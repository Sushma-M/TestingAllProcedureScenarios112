/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.math.BigInteger;
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

import com.testingallprocedurescenarios.school_db.ViewResults;
import com.testingallprocedurescenarios.school_db.ViewResultsId;
import com.testingallprocedurescenarios.school_db.service.ViewResultsService;


/**
 * Controller object for domain model class ViewResults.
 * @see ViewResults
 */
@RestController("School_DB.ViewResultsController")
@Api(value = "ViewResultsController", description = "Exposes APIs to work with ViewResults resource.")
@RequestMapping("/School_DB/ViewResults")
public class ViewResultsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ViewResultsController.class);

    @Autowired
	@Qualifier("School_DB.ViewResultsService")
	private ViewResultsService viewResultsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new ViewResults instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ViewResults createViewResults(@RequestBody ViewResults viewResults) {
		LOGGER.debug("Create ViewResults with information: {}" , viewResults);

		viewResults = viewResultsService.create(viewResults);
		LOGGER.debug("Created ViewResults with information: {}" , viewResults);

	    return viewResults;
	}

    @ApiOperation(value = "Returns the ViewResults instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ViewResults getViewResults(@RequestParam("totalMarks") BigInteger totalMarks, @RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, @RequestParam("studentId") Integer studentId, @RequestParam("studentName") String studentName, @RequestParam("testId") Integer testId) {

        ViewResultsId viewresultsId = new ViewResultsId();
        viewresultsId.setTotalMarks(totalMarks);
        viewresultsId.setAcademicYear(academicYear);
        viewresultsId.setStandardId(standardId);
        viewresultsId.setStudentId(studentId);
        viewresultsId.setStudentName(studentName);
        viewresultsId.setTestId(testId);

        LOGGER.debug("Getting ViewResults with id: {}" , viewresultsId);
        ViewResults viewResults = viewResultsService.getById(viewresultsId);
        LOGGER.debug("ViewResults details with id: {}" , viewResults);

        return viewResults;
    }



    @ApiOperation(value = "Updates the ViewResults instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public ViewResults editViewResults(@RequestParam("totalMarks") BigInteger totalMarks, @RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, @RequestParam("studentId") Integer studentId, @RequestParam("studentName") String studentName, @RequestParam("testId") Integer testId, @RequestBody ViewResults viewResults) {

        viewResults.setTotalMarks(totalMarks);
        viewResults.setAcademicYear(academicYear);
        viewResults.setStandardId(standardId);
        viewResults.setStudentId(studentId);
        viewResults.setStudentName(studentName);
        viewResults.setTestId(testId);

        LOGGER.debug("ViewResults details with id is updated with: {}" , viewResults);

        return viewResultsService.update(viewResults);
    }


    @ApiOperation(value = "Deletes the ViewResults instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteViewResults(@RequestParam("totalMarks") BigInteger totalMarks, @RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, @RequestParam("studentId") Integer studentId, @RequestParam("studentName") String studentName, @RequestParam("testId") Integer testId) {

        ViewResultsId viewresultsId = new ViewResultsId();
        viewresultsId.setTotalMarks(totalMarks);
        viewresultsId.setAcademicYear(academicYear);
        viewresultsId.setStandardId(standardId);
        viewresultsId.setStudentId(studentId);
        viewresultsId.setStudentName(studentName);
        viewresultsId.setTestId(testId);

        LOGGER.debug("Deleting ViewResults with id: {}" , viewresultsId);
        ViewResults viewResults = viewResultsService.delete(viewresultsId);

        return viewResults != null;
    }


    /**
     * @deprecated Use {@link #findViewResults(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of ViewResults instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ViewResults> searchViewResultsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ViewResults list by query filter:{}", (Object) queryFilters);
        return viewResultsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of ViewResults instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ViewResults> findViewResults(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ViewResults list by filter:", query);
        return viewResultsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of ViewResults instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<ViewResults> filterViewResults(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering ViewResults list by filter", query);
        return viewResultsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportViewResults(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return viewResultsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportViewResultsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = ViewResults.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> viewResultsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of ViewResults instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countViewResults( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting ViewResults");
		return viewResultsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getViewResultsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return viewResultsService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service ViewResultsService instance
	 */
	protected void setViewResultsService(ViewResultsService service) {
		this.viewResultsService = service;
	}

}