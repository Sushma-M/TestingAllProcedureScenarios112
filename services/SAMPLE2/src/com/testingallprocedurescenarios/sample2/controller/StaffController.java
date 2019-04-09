/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.controller;

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

import com.testingallprocedurescenarios.sample2.Staff;
import com.testingallprocedurescenarios.sample2.StaffId;
import com.testingallprocedurescenarios.sample2.service.StaffService;


/**
 * Controller object for domain model class Staff.
 * @see Staff
 */
@RestController("SAMPLE2.StaffController")
@Api(value = "StaffController", description = "Exposes APIs to work with Staff resource.")
@RequestMapping("/SAMPLE2/Staff")
public class StaffController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StaffController.class);

    @Autowired
	@Qualifier("SAMPLE2.StaffService")
	private StaffService staffService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Staff instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Staff createStaff(@RequestBody Staff staff) {
		LOGGER.debug("Create Staff with information: {}" , staff);

		staff = staffService.create(staff);
		LOGGER.debug("Created Staff with information: {}" , staff);

	    return staff;
	}

    @ApiOperation(value = "Returns the Staff instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Staff getStaff(@RequestParam("id") Short id, @RequestParam("name") String name, @RequestParam("dept") Short dept, @RequestParam("job") String job, @RequestParam("years") Short years, @RequestParam("salary") Float salary, @RequestParam("comm") Float comm) {

        StaffId staffId = new StaffId();
        staffId.setId(id);
        staffId.setName(name);
        staffId.setDept(dept);
        staffId.setJob(job);
        staffId.setYears(years);
        staffId.setSalary(salary);
        staffId.setComm(comm);

        LOGGER.debug("Getting Staff with id: {}" , staffId);
        Staff staff = staffService.getById(staffId);
        LOGGER.debug("Staff details with id: {}" , staff);

        return staff;
    }



    @ApiOperation(value = "Updates the Staff instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Staff editStaff(@RequestParam("id") Short id, @RequestParam("name") String name, @RequestParam("dept") Short dept, @RequestParam("job") String job, @RequestParam("years") Short years, @RequestParam("salary") Float salary, @RequestParam("comm") Float comm, @RequestBody Staff staff) {

        staff.setId(id);
        staff.setName(name);
        staff.setDept(dept);
        staff.setJob(job);
        staff.setYears(years);
        staff.setSalary(salary);
        staff.setComm(comm);

        LOGGER.debug("Staff details with id is updated with: {}" , staff);

        return staffService.update(staff);
    }


    @ApiOperation(value = "Deletes the Staff instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteStaff(@RequestParam("id") Short id, @RequestParam("name") String name, @RequestParam("dept") Short dept, @RequestParam("job") String job, @RequestParam("years") Short years, @RequestParam("salary") Float salary, @RequestParam("comm") Float comm) {

        StaffId staffId = new StaffId();
        staffId.setId(id);
        staffId.setName(name);
        staffId.setDept(dept);
        staffId.setJob(job);
        staffId.setYears(years);
        staffId.setSalary(salary);
        staffId.setComm(comm);

        LOGGER.debug("Deleting Staff with id: {}" , staffId);
        Staff staff = staffService.delete(staffId);

        return staff != null;
    }


    /**
     * @deprecated Use {@link #findStaffs(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Staff instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Staff> searchStaffsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Staffs list by query filter:{}", (Object) queryFilters);
        return staffService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Staff instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Staff> findStaffs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Staffs list by filter:", query);
        return staffService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Staff instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Staff> filterStaffs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Staffs list by filter", query);
        return staffService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportStaffs(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return staffService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportStaffsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Staff.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> staffService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Staff instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countStaffs( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Staffs");
		return staffService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getStaffAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return staffService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service StaffService instance
	 */
	protected void setStaffService(StaffService service) {
		this.staffService = service;
	}

}