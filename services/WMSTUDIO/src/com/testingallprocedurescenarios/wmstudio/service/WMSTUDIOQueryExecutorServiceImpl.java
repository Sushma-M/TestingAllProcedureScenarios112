/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;

@Service
public class WMSTUDIOQueryExecutorServiceImpl implements WMSTUDIOQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WMSTUDIOQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIOWMQueryExecutor")
    private WMQueryExecutor queryExecutor;


}