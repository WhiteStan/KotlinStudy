/*
 * This file is generated by jOOQ.
 */
package com.firsttouch.ktl.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String  firstname;
    private final String  lastname;
    private final String  phone;

    public Record(Record value) {
        this.id = value.id;
        this.firstname = value.firstname;
        this.lastname = value.lastname;
        this.phone = value.phone;
    }

    public Record(
        Integer id,
        String  firstname,
        String  lastname,
        String  phone
    ) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    /**
     * Getter for <code>app.record.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>app.record.FirstName</code>.
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Getter for <code>app.record.LastName</code>.
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Getter for <code>app.record.Phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Record (");

        sb.append(id);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(phone);

        sb.append(")");
        return sb.toString();
    }
}