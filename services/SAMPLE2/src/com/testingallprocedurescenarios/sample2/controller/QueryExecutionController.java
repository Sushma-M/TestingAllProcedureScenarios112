/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.wavemaker.commons.wrapper.StringWrapper;
import com.wavemaker.runtime.data.export.ExportOptions;
import com.wavemaker.runtime.file.manager.ExportedFileManager;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import com.testingallprocedurescenarios.sample2.service.SAMPLE2QueryExecutorService;
import com.testingallprocedurescenarios.sample2.models.query.*;

@RestController(value = "SAMPLE2.QueryExecutionController")
@RequestMapping("/SAMPLE2/queryExecutor")
@Api(value = "QueryExecutionController", description = "controller class for query execution")
public class QueryExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryExecutionController.class);

    @Autowired
    private SAMPLE2QueryExecutorService queryService;

    @Autowired
	private ExportedFileManager exportedFileManager;

    @JsonView(BlobAsUrlView.class)
    @RequestMapping(value = "/queries/SV_GetAllTypes", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Get All Types")
    public Page<SvGetAllTypesResponse> executeSV_GetAllTypes(Pageable pageable, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetAllTypes");
        Page<SvGetAllTypesResponse> _result = queryService.executeSV_GetAllTypes(pageable);
        LOGGER.debug("got the result for named query: SV_GetAllTypes, result:{}", _result);
        UriComponentsBuilder _uriBuilder = ServletUriComponentsBuilder.fromRequest(_request);
        _uriBuilder.path("/content/{_fieldName_}");
        for(SvGetAllTypesResponse _content : _result.getContent()) {
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

    @ApiOperation(value = "Retrives the BLOB content for property blobcol in query SV_GetAllTypes")
    @RequestMapping(value = "/queries/SV_GetAllTypes/content/blobcol", method = RequestMethod.GET, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable getBlobcolContentForSV_GetAllTypes(@RequestParam(value="downloadAsAttachment", defaultValue = "false") boolean downloadAsAttachment, HttpServletRequest _request) {
        LOGGER.debug("Executing named query: SV_GetAllTypes");

        InputStream _result = queryService.getBlobcolContentForSV_GetAllTypes();
        return WMMultipartUtils.buildDownloadResponse(_request, _result, downloadAsAttachment);
    }

    @ApiOperation(value = "Returns downloadable file url for query SV_GetAllTypes")
    @RequestMapping(value = "/queries/SV_GetAllTypes/export", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public StringWrapper exportSV_GetAllTypes(@RequestBody ExportOptions exportOptions, Pageable pageable) {
        LOGGER.debug("Exporting named query: SV_GetAllTypes");

        String exportedFileName = exportOptions.getFileName();
        if(exportedFileName == null || exportedFileName.isEmpty()) {
            exportedFileName = "SV_GetAllTypes";
        }
        exportedFileName += exportOptions.getExportType().getExtension();

        String exportedUrl = exportedFileManager.registerAndGetURL(exportedFileName,
                        outputStream -> queryService.exportSV_GetAllTypes( exportOptions, pageable, outputStream));

        return new StringWrapper(exportedUrl);
    }

}