

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
@Table(name = "Pacienti", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacienti.findAll", query = "SELECT p FROM Pacienti p"),
    @NamedQuery(name = "Pacienti.findById", query = "SELECT p FROM Pacienti p WHERE p.id = :id"),
    @NamedQuery(name = "Pacienti.findByEmri", query = "SELECT p FROM Pacienti p WHERE p.emri = :emri"),
    @NamedQuery(name = "Pacienti.findByMbiemri", query = "SELECT p FROM Pacienti p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Pacienti.findByGjinia", query = "SELECT p FROM Pacienti p WHERE p.gjinia = :gjinia"),
    @NamedQuery(name = "Pacienti.findByDataLindjes", query = "SELECT p FROM Pacienti p WHERE p.dataLindjes = :dataLindjes"),
    @NamedQuery(name = "Pacienti.findByPesha", query = "SELECT p FROM Pacienti p WHERE p.pesha = :pesha"),
    @NamedQuery(name = "Pacienti.findByGjatsia", query = "SELECT p FROM Pacienti p WHERE p.gjatsia = :gjatsia"),
    @NamedQuery(name = "Pacienti.findByNrTelefonit", query = "SELECT p FROM Pacienti p WHERE p.nrTelefonit = :nrTelefonit"),
    @NamedQuery(name = "Pacienti.findByQyteti", query = "SELECT p FROM Pacienti p WHERE p.qyteti = :qyteti"),
    @NamedQuery(name = "Pacienti.findByShteti", query = "SELECT p FROM Pacienti p WHERE p.shteti = :shteti"),
    @NamedQuery(name = "Pacienti.findByRuga", query = "SELECT p FROM Pacienti p WHERE p.ruga = :ruga"),
    @NamedQuery(name = "Pacienti.findByNumri", query = "SELECT p FROM Pacienti p WHERE p.numri = :numri"),
    @NamedQuery(name = "Pacienti.findByDetajettjera", query = "SELECT p FROM Pacienti p WHERE p.detajettjera = :detajettjera")})
public class Pacienti implements Serializable {
    @OneToMany(mappedBy = "pacjentiID")
    private Collection<FaturaPacientit> faturaPacientitCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "emri", length = 70)
    private String emri;
    @Column(name = "mbiemri", length = 70)
    private String mbiemri;
    @Column(name = "gjinia")
    private Character gjinia;
    @Column(name = "data_lindjes")
    @Temporal(TemporalType.DATE)
    private Date dataLindjes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pesha", precision = 53)
    private Double pesha;
    @Column(name = "gjatsia", precision = 53)
    private Double gjatsia;
    @Column(name = "nr_telefonit")
    private Integer nrTelefonit;
    @Column(name = "qyteti", length = 80)
    private String qyteti;
    @Column(name = "shteti", length = 80)
    private String shteti;
    @Column(name = "ruga", length = 80)
    private String ruga;
    @Column(name = "numri")
    private Integer numri;
    @Column(name = "Detajet_tjera", length = 250)
    private String detajettjera;
    @JoinColumn(name = "ID_dhoma", referencedColumnName = "ID")
    @ManyToOne
    private Dhoma iDdhoma;

    public Pacienti() {
    }

    public Pacienti(Integer id) {
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

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public Double getPesha() {
        return pesha;
    }

    public void setPesha(Double pesha) {
        this.pesha = pesha;
    }

    public Double getGjatsia() {
        return gjatsia;
    }

    public void setGjatsia(Double gjatsia) {
        this.gjatsia = gjatsia;
    }

    public Integer getNrTelefonit() {
        return nrTelefonit;
    }

    public void setNrTelefonit(Integer nrTelefonit) {
        this.nrTelefonit = nrTelefonit;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getShteti() {
        return shteti;
    }

    public void setShteti(String shteti) {
        this.shteti = shteti;
    }

    public String getRuga() {
        return ruga;
    }

    public void setRuga(String ruga) {
        this.ruga = ruga;
    }

    public Integer getNumri() {
        return numri;
    }

    public void setNumri(Integer numri) {
        this.numri = numri;
    }

    public String getDetajettjera() {
        return detajettjera;
    }

    public void setDetajettjera(String detajettjera) {
        this.detajettjera = detajettjera;
    }

    public Dhoma getIDdhoma() {
        return iDdhoma;
    }

    public void setIDdhoma(Dhoma iDdhoma) {
        this.iDdhoma = iDdhoma;
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
        if (!(object instanceof Pacienti)) {
            return false;
        }
        Pacienti other = (Pacienti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Pacienti[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<FaturaPacientit> getFaturaPacientitCollection() {
        return faturaPacientitCollection;
    }

    public void setFaturaPacientitCollection(Collection<FaturaPacientit> faturaPacientitCollection) {
        this.faturaPacientitCollection = faturaPacientitCollection;
    }

}
