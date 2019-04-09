/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testingallprocedurescenarios.sample2.Sales;
import com.testingallprocedurescenarios.sample2.SalesId;
import com.testingallprocedurescenarios.sample2.service.SalesService;


/**
 * Controller object for domain model class Sales.
 * @see Sales
 */
@RestController("SAMPLE2.SalesController")
@Api(value = "SalesController", description = "Exposes APIs to work with Sales resource.")
@RequestMapping("/SAMPLE2/Sales")
public class SalesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SalesController.class);

    @Autowired
	@Qualifier("SAMPLE2.SalesService")
	private SalesService salesService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Sales instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Sales createSales(@RequestBody Sales salesInstance) {
		LOGGER.debug("Create Sales with information: {}" , salesInstance);

		salesInstance = salesService.create(salesInstance);
		LOGGER.debug("Created Sales with information: {}" , salesInstance);

	    return salesInstance;
	}

    @ApiOperation(value = "Returns the Sales instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Sales getSales(@RequestParam("salesDate") Date salesDate, @RequestParam("salesPerson") String salesPerson, @RequestParam("region") String region, @RequestParam("sales") Integer sales) {

        SalesId salesId = new SalesId();
        salesId.setSalesDate(salesDate);
        salesId.setSalesPerson(salesPerson);
        salesId.setRegion(region);
        salesId.setSales(sales);

        LOGGER.debug("Getting Sales with id: {}" , salesId);
        Sales salesInstance = salesService.getById(salesId);
        LOGGER.debug("Sales details with id: {}" , salesInstance);

        return salesInstance;
    }



    @ApiOperation(value = "Updates the Sales instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Sales editSales(@RequestParam("salesDate") Date salesDate, @RequestParam("salesPerson") String salesPerson, @RequestParam("region") String region, @RequestParam("sales") Integer sales, @RequestBody Sales salesInstance) {

        salesInstance.setSalesDate(salesDate);
        salesInstance.setSalesPerson(salesPerson);
        salesInstance.setRegion(region);
        salesInstance.setSales(sales);

        LOGGER.debug("Sales details with id is updated with: {}" , salesInstance);

        return salesService.update(salesInstance);
    }


    @ApiOperation(value = "Deletes the Sales instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteSales(@RequestParam("salesDate") Date salesDate, @RequestParam("salesPerson") String salesPerson, @RequestParam("region") String region, @RequestParam("sales") Integer sales) {

        SalesId salesId = new SalesId();
        salesId.setSalesDate(salesDate);
        salesId.setSalesPerson(salesPerson);
        salesId.setRegion(region);
        salesId.setSales(sales);

        LOGGER.debug("Deleting Sales with id: {}" , salesId);
        Sales salesInstance = salesService.delete(salesId);

        return salesInstance != null;
    }


    /**
     * @deprecated Use {@link #findSales(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Sales instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Sales> searchSalesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Sales list by query filter:{}", (Object) queryFilters);
        return salesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Sales instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Sales> findSales(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Sales list by filter:", query);
        return salesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Sales instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Sales> filterSales(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Sales list by filter", query);
        return salesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportSales(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return salesService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSalesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Sales.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> salesService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Sales instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countSales( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Sales");
		return salesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getSalesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return salesService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service SalesService instance
	 */
	protected void setSalesService(SalesService service) {
		this.salesService = service;
	}

}