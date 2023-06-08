package com.desiemoji.keyboard.data.local.sample;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.rxjava3.EmptyResultSetException;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SampleDao_Impl implements SampleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SampleEntity> __insertionAdapterOfSampleEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeData;

  public SampleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSampleEntity = new EntityInsertionAdapter<SampleEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `sample` (`table_id`,`id`,`data`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SampleEntity value) {
        stmt.bindLong(1, value.getTable_id());
        stmt.bindLong(2, value.getId());
        if (value.getData() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getData());
        }
      }
    };
    this.__preparedStmtOfNukeData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sample";
        return _query;
      }
    };
  }

  @Override
  public Completable insertMusics(final List<SampleEntity> articles) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSampleEntity.insert(articles);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable nukeData() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfNukeData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfNukeData.release(_stmt);
        }
      }
    });
  }

  @Override
  public Single<List<SampleEntity>> getMusics() {
    final String _sql = "SELECT * FROM sample";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<SampleEntity>>() {
      @Override
      public List<SampleEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "table_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
          final List<SampleEntity> _result = new ArrayList<SampleEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SampleEntity _item;
            final int _tmpTable_id;
            _tmpTable_id = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpData;
            if (_cursor.isNull(_cursorIndexOfData)) {
              _tmpData = null;
            } else {
              _tmpData = _cursor.getString(_cursorIndexOfData);
            }
            _item = new SampleEntity(_tmpTable_id,_tmpId,_tmpData);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
