/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.testingallprocedurescenarios.autowire_procedure1000nulltitles.controller;

import com.testingallprocedurescenarios.autowire_procedure1000nulltitles.AutoWire_Procedure1000NullTitles;
import com.testingallprocedurescenarios.adventureworks2014.models.procedure.Procedure1000nullTitlesResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/autoWire_Procedure1000NullTitles")
public class AutoWire_Procedure1000NullTitlesController {

    @Autowired
    private AutoWire_Procedure1000NullTitles autoWire_Procedure1000NullTitles;

    @RequestMapping(value = "/procedureAutowiring", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Fetching 1000 Null Titles from AdventueWorks2014 DB(SQLServer), from Employee Table(using procedure autowiring)")
    public Procedure1000nullTitlesResponse procedureAutowiring() {
        return autoWire_Procedure1000NullTitles.procedureAutowiring();
    }
}
