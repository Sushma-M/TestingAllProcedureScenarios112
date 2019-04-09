/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.service;

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
import org.springframework.context.annotation.Lazy;
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

import com.testingallprocedurescenarios.school_db.AcademicSubjects;
import com.testingallprocedurescenarios.school_db.SubjectDetails;


/**
 * ServiceImpl object for domain model class SubjectDetails.
 *
 * @see SubjectDetails
 */
@Service("School_DB.SubjectDetailsService")
@Validated
public class SubjectDetailsServiceImpl implements SubjectDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SubjectDetailsServiceImpl.class);

    @Lazy
    @Autowired
    @Qualifier("School_DB.AcademicSubjectsService")
    private AcademicSubjectsService academicSubjectsService;

    @Autowired
    @Qualifier("School_DB.SubjectDetailsDao")
    private WMGenericDao<SubjectDetails, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<SubjectDetails, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public SubjectDetails create(SubjectDetails subjectDetails) {
        LOGGER.debug("Creating a new SubjectDetails with information: {}", subjectDetails);

        SubjectDetails subjectDetailsCreated = this.wmGenericDao.create(subjectDetails);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(subjectDetailsCreated);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public SubjectDetails getById(Integer subjectdetailsId) {
        LOGGER.debug("Finding SubjectDetails by id: {}", subjectdetailsId);
        return this.wmGenericDao.findById(subjectdetailsId);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public SubjectDetails findById(Integer subjectdetailsId) {
        LOGGER.debug("Finding SubjectDetails by id: {}", subjectdetailsId);
        try {
            return this.wmGenericDao.findById(subjectdetailsId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No SubjectDetails found with id: {}", subjectdetailsId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public List<SubjectDetails> findByMultipleIds(List<Integer> subjectdetailsIds, boolean orderedReturn) {
        LOGGER.debug("Finding SubjectDetails by ids: {}", subjectdetailsIds);

        return this.wmGenericDao.findByMultipleIds(subjectdetailsIds, orderedReturn);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public SubjectDetails getBySubjectName(String subjectName) {
        Map<String, Object> subjectNameMap = new HashMap<>();
        subjectNameMap.put("subjectName", subjectName);

        LOGGER.debug("Finding SubjectDetails by unique keys: {}", subjectNameMap);
        return this.wmGenericDao.findByUniqueKey(subjectNameMap);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "School_DBTransactionManager")
    @Override
    public SubjectDetails update(SubjectDetails subjectDetails) {
        LOGGER.debug("Updating SubjectDetails with information: {}", subjectDetails);

        List<AcademicSubjects> academicSubjectses = subjectDetails.getAcademicSubjectses();
        if(academicSubjectses != null && Hibernate.isInitialized(academicSubjectses)) {
            academicSubjectses.forEach(_academicSubjects -> _academicSubjects.setSubjectDetails(subjectDetails));
        }

        this.wmGenericDao.update(subjectDetails);
        this.wmGenericDao.refresh(subjectDetails);

        return subjectDetails;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public SubjectDetails delete(Integer subjectdetailsId) {
        LOGGER.debug("Deleting SubjectDetails with id: {}", subjectdetailsId);
        SubjectDetails deleted = this.wmGenericDao.findById(subjectdetailsId);
        if (deleted == null) {
            LOGGER.debug("No SubjectDetails found with id: {}", subjectdetailsId);
            throw new EntityNotFoundException(String.valueOf(subjectdetailsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public void delete(SubjectDetails subjectDetails) {
        LOGGER.debug("Deleting SubjectDetails with {}", subjectDetails);
        this.wmGenericDao.delete(subjectDetails);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public Page<SubjectDetails> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all SubjectDetails");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public Page<SubjectDetails> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all SubjectDetails");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service School_DB for table SubjectDetails to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service School_DB for table SubjectDetails to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public Page<AcademicSubjects> findAssociatedAcademicSubjectses(Integer subjectId, Pageable pageable) {
        LOGGER.debug("Fetching all associated academicSubjectses");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("subjectDetails.subjectId = '" + subjectId + "'");

        return academicSubjectsService.findAll(queryBuilder.toString(), pageable);
    }

    /**
     * This setter method should only be used by unit tests
     *
     * @param service AcademicSubjectsService instance
     */
    protected void setAcademicSubjectsService(AcademicSubjectsService service) {
        this.academicSubjectsService = service;
    }

}