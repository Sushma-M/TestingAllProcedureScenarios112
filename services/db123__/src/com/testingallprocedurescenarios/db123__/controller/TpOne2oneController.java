/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__.controller;

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

import com.testingallprocedurescenarios.db123__.TpOne2one;
import com.testingallprocedurescenarios.db123__.service.TpOne2oneService;


/**
 * Controller object for domain model class TpOne2one.
 * @see TpOne2one
 */
@RestController("db123__.TpOne2oneController")
@Api(value = "TpOne2oneController", description = "Exposes APIs to work with TpOne2one resource.")
@RequestMapping("/db123__/TpOne2one")
public class TpOne2oneController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TpOne2oneController.class);

    @Autowired
	@Qualifier("db123__.TpOne2oneService")
	private TpOne2oneService tpOne2oneService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new TpOne2one instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TpOne2one createTpOne2one(@RequestBody TpOne2one tpOne2one) {
		LOGGER.debug("Create TpOne2one with information: {}" , tpOne2one);

		tpOne2one = tpOne2oneService.create(tpOne2one);
		LOGGER.debug("Created TpOne2one with information: {}" , tpOne2one);

	    return tpOne2one;
	}

    @ApiOperation(value = "Returns the TpOne2one instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TpOne2one getTpOne2one(@PathVariable("id") String id) {
        LOGGER.debug("Getting TpOne2one with id: {}" , id);

        TpOne2one foundTpOne2one = tpOne2oneService.getById(id);
        LOGGER.debug("TpOne2one details with id: {}" , foundTpOne2one);

        return foundTpOne2one;
    }

    @ApiOperation(value = "Updates the TpOne2one instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TpOne2one editTpOne2one(@PathVariable("id") String id, @RequestBody TpOne2one tpOne2one) {
        LOGGER.debug("Editing TpOne2one with id: {}" , tpOne2one.getCharId());

        tpOne2one.setCharId(id);
        tpOne2one = tpOne2oneService.update(tpOne2one);
        LOGGER.debug("TpOne2one details with id: {}" , tpOne2one);

        return tpOne2one;
    }

    @ApiOperation(value = "Deletes the TpOne2one instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTpOne2one(@PathVariable("id") String id) {
        LOGGER.debug("Deleting TpOne2one with id: {}" , id);

        TpOne2one deletedTpOne2one = tpOne2oneService.delete(id);

        return deletedTpOne2one != null;
    }

    /**
     * @deprecated Use {@link #findTpOne2ones(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of TpOne2one instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TpOne2one> searchTpOne2onesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TpOne2ones list by query filter:{}", (Object) queryFilters);
        return tpOne2oneService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TpOne2one instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TpOne2one> findTpOne2ones(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TpOne2ones list by filter:", query);
        return tpOne2oneService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TpOne2one instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TpOne2one> filterTpOne2ones(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TpOne2ones list by filter", query);
        return tpOne2oneService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTpOne2ones(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return tpOne2oneService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportTpOne2onesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = TpOne2one.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> tpOne2oneService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of TpOne2one instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTpOne2ones( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting TpOne2ones");
		return tpOne2oneService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTpOne2oneAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return tpOne2oneService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TpOne2oneService instance
	 */
	protected void setTpOne2oneService(TpOne2oneService service) {
		this.tpOne2oneService = service;
	}

}