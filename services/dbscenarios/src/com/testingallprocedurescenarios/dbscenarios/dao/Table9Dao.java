/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.dbscenarios.Table9;

/**
 * Specifies methods used to obtain and modify Table9 related information
 * which is stored in the database.
 */
@Repository("dbscenarios.Table9Dao")
public class Table9Dao extends WMGenericDaoImpl<Table9, String> {

    @Autowired
    @Qualifier("dbscenariosTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}