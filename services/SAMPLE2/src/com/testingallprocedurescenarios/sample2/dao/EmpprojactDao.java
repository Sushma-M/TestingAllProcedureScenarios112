/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.sample2.Empprojact;
import com.testingallprocedurescenarios.sample2.EmpprojactId;

/**
 * Specifies methods used to obtain and modify Empprojact related information
 * which is stored in the database.
 */
@Repository("SAMPLE2.EmpprojactDao")
public class EmpprojactDao extends WMGenericDaoImpl<Empprojact, EmpprojactId> {

    @Autowired
    @Qualifier("SAMPLE2Template")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}