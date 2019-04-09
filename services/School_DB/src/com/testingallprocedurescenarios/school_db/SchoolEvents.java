/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.school_db;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * SchoolEvents generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`SCHOOL_EVENTS`")
@IdClass(SchoolEventsId.class)
public class SchoolEvents implements Serializable {

    private Date scheduledDate;
    private String eventName;
    private Integer eventId;
    private Time time;
    private String conductedBy;
    private String location;
    private String description;

    @Id
    @Column(name = "`SCHEDULED_DATE`", nullable = false)
    public Date getScheduledDate() {
        return this.scheduledDate;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    @Id
    @Column(name = "`EVENT_NAME`", nullable = false, length = 255)
    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Id
    @Column(name = "`EVENT_ID`", nullable = false, scale = 0, precision = 10)
    public Integer getEventId() {
        return this.eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Column(name = "`TIME`", nullable = true)
    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Column(name = "`CONDUCTED_BY`", nullable = true, length = 255)
    public String getConductedBy() {
        return this.conductedBy;
    }

    public void setConductedBy(String conductedBy) {
        this.conductedBy = conductedBy;
    }

    @Column(name = "`LOCATION`", nullable = true, length = 255)
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "`DESCRIPTION`", nullable = true, length = 500)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolEvents)) return false;
        final SchoolEvents schoolEvents = (SchoolEvents) o;
        return Objects.equals(getScheduledDate(), schoolEvents.getScheduledDate()) &&
                Objects.equals(getEventName(), schoolEvents.getEventName()) &&
                Objects.equals(getEventId(), schoolEvents.getEventId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScheduledDate(),
                getEventName(),
                getEventId());
    }
}