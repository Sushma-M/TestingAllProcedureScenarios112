/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
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

import com.testingallprocedurescenarios.sample2.Act;


/**
 * ServiceImpl object for domain model class Act.
 *
 * @see Act
 */
@Service("SAMPLE2.ActService")
@Validated
public class ActServiceImpl implements ActService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE2.ActDao")
    private WMGenericDao<Act, Short> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Act, Short> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Act create(Act act) {
        LOGGER.debug("Creating a new Act with information: {}", act);

        Act actForActno = act.getActForActno();
        if(actForActno != null && Hibernate.isInitialized(actForActno)) {
            actForActno.setActByActno(act);
        }

        Act actCreated = this.wmGenericDao.create(act);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(actCreated);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Act getById(Short actId) {
        LOGGER.debug("Finding Act by id: {}", actId);
        return this.wmGenericDao.findById(actId);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Act findById(Short actId) {
        LOGGER.debug("Finding Act by id: {}", actId);
        try {
            return this.wmGenericDao.findById(actId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Act found with id: {}", actId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public List<Act> findByMultipleIds(List<Short> actIds, boolean orderedReturn) {
        LOGGER.debug("Finding Acts by ids: {}", actIds);

        return this.wmGenericDao.findByMultipleIds(actIds, orderedReturn);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Act getByActnoAndActkwd(short actno, String actkwd) {
        Map<String, Object> actnoAndActkwdMap = new HashMap<>();
        actnoAndActkwdMap.put("actno", actno);
        actnoAndActkwdMap.put("actkwd", actkwd);

        LOGGER.debug("Finding Act by unique keys: {}", actnoAndActkwdMap);
        return this.wmGenericDao.findByUniqueKey(actnoAndActkwdMap);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLE2TransactionManager")
    @Override
    public Act update(Act act) {
        LOGGER.debug("Updating Act with information: {}", act);

        Act actForActno = act.getActForActno();
        if(actForActno != null && Hibernate.isInitialized(actForActno)) {
            actForActno.setActByActno(act);
        }

        this.wmGenericDao.update(act);
        this.wmGenericDao.refresh(act);

        return act;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Act delete(Short actId) {
        LOGGER.debug("Deleting Act with id: {}", actId);
        Act deleted = this.wmGenericDao.findById(actId);
        if (deleted == null) {
            LOGGER.debug("No Act found with id: {}", actId);
            throw new EntityNotFoundException(String.valueOf(actId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public void delete(Act act) {
        LOGGER.debug("Deleting Act with {}", act);
        this.wmGenericDao.delete(act);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Act> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Acts");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Act> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Acts");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Act to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Act to {} format", options.getExportType());
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