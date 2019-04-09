/*Generated by WaveMaker Studio*/
package com.testingallprocedurescenarios.sample2;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Project generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`PROJECT`")
public class Project implements Serializable {

    private String projno;
    private String projname;
    private String deptno;
    private String respemp;
    private Float prstaff;
    private Date prstdate;
    private Date prendate;
    private String majproj;
    private Department department;
    private Employee employee;
    private Project projectByMajproj;
    private List<Projact> projacts;
    private List<Project> projectsForMajproj;

    @Id
    @Column(name = "`PROJNO`", nullable = false, length = 6)
    public String getProjno() {
        return this.projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    @Column(name = "`PROJNAME`", nullable = false, length = 24)
    public String getProjname() {
        return this.projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    @Column(name = "`DEPTNO`", nullable = false, length = 3)
    public String getDeptno() {
        return this.deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    @Column(name = "`RESPEMP`", nullable = false, length = 6)
    public String getRespemp() {
        return this.respemp;
    }

    public void setRespemp(String respemp) {
        this.respemp = respemp;
    }

    @Column(name = "`PRSTAFF`", nullable = true, scale = 2, precision = 5)
    public Float getPrstaff() {
        return this.prstaff;
    }

    public void setPrstaff(Float prstaff) {
        this.prstaff = prstaff;
    }

    @Column(name = "`PRSTDATE`", nullable = true)
    public Date getPrstdate() {
        return this.prstdate;
    }

    public void setPrstdate(Date prstdate) {
        this.prstdate = prstdate;
    }

    @Column(name = "`PRENDATE`", nullable = true)
    public Date getPrendate() {
        return this.prendate;
    }

    public void setPrendate(Date prendate) {
        this.prendate = prendate;
    }

    @Column(name = "`MAJPROJ`", nullable = true, length = 6)
    public String getMajproj() {
        return this.majproj;
    }

    public void setMajproj(String majproj) {
        this.majproj = majproj;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`DEPTNO`", referencedColumnName = "`DEPTNO`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_PROJECT_1`"))
    @Fetch(FetchMode.JOIN)
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        if(department != null) {
            this.deptno = department.getDeptno();
        }

        this.department = department;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`RESPEMP`", referencedColumnName = "`EMPNO`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_PROJECT_2`"))
    @Fetch(FetchMode.JOIN)
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        if(employee != null) {
            this.respemp = employee.getEmpno();
        }

        this.employee = employee;
    }

    // ignoring self relation properties to avoid circular loops & unwanted fields from the related entity.
    @JsonIgnoreProperties({"projectByMajproj", "projectsForMajproj"})
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`MAJPROJ`", referencedColumnName = "`PROJNO`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`RPP`"))
    @Fetch(FetchMode.JOIN)
    public Project getProjectByMajproj() {
        return this.projectByMajproj;
    }

    public void setProjectByMajproj(Project projectByMajproj) {
        if(projectByMajproj != null) {
            this.majproj = projectByMajproj.getProjno();
        }

        this.projectByMajproj = projectByMajproj;
    }
    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Projact> getProjacts() {
        return this.projacts;
    }

    public void setProjacts(List<Projact> projacts) {
        this.projacts = projacts;
    }

    // ignoring self relation properties to avoid circular loops & unwanted fields from the related entity.
    @JsonIgnoreProperties({"projectByMajproj", "projectsForMajproj"})
    @JsonInclude(Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "projectByMajproj")
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.REMOVE})
    public List<Project> getProjectsForMajproj() {
        return this.projectsForMajproj;
    }

    public void setProjectsForMajproj(List<Project> projectsForMajproj) {
        this.projectsForMajproj = projectsForMajproj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        final Project project = (Project) o;
        return Objects.equals(getProjno(), project.getProjno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjno());
    }
}