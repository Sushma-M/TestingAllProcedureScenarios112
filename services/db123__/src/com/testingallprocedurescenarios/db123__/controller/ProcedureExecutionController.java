/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

import com.testingallprocedurescenarios.db123__.service.Db123__ProcedureExecutorService;

@RestController(value = "Db123__.ProcedureExecutionController")
@RequestMapping("/db123__/procedureExecutor")
@Api(value = "ProcedureExecutionController", description = "controller class for procedure execution")
public class ProcedureExecutionController {


    @Autowired
    private Db123__ProcedureExecutorService procedureService;


}