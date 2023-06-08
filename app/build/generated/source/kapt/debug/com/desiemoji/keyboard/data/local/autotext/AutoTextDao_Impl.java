package com.desiemoji.keyboard.data.local.autotext;

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
import java.lang.IllegalArgumentException;
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
public final class AutoTextDao_Impl implements AutoTextDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AutoTextEntity> __insertionAdapterOfAutoTextEntity;

  private final EntityDeletionOrUpdateAdapter<AutoTextEntity> __deletionAdapterOfAutoTextEntity;

  private final EntityDeletionOrUpdateAdapter<AutoTextEntity> __updateAdapterOfAutoTextEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeData;

  public AutoTextDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAutoTextEntity = new EntityInsertionAdapter<AutoTextEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `auto_text` (`id`,`title`,`label`,`date`,`updatedDate`,`updatedTime`,`body`,`isActive`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoTextEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getLabel() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, __AutoTextLabel_enumToString(value.getLabel()));
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        if (value.getUpdatedDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUpdatedDate());
        }
        if (value.getUpdatedTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdatedTime());
        }
        if (value.getBody() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBody());
        }
        final int _tmp = value.isActive() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfAutoTextEntity = new EntityDeletionOrUpdateAdapter<AutoTextEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `auto_text` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoTextEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfAutoTextEntity = new EntityDeletionOrUpdateAdapter<AutoTextEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `auto_text` SET `id` = ?,`title` = ?,`label` = ?,`date` = ?,`updatedDate` = ?,`updatedTime` = ?,`body` = ?,`isActive` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AutoTextEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getLabel() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, __AutoTextLabel_enumToString(value.getLabel()));
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        if (value.getUpdatedDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUpdatedDate());
        }
        if (value.getUpdatedTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdatedTime());
        }
        if (value.getBody() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getBody());
        }
        final int _tmp = value.isActive() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfNukeData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM auto_text";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final AutoTextEntity autoText) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAutoTextEntity.insert(autoText);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insert(final List<AutoTextEntity> autoTexts) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAutoTextEntity.insert(autoTexts);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final AutoTextEntity autoText) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAutoTextEntity.handle(autoText);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final AutoTextEntity autoText) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfAutoTextEntity.handle(autoText);
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
  public Single<List<AutoTextEntity>> getAll() {
    final String _sql = "SELECT * FROM auto_text ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<AutoTextEntity>>() {
      @Override
      public List<AutoTextEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedDate");
          final int _cursorIndexOfUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedTime");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<AutoTextEntity> _result = new ArrayList<AutoTextEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoTextEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final AutoTextLabel _tmpLabel;
            _tmpLabel = __AutoTextLabel_stringToEnum(_cursor.getString(_cursorIndexOfLabel));
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpUpdatedTime;
            if (_cursor.isNull(_cursorIndexOfUpdatedTime)) {
              _tmpUpdatedTime = null;
            } else {
              _tmpUpdatedTime = _cursor.getString(_cursorIndexOfUpdatedTime);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            _item = new AutoTextEntity(_tmpId,_tmpTitle,_tmpLabel,_tmpDate,_tmpUpdatedDate,_tmpUpdatedTime,_tmpBody,_tmpIsActive);
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
  public Single<List<AutoTextEntity>> getById(final int id) {
    final String _sql = "SELECT * FROM auto_text WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<List<AutoTextEntity>>() {
      @Override
      public List<AutoTextEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedDate");
          final int _cursorIndexOfUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedTime");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<AutoTextEntity> _result = new ArrayList<AutoTextEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoTextEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final AutoTextLabel _tmpLabel;
            _tmpLabel = __AutoTextLabel_stringToEnum(_cursor.getString(_cursorIndexOfLabel));
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpUpdatedTime;
            if (_cursor.isNull(_cursorIndexOfUpdatedTime)) {
              _tmpUpdatedTime = null;
            } else {
              _tmpUpdatedTime = _cursor.getString(_cursorIndexOfUpdatedTime);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            _item = new AutoTextEntity(_tmpId,_tmpTitle,_tmpLabel,_tmpDate,_tmpUpdatedDate,_tmpUpdatedTime,_tmpBody,_tmpIsActive);
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
  public Single<List<AutoTextEntity>> getByTitle(final String search) {
    final String _sql = "SELECT * FROM auto_text WHERE title LIKE '%' || ? || '%' ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, search);
    }
    return RxRoom.createSingle(new Callable<List<AutoTextEntity>>() {
      @Override
      public List<AutoTextEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedDate");
          final int _cursorIndexOfUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedTime");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<AutoTextEntity> _result = new ArrayList<AutoTextEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoTextEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final AutoTextLabel _tmpLabel;
            _tmpLabel = __AutoTextLabel_stringToEnum(_cursor.getString(_cursorIndexOfLabel));
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpUpdatedTime;
            if (_cursor.isNull(_cursorIndexOfUpdatedTime)) {
              _tmpUpdatedTime = null;
            } else {
              _tmpUpdatedTime = _cursor.getString(_cursorIndexOfUpdatedTime);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            _item = new AutoTextEntity(_tmpId,_tmpTitle,_tmpLabel,_tmpDate,_tmpUpdatedDate,_tmpUpdatedTime,_tmpBody,_tmpIsActive);
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
  public Single<List<AutoTextEntity>> getByLabel(final AutoTextLabel search) {
    final String _sql = "SELECT * FROM auto_text WHERE label = ? ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, __AutoTextLabel_enumToString(search));
    }
    return RxRoom.createSingle(new Callable<List<AutoTextEntity>>() {
      @Override
      public List<AutoTextEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedDate");
          final int _cursorIndexOfUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedTime");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<AutoTextEntity> _result = new ArrayList<AutoTextEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoTextEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final AutoTextLabel _tmpLabel;
            _tmpLabel = __AutoTextLabel_stringToEnum(_cursor.getString(_cursorIndexOfLabel));
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpUpdatedTime;
            if (_cursor.isNull(_cursorIndexOfUpdatedTime)) {
              _tmpUpdatedTime = null;
            } else {
              _tmpUpdatedTime = _cursor.getString(_cursorIndexOfUpdatedTime);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            _item = new AutoTextEntity(_tmpId,_tmpTitle,_tmpLabel,_tmpDate,_tmpUpdatedDate,_tmpUpdatedTime,_tmpBody,_tmpIsActive);
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
  public Single<List<AutoTextEntity>> getByBody(final String search) {
    final String _sql = "SELECT * FROM auto_text WHERE body LIKE '%' || ? || '%' ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, search);
    }
    return RxRoom.createSingle(new Callable<List<AutoTextEntity>>() {
      @Override
      public List<AutoTextEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedDate");
          final int _cursorIndexOfUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedTime");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<AutoTextEntity> _result = new ArrayList<AutoTextEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoTextEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final AutoTextLabel _tmpLabel;
            _tmpLabel = __AutoTextLabel_stringToEnum(_cursor.getString(_cursorIndexOfLabel));
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpUpdatedTime;
            if (_cursor.isNull(_cursorIndexOfUpdatedTime)) {
              _tmpUpdatedTime = null;
            } else {
              _tmpUpdatedTime = _cursor.getString(_cursorIndexOfUpdatedTime);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            _item = new AutoTextEntity(_tmpId,_tmpTitle,_tmpLabel,_tmpDate,_tmpUpdatedDate,_tmpUpdatedTime,_tmpBody,_tmpIsActive);
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
  public Single<List<AutoTextEntity>> getByTitleOrBody(final String search) {
    final String _sql = "SELECT * FROM auto_text WHERE (title LIKE '%' || ? || '%' OR body LIKE '%' || ? || '%') ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, search);
    }
    _argIndex = 2;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, search);
    }
    return RxRoom.createSingle(new Callable<List<AutoTextEntity>>() {
      @Override
      public List<AutoTextEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfLabel = CursorUtil.getColumnIndexOrThrow(_cursor, "label");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUpdatedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedDate");
          final int _cursorIndexOfUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedTime");
          final int _cursorIndexOfBody = CursorUtil.getColumnIndexOrThrow(_cursor, "body");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "isActive");
          final List<AutoTextEntity> _result = new ArrayList<AutoTextEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AutoTextEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final AutoTextLabel _tmpLabel;
            _tmpLabel = __AutoTextLabel_stringToEnum(_cursor.getString(_cursorIndexOfLabel));
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpUpdatedDate;
            if (_cursor.isNull(_cursorIndexOfUpdatedDate)) {
              _tmpUpdatedDate = null;
            } else {
              _tmpUpdatedDate = _cursor.getString(_cursorIndexOfUpdatedDate);
            }
            final String _tmpUpdatedTime;
            if (_cursor.isNull(_cursorIndexOfUpdatedTime)) {
              _tmpUpdatedTime = null;
            } else {
              _tmpUpdatedTime = _cursor.getString(_cursorIndexOfUpdatedTime);
            }
            final String _tmpBody;
            if (_cursor.isNull(_cursorIndexOfBody)) {
              _tmpBody = null;
            } else {
              _tmpBody = _cursor.getString(_cursorIndexOfBody);
            }
            final boolean _tmpIsActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp != 0;
            _item = new AutoTextEntity(_tmpId,_tmpTitle,_tmpLabel,_tmpDate,_tmpUpdatedDate,_tmpUpdatedTime,_tmpBody,_tmpIsActive);
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
        _stringBuilder.append("DELETE FROM auto_text WHERE id in (");
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

  private String __AutoTextLabel_enumToString(final AutoTextLabel _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case DEFAULT: return "DEFAULT";
      case USER: return "USER";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private AutoTextLabel __AutoTextLabel_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "DEFAULT": return AutoTextLabel.DEFAULT;
      case "USER": return AutoTextLabel.USER;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
