package com.desiemoji.keyboard.data.local.recentemoji;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.rxjava3.EmptyResultSetException;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RecentEmojiDao_Impl implements RecentEmojiDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecentEmojiEntity> __insertionAdapterOfRecentEmojiEntity;

  private final EntityDeletionOrUpdateAdapter<RecentEmojiEntity> __deletionAdapterOfRecentEmojiEntity;

  private final EntityDeletionOrUpdateAdapter<RecentEmojiEntity> __updateAdapterOfRecentEmojiEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeData;

  public RecentEmojiDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecentEmojiEntity = new EntityInsertionAdapter<RecentEmojiEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `recentemoji` (`tableId`,`emojiCode`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentEmojiEntity value) {
        stmt.bindLong(1, value.getTableId());
        if (value.getEmojiCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmojiCode());
        }
      }
    };
    this.__deletionAdapterOfRecentEmojiEntity = new EntityDeletionOrUpdateAdapter<RecentEmojiEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `recentemoji` WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentEmojiEntity value) {
        stmt.bindLong(1, value.getTableId());
      }
    };
    this.__updateAdapterOfRecentEmojiEntity = new EntityDeletionOrUpdateAdapter<RecentEmojiEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `recentemoji` SET `tableId` = ?,`emojiCode` = ? WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentEmojiEntity value) {
        stmt.bindLong(1, value.getTableId());
        if (value.getEmojiCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEmojiCode());
        }
        stmt.bindLong(3, value.getTableId());
      }
    };
    this.__preparedStmtOfNukeData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM recentemoji";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final RecentEmojiEntity emoji) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecentEmojiEntity.insert(emoji);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insert(final List<RecentEmojiEntity> emoji) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecentEmojiEntity.insert(emoji);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final RecentEmojiEntity emoji) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRecentEmojiEntity.handle(emoji);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final RecentEmojiEntity emoji) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfRecentEmojiEntity.handle(emoji);
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
  public Single<List<String>> getAllRecentEmojis() {
    final String _sql = "SELECT DISTINCT(emojiCode) FROM recentemoji ORDER BY tableId DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
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

  @Override
  public Single<List<RecentEmojiEntity>> getRecentEmojisByKeyword(final String code) {
    final String _sql = "SELECT * FROM recentemoji WHERE emojiCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    return RxRoom.createSingle(new Callable<List<RecentEmojiEntity>>() {
      @Override
      public List<RecentEmojiEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfEmojiCode = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiCode");
          final List<RecentEmojiEntity> _result = new ArrayList<RecentEmojiEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecentEmojiEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final String _tmpEmojiCode;
            if (_cursor.isNull(_cursorIndexOfEmojiCode)) {
              _tmpEmojiCode = null;
            } else {
              _tmpEmojiCode = _cursor.getString(_cursorIndexOfEmojiCode);
            }
            _item = new RecentEmojiEntity(_tmpTableId,_tmpEmojiCode);
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

  @Override
  public Completable delete(final List<Integer> idList) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        StringBuilder _stringBuilder = StringUtil.newStringBuilder();
        _stringBuilder.append("DELETE FROM recentemoji WHERE tableId in (");
        final int _inputSize = idList.size();
        StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
        _stringBuilder.append(")");
        final String _sql = _stringBuilder.toString();
        final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
        int _argIndex = 1;
        for (Integer _item : idList) {
          if (_item == null) {
            _stmt.bindNull(_argIndex);
          } else {
            _stmt.bindLong(_argIndex, _item);
          }
          _argIndex ++;
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
