

package EJB;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Sektori", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sektori.findAll", query = "SELECT s FROM Sektori s"),
    @NamedQuery(name = "Sektori.findById", query = "SELECT s FROM Sektori s WHERE s.id = :id"),
    @NamedQuery(name = "Sektori.findByEmri", query = "SELECT s FROM Sektori s WHERE s.emri = :emri")})
public class Sektori implements Serializable {
    @OneToMany(mappedBy = "sektoriID")
    private Collection<Dhoma> dhomaCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "emri", length = 50)
    private String emri;

    public Sektori() {
    }

    public Sektori(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
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
        if (!(object instanceof Sektori)) {
            return false;
        }
        Sektori other = (Sektori) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Sektori[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Dhoma> getDhomaCollection() {
        return dhomaCollection;
    }

    public void setDhomaCollection(Collection<Dhoma> dhomaCollection) {
        this.dhomaCollection = dhomaCollection;
    }

}
