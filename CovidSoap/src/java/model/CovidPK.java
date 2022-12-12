/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author theki
 */
@Embeddable
public class CovidPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "YEARS")
    private int years;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEEKNUM")
    private int weeknum;

    public CovidPK() {
    }

    public CovidPK(int years, int weeknum) {
        this.years = years;
        this.weeknum = weeknum;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(int weeknum) {
        this.weeknum = weeknum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) years;
        hash += (int) weeknum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CovidPK)) {
            return false;
        }
        CovidPK other = (CovidPK) object;
        if (this.years != other.years) {
            return false;
        }
        if (this.weeknum != other.weeknum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.CovidPK[ years=" + years + ", weeknum=" + weeknum + " ]";
    }
    
}
