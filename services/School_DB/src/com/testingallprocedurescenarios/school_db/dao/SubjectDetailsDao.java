/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.school_db.SubjectDetails;

/**
 * Specifies methods used to obtain and modify SubjectDetails related information
 * which is stored in the database.
 */
@Repository("School_DB.SubjectDetailsDao")
public class SubjectDetailsDao extends WMGenericDaoImpl<SubjectDetails, Integer> {

    @Autowired
    @Qualifier("School_DBTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}