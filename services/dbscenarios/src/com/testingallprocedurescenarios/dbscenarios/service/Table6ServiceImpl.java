/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.service;

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

import com.testingallprocedurescenarios.dbscenarios.Table6;


/**
 * ServiceImpl object for domain model class Table6.
 *
 * @see Table6
 */
@Service("dbscenarios.Table6Service")
@Validated
public class Table6ServiceImpl implements Table6Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table6ServiceImpl.class);


    @Autowired
    @Qualifier("dbscenarios.Table6Dao")
    private WMGenericDao<Table6, Long> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Table6, Long> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
    public Table6 create(Table6 table6) {
        LOGGER.debug("Creating a new Table6 with information: {}", table6);

        Table6 table6Created = this.wmGenericDao.create(table6);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(table6Created);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Table6 getById(Long table6Id) {
        LOGGER.debug("Finding Table6 by id: {}", table6Id);
        return this.wmGenericDao.findById(table6Id);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Table6 findById(Long table6Id) {
        LOGGER.debug("Finding Table6 by id: {}", table6Id);
        try {
            return this.wmGenericDao.findById(table6Id);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Table6 found with id: {}", table6Id, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public List<Table6> findByMultipleIds(List<Long> table6Ids, boolean orderedReturn) {
        LOGGER.debug("Finding Table6s by ids: {}", table6Ids);

        return this.wmGenericDao.findByMultipleIds(table6Ids, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbscenariosTransactionManager")
    @Override
    public Table6 update(Table6 table6) {
        LOGGER.debug("Updating Table6 with information: {}", table6);

        this.wmGenericDao.update(table6);
        this.wmGenericDao.refresh(table6);

        return table6;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
    public Table6 delete(Long table6Id) {
        LOGGER.debug("Deleting Table6 with id: {}", table6Id);
        Table6 deleted = this.wmGenericDao.findById(table6Id);
        if (deleted == null) {
            LOGGER.debug("No Table6 found with id: {}", table6Id);
            throw new EntityNotFoundException(String.valueOf(table6Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
    public void delete(Table6 table6) {
        LOGGER.debug("Deleting Table6 with {}", table6);
        this.wmGenericDao.delete(table6);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<Table6> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Table6s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<Table6> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Table6s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service dbscenarios for table Table6 to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service dbscenarios for table Table6 to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}