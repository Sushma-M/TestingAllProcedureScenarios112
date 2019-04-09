/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingallprocedurescenarios.autowire_procedure1000nulltitles;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;


import com.wavemaker.runtime.security.SecurityService;
import com.wavemaker.runtime.service.annotations.ExposeToClient;
import com.wavemaker.runtime.service.annotations.HideFromClient;
import com.testingallprocedurescenarios.adventureworks2014.service.AdventureWorks2014ProcedureExecutorService;
import com.testingallprocedurescenarios.adventureworks2014.models.procedure.Procedure1000nullTitlesResponse;
//import com.testingallprocedurescenarios.autowire_procedure1000nulltitles.model.*;

/**
 * This is a singleton class with all its public methods exposed as REST APIs via generated controller class.
 * To avoid exposing an API for a particular public method, annotate it with @HideFromClient.
 *
 * Method names will play a major role in defining the Http Method for the generated APIs. For example, a method name
 * that starts with delete/remove, will make the API exposed as Http Method "DELETE".
 *
 * Method Parameters of type primitives (including java.lang.String) will be exposed as Query Parameters &
 * Complex Types/Objects will become part of the Request body in the generated API.
 */
@ExposeToClient
public class AutoWire_Procedure1000NullTitles {

    private static final Logger logger = LoggerFactory.getLogger(AutoWire_Procedure1000NullTitles.class);

    @Autowired
    private SecurityService securityService;

    @Autowired
    private AdventureWorks2014ProcedureExecutorService procedureService;
    /**
     * This is sample java operation that accepts an input from the caller and responds with "Hello".
     *
     * SecurityService that is Autowired will provide access to the security context of the caller. It has methods like isAuthenticated(),
     * getUserName() and getUserId() etc which returns the information based on the caller context.
     *
     * Methods in this class can declare HttpServletRequest, HttpServletResponse as input parameters to access the
     * caller's request/response objects respectively. These parameters will be injected when request is made (during API invocation).
     */
    
 public Procedure1000nullTitlesResponse procedureAutowiring(){
   return  procedureService.executeProcedure_1000NullTitles();
  }



}
