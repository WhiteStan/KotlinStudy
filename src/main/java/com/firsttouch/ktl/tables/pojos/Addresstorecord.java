/*
 * This file is generated by jOOQ.
 */
package com.firsttouch.ktl.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Addresstorecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final Integer addressid;
    private final Integer recordid;

    public Addresstorecord(Addresstorecord value) {
        this.id = value.id;
        this.addressid = value.addressid;
        this.recordid = value.recordid;
    }

    public Addresstorecord(
        Integer id,
        Integer addressid,
        Integer recordid
    ) {
        this.id = id;
        this.addressid = addressid;
        this.recordid = recordid;
    }

    /**
     * Getter for <code>app.addresstorecord.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>app.addresstorecord.addressId</code>.
     */
    public Integer getAddressid() {
        return this.addressid;
    }

    /**
     * Getter for <code>app.addresstorecord.recordId</code>.
     */
    public Integer getRecordid() {
        return this.recordid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Addresstorecord (");

        sb.append(id);
        sb.append(", ").append(addressid);
        sb.append(", ").append(recordid);

        sb.append(")");
        return sb.toString();
    }
}
