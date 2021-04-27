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
@Table(name = "crop_sales", catalog = "Farm_Management", schema = "")
@NamedQueries({
    @NamedQuery(name = "CropSales_1.findAll", query = "SELECT c FROM CropSales_1 c")
    , @NamedQuery(name = "CropSales_1.findBySId", query = "SELECT c FROM CropSales_1 c WHERE c.sId = :sId")
    , @NamedQuery(name = "CropSales_1.findByMId", query = "SELECT c FROM CropSales_1 c WHERE c.mId = :mId")
    , @NamedQuery(name = "CropSales_1.findByCropId", query = "SELECT c FROM CropSales_1 c WHERE c.cropId = :cropId")
    , @NamedQuery(name = "CropSales_1.findByCropName", query = "SELECT c FROM CropSales_1 c WHERE c.cropName = :cropName")
    , @NamedQuery(name = "CropSales_1.findByQuantity", query = "SELECT c FROM CropSales_1 c WHERE c.quantity = :quantity")
    , @NamedQuery(name = "CropSales_1.findByPrice", query = "SELECT c FROM CropSales_1 c WHERE c.price = :price")})
public class CropSales_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "s_id")
    private String sId;
    @Column(name = "m_id")
    private String mId;
    @Column(name = "crop_id")
    private String cropId;
    @Column(name = "crop_name")
    private String cropName;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "price")
    private Long price;

    public CropSales_1() {
    }

    public CropSales_1(String sId) {
        this.sId = sId;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        String oldSId = this.sId;
        this.sId = sId;
        changeSupport.firePropertyChange("SId", oldSId, sId);
    }

    public String getMId() {
        return mId;
    }

    public void setMId(String mId) {
        String oldMId = this.mId;
        this.mId = mId;
        changeSupport.firePropertyChange("MId", oldMId, mId);
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

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        Long oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
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
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CropSales_1)) {
            return false;
        }
        CropSales_1 other = (CropSales_1) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "files.CropSales_1[ sId=" + sId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
