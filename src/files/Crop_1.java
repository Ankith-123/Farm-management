/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author 91959
 */
@Entity
@Table(name = "crop", catalog = "Farm_Management", schema = "")
@NamedQueries({
    @NamedQuery(name = "Crop_1.findAll", query = "SELECT c FROM Crop_1 c")
    , @NamedQuery(name = "Crop_1.findByCropId", query = "SELECT c FROM Crop_1 c WHERE c.cropId = :cropId")
    , @NamedQuery(name = "Crop_1.findByCropName", query = "SELECT c FROM Crop_1 c WHERE c.cropName = :cropName")
    , @NamedQuery(name = "Crop_1.findByYeild", query = "SELECT c FROM Crop_1 c WHERE c.yeild = :yeild")
    , @NamedQuery(name = "Crop_1.findBySeedId", query = "SELECT c FROM Crop_1 c WHERE c.seedId = :seedId")
    , @NamedQuery(name = "Crop_1.findByCType", query = "SELECT c FROM Crop_1 c WHERE c.cType = :cType")
    , @NamedQuery(name = "Crop_1.findBySeason", query = "SELECT c FROM Crop_1 c WHERE c.season = :season")})
public class Crop_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "crop_id")
    private String cropId;
    @Column(name = "crop_name")
    private String cropName;
    @Column(name = "yeild")
    private Long yeild;
    @Column(name = "seed_id")
    private String seedId;
    @Column(name = "c_type")
    private String cType;
    @Column(name = "season")
    private String season;

    public Crop_1() {
    }

    public Crop_1(String cropId) {
        this.cropId = cropId;
    }

    public String getCropId() {
        return cropId;
    }

    public void setCropId(String cropId) {
        String oldCropId = this.cropId;
        this.cropId = cropId;
        changeSupport.firePropertyChange("cropId", oldCropId, cropId);
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        String oldCropName = this.cropName;
        this.cropName = cropName;
        changeSupport.firePropertyChange("cropName", oldCropName, cropName);
    }

    public Long getYeild() {
        return yeild;
    }

    public void setYeild(Long yeild) {
        Long oldYeild = this.yeild;
        this.yeild = yeild;
        changeSupport.firePropertyChange("yeild", oldYeild, yeild);
    }

    public String getSeedId() {
        return seedId;
    }

    public void setSeedId(String seedId) {
        String oldSeedId = this.seedId;
        this.seedId = seedId;
        changeSupport.firePropertyChange("seedId", oldSeedId, seedId);
    }

    public String getCType() {
        return cType;
    }

    public void setCType(String cType) {
        String oldCType = this.cType;
        this.cType = cType;
        changeSupport.firePropertyChange("CType", oldCType, cType);
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        String oldSeason = this.season;
        this.season = season;
        changeSupport.firePropertyChange("season", oldSeason, season);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cropId != null ? cropId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Crop_1)) {
            return false;
        }
        Crop_1 other = (Crop_1) object;
        if ((this.cropId == null && other.cropId != null) || (this.cropId != null && !this.cropId.equals(other.cropId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "files.Crop_1[ cropId=" + cropId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
