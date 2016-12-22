

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
@Table(name = "Historia_Pacientit", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriaPacientit.findAll", query = "SELECT h FROM HistoriaPacientit h"),
    @NamedQuery(name = "HistoriaPacientit.findById", query = "SELECT h FROM HistoriaPacientit h WHERE h.id = :id"),
    @NamedQuery(name = "HistoriaPacientit.findByUpdateDate", query = "SELECT h FROM HistoriaPacientit h WHERE h.updateDate = :updateDate"),
    @NamedQuery(name = "HistoriaPacientit.findByGjendjaMjeksore", query = "SELECT h FROM HistoriaPacientit h WHERE h.gjendjaMjeksore = :gjendjaMjeksore"),
    @NamedQuery(name = "HistoriaPacientit.findByPershkrimiKomponenteve", query = "SELECT h FROM HistoriaPacientit h WHERE h.pershkrimiKomponenteve = :pershkrimiKomponenteve")})
public class HistoriaPacientit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Column(name = "update_date")
    @Temporal(TemporalType.DATE)
    private Date updateDate;
    @Column(name = "gjendja_mjeksore", length = 250)
    private String gjendjaMjeksore;
    @Column(name = "pershkrimi_komponenteve", length = 250)
    private String pershkrimiKomponenteve;
    @JoinColumn(name = "doktori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Doktori doktoriID;
    @JoinColumn(name = "motra_ID", referencedColumnName = "ID")
    @ManyToOne
    private Motra motraID;
    @JoinColumn(name = "pacienti_ID", referencedColumnName = "ID")
    @ManyToOne
    private Pacienti pacientiID;
    @JoinColumn(name = "r_ID", referencedColumnName = "ID")
    @ManyToOne
    private Rescepsionisti rid;

    public HistoriaPacientit() {
    }

    public HistoriaPacientit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getGjendjaMjeksore() {
        return gjendjaMjeksore;
    }

    public void setGjendjaMjeksore(String gjendjaMjeksore) {
        this.gjendjaMjeksore = gjendjaMjeksore;
    }

    public String getPershkrimiKomponenteve() {
        return pershkrimiKomponenteve;
    }

    public void setPershkrimiKomponenteve(String pershkrimiKomponenteve) {
        this.pershkrimiKomponenteve = pershkrimiKomponenteve;
    }

    public Doktori getDoktoriID() {
        return doktoriID;
    }

    public void setDoktoriID(Doktori doktoriID) {
        this.doktoriID = doktoriID;
    }

    public Motra getMotraID() {
        return motraID;
    }

    public void setMotraID(Motra motraID) {
        this.motraID = motraID;
    }

    public Pacienti getPacientiID() {
        return pacientiID;
    }

    public void setPacientiID(Pacienti pacientiID) {
        this.pacientiID = pacientiID;
    }

    public Rescepsionisti getRid() {
        return rid;
    }

    public void setRid(Rescepsionisti rid) {
        this.rid = rid;
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
        if (!(object instanceof HistoriaPacientit)) {
            return false;
        }
        HistoriaPacientit other = (HistoriaPacientit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.HistoriaPacientit[ id=" + id + " ]";
    }

}
