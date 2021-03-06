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

import com.testingallprocedurescenarios.sample2.Vstafac2;
import com.testingallprocedurescenarios.sample2.Vstafac2Id;


/**
 * ServiceImpl object for domain model class Vstafac2.
 *
 * @see Vstafac2
 */
@Service("SAMPLE2.Vstafac2Service")
@Validated
public class Vstafac2ServiceImpl implements Vstafac2Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Vstafac2ServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE2.Vstafac2Dao")
    private WMGenericDao<Vstafac2, Vstafac2Id> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Vstafac2, Vstafac2Id> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac2 create(Vstafac2 vstafac2) {
        LOGGER.debug("Creating a new Vstafac2 with information: {}", vstafac2);

        Vstafac2 vstafac2Created = this.wmGenericDao.create(vstafac2);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(vstafac2Created);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac2 getById(Vstafac2Id vstafac2Id) {
        LOGGER.debug("Finding Vstafac2 by id: {}", vstafac2Id);
        return this.wmGenericDao.findById(vstafac2Id);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac2 findById(Vstafac2Id vstafac2Id) {
        LOGGER.debug("Finding Vstafac2 by id: {}", vstafac2Id);
        try {
            return this.wmGenericDao.findById(vstafac2Id);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Vstafac2 found with id: {}", vstafac2Id, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public List<Vstafac2> findByMultipleIds(List<Vstafac2Id> vstafac2Ids, boolean orderedReturn) {
        LOGGER.debug("Finding Vstafac2s by ids: {}", vstafac2Ids);

        return this.wmGenericDao.findByMultipleIds(vstafac2Ids, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac2 update(Vstafac2 vstafac2) {
        LOGGER.debug("Updating Vstafac2 with information: {}", vstafac2);

        this.wmGenericDao.update(vstafac2);
        this.wmGenericDao.refresh(vstafac2);

        return vstafac2;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Vstafac2 delete(Vstafac2Id vstafac2Id) {
        LOGGER.debug("Deleting Vstafac2 with id: {}", vstafac2Id);
        Vstafac2 deleted = this.wmGenericDao.findById(vstafac2Id);
        if (deleted == null) {
            LOGGER.debug("No Vstafac2 found with id: {}", vstafac2Id);
            throw new EntityNotFoundException(String.valueOf(vstafac2Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public void delete(Vstafac2 vstafac2) {
        LOGGER.debug("Deleting Vstafac2 with {}", vstafac2);
        this.wmGenericDao.delete(vstafac2);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Vstafac2> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Vstafac2s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Vstafac2> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Vstafac2s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Vstafac2 to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Vstafac2 to {} format", options.getExportType());
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