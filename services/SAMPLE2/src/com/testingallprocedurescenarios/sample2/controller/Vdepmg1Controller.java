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
import com.wavemaker.runtime.security.xss.XssDisable;
import com.wavemaker.tools.api.core.annotations.MapTo;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testingallprocedurescenarios.sample2.Vdepmg1;
import com.testingallprocedurescenarios.sample2.Vdepmg1Id;
import com.testingallprocedurescenarios.sample2.service.Vdepmg1Service;


/**
 * Controller object for domain model class Vdepmg1.
 * @see Vdepmg1
 */
@RestController("SAMPLE2.Vdepmg1Controller")
@Api(value = "Vdepmg1Controller", description = "Exposes APIs to work with Vdepmg1 resource.")
@RequestMapping("/SAMPLE2/Vdepmg1")
public class Vdepmg1Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Vdepmg1Controller.class);

    @Autowired
	@Qualifier("SAMPLE2.Vdepmg1Service")
	private Vdepmg1Service vdepmg1Service;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vdepmg1 instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vdepmg1 createVdepmg1(@RequestBody Vdepmg1 vdepmg1) {
		LOGGER.debug("Create Vdepmg1 with information: {}" , vdepmg1);

		vdepmg1 = vdepmg1Service.create(vdepmg1);
		LOGGER.debug("Created Vdepmg1 with information: {}" , vdepmg1);

	    return vdepmg1;
	}

    @ApiOperation(value = "Returns the Vdepmg1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vdepmg1 getVdepmg1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("mgrno") String mgrno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("admrdept") String admrdept) {

        Vdepmg1Id vdepmg1Id = new Vdepmg1Id();
        vdepmg1Id.setDeptno(deptno);
        vdepmg1Id.setDeptname(deptname);
        vdepmg1Id.setMgrno(mgrno);
        vdepmg1Id.setFirstnme(firstnme);
        vdepmg1Id.setMidinit(midinit);
        vdepmg1Id.setLastname(lastname);
        vdepmg1Id.setAdmrdept(admrdept);

        LOGGER.debug("Getting Vdepmg1 with id: {}" , vdepmg1Id);
        Vdepmg1 vdepmg1 = vdepmg1Service.getById(vdepmg1Id);
        LOGGER.debug("Vdepmg1 details with id: {}" , vdepmg1);

        return vdepmg1;
    }



    @ApiOperation(value = "Updates the Vdepmg1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vdepmg1 editVdepmg1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("mgrno") String mgrno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("admrdept") String admrdept, @RequestBody Vdepmg1 vdepmg1) {

        vdepmg1.setDeptno(deptno);
        vdepmg1.setDeptname(deptname);
        vdepmg1.setMgrno(mgrno);
        vdepmg1.setFirstnme(firstnme);
        vdepmg1.setMidinit(midinit);
        vdepmg1.setLastname(lastname);
        vdepmg1.setAdmrdept(admrdept);

        LOGGER.debug("Vdepmg1 details with id is updated with: {}" , vdepmg1);

        return vdepmg1Service.update(vdepmg1);
    }

	@ApiOperation(value = "Partially updates the  Vdepmg1 instance associated with the given composite-id.")
	@RequestMapping(value = "/composite-id", method = RequestMethod.PATCH)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vdepmg1 patchVdepmg1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("mgrno") String mgrno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("admrdept") String admrdept, @RequestBody @MapTo(Vdepmg1.class) Map<String, Object> vdepmg1Patch) {

        Vdepmg1Id vdepmg1Id = new Vdepmg1Id();
        vdepmg1Id.setDeptno(deptno);
        vdepmg1Id.setDeptname(deptname);
        vdepmg1Id.setMgrno(mgrno);
        vdepmg1Id.setFirstnme(firstnme);
        vdepmg1Id.setMidinit(midinit);
        vdepmg1Id.setLastname(lastname);
        vdepmg1Id.setAdmrdept(admrdept);
        LOGGER.debug("Partially updating Vdepmg1 with id: {}" , vdepmg1Id);

        Vdepmg1 vdepmg1 = vdepmg1Service.partialUpdate(vdepmg1Id, vdepmg1Patch);
        LOGGER.debug("Vdepmg1 details after partial update: {}" , vdepmg1);

        return vdepmg1;
    }


    @ApiOperation(value = "Deletes the Vdepmg1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVdepmg1(@RequestParam("deptno") String deptno, @RequestParam("deptname") String deptname, @RequestParam("mgrno") String mgrno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("admrdept") String admrdept) {

        Vdepmg1Id vdepmg1Id = new Vdepmg1Id();
        vdepmg1Id.setDeptno(deptno);
        vdepmg1Id.setDeptname(deptname);
        vdepmg1Id.setMgrno(mgrno);
        vdepmg1Id.setFirstnme(firstnme);
        vdepmg1Id.setMidinit(midinit);
        vdepmg1Id.setLastname(lastname);
        vdepmg1Id.setAdmrdept(admrdept);

        LOGGER.debug("Deleting Vdepmg1 with id: {}" , vdepmg1Id);
        Vdepmg1 vdepmg1 = vdepmg1Service.delete(vdepmg1Id);

        return vdepmg1 != null;
    }


    /**
     * @deprecated Use {@link #findVdepmg1s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vdepmg1 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Vdepmg1> searchVdepmg1sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vdepmg1s list by query filter:{}", (Object) queryFilters);
        return vdepmg1Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vdepmg1 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vdepmg1> findVdepmg1s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vdepmg1s list by filter:", query);
        return vdepmg1Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vdepmg1 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Vdepmg1> filterVdepmg1s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vdepmg1s list by filter", query);
        return vdepmg1Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportVdepmg1s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vdepmg1Service.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportVdepmg1sAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vdepmg1.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vdepmg1Service.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vdepmg1 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countVdepmg1s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vdepmg1s");
		return vdepmg1Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getVdepmg1AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vdepmg1Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service Vdepmg1Service instance
	 */
	protected void setVdepmg1Service(Vdepmg1Service service) {
		this.vdepmg1Service = service;
	}

}