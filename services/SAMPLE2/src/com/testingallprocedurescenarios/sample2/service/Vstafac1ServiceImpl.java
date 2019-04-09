/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

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

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingallprocedurescenarios.sample2.Vstafac1;
import com.testingallprocedurescenarios.sample2.Vstafac1Id;


/**
 * ServiceImpl object for domain model class Vstafac1.
 *
 * @see Vstafac1
 */
@Service("SAMPLE2.Vstafac1Service")
@Validated
public class Vstafac1ServiceImpl implements Vstafac1Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Vstafac1ServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE2.Vstafac1Dao")
    private WMGenericDao<Vstafac1, Vstafac1Id> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Vstafac1, Vstafac1Id> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac1 create(Vstafac1 vstafac1) {
        LOGGER.debug("Creating a new Vstafac1 with information: {}", vstafac1);

        Vstafac1 vstafac1Created = this.wmGenericDao.create(vstafac1);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(vstafac1Created);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac1 getById(Vstafac1Id vstafac1Id) {
        LOGGER.debug("Finding Vstafac1 by id: {}", vstafac1Id);
        return this.wmGenericDao.findById(vstafac1Id);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac1 findById(Vstafac1Id vstafac1Id) {
        LOGGER.debug("Finding Vstafac1 by id: {}", vstafac1Id);
        try {
            return this.wmGenericDao.findById(vstafac1Id);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Vstafac1 found with id: {}", vstafac1Id, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public List<Vstafac1> findByMultipleIds(List<Vstafac1Id> vstafac1Ids, boolean orderedReturn) {
        LOGGER.debug("Finding Vstafac1s by ids: {}", vstafac1Ids);

        return this.wmGenericDao.findByMultipleIds(vstafac1Ids, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac1 update(Vstafac1 vstafac1) {
        LOGGER.debug("Updating Vstafac1 with information: {}", vstafac1);

        this.wmGenericDao.update(vstafac1);
        this.wmGenericDao.refresh(vstafac1);

        return vstafac1;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac1 delete(Vstafac1Id vstafac1Id) {
        LOGGER.debug("Deleting Vstafac1 with id: {}", vstafac1Id);
        Vstafac1 deleted = this.wmGenericDao.findById(vstafac1Id);
        if (deleted == null) {
            LOGGER.debug("No Vstafac1 found with id: {}", vstafac1Id);
            throw new EntityNotFoundException(String.valueOf(vstafac1Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public void delete(Vstafac1 vstafac1) {
        LOGGER.debug("Deleting Vstafac1 with {}", vstafac1);
        this.wmGenericDao.delete(vstafac1);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Vstafac1> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Vstafac1s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Vstafac1> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Vstafac1s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Vstafac1 to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Vstafac1 to {} format", options.getExportType());
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