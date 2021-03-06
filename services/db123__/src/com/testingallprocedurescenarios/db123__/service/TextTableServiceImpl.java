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

import com.testingallprocedurescenarios.db123__.TextTable;


/**
 * ServiceImpl object for domain model class TextTable.
 *
 * @see TextTable
 */
@Service("db123__.TextTableService")
@Validated
public class TextTableServiceImpl implements TextTableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TextTableServiceImpl.class);


    @Autowired
    @Qualifier("db123__.TextTableDao")
    private WMGenericDao<TextTable, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TextTable, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public TextTable create(TextTable textTableInstance) {
        LOGGER.debug("Creating a new TextTable with information: {}", textTableInstance);

        TextTable textTableInstanceCreated = this.wmGenericDao.create(textTableInstance);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(textTableInstanceCreated);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public TextTable getById(Integer texttableId) {
        LOGGER.debug("Finding TextTable by id: {}", texttableId);
        return this.wmGenericDao.findById(texttableId);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public TextTable findById(Integer texttableId) {
        LOGGER.debug("Finding TextTable by id: {}", texttableId);
        try {
            return this.wmGenericDao.findById(texttableId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No TextTable found with id: {}", texttableId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public List<TextTable> findByMultipleIds(List<Integer> texttableIds, boolean orderedReturn) {
        LOGGER.debug("Finding TextTables by ids: {}", texttableIds);

        return this.wmGenericDao.findByMultipleIds(texttableIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "db123__TransactionManager")
    @Override
    public TextTable update(TextTable textTableInstance) {
        LOGGER.debug("Updating TextTable with information: {}", textTableInstance);

        this.wmGenericDao.update(textTableInstance);
        this.wmGenericDao.refresh(textTableInstance);

        return textTableInstance;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public TextTable delete(Integer texttableId) {
        LOGGER.debug("Deleting TextTable with id: {}", texttableId);
        TextTable deleted = this.wmGenericDao.findById(texttableId);
        if (deleted == null) {
            LOGGER.debug("No TextTable found with id: {}", texttableId);
            throw new EntityNotFoundException(String.valueOf(texttableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "db123__TransactionManager")
    @Override
    public void delete(TextTable textTableInstance) {
        LOGGER.debug("Deleting TextTable with {}", textTableInstance);
        this.wmGenericDao.delete(textTableInstance);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<TextTable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all TextTables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager")
    @Override
    public Page<TextTable> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all TextTables");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service db123__ for table TextTable to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "db123__TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service db123__ for table TextTable to {} format", options.getExportType());
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