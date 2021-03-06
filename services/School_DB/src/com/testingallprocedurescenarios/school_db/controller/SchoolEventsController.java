/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.controller;

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

import com.testingallprocedurescenarios.school_db.SchoolEvents;
import com.testingallprocedurescenarios.school_db.SchoolEventsId;
import com.testingallprocedurescenarios.school_db.service.SchoolEventsService;


/**
 * Controller object for domain model class SchoolEvents.
 * @see SchoolEvents
 */
@RestController("School_DB.SchoolEventsController")
@Api(value = "SchoolEventsController", description = "Exposes APIs to work with SchoolEvents resource.")
@RequestMapping("/School_DB/SchoolEvents")
public class SchoolEventsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SchoolEventsController.class);

    @Autowired
	@Qualifier("School_DB.SchoolEventsService")
	private SchoolEventsService schoolEventsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new SchoolEvents instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SchoolEvents createSchoolEvents(@RequestBody SchoolEvents schoolEvents) {
		LOGGER.debug("Create SchoolEvents with information: {}" , schoolEvents);

		schoolEvents = schoolEventsService.create(schoolEvents);
		LOGGER.debug("Created SchoolEvents with information: {}" , schoolEvents);

	    return schoolEvents;
	}

    @ApiOperation(value = "Returns the SchoolEvents instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SchoolEvents getSchoolEvents(@RequestParam("scheduledDate") Date scheduledDate, @RequestParam("eventName") String eventName, @RequestParam("eventId") Integer eventId) {

        SchoolEventsId schooleventsId = new SchoolEventsId();
        schooleventsId.setScheduledDate(scheduledDate);
        schooleventsId.setEventName(eventName);
        schooleventsId.setEventId(eventId);

        LOGGER.debug("Getting SchoolEvents with id: {}" , schooleventsId);
        SchoolEvents schoolEvents = schoolEventsService.getById(schooleventsId);
        LOGGER.debug("SchoolEvents details with id: {}" , schoolEvents);

        return schoolEvents;
    }



    @ApiOperation(value = "Updates the SchoolEvents instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public SchoolEvents editSchoolEvents(@RequestParam("scheduledDate") Date scheduledDate, @RequestParam("eventName") String eventName, @RequestParam("eventId") Integer eventId, @RequestBody SchoolEvents schoolEvents) {

        schoolEvents.setScheduledDate(scheduledDate);
        schoolEvents.setEventName(eventName);
        schoolEvents.setEventId(eventId);

        LOGGER.debug("SchoolEvents details with id is updated with: {}" , schoolEvents);

        return schoolEventsService.update(schoolEvents);
    }


    @ApiOperation(value = "Deletes the SchoolEvents instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteSchoolEvents(@RequestParam("scheduledDate") Date scheduledDate, @RequestParam("eventName") String eventName, @RequestParam("eventId") Integer eventId) {

        SchoolEventsId schooleventsId = new SchoolEventsId();
        schooleventsId.setScheduledDate(scheduledDate);
        schooleventsId.setEventName(eventName);
        schooleventsId.setEventId(eventId);

        LOGGER.debug("Deleting SchoolEvents with id: {}" , schooleventsId);
        SchoolEvents schoolEvents = schoolEventsService.delete(schooleventsId);

        return schoolEvents != null;
    }


    /**
     * @deprecated Use {@link #findSchoolEvents(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of SchoolEvents instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SchoolEvents> searchSchoolEventsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering SchoolEvents list by query filter:{}", (Object) queryFilters);
        return schoolEventsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of SchoolEvents instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SchoolEvents> findSchoolEvents(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering SchoolEvents list by filter:", query);
        return schoolEventsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of SchoolEvents instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<SchoolEvents> filterSchoolEvents(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering SchoolEvents list by filter", query);
        return schoolEventsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportSchoolEvents(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return schoolEventsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSchoolEventsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = SchoolEvents.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> schoolEventsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of SchoolEvents instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countSchoolEvents( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting SchoolEvents");
		return schoolEventsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getSchoolEventsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return schoolEventsService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service SchoolEventsService instance
	 */
	protected void setSchoolEventsService(SchoolEventsService service) {
		this.schoolEventsService = service;
	}

}