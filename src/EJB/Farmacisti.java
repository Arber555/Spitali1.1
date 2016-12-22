

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
@Table(name = "Farmacisti", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Farmacisti.findAll", query = "SELECT f FROM Farmacisti f"),
    @NamedQuery(name = "Farmacisti.findById", query = "SELECT f FROM Farmacisti f WHERE f.id = :id"),
    @NamedQuery(name = "Farmacisti.findByEmri", query = "SELECT f FROM Farmacisti f WHERE f.emri = :emri"),
    @NamedQuery(name = "Farmacisti.findByMbiemri", query = "SELECT f FROM Farmacisti f WHERE f.mbiemri = :mbiemri"),
    @NamedQuery(name = "Farmacisti.findByGjinia", query = "SELECT f FROM Farmacisti f WHERE f.gjinia = :gjinia"),
    @NamedQuery(name = "Farmacisti.findByDataLindjes", query = "SELECT f FROM Farmacisti f WHERE f.dataLindjes = :dataLindjes"),
    @NamedQuery(name = "Farmacisti.findByFjalkalimi", query = "SELECT f FROM Farmacisti f WHERE f.fjalkalimi = :fjalkalimi"),
    @NamedQuery(name = "Farmacisti.findByQyteti", query = "SELECT f FROM Farmacisti f WHERE f.qyteti = :qyteti"),
    @NamedQuery(name = "Farmacisti.findByShteti", query = "SELECT f FROM Farmacisti f WHERE f.shteti = :shteti"),
    @NamedQuery(name = "Farmacisti.findByRuga", query = "SELECT f FROM Farmacisti f WHERE f.ruga = :ruga"),
    @NamedQuery(name = "Farmacisti.findByNumri", query = "SELECT f FROM Farmacisti f WHERE f.numri = :numri"),
    @NamedQuery(name = "Farmacisti.findByDetajetTjera", query = "SELECT f FROM Farmacisti f WHERE f.detajetTjera = :detajetTjera")})
public class Farmacisti implements Serializable {
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
    @Column(name = "detajet_tjera", length = 250)
    private String detajetTjera;
    @OneToMany(mappedBy = "farmacistiID")
    private Collection<Barnat> barnatCollection;
    @OneToMany(mappedBy = "farmacistiID")
    private Collection<Orari> orariCollection;

    public Farmacisti() {
    }

    public Farmacisti(Integer id) {
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

    public String getDetajetTjera() {
        return detajetTjera;
    }

    public void setDetajetTjera(String detajetTjera) {
        this.detajetTjera = detajetTjera;
    }

    @XmlTransient
    public Collection<Barnat> getBarnatCollection() {
        return barnatCollection;
    }

    public void setBarnatCollection(Collection<Barnat> barnatCollection) {
        this.barnatCollection = barnatCollection;
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
        if (!(object instanceof Farmacisti)) {
            return false;
        }
        Farmacisti other = (Farmacisti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Farmacisti[ id=" + id + " ]";
    }

}
