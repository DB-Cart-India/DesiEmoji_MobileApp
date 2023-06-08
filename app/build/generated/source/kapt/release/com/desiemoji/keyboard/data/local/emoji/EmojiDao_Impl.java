package com.desiemoji.keyboard.data.local.emoji;

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
public final class EmojiDao_Impl implements EmojiDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EmojiEntity> __insertionAdapterOfEmojiEntity;

  private final EntityDeletionOrUpdateAdapter<EmojiEntity> __deletionAdapterOfEmojiEntity;

  private final EntityDeletionOrUpdateAdapter<EmojiEntity> __updateAdapterOfEmojiEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeData;

  public EmojiDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEmojiEntity = new EntityInsertionAdapter<EmojiEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `emoji` (`tableId`,`emojiId`,`emojiKeyword`,`SubCategoryId`,`categoryId`,`emojiIcon`,`emojiIconPath`,`emojiIconWebp`,`emojiIconWebpPath`,`createdAt`,`updatedAt`,`active`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EmojiEntity value) {
        stmt.bindLong(1, value.getTableId());
        stmt.bindLong(2, value.getEmojiId());
        if (value.getEmojiKeyword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmojiKeyword());
        }
        stmt.bindLong(4, value.getSubCategoryId());
        stmt.bindLong(5, value.getCategoryId());
        if (value.getEmojiIcon() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmojiIcon());
        }
        if (value.getEmojiIconPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEmojiIconPath());
        }
        if (value.getEmojiIconWebp() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmojiIconWebp());
        }
        if (value.getEmojiIconWebpPath() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getEmojiIconWebpPath());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUpdatedAt());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(12, _tmp);
      }
    };
    this.__deletionAdapterOfEmojiEntity = new EntityDeletionOrUpdateAdapter<EmojiEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `emoji` WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EmojiEntity value) {
        stmt.bindLong(1, value.getTableId());
      }
    };
    this.__updateAdapterOfEmojiEntity = new EntityDeletionOrUpdateAdapter<EmojiEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `emoji` SET `tableId` = ?,`emojiId` = ?,`emojiKeyword` = ?,`SubCategoryId` = ?,`categoryId` = ?,`emojiIcon` = ?,`emojiIconPath` = ?,`emojiIconWebp` = ?,`emojiIconWebpPath` = ?,`createdAt` = ?,`updatedAt` = ?,`active` = ? WHERE `tableId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EmojiEntity value) {
        stmt.bindLong(1, value.getTableId());
        stmt.bindLong(2, value.getEmojiId());
        if (value.getEmojiKeyword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmojiKeyword());
        }
        stmt.bindLong(4, value.getSubCategoryId());
        stmt.bindLong(5, value.getCategoryId());
        if (value.getEmojiIcon() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmojiIcon());
        }
        if (value.getEmojiIconPath() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getEmojiIconPath());
        }
        if (value.getEmojiIconWebp() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmojiIconWebp());
        }
        if (value.getEmojiIconWebpPath() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getEmojiIconWebpPath());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUpdatedAt());
        }
        final int _tmp = value.getActive() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        stmt.bindLong(13, value.getTableId());
      }
    };
    this.__preparedStmtOfNukeData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM emoji";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final EmojiEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEmojiEntity.insert(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insert(final List<EmojiEntity> data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEmojiEntity.insert(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final EmojiEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfEmojiEntity.handle(data);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable update(final EmojiEntity data) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfEmojiEntity.handle(data);
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
  public Single<List<EmojiEntity>> getAllEmoji() {
    final String _sql = "SELECT * FROM emoji WHERE active = true";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<EmojiEntity>>() {
      @Override
      public List<EmojiEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfEmojiId = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiId");
          final int _cursorIndexOfEmojiKeyword = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiKeyword");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfEmojiIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIcon");
          final int _cursorIndexOfEmojiIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconPath");
          final int _cursorIndexOfEmojiIconWebp = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebp");
          final int _cursorIndexOfEmojiIconWebpPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebpPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<EmojiEntity> _result = new ArrayList<EmojiEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EmojiEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpEmojiId;
            _tmpEmojiId = _cursor.getInt(_cursorIndexOfEmojiId);
            final String _tmpEmojiKeyword;
            if (_cursor.isNull(_cursorIndexOfEmojiKeyword)) {
              _tmpEmojiKeyword = null;
            } else {
              _tmpEmojiKeyword = _cursor.getString(_cursorIndexOfEmojiKeyword);
            }
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpEmojiIcon;
            if (_cursor.isNull(_cursorIndexOfEmojiIcon)) {
              _tmpEmojiIcon = null;
            } else {
              _tmpEmojiIcon = _cursor.getString(_cursorIndexOfEmojiIcon);
            }
            final String _tmpEmojiIconPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconPath)) {
              _tmpEmojiIconPath = null;
            } else {
              _tmpEmojiIconPath = _cursor.getString(_cursorIndexOfEmojiIconPath);
            }
            final String _tmpEmojiIconWebp;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebp)) {
              _tmpEmojiIconWebp = null;
            } else {
              _tmpEmojiIconWebp = _cursor.getString(_cursorIndexOfEmojiIconWebp);
            }
            final String _tmpEmojiIconWebpPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebpPath)) {
              _tmpEmojiIconWebpPath = null;
            } else {
              _tmpEmojiIconWebpPath = _cursor.getString(_cursorIndexOfEmojiIconWebpPath);
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
            _item = new EmojiEntity(_tmpTableId,_tmpEmojiId,_tmpEmojiKeyword,_tmpSubCategoryId,_tmpCategoryId,_tmpEmojiIcon,_tmpEmojiIconPath,_tmpEmojiIconWebp,_tmpEmojiIconWebpPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<List<EmojiEntity>> getEmojiBySubCategoryId(final long subCategoryId) {
    final String _sql = "SELECT * FROM emoji WHERE SubCategoryId = ? AND active = true";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, subCategoryId);
    return RxRoom.createSingle(new Callable<List<EmojiEntity>>() {
      @Override
      public List<EmojiEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfEmojiId = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiId");
          final int _cursorIndexOfEmojiKeyword = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiKeyword");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfEmojiIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIcon");
          final int _cursorIndexOfEmojiIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconPath");
          final int _cursorIndexOfEmojiIconWebp = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebp");
          final int _cursorIndexOfEmojiIconWebpPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebpPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<EmojiEntity> _result = new ArrayList<EmojiEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EmojiEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpEmojiId;
            _tmpEmojiId = _cursor.getInt(_cursorIndexOfEmojiId);
            final String _tmpEmojiKeyword;
            if (_cursor.isNull(_cursorIndexOfEmojiKeyword)) {
              _tmpEmojiKeyword = null;
            } else {
              _tmpEmojiKeyword = _cursor.getString(_cursorIndexOfEmojiKeyword);
            }
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpEmojiIcon;
            if (_cursor.isNull(_cursorIndexOfEmojiIcon)) {
              _tmpEmojiIcon = null;
            } else {
              _tmpEmojiIcon = _cursor.getString(_cursorIndexOfEmojiIcon);
            }
            final String _tmpEmojiIconPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconPath)) {
              _tmpEmojiIconPath = null;
            } else {
              _tmpEmojiIconPath = _cursor.getString(_cursorIndexOfEmojiIconPath);
            }
            final String _tmpEmojiIconWebp;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebp)) {
              _tmpEmojiIconWebp = null;
            } else {
              _tmpEmojiIconWebp = _cursor.getString(_cursorIndexOfEmojiIconWebp);
            }
            final String _tmpEmojiIconWebpPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebpPath)) {
              _tmpEmojiIconWebpPath = null;
            } else {
              _tmpEmojiIconWebpPath = _cursor.getString(_cursorIndexOfEmojiIconWebpPath);
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
            _item = new EmojiEntity(_tmpTableId,_tmpEmojiId,_tmpEmojiKeyword,_tmpSubCategoryId,_tmpCategoryId,_tmpEmojiIcon,_tmpEmojiIconPath,_tmpEmojiIconWebp,_tmpEmojiIconWebpPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<List<EmojiEntity>> getEmojiByCategoryId(final long categoryId) {
    final String _sql = "SELECT * FROM emoji WHERE categoryId = ? AND active = true ORDER BY SubCategoryId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, categoryId);
    return RxRoom.createSingle(new Callable<List<EmojiEntity>>() {
      @Override
      public List<EmojiEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfEmojiId = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiId");
          final int _cursorIndexOfEmojiKeyword = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiKeyword");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfEmojiIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIcon");
          final int _cursorIndexOfEmojiIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconPath");
          final int _cursorIndexOfEmojiIconWebp = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebp");
          final int _cursorIndexOfEmojiIconWebpPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebpPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<EmojiEntity> _result = new ArrayList<EmojiEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EmojiEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpEmojiId;
            _tmpEmojiId = _cursor.getInt(_cursorIndexOfEmojiId);
            final String _tmpEmojiKeyword;
            if (_cursor.isNull(_cursorIndexOfEmojiKeyword)) {
              _tmpEmojiKeyword = null;
            } else {
              _tmpEmojiKeyword = _cursor.getString(_cursorIndexOfEmojiKeyword);
            }
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpEmojiIcon;
            if (_cursor.isNull(_cursorIndexOfEmojiIcon)) {
              _tmpEmojiIcon = null;
            } else {
              _tmpEmojiIcon = _cursor.getString(_cursorIndexOfEmojiIcon);
            }
            final String _tmpEmojiIconPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconPath)) {
              _tmpEmojiIconPath = null;
            } else {
              _tmpEmojiIconPath = _cursor.getString(_cursorIndexOfEmojiIconPath);
            }
            final String _tmpEmojiIconWebp;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebp)) {
              _tmpEmojiIconWebp = null;
            } else {
              _tmpEmojiIconWebp = _cursor.getString(_cursorIndexOfEmojiIconWebp);
            }
            final String _tmpEmojiIconWebpPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebpPath)) {
              _tmpEmojiIconWebpPath = null;
            } else {
              _tmpEmojiIconWebpPath = _cursor.getString(_cursorIndexOfEmojiIconWebpPath);
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
            _item = new EmojiEntity(_tmpTableId,_tmpEmojiId,_tmpEmojiKeyword,_tmpSubCategoryId,_tmpCategoryId,_tmpEmojiIcon,_tmpEmojiIconPath,_tmpEmojiIconWebp,_tmpEmojiIconWebpPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<EmojiEntity> getEmojiByEmojiId(final long emojiId) {
    final String _sql = "SELECT * FROM emoji WHERE emojiId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, emojiId);
    return RxRoom.createSingle(new Callable<EmojiEntity>() {
      @Override
      public EmojiEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfEmojiId = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiId");
          final int _cursorIndexOfEmojiKeyword = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiKeyword");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfEmojiIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIcon");
          final int _cursorIndexOfEmojiIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconPath");
          final int _cursorIndexOfEmojiIconWebp = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebp");
          final int _cursorIndexOfEmojiIconWebpPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebpPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final EmojiEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpEmojiId;
            _tmpEmojiId = _cursor.getInt(_cursorIndexOfEmojiId);
            final String _tmpEmojiKeyword;
            if (_cursor.isNull(_cursorIndexOfEmojiKeyword)) {
              _tmpEmojiKeyword = null;
            } else {
              _tmpEmojiKeyword = _cursor.getString(_cursorIndexOfEmojiKeyword);
            }
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpEmojiIcon;
            if (_cursor.isNull(_cursorIndexOfEmojiIcon)) {
              _tmpEmojiIcon = null;
            } else {
              _tmpEmojiIcon = _cursor.getString(_cursorIndexOfEmojiIcon);
            }
            final String _tmpEmojiIconPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconPath)) {
              _tmpEmojiIconPath = null;
            } else {
              _tmpEmojiIconPath = _cursor.getString(_cursorIndexOfEmojiIconPath);
            }
            final String _tmpEmojiIconWebp;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebp)) {
              _tmpEmojiIconWebp = null;
            } else {
              _tmpEmojiIconWebp = _cursor.getString(_cursorIndexOfEmojiIconWebp);
            }
            final String _tmpEmojiIconWebpPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebpPath)) {
              _tmpEmojiIconWebpPath = null;
            } else {
              _tmpEmojiIconWebpPath = _cursor.getString(_cursorIndexOfEmojiIconWebpPath);
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
            _result = new EmojiEntity(_tmpTableId,_tmpEmojiId,_tmpEmojiKeyword,_tmpSubCategoryId,_tmpCategoryId,_tmpEmojiIcon,_tmpEmojiIconPath,_tmpEmojiIconWebp,_tmpEmojiIconWebpPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
  public Single<List<EmojiEntity>> getEmojiBySearch(final String searchText) {
    final String _sql = "SELECT * FROM emoji WHERE (emojiKeyword LIKE '%' || ? || '%') AND active = true";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    return RxRoom.createSingle(new Callable<List<EmojiEntity>>() {
      @Override
      public List<EmojiEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTableId = CursorUtil.getColumnIndexOrThrow(_cursor, "tableId");
          final int _cursorIndexOfEmojiId = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiId");
          final int _cursorIndexOfEmojiKeyword = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiKeyword");
          final int _cursorIndexOfSubCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "SubCategoryId");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryId");
          final int _cursorIndexOfEmojiIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIcon");
          final int _cursorIndexOfEmojiIconPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconPath");
          final int _cursorIndexOfEmojiIconWebp = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebp");
          final int _cursorIndexOfEmojiIconWebpPath = CursorUtil.getColumnIndexOrThrow(_cursor, "emojiIconWebpPath");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final List<EmojiEntity> _result = new ArrayList<EmojiEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EmojiEntity _item;
            final int _tmpTableId;
            _tmpTableId = _cursor.getInt(_cursorIndexOfTableId);
            final int _tmpEmojiId;
            _tmpEmojiId = _cursor.getInt(_cursorIndexOfEmojiId);
            final String _tmpEmojiKeyword;
            if (_cursor.isNull(_cursorIndexOfEmojiKeyword)) {
              _tmpEmojiKeyword = null;
            } else {
              _tmpEmojiKeyword = _cursor.getString(_cursorIndexOfEmojiKeyword);
            }
            final int _tmpSubCategoryId;
            _tmpSubCategoryId = _cursor.getInt(_cursorIndexOfSubCategoryId);
            final int _tmpCategoryId;
            _tmpCategoryId = _cursor.getInt(_cursorIndexOfCategoryId);
            final String _tmpEmojiIcon;
            if (_cursor.isNull(_cursorIndexOfEmojiIcon)) {
              _tmpEmojiIcon = null;
            } else {
              _tmpEmojiIcon = _cursor.getString(_cursorIndexOfEmojiIcon);
            }
            final String _tmpEmojiIconPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconPath)) {
              _tmpEmojiIconPath = null;
            } else {
              _tmpEmojiIconPath = _cursor.getString(_cursorIndexOfEmojiIconPath);
            }
            final String _tmpEmojiIconWebp;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebp)) {
              _tmpEmojiIconWebp = null;
            } else {
              _tmpEmojiIconWebp = _cursor.getString(_cursorIndexOfEmojiIconWebp);
            }
            final String _tmpEmojiIconWebpPath;
            if (_cursor.isNull(_cursorIndexOfEmojiIconWebpPath)) {
              _tmpEmojiIconWebpPath = null;
            } else {
              _tmpEmojiIconWebpPath = _cursor.getString(_cursorIndexOfEmojiIconWebpPath);
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
            _item = new EmojiEntity(_tmpTableId,_tmpEmojiId,_tmpEmojiKeyword,_tmpSubCategoryId,_tmpCategoryId,_tmpEmojiIcon,_tmpEmojiIconPath,_tmpEmojiIconWebp,_tmpEmojiIconWebpPath,_tmpCreatedAt,_tmpUpdatedAt,_tmpActive);
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
        _stringBuilder.append("DELETE FROM emoji WHERE tableId in (");
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
