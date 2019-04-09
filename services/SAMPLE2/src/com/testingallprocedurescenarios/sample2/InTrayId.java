/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class InTrayId implements Serializable {

    private Timestamp received;
    private String source;
    private String subject;
    private String noteText;

    public Timestamp getReceived() {
        return this.received;
    }

    public void setReceived(Timestamp received) {
        this.received = received;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNoteText() {
        return this.noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InTray)) return false;
        final InTray inTray = (InTray) o;
        return Objects.equals(getReceived(), inTray.getReceived()) &&
                Objects.equals(getSource(), inTray.getSource()) &&
                Objects.equals(getSubject(), inTray.getSubject()) &&
                Objects.equals(getNoteText(), inTray.getNoteText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReceived(),
                getSource(),
                getSubject(),
                getNoteText());
    }
}