/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord> implements org.jooq.test.firebird.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = 1002315349;

	/**
	 * The table column <code>T_DATES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.ID, value);
	}

	/**
	 * The table column <code>T_DATES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.ID);
	}

	/**
	 * The table column <code>T_DATES.D</code>
	 */
	@Override
	public void setD(java.sql.Date value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.D, value);
	}

	/**
	 * The table column <code>T_DATES.D</code>
	 */
	@Override
	public java.sql.Date getD() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.D);
	}

	/**
	 * The table column <code>T_DATES.T</code>
	 */
	@Override
	public void setT(java.sql.Time value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.T, value);
	}

	/**
	 * The table column <code>T_DATES.T</code>
	 */
	@Override
	public java.sql.Time getT() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.T);
	}

	/**
	 * The table column <code>T_DATES.TS</code>
	 */
	@Override
	public void setTs(java.sql.Timestamp value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.TS, value);
	}

	/**
	 * The table column <code>T_DATES.TS</code>
	 */
	@Override
	public java.sql.Timestamp getTs() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.TS);
	}

	/**
	 * The table column <code>T_DATES.D_INT</code>
	 */
	@Override
	public void setDInt(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.D_INT, value);
	}

	/**
	 * The table column <code>T_DATES.D_INT</code>
	 */
	@Override
	public java.lang.Integer getDInt() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.D_INT);
	}

	/**
	 * The table column <code>T_DATES.TS_BIGINT</code>
	 */
	@Override
	public void setTsBigint(java.lang.Long value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.TS_BIGINT, value);
	}

	/**
	 * The table column <code>T_DATES.TS_BIGINT</code>
	 */
	@Override
	public java.lang.Long getTsBigint() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.TS_BIGINT);
	}

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES);
	}
}
