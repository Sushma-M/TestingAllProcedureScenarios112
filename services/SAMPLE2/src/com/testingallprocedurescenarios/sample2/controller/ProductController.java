/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.TypeMismatchException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testingallprocedurescenarios.sample2.Product;
import com.testingallprocedurescenarios.sample2.service.ProductService;


/**
 * Controller object for domain model class Product.
 * @see Product
 */
@RestController("SAMPLE2.ProductController")
@Api(value = "ProductController", description = "Exposes APIs to work with Product resource.")
@RequestMapping("/SAMPLE2/Product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
	@Qualifier("SAMPLE2.ProductService")
	private ProductService productService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Product instance.")
    @RequestMapping(method = RequestMethod.POST, consumes = "multipart/form-data")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Product createProduct(@RequestPart("wm_data_json") Product product, @RequestPart(value = "description", required = false) MultipartFile _description) {
		LOGGER.debug("Create Product with information: {}" , product);

    product.setDescription(WMMultipartUtils.toByteArray(_description));
		product = productService.create(product);
		LOGGER.debug("Created Product with information: {}" , product);

	    return product;
	}

    @ApiOperation(value = "Returns the Product instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Product getProduct(@PathVariable("id") String id) {
        LOGGER.debug("Getting Product with id: {}" , id);

        Product foundProduct = productService.getById(id);
        LOGGER.debug("Product details with id: {}" , foundProduct);

        return foundProduct;
    }

    @ApiOperation(value = "Retrieves content for the given BLOB field in Product instance" )
    @RequestMapping(value = "/{id}/content/{fieldName}", method = RequestMethod.GET, produces="application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public DownloadResponse getProductBLOBContent(@PathVariable("id") String id, @PathVariable("fieldName") String fieldName, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam(value="download", defaultValue = "false") boolean download) {

        LOGGER.debug("Retrieves content for the given BLOB field {} in Product instance" , fieldName);

        if(!WMRuntimeUtils.isLob(Product.class, fieldName)) {
            throw new TypeMismatchException("Given field " + fieldName + " is not a valid BLOB type");
        }
        Product product = productService.getById(id);

        return WMMultipartUtils.buildDownloadResponseForBlob(product, fieldName, httpServletRequest, download);
    }

    @ApiOperation(value = "Updates the Product instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Product editProduct(@PathVariable("id") String id, @RequestBody Product product) {
        LOGGER.debug("Editing Product with id: {}" , product.getPid());

        product.setPid(id);
        product = productService.update(product);
        LOGGER.debug("Product details with id: {}" , product);

        return product;
    }

    @ApiOperation(value = "Updates the Product instance associated with the given id.This API should be used when Product instance fields that require multipart data.") 
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.POST, consumes = {"multipart/form-data"})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Product editProduct(@PathVariable("id") String id, MultipartHttpServletRequest multipartHttpServletRequest) {
        Product newProduct = WMMultipartUtils.toObject(multipartHttpServletRequest, Product.class, "SAMPLE2");
        newProduct.setPid(id);

        Product oldProduct = productService.getById(id);
        WMMultipartUtils.updateLobsContent(oldProduct, newProduct);
        LOGGER.debug("Updating Product with information: {}" , newProduct);

        return productService.update(newProduct);
    }

    @ApiOperation(value = "Deletes the Product instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteProduct(@PathVariable("id") String id) {
        LOGGER.debug("Deleting Product with id: {}" , id);

        Product deletedProduct = productService.delete(id);

        return deletedProduct != null;
    }

    /**
     * @deprecated Use {@link #findProducts(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Product instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Product> searchProductsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Products list by query filter:{}", (Object) queryFilters);
        return productService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Product instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Product> findProducts(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Products list by filter:", query);
        return productService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Product instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Product> filterProducts(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Products list by filter", query);
        return productService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportProducts(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return productService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportProductsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Product.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> productService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Product instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countProducts( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Products");
		return productService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getProductAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return productService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ProductService instance
	 */
	protected void setProductService(ProductService service) {
		this.productService = service;
	}

}