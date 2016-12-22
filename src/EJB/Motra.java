

package EJB;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Motra", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motra.findAll", query = "SELECT m FROM Motra m"),
    @NamedQuery(name = "Motra.findById", query = "SELECT m FROM Motra m WHERE m.id = :id"),
    @NamedQuery(name = "Motra.findByEmri", query = "SELECT m FROM Motra m WHERE m.emri = :emri"),
    @NamedQuery(name = "Motra.findByMbiemri", query = "SELECT m FROM Motra m WHERE m.mbiemri = :mbiemri"),
    @NamedQuery(name = "Motra.findByGjinia", query = "SELECT m FROM Motra m WHERE m.gjinia = :gjinia"),
    @NamedQuery(name = "Motra.findByDataLindjes", query = "SELECT m FROM Motra m WHERE m.dataLindjes = :dataLindjes"),
    @NamedQuery(name = "Motra.findByFjalkalimi", query = "SELECT m FROM Motra m WHERE m.fjalkalimi = :fjalkalimi"),
    @NamedQuery(name = "Motra.findByQyteti", query = "SELECT m FROM Motra m WHERE m.qyteti = :qyteti"),
    @NamedQuery(name = "Motra.findByShteti", query = "SELECT m FROM Motra m WHERE m.shteti = :shteti"),
    @NamedQuery(name = "Motra.findByRuga", query = "SELECT m FROM Motra m WHERE m.ruga = :ruga"),
    @NamedQuery(name = "Motra.findByNumri", query = "SELECT m FROM Motra m WHERE m.numri = :numri"),
    @NamedQuery(name = "Motra.findByDetajettjera", query = "SELECT m FROM Motra m WHERE m.detajettjera = :detajettjera")})
public class Motra implements Serializable {
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
    @OneToMany(mappedBy = "motraID")
    private Collection<HistoriaPacientit> historiaPacientitCollection;
    @JoinColumn(name = "sektori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Sektori sektoriID;
    @OneToMany(mappedBy = "motraID")
    private Collection<Orari> orariCollection;

    public Motra() {
    }

    public Motra(Integer id) {
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

    public Sektori getSektoriID() {
        return sektoriID;
    }

    public void setSektoriID(Sektori sektoriID) {
        this.sektoriID = sektoriID;
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
        if (!(object instanceof Motra)) {
            return false;
        }
        Motra other = (Motra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Motra[ id=" + id + " ]";
    }

}
