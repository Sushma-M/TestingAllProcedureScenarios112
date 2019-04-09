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

import com.testingallprocedurescenarios.sample2.Vastrde1;
import com.testingallprocedurescenarios.sample2.Vastrde1Id;
import com.testingallprocedurescenarios.sample2.service.Vastrde1Service;


/**
 * Controller object for domain model class Vastrde1.
 * @see Vastrde1
 */
@RestController("SAMPLE2.Vastrde1Controller")
@Api(value = "Vastrde1Controller", description = "Exposes APIs to work with Vastrde1 resource.")
@RequestMapping("/SAMPLE2/Vastrde1")
public class Vastrde1Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Vastrde1Controller.class);

    @Autowired
	@Qualifier("SAMPLE2.Vastrde1Service")
	private Vastrde1Service vastrde1Service;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vastrde1 instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vastrde1 createVastrde1(@RequestBody Vastrde1 vastrde1) {
		LOGGER.debug("Create Vastrde1 with information: {}" , vastrde1);

		vastrde1 = vastrde1Service.create(vastrde1);
		LOGGER.debug("Created Vastrde1 with information: {}" , vastrde1);

	    return vastrde1;
	}

    @ApiOperation(value = "Returns the Vastrde1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vastrde1 getVastrde1(@RequestParam("dept1no") String dept1no, @RequestParam("dept1nam") String dept1nam, @RequestParam("emp1no") String emp1no, @RequestParam("emp1fn") String emp1fn, @RequestParam("emp1mi") Character emp1mi, @RequestParam("emp1ln") String emp1ln, @RequestParam("type2") Character type2, @RequestParam("dept2no") String dept2no, @RequestParam("dept2nam") String dept2nam, @RequestParam("emp2no") String emp2no, @RequestParam("emp2fn") String emp2fn, @RequestParam("emp2mi") Character emp2mi, @RequestParam("emp2ln") String emp2ln) {

        Vastrde1Id vastrde1Id = new Vastrde1Id();
        vastrde1Id.setDept1no(dept1no);
        vastrde1Id.setDept1nam(dept1nam);
        vastrde1Id.setEmp1no(emp1no);
        vastrde1Id.setEmp1fn(emp1fn);
        vastrde1Id.setEmp1mi(emp1mi);
        vastrde1Id.setEmp1ln(emp1ln);
        vastrde1Id.setType2(type2);
        vastrde1Id.setDept2no(dept2no);
        vastrde1Id.setDept2nam(dept2nam);
        vastrde1Id.setEmp2no(emp2no);
        vastrde1Id.setEmp2fn(emp2fn);
        vastrde1Id.setEmp2mi(emp2mi);
        vastrde1Id.setEmp2ln(emp2ln);

        LOGGER.debug("Getting Vastrde1 with id: {}" , vastrde1Id);
        Vastrde1 vastrde1 = vastrde1Service.getById(vastrde1Id);
        LOGGER.debug("Vastrde1 details with id: {}" , vastrde1);

        return vastrde1;
    }



    @ApiOperation(value = "Updates the Vastrde1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vastrde1 editVastrde1(@RequestParam("dept1no") String dept1no, @RequestParam("dept1nam") String dept1nam, @RequestParam("emp1no") String emp1no, @RequestParam("emp1fn") String emp1fn, @RequestParam("emp1mi") Character emp1mi, @RequestParam("emp1ln") String emp1ln, @RequestParam("type2") Character type2, @RequestParam("dept2no") String dept2no, @RequestParam("dept2nam") String dept2nam, @RequestParam("emp2no") String emp2no, @RequestParam("emp2fn") String emp2fn, @RequestParam("emp2mi") Character emp2mi, @RequestParam("emp2ln") String emp2ln, @RequestBody Vastrde1 vastrde1) {

        vastrde1.setDept1no(dept1no);
        vastrde1.setDept1nam(dept1nam);
        vastrde1.setEmp1no(emp1no);
        vastrde1.setEmp1fn(emp1fn);
        vastrde1.setEmp1mi(emp1mi);
        vastrde1.setEmp1ln(emp1ln);
        vastrde1.setType2(type2);
        vastrde1.setDept2no(dept2no);
        vastrde1.setDept2nam(dept2nam);
        vastrde1.setEmp2no(emp2no);
        vastrde1.setEmp2fn(emp2fn);
        vastrde1.setEmp2mi(emp2mi);
        vastrde1.setEmp2ln(emp2ln);

        LOGGER.debug("Vastrde1 details with id is updated with: {}" , vastrde1);

        return vastrde1Service.update(vastrde1);
    }


    @ApiOperation(value = "Deletes the Vastrde1 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVastrde1(@RequestParam("dept1no") String dept1no, @RequestParam("dept1nam") String dept1nam, @RequestParam("emp1no") String emp1no, @RequestParam("emp1fn") String emp1fn, @RequestParam("emp1mi") Character emp1mi, @RequestParam("emp1ln") String emp1ln, @RequestParam("type2") Character type2, @RequestParam("dept2no") String dept2no, @RequestParam("dept2nam") String dept2nam, @RequestParam("emp2no") String emp2no, @RequestParam("emp2fn") String emp2fn, @RequestParam("emp2mi") Character emp2mi, @RequestParam("emp2ln") String emp2ln) {

        Vastrde1Id vastrde1Id = new Vastrde1Id();
        vastrde1Id.setDept1no(dept1no);
        vastrde1Id.setDept1nam(dept1nam);
        vastrde1Id.setEmp1no(emp1no);
        vastrde1Id.setEmp1fn(emp1fn);
        vastrde1Id.setEmp1mi(emp1mi);
        vastrde1Id.setEmp1ln(emp1ln);
        vastrde1Id.setType2(type2);
        vastrde1Id.setDept2no(dept2no);
        vastrde1Id.setDept2nam(dept2nam);
        vastrde1Id.setEmp2no(emp2no);
        vastrde1Id.setEmp2fn(emp2fn);
        vastrde1Id.setEmp2mi(emp2mi);
        vastrde1Id.setEmp2ln(emp2ln);

        LOGGER.debug("Deleting Vastrde1 with id: {}" , vastrde1Id);
        Vastrde1 vastrde1 = vastrde1Service.delete(vastrde1Id);

        return vastrde1 != null;
    }


    /**
     * @deprecated Use {@link #findVastrde1s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vastrde1 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vastrde1> searchVastrde1sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vastrde1s list by query filter:{}", (Object) queryFilters);
        return vastrde1Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vastrde1 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vastrde1> findVastrde1s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vastrde1s list by filter:", query);
        return vastrde1Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vastrde1 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vastrde1> filterVastrde1s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vastrde1s list by filter", query);
        return vastrde1Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVastrde1s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vastrde1Service.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportVastrde1sAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vastrde1.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vastrde1Service.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vastrde1 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVastrde1s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vastrde1s");
		return vastrde1Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVastrde1AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vastrde1Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service Vastrde1Service instance
	 */
	protected void setVastrde1Service(Vastrde1Service service) {
		this.vastrde1Service = service;
	}

}