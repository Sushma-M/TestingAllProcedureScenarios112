/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.service;

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

import com.testingallprocedurescenarios.sample2.Productsupplier;
import com.testingallprocedurescenarios.sample2.ProductsupplierId;


/**
 * ServiceImpl object for domain model class Productsupplier.
 *
 * @see Productsupplier
 */
@Service("SAMPLE2.ProductsupplierService")
@Validated
public class ProductsupplierServiceImpl implements ProductsupplierService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductsupplierServiceImpl.class);


    @Autowired
    @Qualifier("SAMPLE2.ProductsupplierDao")
    private WMGenericDao<Productsupplier, ProductsupplierId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Productsupplier, ProductsupplierId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Productsupplier create(Productsupplier productsupplier) {
        LOGGER.debug("Creating a new Productsupplier with information: {}", productsupplier);

        Productsupplier productsupplierCreated = this.wmGenericDao.create(productsupplier);
        // reloading object from database to get database defined & server defined values.
        return this.wmGenericDao.refresh(productsupplierCreated);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Productsupplier getById(ProductsupplierId productsupplierId) {
        LOGGER.debug("Finding Productsupplier by id: {}", productsupplierId);
        return this.wmGenericDao.findById(productsupplierId);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Productsupplier findById(ProductsupplierId productsupplierId) {
        LOGGER.debug("Finding Productsupplier by id: {}", productsupplierId);
        try {
            return this.wmGenericDao.findById(productsupplierId);
        } catch (EntityNotFoundException ex) {
            LOGGER.debug("No Productsupplier found with id: {}", productsupplierId, ex);
            return null;
        }
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public List<Productsupplier> findByMultipleIds(List<ProductsupplierId> productsupplierIds, boolean orderedReturn) {
        LOGGER.debug("Finding Productsuppliers by ids: {}", productsupplierIds);

        return this.wmGenericDao.findByMultipleIds(productsupplierIds, orderedReturn);
    }


    @Transactional(rollbackFor = EntityNotFoundException.class, value = "SAMPLE2TransactionManager")
    @Override
    public Productsupplier update(Productsupplier productsupplier) {
        LOGGER.debug("Updating Productsupplier with information: {}", productsupplier);

        this.wmGenericDao.update(productsupplier);
        this.wmGenericDao.refresh(productsupplier);

        return productsupplier;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public Productsupplier delete(ProductsupplierId productsupplierId) {
        LOGGER.debug("Deleting Productsupplier with id: {}", productsupplierId);
        Productsupplier deleted = this.wmGenericDao.findById(productsupplierId);
        if (deleted == null) {
            LOGGER.debug("No Productsupplier found with id: {}", productsupplierId);
            throw new EntityNotFoundException(String.valueOf(productsupplierId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(value = "SAMPLE2TransactionManager")
    @Override
    public void delete(Productsupplier productsupplier) {
        LOGGER.debug("Deleting Productsupplier with {}", productsupplier);
        this.wmGenericDao.delete(productsupplier);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Productsupplier> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Productsuppliers");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager")
    @Override
    public Page<Productsupplier> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Productsuppliers");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Productsupplier to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

    @Transactional(readOnly = true, value = "SAMPLE2TransactionManager", timeout = 300)
    @Override
    public void export(DataExportOptions options, Pageable pageable, OutputStream outputStream) {
        LOGGER.debug("exporting data in the service SAMPLE2 for table Productsupplier to {} format", options.getExportType());
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