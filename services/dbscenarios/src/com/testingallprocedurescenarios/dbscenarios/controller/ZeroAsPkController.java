/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

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

import com.testingallprocedurescenarios.dbscenarios.ZeroAsPk;
import com.testingallprocedurescenarios.dbscenarios.service.ZeroAsPkService;


/**
 * Controller object for domain model class ZeroAsPk.
 * @see ZeroAsPk
 */
@RestController("dbscenarios.ZeroAsPkController")
@Api(value = "ZeroAsPkController", description = "Exposes APIs to work with ZeroAsPk resource.")
@RequestMapping("/dbscenarios/ZeroAsPk")
public class ZeroAsPkController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ZeroAsPkController.class);

    @Autowired
	@Qualifier("dbscenarios.ZeroAsPkService")
	private ZeroAsPkService zeroAsPkService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new ZeroAsPk instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ZeroAsPk createZeroAsPk(@RequestBody ZeroAsPk zeroAsPk) {
		LOGGER.debug("Create ZeroAsPk with information: {}" , zeroAsPk);

		zeroAsPk = zeroAsPkService.create(zeroAsPk);
		LOGGER.debug("Created ZeroAsPk with information: {}" , zeroAsPk);

	    return zeroAsPk;
	}

    @ApiOperation(value = "Returns the ZeroAsPk instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ZeroAsPk getZeroAsPk(@PathVariable("id") Integer id) {
        LOGGER.debug("Getting ZeroAsPk with id: {}" , id);

        ZeroAsPk foundZeroAsPk = zeroAsPkService.getById(id);
        LOGGER.debug("ZeroAsPk details with id: {}" , foundZeroAsPk);

        return foundZeroAsPk;
    }

    @ApiOperation(value = "Updates the ZeroAsPk instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ZeroAsPk editZeroAsPk(@PathVariable("id") Integer id, @RequestBody ZeroAsPk zeroAsPk) {
        LOGGER.debug("Editing ZeroAsPk with id: {}" , zeroAsPk.getId());

        zeroAsPk.setId(id);
        zeroAsPk = zeroAsPkService.update(zeroAsPk);
        LOGGER.debug("ZeroAsPk details with id: {}" , zeroAsPk);

        return zeroAsPk;
    }

    @ApiOperation(value = "Deletes the ZeroAsPk instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteZeroAsPk(@PathVariable("id") Integer id) {
        LOGGER.debug("Deleting ZeroAsPk with id: {}" , id);

        ZeroAsPk deletedZeroAsPk = zeroAsPkService.delete(id);

        return deletedZeroAsPk != null;
    }

    /**
     * @deprecated Use {@link #findZeroAsPks(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of ZeroAsPk instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ZeroAsPk> searchZeroAsPksByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ZeroAsPks list by query filter:{}", (Object) queryFilters);
        return zeroAsPkService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of ZeroAsPk instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ZeroAsPk> findZeroAsPks(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ZeroAsPks list by filter:", query);
        return zeroAsPkService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of ZeroAsPk instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ZeroAsPk> filterZeroAsPks(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ZeroAsPks list by filter", query);
        return zeroAsPkService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportZeroAsPks(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return zeroAsPkService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportZeroAsPksAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = ZeroAsPk.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> zeroAsPkService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of ZeroAsPk instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countZeroAsPks( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting ZeroAsPks");
		return zeroAsPkService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getZeroAsPkAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return zeroAsPkService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ZeroAsPkService instance
	 */
	protected void setZeroAsPkService(ZeroAsPkService service) {
		this.zeroAsPkService = service;
	}

}