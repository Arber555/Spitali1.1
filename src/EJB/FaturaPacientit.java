

package EJB;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Fatura_Pacientit", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaturaPacientit.findAll", query = "SELECT f FROM FaturaPacientit f"),
    @NamedQuery(name = "FaturaPacientit.findById", query = "SELECT f FROM FaturaPacientit f WHERE f.id = :id"),
    @NamedQuery(name = "FaturaPacientit.findByData", query = "SELECT f FROM FaturaPacientit f WHERE f.data = :data"),
    @NamedQuery(name = "FaturaPacientit.findByMetodaPageses", query = "SELECT f FROM FaturaPacientit f WHERE f.metodaPageses = :metodaPageses"),
    @NamedQuery(name = "FaturaPacientit.findByCmimi", query = "SELECT f FROM FaturaPacientit f WHERE f.cmimi = :cmimi"),
    @NamedQuery(name = "FaturaPacientit.findByArtikujt", query = "SELECT f FROM FaturaPacientit f WHERE f.artikujt = :artikujt")})
public class FaturaPacientit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "metoda_Pageses", length = 100)
    private String metodaPageses;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cmimi", precision = 53)
    private Double cmimi;
    @Column(name = "artikujt", length = 100)
    private String artikujt;
    @OneToMany(mappedBy = "faturaID")
    private Collection<Barnat> barnatCollection;
    @JoinColumn(name = "pacjenti_ID", referencedColumnName = "ID")
    @ManyToOne
    private Pacienti pacjentiID;

    public FaturaPacientit() {
    }

    public FaturaPacientit(Integer id) {
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

    public String getMetodaPageses() {
        return metodaPageses;
    }

    public void setMetodaPageses(String metodaPageses) {
        this.metodaPageses = metodaPageses;
    }

    public Double getCmimi() {
        return cmimi;
    }

    public void setCmimi(Double cmimi) {
        this.cmimi = cmimi;
    }

    public String getArtikujt() {
        return artikujt;
    }

    public void setArtikujt(String artikujt) {
        this.artikujt = artikujt;
    }

    @XmlTransient
    public Collection<Barnat> getBarnatCollection() {
        return barnatCollection;
    }

    public void setBarnatCollection(Collection<Barnat> barnatCollection) {
        this.barnatCollection = barnatCollection;
    }

    public Pacienti getPacjentiID() {
        return pacjentiID;
    }

    public void setPacjentiID(Pacienti pacjentiID) {
        this.pacjentiID = pacjentiID;
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
        if (!(object instanceof FaturaPacientit)) {
            return false;
        }
        FaturaPacientit other = (FaturaPacientit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.FaturaPacientit[ id=" + id + " ]";
    }

}
