/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio.controller;

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

import com.testingallprocedurescenarios.wmstudio.Departments;
import com.testingallprocedurescenarios.wmstudio.Employees;
import com.testingallprocedurescenarios.wmstudio.JobHistory;
import com.testingallprocedurescenarios.wmstudio.service.DepartmentsService;


/**
 * Controller object for domain model class Departments.
 * @see Departments
 */
@RestController("WMSTUDIO.DepartmentsController")
@Api(value = "DepartmentsController", description = "Exposes APIs to work with Departments resource.")
@RequestMapping("/WMSTUDIO/Departments")
public class DepartmentsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentsController.class);

    @Autowired
	@Qualifier("WMSTUDIO.DepartmentsService")
	private DepartmentsService departmentsService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Departments instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Departments createDepartments(@RequestBody Departments departments) {
		LOGGER.debug("Create Departments with information: {}" , departments);

		departments = departmentsService.create(departments);
		LOGGER.debug("Created Departments with information: {}" , departments);

	    return departments;
	}

    @ApiOperation(value = "Returns the Departments instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Departments getDepartments(@PathVariable("id") Short id) {
        LOGGER.debug("Getting Departments with id: {}" , id);

        Departments foundDepartments = departmentsService.getById(id);
        LOGGER.debug("Departments details with id: {}" , foundDepartments);

        return foundDepartments;
    }

    @ApiOperation(value = "Updates the Departments instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Departments editDepartments(@PathVariable("id") Short id, @RequestBody Departments departments) {
        LOGGER.debug("Editing Departments with id: {}" , departments.getDepartmentId());

        departments.setDepartmentId(id);
        departments = departmentsService.update(departments);
        LOGGER.debug("Departments details with id: {}" , departments);

        return departments;
    }
    
    @ApiOperation(value = "Partially updates the Departments instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PATCH)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Departments patchDepartments(@PathVariable("id") Short id, @RequestBody @MapTo(Departments.class) Map<String, Object> departmentsPatch) {
        LOGGER.debug("Partially updating Departments with id: {}" , id);

        Departments departments = departmentsService.partialUpdate(id, departmentsPatch);
        LOGGER.debug("Departments details after partial update: {}" , departments);

        return departments;
    }

    @ApiOperation(value = "Deletes the Departments instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteDepartments(@PathVariable("id") Short id) {
        LOGGER.debug("Deleting Departments with id: {}" , id);

        Departments deletedDepartments = departmentsService.delete(id);

        return deletedDepartments != null;
    }

    /**
     * @deprecated Use {@link #findDepartments(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Departments instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Departments> searchDepartmentsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Departments list by query filter:{}", (Object) queryFilters);
        return departmentsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Departments instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Departments> findDepartments(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Departments list by filter:", query);
        return departmentsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Departments instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Departments> filterDepartments(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Departments list by filter", query);
        return departmentsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportDepartments(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return departmentsService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportDepartmentsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Departments.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> departmentsService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Departments instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countDepartments( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Departments");
		return departmentsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getDepartmentsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return departmentsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/employeesesForDepartmentId", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the employeesesForDepartmentId instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Employees> findAssociatedEmployeesesForDepartmentId(@PathVariable("id") Short id, Pageable pageable) {

        LOGGER.debug("Fetching all associated employeesesForDepartmentId");
        return departmentsService.findAssociatedEmployeesesForDepartmentId(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/jobHistories", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the jobHistories instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<JobHistory> findAssociatedJobHistories(@PathVariable("id") Short id, Pageable pageable) {

        LOGGER.debug("Fetching all associated jobHistories");
        return departmentsService.findAssociatedJobHistories(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service DepartmentsService instance
	 */
	protected void setDepartmentsService(DepartmentsService service) {
		this.departmentsService = service;
	}

}