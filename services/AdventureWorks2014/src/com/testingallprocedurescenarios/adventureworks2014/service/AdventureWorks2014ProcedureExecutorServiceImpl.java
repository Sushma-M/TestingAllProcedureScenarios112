/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

import com.testingallprocedurescenarios.adventureworks2014.models.procedure.*;

@Service
public class AdventureWorks2014ProcedureExecutorServiceImpl implements AdventureWorks2014ProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdventureWorks2014ProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("AdventureWorks2014WMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public ProcedureGetByHireDateResponse executeProcedure_GetByHireDate(Date empHireDate) {
        Map<String, Object> params = new HashMap<>(1);

        params.put("empHireDate", empHireDate);

        return procedureExecutor.executeNamedProcedure("Procedure_GetByHireDate", params, ProcedureGetByHireDateResponse.class);
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public Procedure1000nullTitlesResponse executeProcedure_1000NullTitles() {
        Map<String, Object> params = new HashMap<>(0);


        return procedureExecutor.executeNamedProcedure("Procedure_1000NullTitles", params, Procedure1000nullTitlesResponse.class);
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public ProcedureGetDeptDetailsResponse executeProcedure_getDeptDetails(Integer deptid) {
        Map<String, Object> params = new HashMap<>(2);

        params.put("deptid", deptid);

        return procedureExecutor.executeNamedProcedure("Procedure_getDeptDetails", params, ProcedureGetDeptDetailsResponse.class);
    }

    @Transactional(value = "AdventureWorks2014TransactionManager")
    @Override
    public PorcedureDeptNameUsingIdResponse executePorcedure_DeptNameUsingID(Integer deptid) {
        Map<String, Object> params = new HashMap<>(2);

        params.put("deptid", deptid);

        return procedureExecutor.executeNamedProcedure("Porcedure_DeptNameUsingID", params, PorcedureDeptNameUsingIdResponse.class);
    }

}