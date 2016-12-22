

package EJB;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Puntori", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntori.findAll", query = "SELECT p FROM Puntori p"),
    @NamedQuery(name = "Puntori.findById", query = "SELECT p FROM Puntori p WHERE p.id = :id"),
    @NamedQuery(name = "Puntori.findByEmri", query = "SELECT p FROM Puntori p WHERE p.emri = :emri"),
    @NamedQuery(name = "Puntori.findByMbiemri", query = "SELECT p FROM Puntori p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Puntori.findByGjinia", query = "SELECT p FROM Puntori p WHERE p.gjinia = :gjinia"),
    @NamedQuery(name = "Puntori.findByQyteti", query = "SELECT p FROM Puntori p WHERE p.qyteti = :qyteti"),
    @NamedQuery(name = "Puntori.findByShteti", query = "SELECT p FROM Puntori p WHERE p.shteti = :shteti"),
    @NamedQuery(name = "Puntori.findByRuga", query = "SELECT p FROM Puntori p WHERE p.ruga = :ruga"),
    @NamedQuery(name = "Puntori.findByNumri", query = "SELECT p FROM Puntori p WHERE p.numri = :numri"),
    @NamedQuery(name = "Puntori.findByDataLindjes", query = "SELECT p FROM Puntori p WHERE p.dataLindjes = :dataLindjes"),
    @NamedQuery(name = "Puntori.findByDetajettjera", query = "SELECT p FROM Puntori p WHERE p.detajettjera = :detajettjera")})
public class Puntori implements Serializable {
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
    @Column(name = "qyteti", length = 80)
    private String qyteti;
    @Column(name = "shteti", length = 80)
    private String shteti;
    @Column(name = "ruga", length = 80)
    private String ruga;
    @Column(name = "numri")
    private Integer numri;
    @Column(name = "data_lindjes")
    @Temporal(TemporalType.DATE)
    private Date dataLindjes;
    @Column(name = "Detajet_tjera", length = 250)
    private String detajettjera;
    @OneToMany(mappedBy = "puntoriID")
    private Collection<Orari> orariCollection;

    public Puntori() {
    }

    public Puntori(Integer id) {
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

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public String getDetajettjera() {
        return detajettjera;
    }

    public void setDetajettjera(String detajettjera) {
        this.detajettjera = detajettjera;
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
        if (!(object instanceof Puntori)) {
            return false;
        }
        Puntori other = (Puntori) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Puntori[ id=" + id + " ]";
    }

}
