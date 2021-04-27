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
@Table(name = "market", catalog = "Farm_Management", schema = "")
@NamedQueries({
    @NamedQuery(name = "Market_1.findAll", query = "SELECT m FROM Market_1 m")
    , @NamedQuery(name = "Market_1.findByMId", query = "SELECT m FROM Market_1 m WHERE m.mId = :mId")
    , @NamedQuery(name = "Market_1.findByMAddress", query = "SELECT m FROM Market_1 m WHERE m.mAddress = :mAddress")
    , @NamedQuery(name = "Market_1.findByContactNo", query = "SELECT m FROM Market_1 m WHERE m.contactNo = :contactNo")})
public class Market_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "m_id")
    private String mId;
    @Column(name = "m_address")
    private String mAddress;
    @Column(name = "contact_no")
    private Long contactNo;

    public Market_1() {
    }

    public Market_1(String mId) {
        this.mId = mId;
    }

    public String getMId() {
        return mId;
    }

    public void setMId(String mId) {
        String oldMId = this.mId;
        this.mId = mId;
        changeSupport.firePropertyChange("MId", oldMId, mId);
    }

    public String getMAddress() {
        return mAddress;
    }

    public void setMAddress(String mAddress) {
        String oldMAddress = this.mAddress;
        this.mAddress = mAddress;
        changeSupport.firePropertyChange("MAddress", oldMAddress, mAddress);
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        Long oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Market_1)) {
            return false;
        }
        Market_1 other = (Market_1) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "files.Market_1[ mId=" + mId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
