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
import com.wavemaker.runtime.security.xss.XssDisable;
import com.wavemaker.tools.api.core.annotations.MapTo;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testingallprocedurescenarios.school_db.AcademicSubjects;
import com.testingallprocedurescenarios.school_db.Academics;
import com.testingallprocedurescenarios.school_db.AcademicsId;
import com.testingallprocedurescenarios.school_db.StudentAcademics;
import com.testingallprocedurescenarios.school_db.service.AcademicsService;


/**
 * Controller object for domain model class Academics.
 * @see Academics
 */
@RestController("School_DB.AcademicsController")
@Api(value = "AcademicsController", description = "Exposes APIs to work with Academics resource.")
@RequestMapping("/School_DB/Academics")
public class AcademicsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcademicsController.class);

    @Autowired
	@Qualifier("School_DB.AcademicsService")
	private AcademicsService academicsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Academics instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Academics createAcademics(@RequestBody Academics academics) {
		LOGGER.debug("Create Academics with information: {}" , academics);

		academics = academicsService.create(academics);
		LOGGER.debug("Created Academics with information: {}" , academics);

	    return academics;
	}

    @ApiOperation(value = "Returns the Academics instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Academics getAcademics(@RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId) {

        AcademicsId academicsId = new AcademicsId();
        academicsId.setAcademicYear(academicYear);
        academicsId.setStandardId(standardId);

        LOGGER.debug("Getting Academics with id: {}" , academicsId);
        Academics academics = academicsService.getById(academicsId);
        LOGGER.debug("Academics details with id: {}" , academics);

        return academics;
    }



    @ApiOperation(value = "Updates the Academics instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Academics editAcademics(@RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, @RequestBody Academics academics) {

        academics.setAcademicYear(academicYear);
        academics.setStandardId(standardId);

        LOGGER.debug("Academics details with id is updated with: {}" , academics);

        return academicsService.update(academics);
    }

	@ApiOperation(value = "Partially updates the  Academics instance associated with the given composite-id.")
	@RequestMapping(value = "/composite-id", method = RequestMethod.PATCH)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Academics patchAcademics(@RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, @RequestBody @MapTo(Academics.class) Map<String, Object> academicsPatch) {

        AcademicsId academicsId = new AcademicsId();
        academicsId.setAcademicYear(academicYear);
        academicsId.setStandardId(standardId);
        LOGGER.debug("Partially updating Academics with id: {}" , academicsId);

        Academics academics = academicsService.partialUpdate(academicsId, academicsPatch);
        LOGGER.debug("Academics details after partial update: {}" , academics);

        return academics;
    }


    @ApiOperation(value = "Deletes the Academics instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAcademics(@RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId) {

        AcademicsId academicsId = new AcademicsId();
        academicsId.setAcademicYear(academicYear);
        academicsId.setStandardId(standardId);

        LOGGER.debug("Deleting Academics with id: {}" , academicsId);
        Academics academics = academicsService.delete(academicsId);

        return academics != null;
    }


    /**
     * @deprecated Use {@link #findAcademics(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Academics instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Academics> searchAcademicsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Academics list by query filter:{}", (Object) queryFilters);
        return academicsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Academics instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Academics> findAcademics(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Academics list by filter:", query);
        return academicsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Academics instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Academics> filterAcademics(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Academics list by filter", query);
        return academicsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportAcademics(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return academicsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportAcademicsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Academics.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> academicsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Academics instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countAcademics( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Academics");
		return academicsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getAcademicsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return academicsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/composite-id/academicSubjectses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the academicSubjectses instance associated with the given composite-id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AcademicSubjects> findAssociatedAcademicSubjectses(@RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, Pageable pageable) {

        LOGGER.debug("Fetching all associated academicSubjectses");
        return academicsService.findAssociatedAcademicSubjectses(academicYear, standardId, pageable);
    }

    @RequestMapping(value="/composite-id/studentAcademicses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the studentAcademicses instance associated with the given composite-id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<StudentAcademics> findAssociatedStudentAcademicses(@RequestParam("academicYear") String academicYear, @RequestParam("standardId") Integer standardId, Pageable pageable) {

        LOGGER.debug("Fetching all associated studentAcademicses");
        return academicsService.findAssociatedStudentAcademicses(academicYear, standardId, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AcademicsService instance
	 */
	protected void setAcademicsService(AcademicsService service) {
		this.academicsService = service;
	}

}