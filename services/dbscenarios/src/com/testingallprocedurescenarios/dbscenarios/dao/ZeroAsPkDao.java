/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.dbscenarios.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;
import com.wavemaker.runtime.data.dao.query.types.wmql.WMQLTypeHelper;

import com.testingallprocedurescenarios.dbscenarios.ZeroAsPk;

/**
 * Specifies methods used to obtain and modify ZeroAsPk related information
 * which is stored in the database.
 */
@Repository("dbscenarios.ZeroAsPkDao")
public class ZeroAsPkDao extends WMGenericDaoImpl<ZeroAsPk, Integer> {

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