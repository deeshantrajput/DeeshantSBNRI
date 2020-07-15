package com.deeshant.deeshantsbnri.data.local.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.deeshant.deeshantsbnri.data.local.db.dao.DummyDao;
import com.deeshant.deeshantsbnri.data.local.db.dao.DummyDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class DatabaseService_Impl extends DatabaseService {
  private volatile DummyDao _dummyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DummyResponse` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `open_issues_count` INTEGER NOT NULL, `license` TEXT, `permissions` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"3fb6d129c2fe8f71eddcf15f244dfdc7\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DummyResponse`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDummyResponse = new HashMap<String, TableInfo.Column>(6);
        _columnsDummyResponse.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsDummyResponse.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsDummyResponse.put("description", new TableInfo.Column("description", "TEXT", false, 0));
        _columnsDummyResponse.put("open_issues_count", new TableInfo.Column("open_issues_count", "INTEGER", true, 0));
        _columnsDummyResponse.put("license", new TableInfo.Column("license", "TEXT", false, 0));
        _columnsDummyResponse.put("permissions", new TableInfo.Column("permissions", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDummyResponse = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDummyResponse = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDummyResponse = new TableInfo("DummyResponse", _columnsDummyResponse, _foreignKeysDummyResponse, _indicesDummyResponse);
        final TableInfo _existingDummyResponse = TableInfo.read(_db, "DummyResponse");
        if (! _infoDummyResponse.equals(_existingDummyResponse)) {
          throw new IllegalStateException("Migration didn't properly handle DummyResponse(com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse).\n"
                  + " Expected:\n" + _infoDummyResponse + "\n"
                  + " Found:\n" + _existingDummyResponse);
        }
      }
    }, "3fb6d129c2fe8f71eddcf15f244dfdc7", "885b1c1e5a92fa5857d9096f442ab3ee");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "DummyResponse");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DummyResponse`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DummyDao dummyDao() {
    if (_dummyDao != null) {
      return _dummyDao;
    } else {
      synchronized(this) {
        if(_dummyDao == null) {
          _dummyDao = new DummyDao_Impl(this);
        }
        return _dummyDao;
      }
    }
  }
}
