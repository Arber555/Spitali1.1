

package EJB;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Salla_Operacionit", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SallaOperacionit.findAll", query = "SELECT s FROM SallaOperacionit s"),
    @NamedQuery(name = "SallaOperacionit.findById", query = "SELECT s FROM SallaOperacionit s WHERE s.id = :id"),
    @NamedQuery(name = "SallaOperacionit.findByData", query = "SELECT s FROM SallaOperacionit s WHERE s.data = :data"),
    @NamedQuery(name = "SallaOperacionit.findByOra", query = "SELECT s FROM SallaOperacionit s WHERE s.ora = :ora")})
public class SallaOperacionit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "ora")
    @Temporal(TemporalType.TIME)
    private Date ora;
    @JoinColumn(name = "sektori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Sektori sektoriID;

    public SallaOperacionit() {
    }

    public SallaOperacionit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getOra() {
        return ora;
    }

    public void setOra(Date ora) {
        this.ora = ora;
    }

    public Sektori getSektoriID() {
        return sektoriID;
    }

    public void setSektoriID(Sektori sektoriID) {
        this.sektoriID = sektoriID;
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
        if (!(object instanceof SallaOperacionit)) {
            return false;
        }
        SallaOperacionit other = (SallaOperacionit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.SallaOperacionit[ id=" + id + " ]";
    }

}
