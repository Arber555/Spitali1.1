

package EJB;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Rescepsionisti", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rescepsionisti.findAll", query = "SELECT r FROM Rescepsionisti r"),
    @NamedQuery(name = "Rescepsionisti.findById", query = "SELECT r FROM Rescepsionisti r WHERE r.id = :id"),
    @NamedQuery(name = "Rescepsionisti.findByEmri", query = "SELECT r FROM Rescepsionisti r WHERE r.emri = :emri"),
    @NamedQuery(name = "Rescepsionisti.findByMbiemri", query = "SELECT r FROM Rescepsionisti r WHERE r.mbiemri = :mbiemri"),
    @NamedQuery(name = "Rescepsionisti.findByGjinia", query = "SELECT r FROM Rescepsionisti r WHERE r.gjinia = :gjinia"),
    @NamedQuery(name = "Rescepsionisti.findByDataLindjes", query = "SELECT r FROM Rescepsionisti r WHERE r.dataLindjes = :dataLindjes"),
    @NamedQuery(name = "Rescepsionisti.findByFjalkalimi", query = "SELECT r FROM Rescepsionisti r WHERE r.fjalkalimi = :fjalkalimi"),
    @NamedQuery(name = "Rescepsionisti.findByQyteti", query = "SELECT r FROM Rescepsionisti r WHERE r.qyteti = :qyteti"),
    @NamedQuery(name = "Rescepsionisti.findByShteti", query = "SELECT r FROM Rescepsionisti r WHERE r.shteti = :shteti"),
    @NamedQuery(name = "Rescepsionisti.findByRuga", query = "SELECT r FROM Rescepsionisti r WHERE r.ruga = :ruga"),
    @NamedQuery(name = "Rescepsionisti.findByNumri", query = "SELECT r FROM Rescepsionisti r WHERE r.numri = :numri"),
    @NamedQuery(name = "Rescepsionisti.findByDetajettjera", query = "SELECT r FROM Rescepsionisti r WHERE r.detajettjera = :detajettjera")})
public class Rescepsionisti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator ="InvSeq")
    @SequenceGenerator(name ="InvSeq",sequenceName="INV_SEQ",allocationSize=1)
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
    @Column(name = "fjalkalimi", length = 15)
    private String fjalkalimi;
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
    @OneToMany(mappedBy = "rid")
    private Collection<HistoriaPacientit> historiaPacientitCollection;
    @OneToMany(mappedBy = "rescepsionistiID")
    private Collection<Orari> orariCollection;

    public Rescepsionisti() {
    }

    public Rescepsionisti(Integer id) {
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

    public String getFjalkalimi() {
        return fjalkalimi;
    }

    public void setFjalkalimi(String fjalkalimi) {
        this.fjalkalimi = fjalkalimi;
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

    @XmlTransient
    public Collection<HistoriaPacientit> getHistoriaPacientitCollection() {
        return historiaPacientitCollection;
    }

    public void setHistoriaPacientitCollection(Collection<HistoriaPacientit> historiaPacientitCollection) {
        this.historiaPacientitCollection = historiaPacientitCollection;
    }

    @XmlTransient
    public Collection<Orari> getOrariCollection() {
        return orariCollection;
    }

    public void setOrariCollection(Collection<Orari> orariCollection) {
        this.orariCollection = orariCollection;
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
        if (!(object instanceof Rescepsionisti)) {
            return false;
        }
        Rescepsionisti other = (Rescepsionisti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Rescepsionisti[ id=" + id + " ]";
    }

}
