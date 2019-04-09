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

import com.testingallprocedurescenarios.sample2.Catalog;
import com.testingallprocedurescenarios.sample2.service.CatalogService;


/**
 * Controller object for domain model class Catalog.
 * @see Catalog
 */
@RestController("SAMPLE2.CatalogController")
@Api(value = "CatalogController", description = "Exposes APIs to work with Catalog resource.")
@RequestMapping("/SAMPLE2/Catalog")
public class CatalogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CatalogController.class);

    @Autowired
	@Qualifier("SAMPLE2.CatalogService")
	private CatalogService catalogService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Catalog instance.")
    @RequestMapping(method = RequestMethod.POST, consumes = "multipart/form-data")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Catalog createCatalog(@RequestPart("wm_data_json") Catalog catalog, @RequestPart(value = "catlog", required = false) MultipartFile _catlog) {
		LOGGER.debug("Create Catalog with information: {}" , catalog);

    catalog.setCatlog(WMMultipartUtils.toByteArray(_catlog));
		catalog = catalogService.create(catalog);
		LOGGER.debug("Created Catalog with information: {}" , catalog);

	    return catalog;
	}

    @ApiOperation(value = "Returns the Catalog instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Catalog getCatalog(@PathVariable("id") String id) {
        LOGGER.debug("Getting Catalog with id: {}" , id);

        Catalog foundCatalog = catalogService.getById(id);
        LOGGER.debug("Catalog details with id: {}" , foundCatalog);

        return foundCatalog;
    }

    @ApiOperation(value = "Retrieves content for the given BLOB field in Catalog instance" )
    @RequestMapping(value = "/{id}/content/{fieldName}", method = RequestMethod.GET, produces="application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public DownloadResponse getCatalogBLOBContent(@PathVariable("id") String id, @PathVariable("fieldName") String fieldName, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam(value="download", defaultValue = "false") boolean download) {

        LOGGER.debug("Retrieves content for the given BLOB field {} in Catalog instance" , fieldName);

        if(!WMRuntimeUtils.isLob(Catalog.class, fieldName)) {
            throw new TypeMismatchException("Given field " + fieldName + " is not a valid BLOB type");
        }
        Catalog catalog = catalogService.getById(id);

        return WMMultipartUtils.buildDownloadResponseForBlob(catalog, fieldName, httpServletRequest, download);
    }

    @ApiOperation(value = "Updates the Catalog instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Catalog editCatalog(@PathVariable("id") String id, @RequestBody Catalog catalog) {
        LOGGER.debug("Editing Catalog with id: {}" , catalog.getName());

        catalog.setName(id);
        catalog = catalogService.update(catalog);
        LOGGER.debug("Catalog details with id: {}" , catalog);

        return catalog;
    }

    @ApiOperation(value = "Updates the Catalog instance associated with the given id.This API should be used when Catalog instance fields that require multipart data.") 
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.POST, consumes = {"multipart/form-data"})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Catalog editCatalog(@PathVariable("id") String id, MultipartHttpServletRequest multipartHttpServletRequest) {
        Catalog newCatalog = WMMultipartUtils.toObject(multipartHttpServletRequest, Catalog.class, "SAMPLE2");
        newCatalog.setName(id);

        Catalog oldCatalog = catalogService.getById(id);
        WMMultipartUtils.updateLobsContent(oldCatalog, newCatalog);
        LOGGER.debug("Updating Catalog with information: {}" , newCatalog);

        return catalogService.update(newCatalog);
    }

    @ApiOperation(value = "Deletes the Catalog instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteCatalog(@PathVariable("id") String id) {
        LOGGER.debug("Deleting Catalog with id: {}" , id);

        Catalog deletedCatalog = catalogService.delete(id);

        return deletedCatalog != null;
    }

    /**
     * @deprecated Use {@link #findCatalogs(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Catalog instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Catalog> searchCatalogsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Catalogs list by query filter:{}", (Object) queryFilters);
        return catalogService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Catalog instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Catalog> findCatalogs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Catalogs list by filter:", query);
        return catalogService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Catalog instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Catalog> filterCatalogs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Catalogs list by filter", query);
        return catalogService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportCatalogs(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return catalogService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportCatalogsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Catalog.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> catalogService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Catalog instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countCatalogs( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Catalogs");
		return catalogService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getCatalogAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return catalogService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service CatalogService instance
	 */
	protected void setCatalogService(CatalogService service) {
		this.catalogService = service;
	}

}