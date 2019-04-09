/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
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

import com.testingallprocedurescenarios.dbscenarios.Uc;


/**
 * ServiceImpl object for domain model class Uc.
 *
 * @see Uc
 */
@Service("dbscenarios.UcService")
@Validated
public class UcServiceImpl implements UcService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UcServiceImpl.class);


    @Autowired
    @Qualifier("dbscenarios.UcDao")
    private WMGenericDao<Uc, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Uc, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
    public Uc create(Uc uc) {
        LOGGER.debug("Creating a new Uc with information: {}", uc);

        Uc ucCreated = this.wmGenericDao.create(uc);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(ucCreated);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Uc getById(Integer ucId) {
        LOGGER.debug("Finding Uc by id: {}", ucId);
        return this.wmGenericDao.findById(ucId);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Uc findById(Integer ucId) {
        LOGGER.debug("Finding Uc by id: {}", ucId);
        try {
            return this.wmGenericDao.findById(ucId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Uc found with id: {}", ucId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public List<Uc> findByMultipleIds(List<Integer> ucIds, boolean orderedReturn) {
        LOGGER.debug("Finding Ucs by ids: {}", ucIds);

        return this.wmGenericDao.findByMultipleIds(ucIds, orderedReturn);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Uc getByColumn2(int column2) {
        Map<String, Object> column2Map = new HashMap<>();
        column2Map.put("column2", column2);

        LOGGER.debug("Finding Uc by unique keys: {}", column2Map);
        return this.wmGenericDao.findByUniqueKey(column2Map);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbscenariosTransactionManager")
    @Override
    public Uc update(Uc uc) {
        LOGGER.debug("Updating Uc with information: {}", uc);

        this.wmGenericDao.update(uc);
        this.wmGenericDao.refresh(uc);

        return uc;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
    public Uc delete(Integer ucId) {
        LOGGER.debug("Deleting Uc with id: {}", ucId);
        Uc deleted = this.wmGenericDao.findById(ucId);
        if (deleted == null) {
            LOGGER.debug("No Uc found with id: {}", ucId);
            throw new EntityNotFoundException(String.valueOf(ucId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "dbscenariosTransactionManager")
    @Override
    public void delete(Uc uc) {
        LOGGER.debug("Deleting Uc with {}", uc);
        this.wmGenericDao.delete(uc);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<Uc> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Ucs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager")
    @Override
    public Page<Uc> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Ucs");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service dbscenarios for table Uc to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "dbscenariosTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service dbscenarios for table Uc to {} format", options.getExportType());
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