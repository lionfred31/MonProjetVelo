package greendao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import greendao.Station;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table STATION.
*/
public class StationDao extends AbstractDao<Station, Long> {

    public static final String TABLENAME = "STATION";

    /**
     * Properties of entity Station.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Number = new Property(0, Long.class, "number", true, "NUMBER");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Address = new Property(2, String.class, "address", false, "ADDRESS");
        public final static Property PositionId = new Property(3, long.class, "positionId", false, "POSITION_ID");
        public final static Property Banking = new Property(4, Boolean.class, "banking", false, "BANKING");
        public final static Property Bonus = new Property(5, Boolean.class, "bonus", false, "BONUS");
        public final static Property Status = new Property(6, String.class, "status", false, "STATUS");
        public final static Property Contract_name = new Property(7, String.class, "contract_name", false, "CONTRACT_NAME");
        public final static Property Bike_stands = new Property(8, Integer.class, "bike_stands", false, "BIKE_STANDS");
        public final static Property Available_bike_stands = new Property(9, Integer.class, "available_bike_stands", false, "AVAILABLE_BIKE_STANDS");
        public final static Property Available_bikes = new Property(10, Integer.class, "available_bikes", false, "AVAILABLE_BIKES");
        public final static Property Last_update = new Property(11, Long.class, "last_update", false, "LAST_UPDATE");
    };

    private DaoSession daoSession;


    public StationDao(DaoConfig config) {
        super(config);
    }
    
    public StationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'STATION' (" + //
                "'NUMBER' INTEGER PRIMARY KEY ," + // 0: number
                "'NAME' TEXT," + // 1: name
                "'ADDRESS' TEXT," + // 2: address
                "'POSITION_ID' INTEGER NOT NULL ," + // 3: positionId
                "'BANKING' INTEGER," + // 4: banking
                "'BONUS' INTEGER," + // 5: bonus
                "'STATUS' TEXT," + // 6: status
                "'CONTRACT_NAME' TEXT," + // 7: contract_name
                "'BIKE_STANDS' INTEGER," + // 8: bike_stands
                "'AVAILABLE_BIKE_STANDS' INTEGER," + // 9: available_bike_stands
                "'AVAILABLE_BIKES' INTEGER," + // 10: available_bikes
                "'LAST_UPDATE' INTEGER);"); // 11: last_update
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'STATION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Station entity) {
        stmt.clearBindings();
 
        Long number = entity.getNumber();
        if (number != null) {
            stmt.bindLong(1, number);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(3, address);
        }
        stmt.bindLong(4, entity.getPositionId());
 
        Boolean banking = entity.getBanking();
        if (banking != null) {
            stmt.bindLong(5, banking ? 1l: 0l);
        }
 
        Boolean bonus = entity.getBonus();
        if (bonus != null) {
            stmt.bindLong(6, bonus ? 1l: 0l);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(7, status);
        }
 
        String contract_name = entity.getContract_name();
        if (contract_name != null) {
            stmt.bindString(8, contract_name);
        }
 
        Integer bike_stands = entity.getBike_stands();
        if (bike_stands != null) {
            stmt.bindLong(9, bike_stands);
        }
 
        Integer available_bike_stands = entity.getAvailable_bike_stands();
        if (available_bike_stands != null) {
            stmt.bindLong(10, available_bike_stands);
        }
 
        Integer available_bikes = entity.getAvailable_bikes();
        if (available_bikes != null) {
            stmt.bindLong(11, available_bikes);
        }
 
        Long last_update = entity.getLast_update();
        if (last_update != null) {
            stmt.bindLong(12, last_update);
        }
    }

    @Override
    protected void attachEntity(Station entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Station readEntity(Cursor cursor, int offset) {
        Station entity = new Station( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // number
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // address
            cursor.getLong(offset + 3), // positionId
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // banking
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0, // bonus
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // status
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // contract_name
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // bike_stands
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // available_bike_stands
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // available_bikes
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11) // last_update
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Station entity, int offset) {
        entity.setNumber(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAddress(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPositionId(cursor.getLong(offset + 3));
        entity.setBanking(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setBonus(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
        entity.setStatus(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setContract_name(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setBike_stands(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setAvailable_bike_stands(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setAvailable_bikes(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setLast_update(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Station entity, long rowId) {
        entity.setNumber(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Station entity) {
        if(entity != null) {
            return entity.getNumber();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getPositionDao().getAllColumns());
            builder.append(" FROM STATION T");
            builder.append(" LEFT JOIN POSITION T0 ON T.'POSITION_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Station loadCurrentDeep(Cursor cursor, boolean lock) {
        Station entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Position position = loadCurrentOther(daoSession.getPositionDao(), cursor, offset);
         if(position != null) {
            entity.setPosition(position);
        }

        return entity;    
    }

    public Station loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Station> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Station> list = new ArrayList<Station>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Station> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Station> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
