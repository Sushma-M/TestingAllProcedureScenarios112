/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import com.wavemaker.runtime.data.dao.query.types.wmql.WMQLTypeHelper;

import com.testingallprocedurescenarios.dbscenarios.VirtualTable;

/**
 * Specifies methods used to obtain and modify VirtualTable related information
 * which is stored in the database.
 */
@Repository("dbscenarios.VirtualTableDao")
public class VirtualTableDao extends WMGenericDaoImpl<VirtualTable, String> {

    @Autowired
    @Qualifier("dbscenariosTemplate")
    private HibernateTemplate template;

    @Autowired
    @Qualifier("dbscenariosWMQLTypeHelper")
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