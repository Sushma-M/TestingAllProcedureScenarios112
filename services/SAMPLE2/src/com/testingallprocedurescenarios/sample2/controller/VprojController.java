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

import com.testingallprocedurescenarios.sample2.Vproj;
import com.testingallprocedurescenarios.sample2.VprojId;
import com.testingallprocedurescenarios.sample2.service.VprojService;


/**
 * Controller object for domain model class Vproj.
 * @see Vproj
 */
@RestController("SAMPLE2.VprojController")
@Api(value = "VprojController", description = "Exposes APIs to work with Vproj resource.")
@RequestMapping("/SAMPLE2/Vproj")
public class VprojController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VprojController.class);

    @Autowired
	@Qualifier("SAMPLE2.VprojService")
	private VprojService vprojService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new Vproj instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vproj createVproj(@RequestBody Vproj vproj) {
		LOGGER.debug("Create Vproj with information: {}" , vproj);

		vproj = vprojService.create(vproj);
		LOGGER.debug("Created Vproj with information: {}" , vproj);

	    return vproj;
	}

    @ApiOperation(value = "Returns the Vproj instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vproj getVproj(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("deptno") String deptno, @RequestParam("respemp") String respemp, @RequestParam("prstaff") Float prstaff, @RequestParam("prstdate") Date prstdate, @RequestParam("prendate") Date prendate, @RequestParam("majproj") String majproj) {

        VprojId vprojId = new VprojId();
        vprojId.setProjno(projno);
        vprojId.setProjname(projname);
        vprojId.setDeptno(deptno);
        vprojId.setRespemp(respemp);
        vprojId.setPrstaff(prstaff);
        vprojId.setPrstdate(prstdate);
        vprojId.setPrendate(prendate);
        vprojId.setMajproj(majproj);

        LOGGER.debug("Getting Vproj with id: {}" , vprojId);
        Vproj vproj = vprojService.getById(vprojId);
        LOGGER.debug("Vproj details with id: {}" , vproj);

        return vproj;
    }



    @ApiOperation(value = "Updates the Vproj instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Vproj editVproj(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("deptno") String deptno, @RequestParam("respemp") String respemp, @RequestParam("prstaff") Float prstaff, @RequestParam("prstdate") Date prstdate, @RequestParam("prendate") Date prendate, @RequestParam("majproj") String majproj, @RequestBody Vproj vproj) {

        vproj.setProjno(projno);
        vproj.setProjname(projname);
        vproj.setDeptno(deptno);
        vproj.setRespemp(respemp);
        vproj.setPrstaff(prstaff);
        vproj.setPrstdate(prstdate);
        vproj.setPrendate(prendate);
        vproj.setMajproj(majproj);

        LOGGER.debug("Vproj details with id is updated with: {}" , vproj);

        return vprojService.update(vproj);
    }


    @ApiOperation(value = "Deletes the Vproj instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVproj(@RequestParam("projno") String projno, @RequestParam("projname") String projname, @RequestParam("deptno") String deptno, @RequestParam("respemp") String respemp, @RequestParam("prstaff") Float prstaff, @RequestParam("prstdate") Date prstdate, @RequestParam("prendate") Date prendate, @RequestParam("majproj") String majproj) {

        VprojId vprojId = new VprojId();
        vprojId.setProjno(projno);
        vprojId.setProjname(projname);
        vprojId.setDeptno(deptno);
        vprojId.setRespemp(respemp);
        vprojId.setPrstaff(prstaff);
        vprojId.setPrstdate(prstdate);
        vprojId.setPrendate(prendate);
        vprojId.setMajproj(majproj);

        LOGGER.debug("Deleting Vproj with id: {}" , vprojId);
        Vproj vproj = vprojService.delete(vprojId);

        return vproj != null;
    }


    /**
     * @deprecated Use {@link #findVprojs(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Vproj instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vproj> searchVprojsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Vprojs list by query filter:{}", (Object) queryFilters);
        return vprojService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vproj instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vproj> findVprojs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vprojs list by filter:", query);
        return vprojService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Vproj instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Vproj> filterVprojs(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Vprojs list by filter", query);
        return vprojService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVprojs(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vprojService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportVprojsAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = Vproj.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> vprojService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of Vproj instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVprojs( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Vprojs");
		return vprojService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVprojAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vprojService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VprojService instance
	 */
	protected void setVprojService(VprojService service) {
		this.vprojService = service;
	}

}