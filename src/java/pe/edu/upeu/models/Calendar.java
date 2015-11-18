/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aldo
 */
@MappedSuperclass
@Table(name = "calendar")
@XmlRootElement
public class Calendar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "weekCalendar")
    private String weekCalendar;
    @Basic(optional = false)
    @Column(name = "dayCalendar")
    private String dayCalendar;
    @Basic(optional = false)
    @Column(name = "dateCalendar")
    @Temporal(TemporalType.DATE)
    private Date dateCalendar;

    public Calendar() {
    }

    public Calendar(Integer id) {
        this.id = id;
    }

    public Calendar(Integer id, String weekCalendar, String dayCalendar, Date dateCalendar) {
        this.id = id;
        this.weekCalendar = weekCalendar;
        this.dayCalendar = dayCalendar;
        this.dateCalendar = dateCalendar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeekCalendar() {
        return weekCalendar;
    }

    public void setWeekCalendar(String weekCalendar) {
        this.weekCalendar = weekCalendar;
    }

    public String getDayCalendar() {
        return dayCalendar;
    }

    public void setDayCalendar(String dayCalendar) {
        this.dayCalendar = dayCalendar;
    }

    public Date getDateCalendar() {
        return dateCalendar;
    }

    public void setDateCalendar(Date dateCalendar) {
        this.dateCalendar = dateCalendar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendar)) {
            return false;
        }
        Calendar other = (Calendar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.models.Calendar[ id=" + id + " ]";
    }
    
}
