/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;

@Service
public class School_DBQueryExecutorServiceImpl implements School_DBQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(School_DBQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("School_DBWMQueryExecutor")
    private WMQueryExecutor queryExecutor;


}