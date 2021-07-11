/*
 * This file is generated by jOOQ.
 */
package generated.com.firsttouch.ktl.tables;


import generated.com.firsttouch.ktl.App;
import generated.com.firsttouch.ktl.Keys;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>app.address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>app.address.id</code>.
     */
    public final TableField<Record, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>app.address.Address</code>.
     */
    public final TableField<Record, String> ADDRESS_ = createField(DSL.name("Address"), SQLDataType.VARCHAR(120).nullable(false), this, "");

    /**
     * The column <code>app.address.City</code>.
     */
    public final TableField<Record, String> CITY = createField(DSL.name("City"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    private Address(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Address(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>app.address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>app.address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    /**
     * Create a <code>app.address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    public <O extends Record> Address(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : App.APP;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_ADDRESS_PRIMARY;
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }
}
