/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.adventureworks2014.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.adventureworks2014.JobCandidate;

/**
 * Specifies methods used to obtain and modify JobCandidate related information
 * which is stored in the database.
 */
@Repository("AdventureWorks2014.JobCandidateDao")
public class JobCandidateDao extends WMGenericDaoImpl<JobCandidate, Integer> {

    @Autowired
    @Qualifier("AdventureWorks2014Template")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}