/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.InputStream;
import java.sql.Date;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;
import com.wavemaker.commons.json.views.JsonViews.BlobAsUrlView;
import com.wavemaker.commons.wrapper.IntegerWrapper;
import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import com.testingallprocedurescenarios.dbscenarios.service.DbscenariosQueryExecutorService;
import com.testingallprocedurescenarios.dbscenarios.models.query.*;

@RestController(value = "Dbscenarios.QueryExecutionController")
@RequestMapping("/dbscenarios/queryExecutor")
@Api(value = "QueryExecutionController", description = "controller class for query execution")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private DbscenariosQueryExecutorService queryService;

    @Autowired
	private ExportedFileManager exportedFileManager;

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/HQL_MysqlAllTypesWithAlias", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Mysql All Types With Alias")
    public Page<HqlMysqlAllTypesWithAliasResponse> executeHQL_MysqlAllTypesWithAlias(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: HQL_MysqlAllTypesWithAlias");
        Page<HqlMysqlAllTypesWithAliasResponse> _result = queryService.executeHQL_MysqlAllTypesWithAlias(pageable);
        LOGGER.debug("got the result for named query: HQL_MysqlAllTypesWithAlias, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(HqlMysqlAllTypesWithAliasResponse _content : _result.getContent()) {
            Map<String, Object> _properties = new HashMap(1);
            _properties.put("_fieldName_", "blobcol");
            if(_content.getBlobcol() != null) {
                _content.setBlobcol(_uriBuilder.buildAndExpand(_properties).toUriString().getBytes());
            } else {
                _content.setBlobcol(null);
            }
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobcol in query HQL_MysqlAllTypesWithAlias")
    @RequestMapping(value = "/queries/HQL_MysqlAllTypesWithAlias/content/blobcol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobcolContentForHQL_MysqlAllTypesWithAlias(@RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: HQL_MysqlAllTypesWithAlias");

        InputStream _result = queryService.getBlobcolContentForHQL_MysqlAllTypesWithAlias();
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query HQL_MysqlAllTypesWithAlias")
    @RequestMapping(value = "/queries/HQL_MysqlAllTypesWithAlias/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportHQL_MysqlAllTypesWithAlias(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: HQL_MysqlAllTypesWithAlias");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "HQL_MysqlAllTypesWithAlias";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportHQL_MysqlAllTypesWithAlias( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_GetBelowPK10", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Get Values below 10")
    public Page<SvGetBelowPk10Response> executeSV_GetBelowPK10(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetBelowPK10");
        Page<SvGetBelowPk10Response> _result = queryService.executeSV_GetBelowPK10(pageable);
        LOGGER.debug("got the result for named query: SV_GetBelowPK10, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(SvGetBelowPk10Response _content : _result.getContent()) {
            Map<String, Object> _properties = new HashMap(1);
            _properties.put("_fieldName_", "blobCol");
            if(_content.getBlobCol() != null) {
                _content.setBlobCol(_uriBuilder.buildAndExpand(_properties).toUriString().getBytes());
            } else {
                _content.setBlobCol(null);
            }
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobCol in query SV_GetBelowPK10")
    @RequestMapping(value = "/queries/SV_GetBelowPK10/content/blobCol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobColContentForSV_GetBelowPK10(@RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetBelowPK10");

        InputStream _result = queryService.getBlobColContentForSV_GetBelowPK10();
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_GetBelowPK10")
    @RequestMapping(value = "/queries/SV_GetBelowPK10/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_GetBelowPK10(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_GetBelowPK10");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_GetBelowPK10";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_GetBelowPK10( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_GetSingleRecord", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Get Single Record")
    public SvGetSingleRecordResponse executeSV_GetSingleRecord(@RequestParam(value = "Id") Integer id, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetSingleRecord");
        SvGetSingleRecordResponse _result = queryService.executeSV_GetSingleRecord(id);
        LOGGER.debug("got the result for named query: SV_GetSingleRecord, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        if(_result.getBlobCol() != null) {
            _result.setBlobCol(_uriBuilder.buildAndExpand(Collections.singletonMap("_fieldName_", "blobCol")).toUriString().getBytes());
        } else {
            _result.setBlobCol(null);
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobCol in query SV_GetSingleRecord")
    @RequestMapping(value = "/queries/SV_GetSingleRecord/content/blobCol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobColContentForSV_GetSingleRecord(@RequestParam(value = "Id") Integer id, @RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetSingleRecord");

        InputStream _result = queryService.getBlobColContentForSV_GetSingleRecord(id);
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_LoggedinUser", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Logged in user")
    public Page<SvLoggedinUserResponse> executeSV_LoggedinUser(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_LoggedinUser");
        Page<SvLoggedinUserResponse> _result = queryService.executeSV_LoggedinUser(pageable);
        LOGGER.debug("got the result for named query: SV_LoggedinUser, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(SvLoggedinUserResponse _content : _result.getContent()) {
            Map<String, Object> _properties = new HashMap(1);
            _properties.put("_fieldName_", "blobCol");
            if(_content.getBlobCol() != null) {
                _content.setBlobCol(_uriBuilder.buildAndExpand(_properties).toUriString().getBytes());
            } else {
                _content.setBlobCol(null);
            }
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobCol in query SV_LoggedinUser")
    @RequestMapping(value = "/queries/SV_LoggedinUser/content/blobCol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobColContentForSV_LoggedinUser(@RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_LoggedinUser");

        InputStream _result = queryService.getBlobColContentForSV_LoggedinUser();
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_LoggedinUser")
    @RequestMapping(value = "/queries/SV_LoggedinUser/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_LoggedinUser(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_LoggedinUser");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_LoggedinUser";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_LoggedinUser( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

    @RequestMapping(value = "/queries/SV_InsertQueryUsingSystemParams", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Insert Query Using System Params")
    public IntegerWrapper executeSV_InsertQueryUsingSystemParams(@Valid @RequestBody SvInsertQueryUsingSystemParamsRequest svInsertQueryUsingSystemParamsRequest, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_InsertQueryUsingSystemParams");
        Integer _result = queryService.executeSV_InsertQueryUsingSystemParams(svInsertQueryUsingSystemParamsRequest);
        LOGGER.debug("got the result for named query: SV_InsertQueryUsingSystemParams, result:{}", _result);
        return new IntegerWrapper(_result);
    }

    @RequestMapping(value = "/queries/SV_ByteDatetime", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "hldfh.sdafsd")
    public Page<SvByteDatetimeResponse> executeSV_ByteDatetime(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_ByteDatetime");
        Page<SvByteDatetimeResponse> _result = queryService.executeSV_ByteDatetime(pageable);
        LOGGER.debug("got the result for named query: SV_ByteDatetime, result:{}", _result);
        return _result;
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_ByteDatetime")
    @RequestMapping(value = "/queries/SV_ByteDatetime/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_ByteDatetime(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_ByteDatetime");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_ByteDatetime";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_ByteDatetime( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_ALlTypesData1", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "SV_ALlTypesData1")
    public Page<SvAllTypesData1Response> executeSV_ALlTypesData1(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_ALlTypesData1");
        Page<SvAllTypesData1Response> _result = queryService.executeSV_ALlTypesData1(pageable);
        LOGGER.debug("got the result for named query: SV_ALlTypesData1, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(SvAllTypesData1Response _content : _result.getContent()) {
            Map<String, Object> _properties = new HashMap(1);
            _properties.put("_fieldName_", "blobCol");
            if(_content.getBlobCol() != null) {
                _content.setBlobCol(_uriBuilder.buildAndExpand(_properties).toUriString().getBytes());
            } else {
                _content.setBlobCol(null);
            }
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobCol in query SV_ALlTypesData1")
    @RequestMapping(value = "/queries/SV_ALlTypesData1/content/blobCol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobColContentForSV_ALlTypesData1(@RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_ALlTypesData1");

        InputStream _result = queryService.getBlobColContentForSV_ALlTypesData1();
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_ALlTypesData1")
    @RequestMapping(value = "/queries/SV_ALlTypesData1/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_ALlTypesData1(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_ALlTypesData1");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_ALlTypesData1";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_ALlTypesData1( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_GetByDateCol", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Get By date Col")
    public Page<SvGetByDateColResponse> executeSV_GetByDateCol(@RequestParam(value = "datecol") Date datecol, Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetByDateCol");
        Page<SvGetByDateColResponse> _result = queryService.executeSV_GetByDateCol(datecol, pageable);
        LOGGER.debug("got the result for named query: SV_GetByDateCol, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(SvGetByDateColResponse _content : _result.getContent()) {
            Map<String, Object> _properties = new HashMap(1);
            _properties.put("_fieldName_", "blobCol");
            if(_content.getBlobCol() != null) {
                _content.setBlobCol(_uriBuilder.buildAndExpand(_properties).toUriString().getBytes());
            } else {
                _content.setBlobCol(null);
            }
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobCol in query SV_GetByDateCol")
    @RequestMapping(value = "/queries/SV_GetByDateCol/content/blobCol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobColContentForSV_GetByDateCol(@RequestParam(value = "datecol") Date datecol, @RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetByDateCol");

        InputStream _result = queryService.getBlobColContentForSV_GetByDateCol(datecol);
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_GetByDateCol")
    @RequestMapping(value = "/queries/SV_GetByDateCol/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_GetByDateCol(@RequestParam(value = "datecol") Date datecol, @RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_GetByDateCol");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_GetByDateCol";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_GetByDateCol(datecol,  exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_AllTypesData", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "All Types Data")
    public Page<SvAllTypesDataResponse> executeSV_AllTypesData(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_AllTypesData");
        Page<SvAllTypesDataResponse> _result = queryService.executeSV_AllTypesData(pageable);
        LOGGER.debug("got the result for named query: SV_AllTypesData, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(SvAllTypesDataResponse _content : _result.getContent()) {
            Map<String, Object> _properties = new HashMap(1);
            _properties.put("_fieldName_", "blobCol");
            if(_content.getBlobCol() != null) {
                _content.setBlobCol(_uriBuilder.buildAndExpand(_properties).toUriString().getBytes());
            } else {
                _content.setBlobCol(null);
            }
        }
        return _result;
    }

    @ApiOperation(value = "Retrives the BLOB content for property blobCol in query SV_AllTypesData")
    @RequestMapping(value = "/queries/SV_AllTypesData/content/blobCol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobColContentForSV_AllTypesData(@RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_AllTypesData");

        InputStream _result = queryService.getBlobColContentForSV_AllTypesData();
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_AllTypesData")
    @RequestMapping(value = "/queries/SV_AllTypesData/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_AllTypesData(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_AllTypesData");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_AllTypesData";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_AllTypesData( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

}