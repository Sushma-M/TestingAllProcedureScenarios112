/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.wavemaker.commons.InvalidInputException;
import com.wavemaker.commons.MessageResource;
import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingallprocedurescenarios.sample2.Vphone;
import com.testingallprocedurescenarios.sample2.VphoneId;


/**
 * ServiceImpl object for domain model class Vphone.
 *
 * @see Vphone
 */
@Service("SAMPLE2.VphoneService")
@Validated
public class VphoneServiceImpl implements VphoneService {

    private static final Logger LOGGER = LoggerFactory.getLogger(VphoneServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE2.VphoneDao")
    private WMGenericDao<Vphone, VphoneId> wmGenericDao;

    @Autowired
    private ObjectMapper objectMapper;


    public void setWMGenericDao(WMGenericDao<Vphone, VphoneId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vphone create(Vphone vphone) {
        LOGGER.debug("Creating a new Vphone with information: {}", vphone);

        Vphone vphoneCreated = this.wmGenericDao.create(vphone);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(vphoneCreated);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Vphone getById(VphoneId vphoneId) {
        LOGGER.debug("Finding Vphone by id: {}", vphoneId);
        return this.wmGenericDao.findById(vphoneId);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Vphone findById(VphoneId vphoneId) {
        LOGGER.debug("Finding Vphone by id: {}", vphoneId);
        try {
            return this.wmGenericDao.findById(vphoneId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Vphone found with id: {}", vphoneId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public List<Vphone> findByMultipleIds(List<VphoneId> vphoneIds, boolean orderedReturn) {
        LOGGER.debug("Finding Vphones by ids: {}", vphoneIds);

        return this.wmGenericDao.findByMultipleIds(vphoneIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLE2TransactionManager")
    @Override
    public Vphone update(Vphone vphone) {
        LOGGER.debug("Updating Vphone with information: {}", vphone);

        this.wmGenericDao.update(vphone);
        this.wmGenericDao.refresh(vphone);

        return vphone;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vphone partialUpdate(VphoneId vphoneId, Map<String, Object>vphonePatch) {
        LOGGER.debug("Partially Updating the Vphone with id: {}", vphoneId);

        Vphone vphone = getById(vphoneId);

        try {
            ObjectReader vphoneReader = this.objectMapper.readerForUpdating(vphone);
            vphone = vphoneReader.readValue(this.objectMapper.writeValueAsString(vphonePatch));
        } catch (IOException ex) {
            LOGGER.debug("There was a problem in applying the patch: {}", vphonePatch, ex);
            throw new InvalidInputException("Could not apply patch",ex);
        }

        vphone = update(vphone);

        return vphone;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vphone delete(VphoneId vphoneId) {
        LOGGER.debug("Deleting Vphone with id: {}", vphoneId);
        Vphone deleted = this.wmGenericDao.findById(vphoneId);
        if (deleted == null) {
            LOGGER.debug("No Vphone found with id: {}", vphoneId);
            throw new EntityNotFoundException(MessageResource.create("com.wavemaker.runtime.entity.not.found"), Vphone.class.getSimpleName(), vphoneId);
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public void delete(Vphone vphone) {
        LOGGER.debug("Deleting Vphone with {}", vphone);
        this.wmGenericDao.delete(vphone);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Vphone> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Vphones");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Vphone> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Vphones");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Vphone to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Vphone to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}