

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
@Table(name = "Doktori", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doktori.findAll", query = "SELECT d FROM Doktori d"),
    @NamedQuery(name = "Doktori.findById", query = "SELECT d FROM Doktori d WHERE d.id = :id"),
    @NamedQuery(name = "Doktori.findByEmri", query = "SELECT d FROM Doktori d WHERE d.emri = :emri"),
    @NamedQuery(name = "Doktori.findByMbiemri", query = "SELECT d FROM Doktori d WHERE d.mbiemri = :mbiemri"),
    @NamedQuery(name = "Doktori.findByGjinia", query = "SELECT d FROM Doktori d WHERE d.gjinia = :gjinia"),
    @NamedQuery(name = "Doktori.findByDataLindjes", query = "SELECT d FROM Doktori d WHERE d.dataLindjes = :dataLindjes"),
    @NamedQuery(name = "Doktori.findByFjalkalimi", query = "SELECT d FROM Doktori d WHERE d.fjalkalimi = :fjalkalimi"),
    @NamedQuery(name = "Doktori.findBySpecializimi", query = "SELECT d FROM Doktori d WHERE d.specializimi = :specializimi"),
    @NamedQuery(name = "Doktori.findByQyteti", query = "SELECT d FROM Doktori d WHERE d.qyteti = :qyteti"),
    @NamedQuery(name = "Doktori.findByShteti", query = "SELECT d FROM Doktori d WHERE d.shteti = :shteti"),
    @NamedQuery(name = "Doktori.findByRuga", query = "SELECT d FROM Doktori d WHERE d.ruga = :ruga"),
    @NamedQuery(name = "Doktori.findByNumri", query = "SELECT d FROM Doktori d WHERE d.numri = :numri"),
    @NamedQuery(name = "Doktori.findByDetajetTjera", query = "SELECT d FROM Doktori d WHERE d.detajetTjera = :detajetTjera"),
    @NamedQuery(name = "Doktori.findByEmriMbiemri", query = "select d from Doktori as d where d.emri = :emri and d.mbiemri = :mbiemri")})
   
public class Doktori implements Serializable {
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
    @Column(name = "specializimi", length = 300)
    private String specializimi;
    @Column(name = "qyteti", length = 80)
    private String qyteti;
    @Column(name = "shteti", length = 80)
    private String shteti;
    @Column(name = "ruga", length = 80)
    private String ruga;
    @Column(name = "numri")
    private Integer numri;
    @Column(name = "detajet_tjera", length = 250)
    private String detajetTjera;
    @OneToMany(mappedBy = "doktoriID")
    private Collection<HistoriaPacientit> historiaPacientitCollection;
    @JoinColumn(name = "sektori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Sektori sektoriID;
    @OneToMany(mappedBy = "doktoriID")
    private Collection<Orari> orariCollection;

    public Doktori() {
    }

    public Doktori(Integer id) {
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

    public String getSpecializimi() {
        return specializimi;
    }

    public void setSpecializimi(String specializimi) {
        this.specializimi = specializimi;
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

    public String getDetajetTjera() {
        return detajetTjera;
    }

    public void setDetajetTjera(String detajetTjera) {
        this.detajetTjera = detajetTjera;
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
        if (!(object instanceof Doktori)) {
            return false;
        }
        Doktori other = (Doktori) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Doktori[ id=" + id + " ]";
    }

}
