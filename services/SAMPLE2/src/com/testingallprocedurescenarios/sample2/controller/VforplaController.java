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

import com.testingallprocedurescenarios.sample2.Vforpla;
import com.testingallprocedurescenarios.sample2.VforplaId;
import com.testingallprocedurescenarios.sample2.service.VforplaService;


/**
 * Controller object for domain model class Vforpla.
 * @see Vforpla
 */
@RestController("SAMPLE2.VforplaController")
@Api(value = "VforplaController", description = "Exposes APIs to work with Vforpla resource.")
@RequestMapping("/SAMPLE2/Vforpla")
public class VforplaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VforplaController.class);

    @Autowired
	@Qualifier("SAMPLE2.VforplaService")
	private VforplaService vforplaService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vforpla instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vforpla createVforpla(@RequestBody Vforpla vforpla) {
		LOGGER.debug("Create Vforpla with information: {}" , vforpla);

		vforpla = vforplaService.create(vforpla);
		LOGGER.debug("Created Vforpla with information: {}" , vforpla);

	    return vforpla;
	}

    @ApiOperation(value = "Returns the Vforpla instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vforpla getVforpla(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("respemp") String respemp, @RequestParam("projdep") String projdep, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname) {

        VforplaId vforplaId = new VforplaId();
        vforplaId.setProjno(projno);
        vforplaId.setProjname(projname);
        vforplaId.setRespemp(respemp);
        vforplaId.setProjdep(projdep);
        vforplaId.setFrstinit(frstinit);
        vforplaId.setMidinit(midinit);
        vforplaId.setLastname(lastname);

        LOGGER.debug("Getting Vforpla with id: {}" , vforplaId);
        Vforpla vforpla = vforplaService.getById(vforplaId);
        LOGGER.debug("Vforpla details with id: {}" , vforpla);

        return vforpla;
    }



    @ApiOperation(value = "Updates the Vforpla instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vforpla editVforpla(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("respemp") String respemp, @RequestParam("projdep") String projdep, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestBody Vforpla vforpla) {

        vforpla.setProjno(projno);
        vforpla.setProjname(projname);
        vforpla.setRespemp(respemp);
        vforpla.setProjdep(projdep);
        vforpla.setFrstinit(frstinit);
        vforpla.setMidinit(midinit);
        vforpla.setLastname(lastname);

        LOGGER.debug("Vforpla details with id is updated with: {}" , vforpla);

        return vforplaService.update(vforpla);
    }

	@ApiOperation(value = "Partially updates the  Vforpla instance associated with the given composite-id.")
	@RequestMapping(value = "/composite-id", method = RequestMethod.PATCH)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vforpla patchVforpla(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("respemp") String respemp, @RequestParam("projdep") String projdep, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname, @RequestBody @MapTo(Vforpla.class) Map<String, Object> vforplaPatch) {

        VforplaId vforplaId = new VforplaId();
        vforplaId.setProjno(projno);
        vforplaId.setProjname(projname);
        vforplaId.setRespemp(respemp);
        vforplaId.setProjdep(projdep);
        vforplaId.setFrstinit(frstinit);
        vforplaId.setMidinit(midinit);
        vforplaId.setLastname(lastname);
        LOGGER.debug("Partially updating Vforpla with id: {}" , vforplaId);

        Vforpla vforpla = vforplaService.partialUpdate(vforplaId, vforplaPatch);
        LOGGER.debug("Vforpla details after partial update: {}" , vforpla);

        return vforpla;
    }


    @ApiOperation(value = "Deletes the Vforpla instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVforpla(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("respemp") String respemp, @RequestParam("projdep") String projdep, @RequestParam("frstinit") Character frstinit, @RequestParam("midinit") Character midinit, @RequestParam("lastname") String lastname) {

        VforplaId vforplaId = new VforplaId();
        vforplaId.setProjno(projno);
        vforplaId.setProjname(projname);
        vforplaId.setRespemp(respemp);
        vforplaId.setProjdep(projdep);
        vforplaId.setFrstinit(frstinit);
        vforplaId.setMidinit(midinit);
        vforplaId.setLastname(lastname);

        LOGGER.debug("Deleting Vforpla with id: {}" , vforplaId);
        Vforpla vforpla = vforplaService.delete(vforplaId);

        return vforpla != null;
    }


    /**
     * @deprecated Use {@link #findVforplas(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vforpla instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Vforpla> searchVforplasByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vforplas list by query filter:{}", (Object) queryFilters);
        return vforplaService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vforpla instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vforpla> findVforplas(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vforplas list by filter:", query);
        return vforplaService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vforpla instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Page<Vforpla> filterVforplas(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vforplas list by filter", query);
        return vforplaService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public Downloadable exportVforplas(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vforplaService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @XssDisable
    public StringWrapper exportVforplasAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vforpla.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vforplaService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vforpla instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Long countVforplas( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vforplas");
		return vforplaService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	@XssDisable
	public Page<Map<String, Object>> getVforplaAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vforplaService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VforplaService instance
	 */
	protected void setVforplaService(VforplaService service) {
		this.vforplaService = service;
	}

}