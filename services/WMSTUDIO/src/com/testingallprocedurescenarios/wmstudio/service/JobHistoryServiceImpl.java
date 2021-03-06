/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio.service;

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

import com.testingallprocedurescenarios.wmstudio.JobHistory;
import com.testingallprocedurescenarios.wmstudio.JobHistoryId;


/**
 * ServiceImpl object for domain model class JobHistory.
 *
 * @see JobHistory
 */
@Service("WMSTUDIO.JobHistoryService")
@Validated
public class JobHistoryServiceImpl implements JobHistoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobHistoryServiceImpl.class);


    @Autowired
    @Qualifier("WMSTUDIO.JobHistoryDao")
    private WMGenericDao<JobHistory, JobHistoryId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<JobHistory, JobHistoryId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public JobHistory create(JobHistory jobHistory) {
        LOGGER.debug("Creating a new JobHistory with information: {}", jobHistory);

        JobHistory jobHistoryCreated = this.wmGenericDao.create(jobHistory);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(jobHistoryCreated);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public JobHistory getById(JobHistoryId jobhistoryId) {
        LOGGER.debug("Finding JobHistory by id: {}", jobhistoryId);
        return this.wmGenericDao.findById(jobhistoryId);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public JobHistory findById(JobHistoryId jobhistoryId) {
        LOGGER.debug("Finding JobHistory by id: {}", jobhistoryId);
        try {
            return this.wmGenericDao.findById(jobhistoryId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No JobHistory found with id: {}", jobhistoryId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public List<JobHistory> findByMultipleIds(List<JobHistoryId> jobhistoryIds, boolean orderedReturn) {
        LOGGER.debug("Finding JobHistories by ids: {}", jobhistoryIds);

        return this.wmGenericDao.findByMultipleIds(jobhistoryIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public JobHistory update(JobHistory jobHistory) {
        LOGGER.debug("Updating JobHistory with information: {}", jobHistory);

        this.wmGenericDao.update(jobHistory);
        this.wmGenericDao.refresh(jobHistory);

        return jobHistory;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public JobHistory delete(JobHistoryId jobhistoryId) {
        LOGGER.debug("Deleting JobHistory with id: {}", jobhistoryId);
        JobHistory deleted = this.wmGenericDao.findById(jobhistoryId);
        if (deleted == null) {
            LOGGER.debug("No JobHistory found with id: {}", jobhistoryId);
            throw new EntityNotFoundException(String.valueOf(jobhistoryId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public void delete(JobHistory jobHistory) {
        LOGGER.debug("Deleting JobHistory with {}", jobHistory);
        this.wmGenericDao.delete(jobHistory);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<JobHistory> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all JobHistories");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<JobHistory> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all JobHistories");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table JobHistory to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table JobHistory to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}