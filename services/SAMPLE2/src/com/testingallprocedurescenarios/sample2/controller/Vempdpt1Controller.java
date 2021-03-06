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

import com.testingallprocedurescenarios.sample2.Vempdpt1;
import com.testingallprocedurescenarios.sample2.Vempdpt1Id;
import com.testingallprocedurescenarios.sample2.service.Vempdpt1Service;


/**
 * Controller object for domain model class Vempdpt1.
 * @see Vempdpt1
 */
@RestController("SAMPLE2.Vempdpt1Controller")
@Api(value = "Vempdpt1Controller", description = "Exposes APIs to work with Vempdpt1 resource.")
@RequestMapping("/SAMPLE2/Vempdpt1")
public class Vempdpt1Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Vempdpt1Controller.class);

    @Autowired
	@Qualifier("SAMPLE2.Vempdpt1Service")
	private Vempdpt1Service vempdpt1Service;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vempdpt1 instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vempdpt1 createVempdpt1(@RequestBody Vempdpt1 vempdpt1) {
		LOGGER.debug("Create Vempdpt1 with information: {}" , vempdpt1);

		vempdpt1 = vempdpt1Service.create(vempdpt1);
		LOGGER.debug("Created Vempdpt1 with information: {}" , vempdpt1);

	    return vempdpt1;
	}

    @ApiOperation(value = "Returns the Vempdpt1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vempdpt1 getVempdpt1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("empno") String empno, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("workdept") String workdept) {

        Vempdpt1Id vempdpt1Id = new Vempdpt1Id();
        vempdpt1Id.setDeptno(deptno);
        vempdpt1Id.setDeptname(deptname);
        vempdpt1Id.setEmpno(empno);
        vempdpt1Id.setFrstinit(frstinit);
        vempdpt1Id.setMidinit(midinit);
        vempdpt1Id.setLastname(lastname);
        vempdpt1Id.setWorkdept(workdept);

        LOGGER.debug("Getting Vempdpt1 with id: {}" , vempdpt1Id);
        Vempdpt1 vempdpt1 = vempdpt1Service.getById(vempdpt1Id);
        LOGGER.debug("Vempdpt1 details with id: {}" , vempdpt1);

        return vempdpt1;
    }



    @ApiOperation(value = "Updates the Vempdpt1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vempdpt1 editVempdpt1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("empno") String empno, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("workdept") String workdept, @RequestBody Vempdpt1 vempdpt1) {

        vempdpt1.setDeptno(deptno);
        vempdpt1.setDeptname(deptname);
        vempdpt1.setEmpno(empno);
        vempdpt1.setFrstinit(frstinit);
        vempdpt1.setMidinit(midinit);
        vempdpt1.setLastname(lastname);
        vempdpt1.setWorkdept(workdept);

        LOGGER.debug("Vempdpt1 details with id is updated with: {}" , vempdpt1);

        return vempdpt1Service.update(vempdpt1);
    }


    @ApiOperation(value = "Deletes the Vempdpt1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVempdpt1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("empno") String empno, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("workdept") String workdept) {

        Vempdpt1Id vempdpt1Id = new Vempdpt1Id();
        vempdpt1Id.setDeptno(deptno);
        vempdpt1Id.setDeptname(deptname);
        vempdpt1Id.setEmpno(empno);
        vempdpt1Id.setFrstinit(frstinit);
        vempdpt1Id.setMidinit(midinit);
        vempdpt1Id.setLastname(lastname);
        vempdpt1Id.setWorkdept(workdept);

        LOGGER.debug("Deleting Vempdpt1 with id: {}" , vempdpt1Id);
        Vempdpt1 vempdpt1 = vempdpt1Service.delete(vempdpt1Id);

        return vempdpt1 != null;
    }


    /**
     * @deprecated Use {@link #findVempdpt1s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vempdpt1 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vempdpt1> searchVempdpt1sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vempdpt1s list by query filter:{}", (Object) queryFilters);
        return vempdpt1Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vempdpt1 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vempdpt1> findVempdpt1s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vempdpt1s list by filter:", query);
        return vempdpt1Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vempdpt1 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vempdpt1> filterVempdpt1s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vempdpt1s list by filter", query);
        return vempdpt1Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVempdpt1s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vempdpt1Service.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportVempdpt1sAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vempdpt1.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vempdpt1Service.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vempdpt1 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVempdpt1s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vempdpt1s");
		return vempdpt1Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVempdpt1AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vempdpt1Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service Vempdpt1Service instance
	 */
	protected void setVempdpt1Service(Vempdpt1Service service) {
		this.vempdpt1Service = service;
	}

}