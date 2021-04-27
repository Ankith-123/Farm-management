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
@Table(name = "fertillizer", catalog = "Farm_Management", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fertillizer.findAll", query = "SELECT f FROM Fertillizer f")
    , @NamedQuery(name = "Fertillizer.findByFid", query = "SELECT f FROM Fertillizer f WHERE f.fid = :fid")
    , @NamedQuery(name = "Fertillizer.findByFname", query = "SELECT f FROM Fertillizer f WHERE f.fname = :fname")
    , @NamedQuery(name = "Fertillizer.findByQuantity", query = "SELECT f FROM Fertillizer f WHERE f.quantity = :quantity")
    , @NamedQuery(name = "Fertillizer.findByPrice", query = "SELECT f FROM Fertillizer f WHERE f.price = :price")
    , @NamedQuery(name = "Fertillizer.findByDateOfPurchase", query = "SELECT f FROM Fertillizer f WHERE f.dateOfPurchase = :dateOfPurchase")
    , @NamedQuery(name = "Fertillizer.findByType", query = "SELECT f FROM Fertillizer f WHERE f.type = :type")})
public class Fertillizer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "F_id")
    private String fid;
    @Column(name = "F_name")
    private String fname;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "price")
    private Long price;
    @Column(name = "date_of_purchase")
    private String dateOfPurchase;
    @Column(name = "type")
    private String type;

    public Fertillizer() {
    }

    public Fertillizer(String fid) {
        this.fid = fid;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        String oldFid = this.fid;
        this.fid = fid;
        changeSupport.firePropertyChange("fid", oldFid, fid);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
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

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        String oldDateOfPurchase = this.dateOfPurchase;
        this.dateOfPurchase = dateOfPurchase;
        changeSupport.firePropertyChange("dateOfPurchase", oldDateOfPurchase, dateOfPurchase);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fertillizer)) {
            return false;
        }
        Fertillizer other = (Fertillizer) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "files.Fertillizer[ fid=" + fid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
