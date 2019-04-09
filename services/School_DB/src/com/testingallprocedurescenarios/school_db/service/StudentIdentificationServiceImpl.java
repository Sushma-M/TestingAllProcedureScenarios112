/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.IOException;
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

import com.testingallprocedurescenarios.school_db.StudentDetails;
import com.testingallprocedurescenarios.school_db.StudentIdentification;


/**
 * ServiceImpl object for domain model class StudentIdentification.
 *
 * @see StudentIdentification
 */
@Service("School_DB.StudentIdentificationService")
@Validated
public class StudentIdentificationServiceImpl implements StudentIdentificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentIdentificationServiceImpl.class);


    @Autowired
    @Qualifier("School_DB.StudentIdentificationDao")
    private WMGenericDao<StudentIdentification, Integer> wmGenericDao;

    @Autowired
    private ObjectMapper objectMapper;


    public void setWMGenericDao(WMGenericDao<StudentIdentification, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public StudentIdentification create(StudentIdentification studentIdentification) {
        LOGGER.debug("Creating a new StudentIdentification with information: {}", studentIdentification);

        StudentIdentification studentIdentificationCreated = this.wmGenericDao.create(studentIdentification);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(studentIdentificationCreated);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public StudentIdentification getById(Integer studentidentificationId) {
        LOGGER.debug("Finding StudentIdentification by id: {}", studentidentificationId);
        return this.wmGenericDao.findById(studentidentificationId);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public StudentIdentification findById(Integer studentidentificationId) {
        LOGGER.debug("Finding StudentIdentification by id: {}", studentidentificationId);
        try {
            return this.wmGenericDao.findById(studentidentificationId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No StudentIdentification found with id: {}", studentidentificationId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public List<StudentIdentification> findByMultipleIds(List<Integer> studentidentificationIds, boolean orderedReturn) {
        LOGGER.debug("Finding StudentIdentifications by ids: {}", studentidentificationIds);

        return this.wmGenericDao.findByMultipleIds(studentidentificationIds, orderedReturn);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public StudentIdentification getByIdentificationNumber(String identificationNumber) {
        Map<String, Object> identificationNumberMap = new HashMap<>();
        identificationNumberMap.put("identificationNumber", identificationNumber);

        LOGGER.debug("Finding StudentIdentification by unique keys: {}", identificationNumberMap);
        return this.wmGenericDao.findByUniqueKey(identificationNumberMap);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "School_DBTransactionManager")
    @Override
    public StudentIdentification update(StudentIdentification studentIdentification) {
        LOGGER.debug("Updating StudentIdentification with information: {}", studentIdentification);

        StudentDetails studentDetails = studentIdentification.getStudentDetails();
        if(studentDetails != null && Hibernate.isInitialized(studentDetails)) {
            studentDetails.setStudentIdentification(studentIdentification);
        }

        this.wmGenericDao.update(studentIdentification);
        this.wmGenericDao.refresh(studentIdentification);

        return studentIdentification;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public StudentIdentification partialUpdate(Integer studentidentificationId, Map<String, Object>studentIdentificationPatch) {
        LOGGER.debug("Partially Updating the StudentIdentification with id: {}", studentidentificationId);

        StudentIdentification studentIdentification = getById(studentidentificationId);

        try {
            ObjectReader studentIdentificationReader = this.objectMapper.readerForUpdating(studentIdentification);
            studentIdentification = studentIdentificationReader.readValue(this.objectMapper.writeValueAsString(studentIdentificationPatch));
        } catch (IOException ex) {
            LOGGER.debug("There was a problem in applying the patch: {}", studentIdentificationPatch, ex);
            throw new InvalidInputException("Could not apply patch",ex);
        }

        studentIdentification = update(studentIdentification);

        return studentIdentification;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public StudentIdentification delete(Integer studentidentificationId) {
        LOGGER.debug("Deleting StudentIdentification with id: {}", studentidentificationId);
        StudentIdentification deleted = this.wmGenericDao.findById(studentidentificationId);
        if (deleted == null) {
            LOGGER.debug("No StudentIdentification found with id: {}", studentidentificationId);
            throw new EntityNotFoundException(MessageResource.create("com.wavemaker.runtime.entity.not.found"), StudentIdentification.class.getSimpleName(), studentidentificationId);
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "School_DBTransactionManager")
    @Override
    public void delete(StudentIdentification studentIdentification) {
        LOGGER.debug("Deleting StudentIdentification with {}", studentIdentification);
        this.wmGenericDao.delete(studentIdentification);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public Page<StudentIdentification> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all StudentIdentifications");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager")
    @Override
    public Page<StudentIdentification> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all StudentIdentifications");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service School_DB for table StudentIdentification to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "School_DBTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service School_DB for table StudentIdentification to {} format", options.getExportType());
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



}