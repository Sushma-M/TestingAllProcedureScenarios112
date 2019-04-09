/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.sample2.Empmdc;
import com.testingallprocedurescenarios.sample2.EmpmdcId;

/**
 * Specifies methods used to obtain and modify Empmdc related information
 * which is stored in the database.
 */
@Repository("SAMPLE2.EmpmdcDao")
public class EmpmdcDao extends WMGenericDaoImpl<Empmdc, EmpmdcId> {

    @Autowired
    @Qualifier("SAMPLE2Template")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}