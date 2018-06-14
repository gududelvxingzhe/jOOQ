/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.db.h2.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.db.h2.tables.BookToBookStore;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStoreRecord extends UpdatableRecordImpl<BookToBookStoreRecord> implements Record3<String, Integer, Integer> {

    private static final long serialVersionUID = -377224659;

    /**
     * Setter for <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
     */
    public void setBookStoreName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
     */
    public String getBookStoreName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
     */
    public void setBookId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
     */
    public Integer getBookId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>PUBLIC.BOOK_TO_BOOK_STORE.STOCK</code>.
     */
    public void setStock(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK_TO_BOOK_STORE.STOCK</code>.
     */
    public Integer getStock() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return BookToBookStore.BOOK_TO_BOOK_STORE.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBookStoreName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBookStoreName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord value1(String value) {
        setBookStoreName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord value2(Integer value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord value3(Integer value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStoreRecord values(String value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookToBookStoreRecord
     */
    public BookToBookStoreRecord() {
        super(BookToBookStore.BOOK_TO_BOOK_STORE);
    }

    /**
     * Create a detached, initialised BookToBookStoreRecord
     */
    public BookToBookStoreRecord(String bookStoreName, Integer bookId, Integer stock) {
        super(BookToBookStore.BOOK_TO_BOOK_STORE);

        set(0, bookStoreName);
        set(1, bookId);
        set(2, stock);
    }
}
