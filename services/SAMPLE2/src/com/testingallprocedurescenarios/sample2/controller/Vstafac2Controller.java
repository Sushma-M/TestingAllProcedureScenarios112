/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.controller;

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

import com.testingallprocedurescenarios.sample2.Vstafac2;
import com.testingallprocedurescenarios.sample2.Vstafac2Id;
import com.testingallprocedurescenarios.sample2.service.Vstafac2Service;


/**
 * Controller object for domain model class Vstafac2.
 * @see Vstafac2
 */
@RestController("SAMPLE2.Vstafac2Controller")
@Api(value = "Vstafac2Controller", description = "Exposes APIs to work with Vstafac2 resource.")
@RequestMapping("/SAMPLE2/Vstafac2")
public class Vstafac2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Vstafac2Controller.class);

    @Autowired
	@Qualifier("SAMPLE2.Vstafac2Service")
	private Vstafac2Service vstafac2Service;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vstafac2 instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vstafac2 createVstafac2(@RequestBody Vstafac2 vstafac2) {
		LOGGER.debug("Create Vstafac2 with information: {}" , vstafac2);

		vstafac2 = vstafac2Service.create(vstafac2);
		LOGGER.debug("Created Vstafac2 with information: {}" , vstafac2);

	    return vstafac2;
	}

    @ApiOperation(value = "Returns the Vstafac2 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vstafac2 getVstafac2(@RequestParam("projno") String projno, @RequestParam("actno") Short actno, @RequestParam("actdesc") String actdesc, @RequestParam("empno") String empno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("emptime") Float emptime, @RequestParam("stdate") Date stdate, @RequestParam("endate") Date endate, @RequestParam("type") Character type) {

        Vstafac2Id vstafac2Id = new Vstafac2Id();
        vstafac2Id.setProjno(projno);
        vstafac2Id.setActno(actno);
        vstafac2Id.setActdesc(actdesc);
        vstafac2Id.setEmpno(empno);
        vstafac2Id.setFirstnme(firstnme);
        vstafac2Id.setMidinit(midinit);
        vstafac2Id.setLastname(lastname);
        vstafac2Id.setEmptime(emptime);
        vstafac2Id.setStdate(stdate);
        vstafac2Id.setEndate(endate);
        vstafac2Id.setType(type);

        LOGGER.debug("Getting Vstafac2 with id: {}" , vstafac2Id);
        Vstafac2 vstafac2 = vstafac2Service.getById(vstafac2Id);
        LOGGER.debug("Vstafac2 details with id: {}" , vstafac2);

        return vstafac2;
    }



    @ApiOperation(value = "Updates the Vstafac2 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vstafac2 editVstafac2(@RequestParam("projno") String projno, @RequestParam("actno") Short actno, @RequestParam("actdesc") String actdesc, @RequestParam("empno") String empno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("emptime") Float emptime, @RequestParam("stdate") Date stdate, @RequestParam("endate") Date endate, @RequestParam("type") Character type, @RequestBody Vstafac2 vstafac2) {

        vstafac2.setProjno(projno);
        vstafac2.setActno(actno);
        vstafac2.setActdesc(actdesc);
        vstafac2.setEmpno(empno);
        vstafac2.setFirstnme(firstnme);
        vstafac2.setMidinit(midinit);
        vstafac2.setLastname(lastname);
        vstafac2.setEmptime(emptime);
        vstafac2.setStdate(stdate);
        vstafac2.setEndate(endate);
        vstafac2.setType(type);

        LOGGER.debug("Vstafac2 details with id is updated with: {}" , vstafac2);

        return vstafac2Service.update(vstafac2);
    }


    @ApiOperation(value = "Deletes the Vstafac2 instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVstafac2(@RequestParam("projno") String projno, @RequestParam("actno") Short actno, @RequestParam("actdesc") String actdesc, @RequestParam("empno") String empno, @RequestParam("firstnme") String firstnme, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestParam("emptime") Float emptime, @RequestParam("stdate") Date stdate, @RequestParam("endate") Date endate, @RequestParam("type") Character type) {

        Vstafac2Id vstafac2Id = new Vstafac2Id();
        vstafac2Id.setProjno(projno);
        vstafac2Id.setActno(actno);
        vstafac2Id.setActdesc(actdesc);
        vstafac2Id.setEmpno(empno);
        vstafac2Id.setFirstnme(firstnme);
        vstafac2Id.setMidinit(midinit);
        vstafac2Id.setLastname(lastname);
        vstafac2Id.setEmptime(emptime);
        vstafac2Id.setStdate(stdate);
        vstafac2Id.setEndate(endate);
        vstafac2Id.setType(type);

        LOGGER.debug("Deleting Vstafac2 with id: {}" , vstafac2Id);
        Vstafac2 vstafac2 = vstafac2Service.delete(vstafac2Id);

        return vstafac2 != null;
    }


    /**
     * @deprecated Use {@link #findVstafac2s(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vstafac2 instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vstafac2> searchVstafac2sByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vstafac2s list by query filter:{}", (Object) queryFilters);
        return vstafac2Service.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vstafac2 instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vstafac2> findVstafac2s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vstafac2s list by filter:", query);
        return vstafac2Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vstafac2 instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vstafac2> filterVstafac2s(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vstafac2s list by filter", query);
        return vstafac2Service.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVstafac2s(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vstafac2Service.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportVstafac2sAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vstafac2.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vstafac2Service.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vstafac2 instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVstafac2s( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vstafac2s");
		return vstafac2Service.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVstafac2AggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vstafac2Service.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service Vstafac2Service instance
	 */
	protected void setVstafac2Service(Vstafac2Service service) {
		this.vstafac2Service = service;
	}

}