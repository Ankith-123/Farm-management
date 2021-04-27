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
@Table(name = "seed", catalog = "Farm_Management", schema = "")
@NamedQueries({
    @NamedQuery(name = "Seed_1.findAll", query = "SELECT s FROM Seed_1 s")
    , @NamedQuery(name = "Seed_1.findBySeedId", query = "SELECT s FROM Seed_1 s WHERE s.seedId = :seedId")
    , @NamedQuery(name = "Seed_1.findBySeedName", query = "SELECT s FROM Seed_1 s WHERE s.seedName = :seedName")
    , @NamedQuery(name = "Seed_1.findBySeedType", query = "SELECT s FROM Seed_1 s WHERE s.seedType = :seedType")
    , @NamedQuery(name = "Seed_1.findByCategory", query = "SELECT s FROM Seed_1 s WHERE s.category = :category")
    , @NamedQuery(name = "Seed_1.findByPrice", query = "SELECT s FROM Seed_1 s WHERE s.price = :price")})
public class Seed_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "seed_id")
    private String seedId;
    @Column(name = "seed_name")
    private String seedName;
    @Column(name = "seed_type")
    private String seedType;
    @Column(name = "category")
    private String category;
    @Column(name = "price")
    private Long price;

    public Seed_1() {
    }

    public Seed_1(String seedId) {
        this.seedId = seedId;
    }

    public String getSeedId() {
        return seedId;
    }

    public void setSeedId(String seedId) {
        String oldSeedId = this.seedId;
        this.seedId = seedId;
        changeSupport.firePropertyChange("seedId", oldSeedId, seedId);
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        String oldSeedName = this.seedName;
        this.seedName = seedName;
        changeSupport.firePropertyChange("seedName", oldSeedName, seedName);
    }

    public String getSeedType() {
        return seedType;
    }

    public void setSeedType(String seedType) {
        String oldSeedType = this.seedType;
        this.seedType = seedType;
        changeSupport.firePropertyChange("seedType", oldSeedType, seedType);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        Long oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seedId != null ? seedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seed_1)) {
            return false;
        }
        Seed_1 other = (Seed_1) object;
        if ((this.seedId == null && other.seedId != null) || (this.seedId != null && !this.seedId.equals(other.seedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "files.Seed_1[ seedId=" + seedId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
