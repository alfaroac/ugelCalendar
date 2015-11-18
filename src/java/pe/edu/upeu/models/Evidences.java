/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aldo
 */
@MappedSuperclass
@Table(name = "evidences")
@XmlRootElement
public class Evidences implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "fileEvidences")
    private String fileEvidences;
    @JoinColumn(name = "activityId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Activity activityId;

    public Evidences() {
    }

    public Evidences(Integer id) {
        this.id = id;
    }

    public Evidences(Integer id, String description, String fileEvidences) {
        this.id = id;
        this.description = description;
        this.fileEvidences = fileEvidences;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileEvidences() {
        return fileEvidences;
    }

    public void setFileEvidences(String fileEvidences) {
        this.fileEvidences = fileEvidences;
    }

    public Activity getActivityId() {
        return activityId;
    }

    public void setActivityId(Activity activityId) {
        this.activityId = activityId;
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
        if (!(object instanceof Evidences)) {
            return false;
        }
        Evidences other = (Evidences) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.models.Evidences[ id=" + id + " ]";
    }
    
}
