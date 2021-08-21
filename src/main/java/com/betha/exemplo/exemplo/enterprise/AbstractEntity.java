package com.betha.exemplo.exemplo.enterprise;

import java.math.BigInteger;

public abstract class AbstractEntity {

    private BigInteger id;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
