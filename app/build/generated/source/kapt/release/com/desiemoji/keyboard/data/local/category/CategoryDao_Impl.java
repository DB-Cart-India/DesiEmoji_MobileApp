package com.desiemoji.keyboard.data.local.category;

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
public final class CategoryDao_Impl implements CategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CategoryEntity> __insertionAdapterOfCategoryEntity;

  private final EntityDeletionOrUpdateAdapter<CategoryEntity> __deletionAdapterOfCategoryEntity;

  private final EntityDeletionOrUpdateAdapter<CategoryEntity> __updateAdapterOfCategoryEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeData;

  public CategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategoryEntity = new EntityInsertionAdapter<CategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `category` (`tableId`,`categoryId`,`categoryName`,`categoryIcon`,`categoryIconPath`,`createdAt`,`updatedAt`,`active`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CategoryEntity value) {
        stmt.bindLong(1, value.getTableId());
        stmt.bindLong(2, value.getCategoryId());
        if (value.getCategoryName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategoryName());
        }
        if (value.getCategoryIcon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategoryIcon());
        }
        if (value.getCategoryIconPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCategoryIconPath());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUpdatedAt());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfCategoryEntity = new EntityDeletionOrUpdateAdapter<CategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `category` WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CategoryEntity value) {
        stmt.bindLong(1, value.getTableId());
      }
    };
    this.__updateAdapterOfCategoryEntity = new EntityDeletionOrUpdateAdapter<CategoryEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `category` SET `tableId` = ?,`categoryId` = ?,`categoryName` = ?,`categoryIcon` = ?,`categoryIconPath` = ?,`createdAt` = ?,`updatedAt` = ?,`active` = ? WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CategoryEntity value) {
        stmt.bindLong(1, value.getTableId());
        stmt.bindLong(2, value.getCategoryId());
        if (value.getCategoryName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategoryName());
        }
        if (value.getCategoryIcon() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategoryIcon());
        }
        if (value.getCategoryIconPath() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCategoryIconPath());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUpdatedAt());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        stmt.bindLong(9, value.getTableId());
      }
    };
    this.__preparedStmtOfNukeData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM category";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final CategoryEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCategoryEntity.insert(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insert(final List<CategoryEntity> data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCategoryEntity.insert(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final CategoryEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCategoryEntity.handle(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final CategoryEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCategoryEntity.handle(data);
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
  public Single<List<CategoryEntity>> getAllCategory() {
    final String _sql = "SELECT * FROM category WHERE active = true";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<CategoryEntity>>() {
      @Override
      public List<CategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryName");
          final int _cursorIndexOfCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryIcon");
          final int _cursorIndexOfCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<CategoryEntity> _result = new ArrayList<CategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpCategoryName;
            if (_cursor.isNull(_cursorIndexOfCategoryName)) {
              _tmpCategoryName = null;
            } else {
              _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
            }
            final String _tmpCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfCategoryIcon)) {
              _tmpCategoryIcon = null;
            } else {
              _tmpCategoryIcon = _cursor.getString(_cursorIndexOfCategoryIcon);
            }
            final String _tmpCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfCategoryIconPath)) {
              _tmpCategoryIconPath = null;
            } else {
              _tmpCategoryIconPath = _cursor.getString(_cursorIndexOfCategoryIconPath);
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
            _item = new CategoryEntity(_tmpTableId,_tmpCategoryId,_tmpCategoryName,_tmpCategoryIcon,_tmpCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<CategoryEntity> getCategoryByCategoryId(final long categoryId) {
    final String _sql = "SELECT * FROM category WHERE categoryId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, categoryId);
    return RxRoom.createSingle(new Callable<CategoryEntity>() {
      @Override
      public CategoryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryName");
          final int _cursorIndexOfCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryIcon");
          final int _cursorIndexOfCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final CategoryEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpCategoryName;
            if (_cursor.isNull(_cursorIndexOfCategoryName)) {
              _tmpCategoryName = null;
            } else {
              _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
            }
            final String _tmpCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfCategoryIcon)) {
              _tmpCategoryIcon = null;
            } else {
              _tmpCategoryIcon = _cursor.getString(_cursorIndexOfCategoryIcon);
            }
            final String _tmpCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfCategoryIconPath)) {
              _tmpCategoryIconPath = null;
            } else {
              _tmpCategoryIconPath = _cursor.getString(_cursorIndexOfCategoryIconPath);
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
            _result = new CategoryEntity(_tmpTableId,_tmpCategoryId,_tmpCategoryName,_tmpCategoryIcon,_tmpCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<List<CategoryEntity>> getCategoryBySearch(final String searchText) {
    final String _sql = "SELECT * FROM category WHERE categoryName LIKE '%' || ? || '%' AND active = true";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    return RxRoom.createSingle(new Callable<List<CategoryEntity>>() {
      @Override
      public List<CategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryName");
          final int _cursorIndexOfCategoryIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryIcon");
          final int _cursorIndexOfCategoryIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryIconPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<CategoryEntity> _result = new ArrayList<CategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CategoryEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpCategoryName;
            if (_cursor.isNull(_cursorIndexOfCategoryName)) {
              _tmpCategoryName = null;
            } else {
              _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
            }
            final String _tmpCategoryIcon;
            if (_cursor.isNull(_cursorIndexOfCategoryIcon)) {
              _tmpCategoryIcon = null;
            } else {
              _tmpCategoryIcon = _cursor.getString(_cursorIndexOfCategoryIcon);
            }
            final String _tmpCategoryIconPath;
            if (_cursor.isNull(_cursorIndexOfCategoryIconPath)) {
              _tmpCategoryIconPath = null;
            } else {
              _tmpCategoryIconPath = _cursor.getString(_cursorIndexOfCategoryIconPath);
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
            _item = new CategoryEntity(_tmpTableId,_tmpCategoryId,_tmpCategoryName,_tmpCategoryIcon,_tmpCategoryIconPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
        _stringBuilder.append("DELETE FROM category WHERE tableId in (");
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
