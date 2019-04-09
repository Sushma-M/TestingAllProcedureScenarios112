/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.controller;

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

import com.testingallprocedurescenarios.school_db.Results;
import com.testingallprocedurescenarios.school_db.TestConducted;
import com.testingallprocedurescenarios.school_db.TestConductedId;
import com.testingallprocedurescenarios.school_db.service.TestConductedService;


/**
 * Controller object for domain model class TestConducted.
 * @see TestConducted
 */
@RestController("School_DB.TestConductedController")
@Api(value = "TestConductedController", description = "Exposes APIs to work with TestConducted resource.")
@RequestMapping("/School_DB/TestConducted")
public class TestConductedController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestConductedController.class);

    @Autowired
	@Qualifier("School_DB.TestConductedService")
	private TestConductedService testConductedService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new TestConducted instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TestConducted createTestConducted(@RequestBody TestConducted testConducted) {
		LOGGER.debug("Create TestConducted with information: {}" , testConducted);

		testConducted = testConductedService.create(testConducted);
		LOGGER.debug("Created TestConducted with information: {}" , testConducted);

	    return testConducted;
	}

    @ApiOperation(value = "Returns the TestConducted instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TestConducted getTestConducted(@RequestParam("academicYear") String academicYear, @RequestParam("testConductedId") Integer testConductedId, @RequestParam("standardId") Integer standardId) {

        TestConductedId testconductedId = new TestConductedId();
        testconductedId.setAcademicYear(academicYear);
        testconductedId.setTestConductedId(testConductedId);
        testconductedId.setStandardId(standardId);

        LOGGER.debug("Getting TestConducted with id: {}" , testconductedId);
        TestConducted testConducted = testConductedService.getById(testconductedId);
        LOGGER.debug("TestConducted details with id: {}" , testConducted);

        return testConducted;
    }



    @ApiOperation(value = "Updates the TestConducted instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public TestConducted editTestConducted(@RequestParam("academicYear") String academicYear, @RequestParam("testConductedId") Integer testConductedId, @RequestParam("standardId") Integer standardId, @RequestBody TestConducted testConducted) {

        testConducted.setAcademicYear(academicYear);
        testConducted.setTestConductedId(testConductedId);
        testConducted.setStandardId(standardId);

        LOGGER.debug("TestConducted details with id is updated with: {}" , testConducted);

        return testConductedService.update(testConducted);
    }


    @ApiOperation(value = "Deletes the TestConducted instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteTestConducted(@RequestParam("academicYear") String academicYear, @RequestParam("testConductedId") Integer testConductedId, @RequestParam("standardId") Integer standardId) {

        TestConductedId testconductedId = new TestConductedId();
        testconductedId.setAcademicYear(academicYear);
        testconductedId.setTestConductedId(testConductedId);
        testconductedId.setStandardId(standardId);

        LOGGER.debug("Deleting TestConducted with id: {}" , testconductedId);
        TestConducted testConducted = testConductedService.delete(testconductedId);

        return testConducted != null;
    }


    /**
     * @deprecated Use {@link #findTestConducteds(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of TestConducted instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TestConducted> searchTestConductedsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering TestConducteds list by query filter:{}", (Object) queryFilters);
        return testConductedService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TestConducted instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TestConducted> findTestConducteds(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TestConducteds list by filter:", query);
        return testConductedService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of TestConducted instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<TestConducted> filterTestConducteds(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering TestConducteds list by filter", query);
        return testConductedService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportTestConducteds(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return testConductedService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportTestConductedsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = TestConducted.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> testConductedService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of TestConducted instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countTestConducteds( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting TestConducteds");
		return testConductedService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getTestConductedAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return testConductedService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/composite-id/resultses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the resultses instance associated with the given composite-id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Results> findAssociatedResultses(@RequestParam("academicYear") String academicYear, @RequestParam("testConductedId") Integer testConductedId, @RequestParam("standardId") Integer standardId, Pageable pageable) {

        LOGGER.debug("Fetching all associated resultses");
        return testConductedService.findAssociatedResultses(academicYear, testConductedId, standardId, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service TestConductedService instance
	 */
	protected void setTestConductedService(TestConductedService service) {
		this.testConductedService = service;
	}

}