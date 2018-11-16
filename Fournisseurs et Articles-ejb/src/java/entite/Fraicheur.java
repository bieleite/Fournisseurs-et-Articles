/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author gabrielleite
 */
@Entity
public class Fraicheur extends Article implements Serializable {
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dt_limite;

    /**
     * Get the value of dt_limite
     *
     * @return the value of dt_limite
     */
    public Date getDt_limite() {
        return dt_limite;
    }

    /**
     * Set the value of dt_limite
     *
     * @param dt_limite new value of dt_limite
     */
    public void setDt_limite(Date dt_limite) {
        this.dt_limite = dt_limite;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Fraicheur)) {
            return false;
        }
        Fraicheur other = (Fraicheur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Fraicheur[ id=" + id + " ]";
    }
    
}
