

package EJB;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Dhoma", catalog = "SpitaliDB1_2", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dhoma.findAll", query = "SELECT d FROM Dhoma d"),
    @NamedQuery(name = "Dhoma.findById", query = "SELECT d FROM Dhoma d WHERE d.id = :id"),
    @NamedQuery(name = "Dhoma.findByNrdhomes", query = "SELECT d FROM Dhoma d WHERE d.nrdhomes = :nrdhomes"),
    @NamedQuery(name = "Dhoma.findByNrshtratve", query = "SELECT d FROM Dhoma d WHERE d.nrshtratve = :nrshtratve"),
    @NamedQuery(name = "Dhoma.findByCountP", query = "SELECT d FROM Dhoma d WHERE d.countP = :countP")})
public class Dhoma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    @GeneratedValue(generator ="InvSeq")
    @SequenceGenerator(name ="InvSeq",sequenceName="INV_SEQ",allocationSize=1)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Nr_dhomes", nullable = false)
    private int nrdhomes;
    @Column(name = "Nr_shtratve")
    private Integer nrshtratve;
    @Column(name = "countP")
    private Integer countP;
    @JoinColumn(name = "sektori_ID", referencedColumnName = "ID")
    @ManyToOne
    private Sektori sektoriID;

    public Dhoma() {
    }

    public Dhoma(Integer id) {
        this.id = id;
    }

    public Dhoma(Integer id, int nrdhomes) {
        this.id = id;
        this.nrdhomes = nrdhomes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNrdhomes() {
        return nrdhomes;
    }

    public void setNrdhomes(int nrdhomes) {
        this.nrdhomes = nrdhomes;
    }

    public Integer getNrshtratve() {
        return nrshtratve;
    }

    public void setNrshtratve(Integer nrshtratve) {
        this.nrshtratve = nrshtratve;
    }

    public Integer getCountP() {
        return countP;
    }

    public void setCountP(Integer countP) {
        this.countP = countP;
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
        if (!(object instanceof Dhoma)) {
            return false;
        }
        Dhoma other = (Dhoma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EJB.Dhoma[ id=" + id + " ]";
    }

}
