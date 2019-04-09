/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.math.BigInteger;
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

import com.testingallprocedurescenarios.wmstudio.Countries;
import com.testingallprocedurescenarios.wmstudio.Regions;


/**
 * ServiceImpl object for domain model class Regions.
 *
 * @see Regions
 */
@Service("WMSTUDIO.RegionsService")
@Validated
public class RegionsServiceImpl implements RegionsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegionsServiceImpl.class);

    @Lazy
    @Autowired
    @Qualifier("WMSTUDIO.CountriesService")
    private CountriesService countriesService;

    @Autowired
    @Qualifier("WMSTUDIO.RegionsDao")
    private WMGenericDao<Regions, BigInteger> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Regions, BigInteger> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Regions create(Regions regions) {
        LOGGER.debug("Creating a new Regions with information: {}", regions);

        List<Countries> countrieses = regions.getCountrieses();
        if(countrieses != null && Hibernate.isInitialized(countrieses)) {
            countrieses.forEach(_countries -> _countries.setRegions(regions));
        }

        Regions regionsCreated = this.wmGenericDao.create(regions);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(regionsCreated);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Regions getById(BigInteger regionsId) {
        LOGGER.debug("Finding Regions by id: {}", regionsId);
        return this.wmGenericDao.findById(regionsId);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Regions findById(BigInteger regionsId) {
        LOGGER.debug("Finding Regions by id: {}", regionsId);
        try {
            return this.wmGenericDao.findById(regionsId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Regions found with id: {}", regionsId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public List<Regions> findByMultipleIds(List<BigInteger> regionsIds, boolean orderedReturn) {
        LOGGER.debug("Finding Regions by ids: {}", regionsIds);

        return this.wmGenericDao.findByMultipleIds(regionsIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
    @Override
    public Regions update(Regions regions) {
        LOGGER.debug("Updating Regions with information: {}", regions);

        List<Countries> countrieses = regions.getCountrieses();
        if(countrieses != null && Hibernate.isInitialized(countrieses)) {
            countrieses.forEach(_countries -> _countries.setRegions(regions));
        }

        this.wmGenericDao.update(regions);
        this.wmGenericDao.refresh(regions);

        return regions;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Regions delete(BigInteger regionsId) {
        LOGGER.debug("Deleting Regions with id: {}", regionsId);
        Regions deleted = this.wmGenericDao.findById(regionsId);
        if (deleted == null) {
            LOGGER.debug("No Regions found with id: {}", regionsId);
            throw new EntityNotFoundException(String.valueOf(regionsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public void delete(Regions regions) {
        LOGGER.debug("Deleting Regions with {}", regions);
        this.wmGenericDao.delete(regions);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Regions> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Regions");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Regions> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Regions");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table Regions to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table Regions to {} format", options.getExportType());
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

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Countries> findAssociatedCountrieses(BigInteger regionId, Pageable pageable) {
        LOGGER.debug("Fetching all associated countrieses");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("regions.regionId = '" + regionId + "'");

        return countriesService.findAll(queryBuilder.toString(), pageable);
    }

    /**
     * This setter method should only be used by unit tests
     *
     * @param service CountriesService instance
     */
    protected void setCountriesService(CountriesService service) {
        this.countriesService = service;
    }

}