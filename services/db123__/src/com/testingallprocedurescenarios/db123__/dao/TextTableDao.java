/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.db123__.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.db123__.TextTable;

/**
 * Specifies methods used to obtain and modify TextTable related information
 * which is stored in the database.
 */
@Repository("db123__.TextTableDao")
public class TextTableDao extends WMGenericDaoImpl<TextTable, Integer> {

    @Autowired
    @Qualifier("db123__Template")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}