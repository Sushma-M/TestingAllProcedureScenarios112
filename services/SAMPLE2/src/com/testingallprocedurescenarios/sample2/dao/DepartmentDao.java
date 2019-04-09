/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import com.wavemaker.runtime.data.dao.query.types.wmql.WMQLTypeHelper;

import com.testingallprocedurescenarios.sample2.Department;

/**
 * Specifies methods used to obtain and modify Department related information
 * which is stored in the database.
 */
@Repository("SAMPLE2.DepartmentDao")
public class DepartmentDao extends WMGenericDaoImpl<Department, String> {

    @Autowired
    @Qualifier("SAMPLE2Template")
    private HibernateTemplate template;

    @Autowired
    @Qualifier("SAMPLE2WMQLTypeHelper")
    private WMQLTypeHelper wmqlTypeHelper;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }

    @Override
    public WMQLTypeHelper getWMQLTypeHelper() {
        return this.wmqlTypeHelper;
    }

}