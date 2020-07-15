package com.deeshant.deeshantsbnri.data.local.db.dao;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.deeshant.deeshantsbnri.data.local.db.Converter;
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class DummyDao_Impl implements DummyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDummyResponse;

  private final Converter __converter = new Converter();

  public DummyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDummyResponse = new EntityInsertionAdapter<DummyResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DummyResponse`(`id`,`name`,`description`,`open_issues_count`,`license`,`permissions`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DummyResponse value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getOpen_issues_count());
        final String _tmp;
        _tmp = __converter.nestedDataToString(value.getLicense());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converter.PermToString(value.getPermissions());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
      }
    };
  }

  @Override
  public void createAll(List<DummyResponse> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDummyResponse.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Single<List<DummyResponse>> getAll() {
    final String _sql = "SELECT * FROM DummyResponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<List<DummyResponse>>() {
      @Override
      public List<DummyResponse> call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
          final int _cursorIndexOfOpenIssuesCount = _cursor.getColumnIndexOrThrow("open_issues_count");
          final int _cursorIndexOfLicense = _cursor.getColumnIndexOrThrow("license");
          final int _cursorIndexOfPermissions = _cursor.getColumnIndexOrThrow("permissions");
          final java.util.List<com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse> _result = new java.util.ArrayList<com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final java.lang.String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final java.lang.String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final int _tmpOpen_issues_count;
            _tmpOpen_issues_count = _cursor.getInt(_cursorIndexOfOpenIssuesCount);
            final com.deeshant.deeshantsbnri.data.local.db.entity.License _tmpLicense;
            final java.lang.String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfLicense);
            _tmpLicense = __converter.stringToNestedData(_tmp);
            final com.deeshant.deeshantsbnri.data.local.db.entity.Permisions _tmpPermissions;
            final java.lang.String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfPermissions);
            _tmpPermissions = __converter.stringToPerm(_tmp_1);
            _item = new com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse(_tmpId,_tmpName,_tmpDescription,_tmpOpen_issues_count,_tmpLicense,_tmpPermissions);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
