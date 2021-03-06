/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.sources.tables.Stream;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StreamRecord extends UpdatableRecordImpl<StreamRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.stream.stream_id</code>.
     */
    public void setStreamId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.stream.stream_id</code>.
     */
    public Integer getStreamId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.stream.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.stream.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Stream.STREAM.STREAM_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Stream.STREAM.USER_ID;
    }

    @Override
    public Integer component1() {
        return getStreamId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public Integer value1() {
        return getStreamId();
    }

    @Override
    public Integer value2() {
        return getUserId();
    }

    @Override
    public StreamRecord value1(Integer value) {
        setStreamId(value);
        return this;
    }

    @Override
    public StreamRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public StreamRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StreamRecord
     */
    public StreamRecord() {
        super(Stream.STREAM);
    }

    /**
     * Create a detached, initialised StreamRecord
     */
    public StreamRecord(Integer streamId, Integer userId) {
        super(Stream.STREAM);

        setStreamId(streamId);
        setUserId(userId);
    }
}
