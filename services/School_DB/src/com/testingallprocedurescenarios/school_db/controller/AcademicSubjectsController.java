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
import com.testingallprocedurescenarios.school_db.AcademicSubjectsId;
import com.testingallprocedurescenarios.school_db.AcademicTestSubjects;
import com.testingallprocedurescenarios.school_db.service.AcademicSubjectsService;


/**
 * Controller object for domain model class AcademicSubjects.
 * @see AcademicSubjects
 */
@RestController("School_DB.AcademicSubjectsController")
@Api(value = "AcademicSubjectsController", description = "Exposes APIs to work with AcademicSubjects resource.")
@RequestMapping("/School_DB/AcademicSubjects")
public class AcademicSubjectsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcademicSubjectsController.class);

    @Autowired
	@Qualifier("School_DB.AcademicSubjectsService")
	private AcademicSubjectsService academicSubjectsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new AcademicSubjects instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AcademicSubjects createAcademicSubjects(@RequestBody AcademicSubjects academicSubjects) {
		LOGGER.debug("Create AcademicSubjects with information: {}" , academicSubjects);

		academicSubjects = academicSubjectsService.create(academicSubjects);
		LOGGER.debug("Created AcademicSubjects with information: {}" , academicSubjects);

	    return academicSubjects;
	}

    @ApiOperation(value = "Returns the AcademicSubjects instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AcademicSubjects getAcademicSubjects(@RequestParam("academicYear") String academicYear, @RequestParam("subjectId") Integer subjectId, @RequestParam("standardId") Integer standardId) {

        AcademicSubjectsId academicsubjectsId = new AcademicSubjectsId();
        academicsubjectsId.setAcademicYear(academicYear);
        academicsubjectsId.setSubjectId(subjectId);
        academicsubjectsId.setStandardId(standardId);

        LOGGER.debug("Getting AcademicSubjects with id: {}" , academicsubjectsId);
        AcademicSubjects academicSubjects = academicSubjectsService.getById(academicsubjectsId);
        LOGGER.debug("AcademicSubjects details with id: {}" , academicSubjects);

        return academicSubjects;
    }



    @ApiOperation(value = "Updates the AcademicSubjects instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AcademicSubjects editAcademicSubjects(@RequestParam("academicYear") String academicYear, @RequestParam("subjectId") Integer subjectId, @RequestParam("standardId") Integer standardId, @RequestBody AcademicSubjects academicSubjects) {

        academicSubjects.setAcademicYear(academicYear);
        academicSubjects.setSubjectId(subjectId);
        academicSubjects.setStandardId(standardId);

        LOGGER.debug("AcademicSubjects details with id is updated with: {}" , academicSubjects);

        return academicSubjectsService.update(academicSubjects);
    }

	@ApiOperation(value = "Partially updates the  AcademicSubjects instance associated with the given composite-id.")
	@RequestMapping(value = "/composite-id", method = RequestMethod.PATCH)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AcademicSubjects patchAcademicSubjects(@RequestParam("academicYear") String academicYear, @RequestParam("subjectId") Integer subjectId, @RequestParam("standardId") Integer standardId, @RequestBody @MapTo(AcademicSubjects.class) Map<String, Object> academicSubjectsPatch) {

        AcademicSubjectsId academicsubjectsId = new AcademicSubjectsId();
        academicsubjectsId.setAcademicYear(academicYear);
        academicsubjectsId.setSubjectId(subjectId);
        academicsubjectsId.setStandardId(standardId);
        LOGGER.debug("Partially updating AcademicSubjects with id: {}" , academicsubjectsId);

        AcademicSubjects academicSubjects = academicSubjectsService.partialUpdate(academicsubjectsId, academicSubjectsPatch);
        LOGGER.debug("AcademicSubjects details after partial update: {}" , academicSubjects);

        return academicSubjects;
    }


    @ApiOperation(value = "Deletes the AcademicSubjects instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAcademicSubjects(@RequestParam("academicYear") String academicYear, @RequestParam("subjectId") Integer subjectId, @RequestParam("standardId") Integer standardId) {

        AcademicSubjectsId academicsubjectsId = new AcademicSubjectsId();
        academicsubjectsId.setAcademicYear(academicYear);
        academicsubjectsId.setSubjectId(subjectId);
        academicsubjectsId.setStandardId(standardId);

        LOGGER.debug("Deleting AcademicSubjects with id: {}" , academicsubjectsId);
        AcademicSubjects academicSubjects = academicSubjectsService.delete(academicsubjectsId);

        return academicSubjects != null;
    }


    /**
     * @deprecated Use {@link #findAcademicSubjects(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of AcademicSubjects instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<AcademicSubjects> searchAcademicSubjectsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AcademicSubjects list by query filter:{}", (Object) queryFilters);
        return academicSubjectsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of AcademicSubjects instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AcademicSubjects> findAcademicSubjects(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AcademicSubjects list by filter:", query);
        return academicSubjectsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of AcademicSubjects instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<AcademicSubjects> filterAcademicSubjects(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AcademicSubjects list by filter", query);
        return academicSubjectsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportAcademicSubjects(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return academicSubjectsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportAcademicSubjectsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = AcademicSubjects.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> academicSubjectsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of AcademicSubjects instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countAcademicSubjects( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting AcademicSubjects");
		return academicSubjectsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getAcademicSubjectsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return academicSubjectsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/composite-id/academicTestSubjectses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the academicTestSubjectses instance associated with the given composite-id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AcademicTestSubjects> findAssociatedAcademicTestSubjectses(@RequestParam("academicYear") String academicYear, @RequestParam("subjectId") Integer subjectId, @RequestParam("standardId") Integer standardId, Pageable pageable) {

        LOGGER.debug("Fetching all associated academicTestSubjectses");
        return academicSubjectsService.findAssociatedAcademicTestSubjectses(academicYear, subjectId, standardId, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AcademicSubjectsService instance
	 */
	protected void setAcademicSubjectsService(AcademicSubjectsService service) {
		this.academicSubjectsService = service;
	}

}