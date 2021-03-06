/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
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

import com.testingallprocedurescenarios.db123__.AllExternalTypes;
import com.testingallprocedurescenarios.db123__.AllExternalTypesId;
import com.testingallprocedurescenarios.db123__.service.AllExternalTypesService;


/**
 * Controller object for domain model class AllExternalTypes.
 * @see AllExternalTypes
 */
@RestController("db123__.AllExternalTypesController")
@Api(value = "AllExternalTypesController", description = "Exposes APIs to work with AllExternalTypes resource.")
@RequestMapping("/db123__/AllExternalTypes")
public class AllExternalTypesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllExternalTypesController.class);

    @Autowired
	@Qualifier("db123__.AllExternalTypesService")
	private AllExternalTypesService allExternalTypesService;

	@Autowired
	private ExportedFileManager exportedFileManager;

	@ApiOperation(value = "Creates a new AllExternalTypes instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllExternalTypes createAllExternalTypes(@RequestBody AllExternalTypes allExternalTypes) {
		LOGGER.debug("Create AllExternalTypes with information: {}" , allExternalTypes);

		allExternalTypes = allExternalTypesService.create(allExternalTypes);
		LOGGER.debug("Created AllExternalTypes with information: {}" , allExternalTypes);

	    return allExternalTypes;
	}

    @ApiOperation(value = "Returns the AllExternalTypes instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllExternalTypes getAllExternalTypes(@RequestParam("bigintCol") BigInteger bigintCol, @RequestParam("bitCol") Boolean bitCol, @RequestParam("char10Col") String char10Col, @RequestParam("dateCol") Date dateCol, @RequestParam("datetimeCol") LocalDateTime datetimeCol, @RequestParam("decimal18p0s") BigInteger decimal18p0s, @RequestParam("floatCol") BigDecimal floatCol, @RequestParam("intCol") Integer intCol, @RequestParam("numeric18p0s") BigInteger numeric18p0s, @RequestParam("smallintCol") Short smallintCol, @RequestParam("textCol") String textCol, @RequestParam("timeCol") Time timeCol, @RequestParam("timestampCol") Timestamp timestampCol, @RequestParam("tinyintCol") Short tinyintCol, @RequestParam("varchar50Col") String varchar50Col, @RequestParam("uuidCol") String uuidCol) {

        AllExternalTypesId allexternaltypesId = new AllExternalTypesId();
        allexternaltypesId.setBigintCol(bigintCol);
        allexternaltypesId.setBitCol(bitCol);
        allexternaltypesId.setChar10Col(char10Col);
        allexternaltypesId.setDateCol(dateCol);
        allexternaltypesId.setDatetimeCol(datetimeCol);
        allexternaltypesId.setDecimal18p0s(decimal18p0s);
        allexternaltypesId.setFloatCol(floatCol);
        allexternaltypesId.setIntCol(intCol);
        allexternaltypesId.setNumeric18p0s(numeric18p0s);
        allexternaltypesId.setSmallintCol(smallintCol);
        allexternaltypesId.setTextCol(textCol);
        allexternaltypesId.setTimeCol(timeCol);
        allexternaltypesId.setTimestampCol(timestampCol);
        allexternaltypesId.setTinyintCol(tinyintCol);
        allexternaltypesId.setVarchar50Col(varchar50Col);
        allexternaltypesId.setUuidCol(uuidCol);

        LOGGER.debug("Getting AllExternalTypes with id: {}" , allexternaltypesId);
        AllExternalTypes allExternalTypes = allExternalTypesService.getById(allexternaltypesId);
        LOGGER.debug("AllExternalTypes details with id: {}" , allExternalTypes);

        return allExternalTypes;
    }



    @ApiOperation(value = "Updates the AllExternalTypes instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public AllExternalTypes editAllExternalTypes(@RequestParam("bigintCol") BigInteger bigintCol, @RequestParam("bitCol") Boolean bitCol, @RequestParam("char10Col") String char10Col, @RequestParam("dateCol") Date dateCol, @RequestParam("datetimeCol") LocalDateTime datetimeCol, @RequestParam("decimal18p0s") BigInteger decimal18p0s, @RequestParam("floatCol") BigDecimal floatCol, @RequestParam("intCol") Integer intCol, @RequestParam("numeric18p0s") BigInteger numeric18p0s, @RequestParam("smallintCol") Short smallintCol, @RequestParam("textCol") String textCol, @RequestParam("timeCol") Time timeCol, @RequestParam("timestampCol") Timestamp timestampCol, @RequestParam("tinyintCol") Short tinyintCol, @RequestParam("varchar50Col") String varchar50Col, @RequestParam("uuidCol") String uuidCol, @RequestBody AllExternalTypes allExternalTypes) {

        allExternalTypes.setBigintCol(bigintCol);
        allExternalTypes.setBitCol(bitCol);
        allExternalTypes.setChar10Col(char10Col);
        allExternalTypes.setDateCol(dateCol);
        allExternalTypes.setDatetimeCol(datetimeCol);
        allExternalTypes.setDecimal18p0s(decimal18p0s);
        allExternalTypes.setFloatCol(floatCol);
        allExternalTypes.setIntCol(intCol);
        allExternalTypes.setNumeric18p0s(numeric18p0s);
        allExternalTypes.setSmallintCol(smallintCol);
        allExternalTypes.setTextCol(textCol);
        allExternalTypes.setTimeCol(timeCol);
        allExternalTypes.setTimestampCol(timestampCol);
        allExternalTypes.setTinyintCol(tinyintCol);
        allExternalTypes.setVarchar50Col(varchar50Col);
        allExternalTypes.setUuidCol(uuidCol);

        LOGGER.debug("AllExternalTypes details with id is updated with: {}" , allExternalTypes);

        return allExternalTypesService.update(allExternalTypes);
    }


    @ApiOperation(value = "Deletes the AllExternalTypes instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteAllExternalTypes(@RequestParam("bigintCol") BigInteger bigintCol, @RequestParam("bitCol") Boolean bitCol, @RequestParam("char10Col") String char10Col, @RequestParam("dateCol") Date dateCol, @RequestParam("datetimeCol") LocalDateTime datetimeCol, @RequestParam("decimal18p0s") BigInteger decimal18p0s, @RequestParam("floatCol") BigDecimal floatCol, @RequestParam("intCol") Integer intCol, @RequestParam("numeric18p0s") BigInteger numeric18p0s, @RequestParam("smallintCol") Short smallintCol, @RequestParam("textCol") String textCol, @RequestParam("timeCol") Time timeCol, @RequestParam("timestampCol") Timestamp timestampCol, @RequestParam("tinyintCol") Short tinyintCol, @RequestParam("varchar50Col") String varchar50Col, @RequestParam("uuidCol") String uuidCol) {

        AllExternalTypesId allexternaltypesId = new AllExternalTypesId();
        allexternaltypesId.setBigintCol(bigintCol);
        allexternaltypesId.setBitCol(bitCol);
        allexternaltypesId.setChar10Col(char10Col);
        allexternaltypesId.setDateCol(dateCol);
        allexternaltypesId.setDatetimeCol(datetimeCol);
        allexternaltypesId.setDecimal18p0s(decimal18p0s);
        allexternaltypesId.setFloatCol(floatCol);
        allexternaltypesId.setIntCol(intCol);
        allexternaltypesId.setNumeric18p0s(numeric18p0s);
        allexternaltypesId.setSmallintCol(smallintCol);
        allexternaltypesId.setTextCol(textCol);
        allexternaltypesId.setTimeCol(timeCol);
        allexternaltypesId.setTimestampCol(timestampCol);
        allexternaltypesId.setTinyintCol(tinyintCol);
        allexternaltypesId.setVarchar50Col(varchar50Col);
        allexternaltypesId.setUuidCol(uuidCol);

        LOGGER.debug("Deleting AllExternalTypes with id: {}" , allexternaltypesId);
        AllExternalTypes allExternalTypes = allExternalTypesService.delete(allexternaltypesId);

        return allExternalTypes != null;
    }


    /**
     * @deprecated Use {@link #findAllExternalTypes(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of AllExternalTypes instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AllExternalTypes> searchAllExternalTypesByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering AllExternalTypes list by query filter:{}", (Object) queryFilters);
        return allExternalTypesService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of AllExternalTypes instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AllExternalTypes> findAllExternalTypes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AllExternalTypes list by filter:", query);
        return allExternalTypesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of AllExternalTypes instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<AllExternalTypes> filterAllExternalTypes(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering AllExternalTypes list by filter", query);
        return allExternalTypesService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportAllExternalTypes(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return allExternalTypesService.export(exportType, query, pageable);
    }

    @ApiOperation(value = "Returns a URL to download a file for the data matching the optional query (q) request param and the required fields provided in the Export Options.") 
    @RequestMapping(value = "/export", method = {RequestMethod.POST}, consumes = "application/json")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportAllExternalTypesAndGetURL(@RequestBody DataExportOptions exportOptions, Pageable pageable) {
        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = AllExternalTypes.class.getSimpleName();
        }
        exportedFileName += exportOptions.getExportType().getExtension();
        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName, outputStream -> allExternalTypesService.export(exportOptions, pageable, outputStream));
        return new StringWrapper(exportedUrl);
    }

	@ApiOperation(value = "Returns the total count of AllExternalTypes instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countAllExternalTypes( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting AllExternalTypes");
		return allExternalTypesService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getAllExternalTypesAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return allExternalTypesService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service AllExternalTypesService instance
	 */
	protected void setAllExternalTypesService(AllExternalTypesService service) {
		this.allExternalTypesService = service;
	}

}