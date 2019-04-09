/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.service;

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

import com.testingallprocedurescenarios.adventureworks2014.Employee;
import com.testingallprocedurescenarios.adventureworks2014.Person;


/**
 * ServiceImpl object for domain model class Person.
 *
 * @see Person
 */
@Service("AdventureWorks2014.PersonService")
@Validated
public class PersonServiceImpl implements PersonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonServiceImpl.class);


    @Autowired
    @Qualifier("AdventureWorks2014.PersonDao")
    private WMGenericDao<Person, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Person, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public Person create(Person person) {
        LOGGER.debug("Creating a new Person with information: {}", person);

        Employee employee = person.getEmployee();
        if(employee != null && Hibernate.isInitialized(employee)) {
            employee.setPerson(person);
        }

        Person personCreated = this.wmGenericDao.create(person);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(personCreated);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Person getById(Integer personId) {
        LOGGER.debug("Finding Person by id: {}", personId);
        return this.wmGenericDao.findById(personId);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Person findById(Integer personId) {
        LOGGER.debug("Finding Person by id: {}", personId);
        try {
            return this.wmGenericDao.findById(personId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Person found with id: {}", personId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public List<Person> findByMultipleIds(List<Integer> personIds, boolean orderedReturn) {
        LOGGER.debug("Finding Persons by ids: {}", personIds);

        return this.wmGenericDao.findByMultipleIds(personIds, orderedReturn);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Person getByRowguid(String rowguid) {
        Map<String, Object> rowguidMap = new HashMap<>();
        rowguidMap.put("rowguid", rowguid);

        LOGGER.debug("Finding Person by unique keys: {}", rowguidMap);
        return this.wmGenericDao.findByUniqueKey(rowguidMap);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AdventureWorks2014TransactionManager")
    @Override
    public Person update(Person person) {
        LOGGER.debug("Updating Person with information: {}", person);

        Employee employee = person.getEmployee();
        if(employee != null && Hibernate.isInitialized(employee)) {
            employee.setPerson(person);
        }

        this.wmGenericDao.update(person);
        this.wmGenericDao.refresh(person);

        return person;
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public Person delete(Integer personId) {
        LOGGER.debug("Deleting Person with id: {}", personId);
        Person deleted = this.wmGenericDao.findById(personId);
        if (deleted == null) {
            LOGGER.debug("No Person found with id: {}", personId);
            throw new EntityNotFoundException(String.valueOf(personId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public void delete(Person person) {
        LOGGER.debug("Deleting Person with {}", person);
        this.wmGenericDao.delete(person);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<Person> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Persons");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<Person> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Persons");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service AdventureWorks2014 for table Person to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service AdventureWorks2014 for table Person to {} format", options.getExportType());
        this.wmGenericDao.export(options, pageable, outputStream);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "AdventureWorks2014TransactionManager")
    @Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}