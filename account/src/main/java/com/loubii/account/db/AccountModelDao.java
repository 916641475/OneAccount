package com.loubii.account.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.loubii.account.bean.AccountModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ACCOUNT_MODEL".
*/
public class AccountModelDao extends AbstractDao<AccountModel, Long> {

    public static final String TABLENAME = "ACCOUNT_MODEL";

    /**
     * Properties of entity AccountModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Count = new Property(1, float.class, "count", false, "COUNT");
        public final static Property OutIntype = new Property(2, int.class, "outIntype", false, "OUT_INTYPE");
        public final static Property DetailType = new Property(3, String.class, "detailType", false, "DETAIL_TYPE");
        public final static Property PicRes = new Property(4, int.class, "picRes", false, "PIC_RES");
        public final static Property Time = new Property(5, java.util.Date.class, "time", false, "TIME");
        public final static Property Note = new Property(6, String.class, "note", false, "NOTE");
        public final static Property Remark = new Property(7, String.class, "remark", false, "REMARK");
    }


    public AccountModelDao(DaoConfig config) {
        super(config);
    }
    
    public AccountModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ACCOUNT_MODEL\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"COUNT\" REAL NOT NULL ," + // 1: count
                "\"OUT_INTYPE\" INTEGER NOT NULL ," + // 2: outIntype
                "\"DETAIL_TYPE\" TEXT," + // 3: detailType
                "\"PIC_RES\" INTEGER NOT NULL ," + // 4: picRes
                "\"TIME\" INTEGER," + // 5: time
                "\"NOTE\" TEXT," + // 6: note
                "\"REMARK\" TEXT);"); // 7: remark
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ACCOUNT_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, AccountModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindDouble(2, entity.getCount());
        stmt.bindLong(3, entity.getOutIntype());
 
        String detailType = entity.getDetailType();
        if (detailType != null) {
            stmt.bindString(4, detailType);
        }
        stmt.bindLong(5, entity.getPicRes());
 
        java.util.Date time = entity.getTime();
        if (time != null) {
            stmt.bindLong(6, time.getTime());
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(7, note);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(8, remark);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, AccountModel entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindDouble(2, entity.getCount());
        stmt.bindLong(3, entity.getOutIntype());
 
        String detailType = entity.getDetailType();
        if (detailType != null) {
            stmt.bindString(4, detailType);
        }
        stmt.bindLong(5, entity.getPicRes());
 
        java.util.Date time = entity.getTime();
        if (time != null) {
            stmt.bindLong(6, time.getTime());
        }
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(7, note);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(8, remark);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public AccountModel readEntity(Cursor cursor, int offset) {
        AccountModel entity = new AccountModel( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getFloat(offset + 1), // count
            cursor.getInt(offset + 2), // outIntype
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // detailType
            cursor.getInt(offset + 4), // picRes
            cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)), // time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // note
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // remark
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, AccountModel entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCount(cursor.getFloat(offset + 1));
        entity.setOutIntype(cursor.getInt(offset + 2));
        entity.setDetailType(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPicRes(cursor.getInt(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : new java.util.Date(cursor.getLong(offset + 5)));
        entity.setNote(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRemark(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(AccountModel entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(AccountModel entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(AccountModel entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
