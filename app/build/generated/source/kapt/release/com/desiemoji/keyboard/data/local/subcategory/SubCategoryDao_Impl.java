package com.desiemoji.keyboard.data.local.subcategory;

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
public final class SubCategoryDao_Impl implements SubCategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SubCategoryEntity> __insertionAdapterOfSubCategoryEntity;

  private final EntityDeletionOrUpdateAdapter<SubCategoryEntity> __deletionAdapterOfSubCategoryEntity;

  private final EntityDeletionOrUpdateAdapter<SubCategoryEntity> __updateAdapterOfSubCategoryEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeData;

  public SubCategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubCategoryEntity = new EntityInsertionAdapter<SubCategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `subcategory` (`tableId`,`SubCategoryId`,`SubCategoryName`,`categoryId`,`subCategoryIcon`,`subCategoryIconPath`,`createdAt`,`updatedAt`,`active`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubCategoryEntity value) {
        stmt.bindLong(1, value.getTableId());
        stmt.bindLong(2, value.getSubCategoryId());
        if (value.getSubCategoryName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSubCategoryName());
        }
        stmt.bindLong(4, value.getCategoryId());
        if (value.getSubCategoryIcon() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSubCategoryIcon());
        }
        if (value.getSubCategoryIconPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSubCategoryIconPath());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUpdatedAt());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__deletionAdapterOfSubCategoryEntity = new EntityDeletionOrUpdateAdapter<SubCategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `subcategory` WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubCategoryEntity value) {
        stmt.bindLong(1, value.getTableId());
      }
    };
    this.__updateAdapterOfSubCategoryEntity = new EntityDeletionOrUpdateAdapter<SubCategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `subcategory` SET `tableId` = ?,`SubCategoryId` = ?,`SubCategoryName` = ?,`categoryId` = ?,`subCategoryIcon` = ?,`subCategoryIconPath` = ?,`createdAt` = ?,`updatedAt` = ?,`active` = ? WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubCategoryEntity value) {
        stmt.bindLong(1, value.getTableId());
        stmt.bindLong(2, value.getSubCategoryId());
        if (value.getSubCategoryName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSubCategoryName());
        }
        stmt.bindLong(4, value.getCategoryId());
        if (value.getSubCategoryIcon() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSubCategoryIcon());
        }
        if (value.getSubCategoryIconPath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSubCategoryIconPath());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUpdatedAt());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        stmt.bindLong(10, value.getTableId());
      }
    };
    this.__preparedStmtOfNukeData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM subcategory";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final SubCategoryEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSubCategoryEntity.insert(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insert(final List<SubCategoryEntity> data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSubCategoryEntity.insert(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final SubCategoryEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfSubCategoryEntity.handle(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final SubCategoryEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSubCategoryEntity.handle(data);
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
  public Single<List<SubCategoryEntity>> getAllSubCategory() {
    final String _sql = "SELECT * FROM subcategory WHERE active = true  ORDER BY SubCategoryName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<SubCategoryEntity>>() {
      @Override
      public List<SubCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfSubCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryName");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfSubCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIcon");
          final int _cursorIndexOfSubCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<SubCategoryEntity> _result = new ArrayList<SubCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubCategoryEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final String _tmpSubCategoryName;
            if (_cursor.isNull(_cursorIndexOfSubCategoryName)) {
              _tmpSubCategoryName = null;
            } else {
              _tmpSubCategoryName = _cursor.getString(_cursorIndexOfSubCategoryName);
            }
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpSubCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIcon)) {
              _tmpSubCategoryIcon = null;
            } else {
              _tmpSubCategoryIcon = _cursor.getString(_cursorIndexOfSubCategoryIcon);
            }
            final String _tmpSubCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIconPath)) {
              _tmpSubCategoryIconPath = null;
            } else {
              _tmpSubCategoryIconPath = _cursor.getString(_cursorIndexOfSubCategoryIconPath);
            }
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            final boolean _tmpActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfActive);
            _tmpActive = _tmp != 0;
            _item = new SubCategoryEntity(_tmpTableId,_tmpSubCategoryId,_tmpSubCategoryName,_tmpCategoryId,_tmpSubCategoryIcon,_tmpSubCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<List<SubCategoryEntity>> getSubCategoryByCategoryId(final long categoryId) {
    final String _sql = "SELECT * FROM subcategory WHERE categoryId = ? AND active = true ORDER BY SubCategoryName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, categoryId);
    return RxRoom.createSingle(new Callable<List<SubCategoryEntity>>() {
      @Override
      public List<SubCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfSubCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryName");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfSubCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIcon");
          final int _cursorIndexOfSubCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<SubCategoryEntity> _result = new ArrayList<SubCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubCategoryEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final String _tmpSubCategoryName;
            if (_cursor.isNull(_cursorIndexOfSubCategoryName)) {
              _tmpSubCategoryName = null;
            } else {
              _tmpSubCategoryName = _cursor.getString(_cursorIndexOfSubCategoryName);
            }
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpSubCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIcon)) {
              _tmpSubCategoryIcon = null;
            } else {
              _tmpSubCategoryIcon = _cursor.getString(_cursorIndexOfSubCategoryIcon);
            }
            final String _tmpSubCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIconPath)) {
              _tmpSubCategoryIconPath = null;
            } else {
              _tmpSubCategoryIconPath = _cursor.getString(_cursorIndexOfSubCategoryIconPath);
            }
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            final boolean _tmpActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfActive);
            _tmpActive = _tmp != 0;
            _item = new SubCategoryEntity(_tmpTableId,_tmpSubCategoryId,_tmpSubCategoryName,_tmpCategoryId,_tmpSubCategoryIcon,_tmpSubCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<SubCategoryEntity> getSubCategoryBySubCategoryId(final long subCategoryId) {
    final String _sql = "SELECT * FROM subcategory WHERE SubCategoryId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, subCategoryId);
    return RxRoom.createSingle(new Callable<SubCategoryEntity>() {
      @Override
      public SubCategoryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfSubCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryName");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfSubCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIcon");
          final int _cursorIndexOfSubCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final SubCategoryEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final String _tmpSubCategoryName;
            if (_cursor.isNull(_cursorIndexOfSubCategoryName)) {
              _tmpSubCategoryName = null;
            } else {
              _tmpSubCategoryName = _cursor.getString(_cursorIndexOfSubCategoryName);
            }
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpSubCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIcon)) {
              _tmpSubCategoryIcon = null;
            } else {
              _tmpSubCategoryIcon = _cursor.getString(_cursorIndexOfSubCategoryIcon);
            }
            final String _tmpSubCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIconPath)) {
              _tmpSubCategoryIconPath = null;
            } else {
              _tmpSubCategoryIconPath = _cursor.getString(_cursorIndexOfSubCategoryIconPath);
            }
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            final boolean _tmpActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfActive);
            _tmpActive = _tmp != 0;
            _result = new SubCategoryEntity(_tmpTableId,_tmpSubCategoryId,_tmpSubCategoryName,_tmpCategoryId,_tmpSubCategoryIcon,_tmpSubCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
          } else {
            _result = null;
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
  public Single<List<SubCategoryEntity>> getSubCategoryBySearch(final String searchText) {
    final String _sql = "SELECT * FROM subcategory WHERE (SubCategoryName LIKE '%' || ? || '%') AND active = true ORDER BY SubCategoryName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    return RxRoom.createSingle(new Callable<List<SubCategoryEntity>>() {
      @Override
      public List<SubCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfSubCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryName");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfSubCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIcon");
          final int _cursorIndexOfSubCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "subCategoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<SubCategoryEntity> _result = new ArrayList<SubCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubCategoryEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final String _tmpSubCategoryName;
            if (_cursor.isNull(_cursorIndexOfSubCategoryName)) {
              _tmpSubCategoryName = null;
            } else {
              _tmpSubCategoryName = _cursor.getString(_cursorIndexOfSubCategoryName);
            }
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpSubCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIcon)) {
              _tmpSubCategoryIcon = null;
            } else {
              _tmpSubCategoryIcon = _cursor.getString(_cursorIndexOfSubCategoryIcon);
            }
            final String _tmpSubCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfSubCategoryIconPath)) {
              _tmpSubCategoryIconPath = null;
            } else {
              _tmpSubCategoryIconPath = _cursor.getString(_cursorIndexOfSubCategoryIconPath);
            }
            final String _tmpCreatedAt;
            if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
              _tmpCreatedAt = null;
            } else {
              _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
            }
            final String _tmpUpdatedAt;
            if (_cursor.isNull(_cursorIndexOfUpdatedAt)) {
              _tmpUpdatedAt = null;
            } else {
              _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
            }
            final boolean _tmpActive;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfActive);
            _tmpActive = _tmp != 0;
            _item = new SubCategoryEntity(_tmpTableId,_tmpSubCategoryId,_tmpSubCategoryName,_tmpCategoryId,_tmpSubCategoryIcon,_tmpSubCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
        _stringBuilder.append("DELETE FROM subcategory WHERE tableId in (");
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
