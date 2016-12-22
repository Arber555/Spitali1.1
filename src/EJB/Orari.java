

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
@Table(name = "Orari", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orari.findAll", query = "SELECT o FROM Orari o"),
    @NamedQuery(name = "Orari.findById", query = "SELECT o FROM Orari o WHERE o.id = :id"),
    @NamedQuery(name = "Orari.findByDataFilimit", query = "SELECT o FROM Orari o WHERE o.dataFilimit = :dataFilimit"),
    @NamedQuery(name = "Orari.findByDataMbarimit", query = "SELECT o FROM Orari o WHERE o.dataMbarimit = :dataMbarimit"),
    @NamedQuery(name = "Orari.findByKohaFillimi", query = "SELECT o FROM Orari o WHERE o.kohaFillimi = :kohaFillimi"),
    @NamedQuery(name = "Orari.findByKohaMbarimi", query = "SELECT o FROM Orari o WHERE o.kohaMbarimi = :kohaMbarimi")})
public class Orari implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "data_Filimit")
    @Temporal(TemporalType.DATE)
    private Date dataFilimit;
    @Column(name = "data_Mbarimit")
    @Temporal(TemporalType.DATE)
    private Date dataMbarimit;
    @Column(name = "koha_Fillimi")
    @Temporal(TemporalType.TIME)
    private Date kohaFillimi;
    @Column(name = "koha_Mbarimi")
    @Temporal(TemporalType.TIME)
    private Date kohaMbarimi;
    @JoinColumn(name = "Doktori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Doktori doktoriID;
    @JoinColumn(name = "Farmacisti_ID", referencedColumnName = "ID")
    @ManyToOne
    private Farmacisti farmacistiID;
    @JoinColumn(name = "Motra_ID", referencedColumnName = "ID")
    @ManyToOne
    private Motra motraID;
    @JoinColumn(name = "Puntori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Puntori puntoriID;
    @JoinColumn(name = "Rescepsionisti_ID", referencedColumnName = "ID")
    @ManyToOne
    private Rescepsionisti rescepsionistiID;

    public Orari() {
    }

    public Orari(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataFilimit() {
        return dataFilimit;
    }

    public void setDataFilimit(Date dataFilimit) {
        this.dataFilimit = dataFilimit;
    }

    public Date getDataMbarimit() {
        return dataMbarimit;
    }

    public void setDataMbarimit(Date dataMbarimit) {
        this.dataMbarimit = dataMbarimit;
    }

    public Date getKohaFillimi() {
        return kohaFillimi;
    }

    public void setKohaFillimi(Date kohaFillimi) {
        this.kohaFillimi = kohaFillimi;
    }

    public Date getKohaMbarimi() {
        return kohaMbarimi;
    }

    public void setKohaMbarimi(Date kohaMbarimi) {
        this.kohaMbarimi = kohaMbarimi;
    }

    public Doktori getDoktoriID() {
        return doktoriID;
    }

    public void setDoktoriID(Doktori doktoriID) {
        this.doktoriID = doktoriID;
    }

    public Farmacisti getFarmacistiID() {
        return farmacistiID;
    }

    public void setFarmacistiID(Farmacisti farmacistiID) {
        this.farmacistiID = farmacistiID;
    }

    public Motra getMotraID() {
        return motraID;
    }

    public void setMotraID(Motra motraID) {
        this.motraID = motraID;
    }

    public Puntori getPuntoriID() {
        return puntoriID;
    }

    public void setPuntoriID(Puntori puntoriID) {
        this.puntoriID = puntoriID;
    }

    public Rescepsionisti getRescepsionistiID() {
        return rescepsionistiID;
    }

    public void setRescepsionistiID(Rescepsionisti rescepsionistiID) {
        this.rescepsionistiID = rescepsionistiID;
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
        if (!(object instanceof Orari)) {
            return false;
        }
        Orari other = (Orari) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Orari[ id=" + id + " ]";
    }

}
