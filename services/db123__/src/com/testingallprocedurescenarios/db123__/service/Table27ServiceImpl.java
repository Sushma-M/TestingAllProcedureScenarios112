/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__.service;

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

import com.testingallprocedurescenarios.db123__.Table27;


/**
 * ServiceImpl object for domain model class Table27.
 *
 * @see Table27
 */
@Service("db123__.Table27Service")
@Validated
public class Table27ServiceImpl implements Table27Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Table27ServiceImpl.class);


    @Autowired
    @Qualifier("db123__.Table27Dao")
    private WMGenericDao<Table27, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Table27, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public Table27 create(Table27 table27) {
        LOGGER.debug("Creating a new Table27 with information: {}", table27);

        Table27 table27Created = this.wmGenericDao.create(table27);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(table27Created);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Table27 getById(Integer table27Id) {
        LOGGER.debug("Finding Table27 by id: {}", table27Id);
        return this.wmGenericDao.findById(table27Id);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Table27 findById(Integer table27Id) {
        LOGGER.debug("Finding Table27 by id: {}", table27Id);
        try {
            return this.wmGenericDao.findById(table27Id);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Table27 found with id: {}", table27Id, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public List<Table27> findByMultipleIds(List<Integer> table27Ids, boolean orderedReturn) {
        LOGGER.debug("Finding Table27s by ids: {}", table27Ids);

        return this.wmGenericDao.findByMultipleIds(table27Ids, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "db123__TransactionManager")
    @Override
    public Table27 update(Table27 table27) {
        LOGGER.debug("Updating Table27 with information: {}", table27);

        this.wmGenericDao.update(table27);
        this.wmGenericDao.refresh(table27);

        return table27;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public Table27 delete(Integer table27Id) {
        LOGGER.debug("Deleting Table27 with id: {}", table27Id);
        Table27 deleted = this.wmGenericDao.findById(table27Id);
        if (deleted == null) {
            LOGGER.debug("No Table27 found with id: {}", table27Id);
            throw new EntityNotFoundException(String.valueOf(table27Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public void delete(Table27 table27) {
        LOGGER.debug("Deleting Table27 with {}", table27);
        this.wmGenericDao.delete(table27);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<Table27> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Table27s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<Table27> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Table27s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service db123__ for table Table27 to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service db123__ for table Table27 to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}