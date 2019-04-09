/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.wmstudio.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testingallprocedurescenarios.wmstudio.Locations;

/**
 * Specifies methods used to obtain and modify Locations related information
 * which is stored in the database.
 */
@Repository("WMSTUDIO.LocationsDao")
public class LocationsDao extends WMGenericDaoImpl<Locations, Short> {

    @Autowired
    @Qualifier("WMSTUDIOTemplate")
    private HibernateTemplate template;


    @Override
    public HibernateTemplate getTemplate() {
        return this.template;
    }
}