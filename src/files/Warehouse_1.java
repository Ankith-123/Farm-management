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
@Table(name = "warehouse", catalog = "Farm_Management", schema = "")
@NamedQueries({
    @NamedQuery(name = "Warehouse_1.findAll", query = "SELECT w FROM Warehouse_1 w")
    , @NamedQuery(name = "Warehouse_1.findByWId", query = "SELECT w FROM Warehouse_1 w WHERE w.wId = :wId")
    , @NamedQuery(name = "Warehouse_1.findByWName", query = "SELECT w FROM Warehouse_1 w WHERE w.wName = :wName")
    , @NamedQuery(name = "Warehouse_1.findByLocation", query = "SELECT w FROM Warehouse_1 w WHERE w.location = :location")
    , @NamedQuery(name = "Warehouse_1.findByCapacity", query = "SELECT w FROM Warehouse_1 w WHERE w.capacity = :capacity")
    , @NamedQuery(name = "Warehouse_1.findByContact", query = "SELECT w FROM Warehouse_1 w WHERE w.contact = :contact")})
public class Warehouse_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "w_id")
    private String wId;
    @Column(name = "w_name")
    private String wName;
    @Column(name = "location")
    private String location;
    @Column(name = "capacity")
    private Long capacity;
    @Column(name = "contact")
    private Long contact;

    public Warehouse_1() {
    }

    public Warehouse_1(String wId) {
        this.wId = wId;
    }

    public String getWId() {
        return wId;
    }

    public void setWId(String wId) {
        String oldWId = this.wId;
        this.wId = wId;
        changeSupport.firePropertyChange("WId", oldWId, wId);
    }

    public String getWName() {
        return wName;
    }

    public void setWName(String wName) {
        String oldWName = this.wName;
        this.wName = wName;
        changeSupport.firePropertyChange("WName", oldWName, wName);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        Long oldCapacity = this.capacity;
        this.capacity = capacity;
        changeSupport.firePropertyChange("capacity", oldCapacity, capacity);
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        Long oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wId != null ? wId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Warehouse_1)) {
            return false;
        }
        Warehouse_1 other = (Warehouse_1) object;
        if ((this.wId == null && other.wId != null) || (this.wId != null && !this.wId.equals(other.wId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "files.Warehouse_1[ wId=" + wId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
