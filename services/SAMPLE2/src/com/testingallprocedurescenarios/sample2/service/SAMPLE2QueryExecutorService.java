/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportOptions;

import com.testingallprocedurescenarios.sample2.models.query.*;

public interface SAMPLE2QueryExecutorService {

    Page<SvGetAllTypesResponse> executeSV_GetAllTypes(Pageable pageable);

    InputStream getBlobcolContentForSV_GetAllTypes() throws EntityNotFoundException;

    void exportSV_GetAllTypes(ExportOptions exportOptions, Pageable pageable, OutputStream outputStream);

}