package com.betha.exemplo.exemplo.model;

import com.betha.exemplo.exemplo.enterprise.AbstractRegion;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pais extends AbstractRegion {

    @Column(name = "INDICE_DESENV_HUM")
    private Integer idh;

    public Integer getIdh() {
        return idh;
    }

    public void setIdh(Integer idh) {
        this.idh = idh;
    }
}
