/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Keys;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.StreamRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stream extends TableImpl<StreamRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.stream</code>
     */
    public static final Stream STREAM = new Stream();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StreamRecord> getRecordType() {
        return StreamRecord.class;
    }

    /**
     * The column <code>public.stream.stream_id</code>.
     */
    public final TableField<StreamRecord, Integer> STREAM_ID = createField(DSL.name("stream_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.stream.user_id</code>.
     */
    public final TableField<StreamRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Stream(Name alias, Table<StreamRecord> aliased) {
        this(alias, aliased, null);
    }

    private Stream(Name alias, Table<StreamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.stream</code> table reference
     */
    public Stream(String alias) {
        this(DSL.name(alias), STREAM);
    }

    /**
     * Create an aliased <code>public.stream</code> table reference
     */
    public Stream(Name alias) {
        this(alias, STREAM);
    }

    /**
     * Create a <code>public.stream</code> table reference
     */
    public Stream() {
        this(DSL.name("stream"), null);
    }

    public <O extends Record> Stream(Table<O> child, ForeignKey<O, StreamRecord> key) {
        super(child, key, STREAM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<StreamRecord> getPrimaryKey() {
        return Keys.STREAM_PKEY;
    }

    @Override
    public List<ForeignKey<StreamRecord, ?>> getReferences() {
        return Arrays.asList(Keys.STREAM__STREAM_USER_ID_FKEY);
    }

    private transient Users _users;

    /**
     * Get the implicit join path to the <code>public.users</code> table.
     */
    public Users users() {
        if (_users == null)
            _users = new Users(this, Keys.STREAM__STREAM_USER_ID_FKEY);

        return _users;
    }

    @Override
    public Stream as(String alias) {
        return new Stream(DSL.name(alias), this);
    }

    @Override
    public Stream as(Name alias) {
        return new Stream(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Stream rename(String name) {
        return new Stream(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Stream rename(Name name) {
        return new Stream(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
