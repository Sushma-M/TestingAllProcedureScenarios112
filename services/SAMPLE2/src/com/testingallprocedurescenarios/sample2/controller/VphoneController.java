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

import com.testingallprocedurescenarios.sample2.Vphone;
import com.testingallprocedurescenarios.sample2.VphoneId;
import com.testingallprocedurescenarios.sample2.service.VphoneService;


/**
 * Controller object for domain model class Vphone.
 * @see Vphone
 */
@RestController("SAMPLE2.VphoneController")
@Api(value = "VphoneController", description = "Exposes APIs to work with Vphone resource.")
@RequestMapping("/SAMPLE2/Vphone")
public class VphoneController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VphoneController.class);

    @Autowired
	@Qualifier("SAMPLE2.VphoneService")
	private VphoneService vphoneService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vphone instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vphone createVphone(@RequestBody Vphone vphone) {
		LOGGER.debug("Create Vphone with information: {}" , vphone);

		vphone = vphoneService.create(vphone);
		LOGGER.debug("Created Vphone with information: {}" , vphone);

	    return vphone;
	}

    @ApiOperation(value = "Returns the Vphone instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vphone getVphone(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname, @RequestParam("middleinitial") Character middleinitial, @RequestParam("phonenumber") String phonenumber, @RequestParam("employeenumber") String employeenumber, @RequestParam("deptnumber") String deptnumber, @RequestParam("deptname") String deptname) {

        VphoneId vphoneId = new VphoneId();
        vphoneId.setLastname(lastname);
        vphoneId.setFirstname(firstname);
        vphoneId.setMiddleinitial(middleinitial);
        vphoneId.setPhonenumber(phonenumber);
        vphoneId.setEmployeenumber(employeenumber);
        vphoneId.setDeptnumber(deptnumber);
        vphoneId.setDeptname(deptname);

        LOGGER.debug("Getting Vphone with id: {}" , vphoneId);
        Vphone vphone = vphoneService.getById(vphoneId);
        LOGGER.debug("Vphone details with id: {}" , vphone);

        return vphone;
    }



    @ApiOperation(value = "Updates the Vphone instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vphone editVphone(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname, @RequestParam("middleinitial") Character middleinitial, @RequestParam("phonenumber") String phonenumber, @RequestParam("employeenumber") String employeenumber, @RequestParam("deptnumber") String deptnumber, @RequestParam("deptname") String deptname, @RequestBody Vphone vphone) {

        vphone.setLastname(lastname);
        vphone.setFirstname(firstname);
        vphone.setMiddleinitial(middleinitial);
        vphone.setPhonenumber(phonenumber);
        vphone.setEmployeenumber(employeenumber);
        vphone.setDeptnumber(deptnumber);
        vphone.setDeptname(deptname);

        LOGGER.debug("Vphone details with id is updated with: {}" , vphone);

        return vphoneService.update(vphone);
    }


    @ApiOperation(value = "Deletes the Vphone instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVphone(@RequestParam("lastname") String lastname, @RequestParam("firstname") String firstname, @RequestParam("middleinitial") Character middleinitial, @RequestParam("phonenumber") String phonenumber, @RequestParam("employeenumber") String employeenumber, @RequestParam("deptnumber") String deptnumber, @RequestParam("deptname") String deptname) {

        VphoneId vphoneId = new VphoneId();
        vphoneId.setLastname(lastname);
        vphoneId.setFirstname(firstname);
        vphoneId.setMiddleinitial(middleinitial);
        vphoneId.setPhonenumber(phonenumber);
        vphoneId.setEmployeenumber(employeenumber);
        vphoneId.setDeptnumber(deptnumber);
        vphoneId.setDeptname(deptname);

        LOGGER.debug("Deleting Vphone with id: {}" , vphoneId);
        Vphone vphone = vphoneService.delete(vphoneId);

        return vphone != null;
    }


    /**
     * @deprecated Use {@link #findVphones(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vphone instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vphone> searchVphonesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vphones list by query filter:{}", (Object) queryFilters);
        return vphoneService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vphone instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vphone> findVphones(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vphones list by filter:", query);
        return vphoneService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vphone instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vphone> filterVphones(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vphones list by filter", query);
        return vphoneService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVphones(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vphoneService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportVphonesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vphone.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vphoneService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vphone instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVphones( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vphones");
		return vphoneService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVphoneAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vphoneService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VphoneService instance
	 */
	protected void setVphoneService(VphoneService service) {
		this.vphoneService = service;
	}

}