package com.desiemoji.keyboard.data.local.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.desiemoji.keyboard.data.local.autotext.AutoTextDao;
import com.desiemoji.keyboard.data.local.autotext.AutoTextDao_Impl;
import com.desiemoji.keyboard.data.local.category.CategoryDao;
import com.desiemoji.keyboard.data.local.category.CategoryDao_Impl;
import com.desiemoji.keyboard.data.local.emoji.EmojiDao;
import com.desiemoji.keyboard.data.local.emoji.EmojiDao_Impl;
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao;
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao_Impl;
import com.desiemoji.keyboard.data.local.sample.SampleDao;
import com.desiemoji.keyboard.data.local.sample.SampleDao_Impl;
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryDao;
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CategoryDao _categoryDao;

  private volatile SubCategoryDao _subCategoryDao;

  private volatile EmojiDao _emojiDao;

  private volatile RecentEmojiDao _recentEmojiDao;

  private volatile SampleDao _sampleDao;

  private volatile AutoTextDao _autoTextDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `category` (`tableId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryId` INTEGER NOT NULL, `categoryName` TEXT NOT NULL, `categoryIcon` TEXT NOT NULL, `categoryIconPath` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `active` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `subcategory` (`tableId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `SubCategoryId` INTEGER NOT NULL, `SubCategoryName` TEXT NOT NULL, `categoryId` INTEGER NOT NULL, `subCategoryIcon` TEXT NOT NULL, `subCategoryIconPath` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `active` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `emoji` (`tableId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `emojiId` INTEGER NOT NULL, `emojiKeyword` TEXT NOT NULL, `SubCategoryId` INTEGER NOT NULL, `categoryId` INTEGER NOT NULL, `emojiIcon` TEXT NOT NULL, `emojiIconPath` TEXT NOT NULL, `emojiIconWebp` TEXT NOT NULL, `emojiIconWebpPath` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `active` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recentemoji` (`tableId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `emojiCode` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sample` (`table_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `data` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `auto_text` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `label` TEXT NOT NULL, `date` TEXT NOT NULL, `updatedDate` TEXT NOT NULL, `updatedTime` TEXT NOT NULL, `body` TEXT NOT NULL, `isActive` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '647052ee753c1e5aea5517fb509b58cc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `category`");
        _db.execSQL("DROP TABLE IF EXISTS `subcategory`");
        _db.execSQL("DROP TABLE IF EXISTS `emoji`");
        _db.execSQL("DROP TABLE IF EXISTS `recentemoji`");
        _db.execSQL("DROP TABLE IF EXISTS `sample`");
        _db.execSQL("DROP TABLE IF EXISTS `auto_text`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCategory = new HashMap<String, TableInfo.Column>(8);
        _columnsCategory.put("tableId", new TableInfo.Column("tableId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("categoryName", new TableInfo.Column("categoryName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("categoryIcon", new TableInfo.Column("categoryIcon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("categoryIconPath", new TableInfo.Column("categoryIconPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("active", new TableInfo.Column("active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategory = new TableInfo("category", _columnsCategory, _foreignKeysCategory, _indicesCategory);
        final TableInfo _existingCategory = TableInfo.read(_db, "category");
        if (! _infoCategory.equals(_existingCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "category(com.desiemoji.keyboard.data.local.category.CategoryEntity).\n"
                  + " Expected:\n" + _infoCategory + "\n"
                  + " Found:\n" + _existingCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsSubcategory = new HashMap<String, TableInfo.Column>(9);
        _columnsSubcategory.put("tableId", new TableInfo.Column("tableId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("SubCategoryId", new TableInfo.Column("SubCategoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("SubCategoryName", new TableInfo.Column("SubCategoryName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("subCategoryIcon", new TableInfo.Column("subCategoryIcon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("subCategoryIconPath", new TableInfo.Column("subCategoryIconPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubcategory.put("active", new TableInfo.Column("active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubcategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubcategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubcategory = new TableInfo("subcategory", _columnsSubcategory, _foreignKeysSubcategory, _indicesSubcategory);
        final TableInfo _existingSubcategory = TableInfo.read(_db, "subcategory");
        if (! _infoSubcategory.equals(_existingSubcategory)) {
          return new RoomOpenHelper.ValidationResult(false, "subcategory(com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity).\n"
                  + " Expected:\n" + _infoSubcategory + "\n"
                  + " Found:\n" + _existingSubcategory);
        }
        final HashMap<String, TableInfo.Column> _columnsEmoji = new HashMap<String, TableInfo.Column>(12);
        _columnsEmoji.put("tableId", new TableInfo.Column("tableId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("emojiId", new TableInfo.Column("emojiId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("emojiKeyword", new TableInfo.Column("emojiKeyword", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("SubCategoryId", new TableInfo.Column("SubCategoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("categoryId", new TableInfo.Column("categoryId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("emojiIcon", new TableInfo.Column("emojiIcon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("emojiIconPath", new TableInfo.Column("emojiIconPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("emojiIconWebp", new TableInfo.Column("emojiIconWebp", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("emojiIconWebpPath", new TableInfo.Column("emojiIconWebpPath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("createdAt", new TableInfo.Column("createdAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("updatedAt", new TableInfo.Column("updatedAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEmoji.put("active", new TableInfo.Column("active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEmoji = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEmoji = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEmoji = new TableInfo("emoji", _columnsEmoji, _foreignKeysEmoji, _indicesEmoji);
        final TableInfo _existingEmoji = TableInfo.read(_db, "emoji");
        if (! _infoEmoji.equals(_existingEmoji)) {
          return new RoomOpenHelper.ValidationResult(false, "emoji(com.desiemoji.keyboard.data.local.emoji.EmojiEntity).\n"
                  + " Expected:\n" + _infoEmoji + "\n"
                  + " Found:\n" + _existingEmoji);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentemoji = new HashMap<String, TableInfo.Column>(2);
        _columnsRecentemoji.put("tableId", new TableInfo.Column("tableId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentemoji.put("emojiCode", new TableInfo.Column("emojiCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentemoji = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentemoji = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecentemoji = new TableInfo("recentemoji", _columnsRecentemoji, _foreignKeysRecentemoji, _indicesRecentemoji);
        final TableInfo _existingRecentemoji = TableInfo.read(_db, "recentemoji");
        if (! _infoRecentemoji.equals(_existingRecentemoji)) {
          return new RoomOpenHelper.ValidationResult(false, "recentemoji(com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity).\n"
                  + " Expected:\n" + _infoRecentemoji + "\n"
                  + " Found:\n" + _existingRecentemoji);
        }
        final HashMap<String, TableInfo.Column> _columnsSample = new HashMap<String, TableInfo.Column>(3);
        _columnsSample.put("table_id", new TableInfo.Column("table_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSample.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSample.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSample = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSample = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSample = new TableInfo("sample", _columnsSample, _foreignKeysSample, _indicesSample);
        final TableInfo _existingSample = TableInfo.read(_db, "sample");
        if (! _infoSample.equals(_existingSample)) {
          return new RoomOpenHelper.ValidationResult(false, "sample(com.desiemoji.keyboard.data.local.sample.SampleEntity).\n"
                  + " Expected:\n" + _infoSample + "\n"
                  + " Found:\n" + _existingSample);
        }
        final HashMap<String, TableInfo.Column> _columnsAutoText = new HashMap<String, TableInfo.Column>(8);
        _columnsAutoText.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("label", new TableInfo.Column("label", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("updatedDate", new TableInfo.Column("updatedDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("updatedTime", new TableInfo.Column("updatedTime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("body", new TableInfo.Column("body", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAutoText.put("isActive", new TableInfo.Column("isActive", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAutoText = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAutoText = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAutoText = new TableInfo("auto_text", _columnsAutoText, _foreignKeysAutoText, _indicesAutoText);
        final TableInfo _existingAutoText = TableInfo.read(_db, "auto_text");
        if (! _infoAutoText.equals(_existingAutoText)) {
          return new RoomOpenHelper.ValidationResult(false, "auto_text(com.desiemoji.keyboard.data.local.autotext.AutoTextEntity).\n"
                  + " Expected:\n" + _infoAutoText + "\n"
                  + " Found:\n" + _existingAutoText);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "647052ee753c1e5aea5517fb509b58cc", "71de41159d189d7ccf4c68bc63ad7706");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "category","subcategory","emoji","recentemoji","sample","auto_text");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `category`");
      _db.execSQL("DELETE FROM `subcategory`");
      _db.execSQL("DELETE FROM `emoji`");
      _db.execSQL("DELETE FROM `recentemoji`");
      _db.execSQL("DELETE FROM `sample`");
      _db.execSQL("DELETE FROM `auto_text`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CategoryDao.class, CategoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SubCategoryDao.class, SubCategoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(EmojiDao.class, EmojiDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RecentEmojiDao.class, RecentEmojiDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SampleDao.class, SampleDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AutoTextDao.class, AutoTextDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CategoryDao categoryDao() {
    if (_categoryDao != null) {
      return _categoryDao;
    } else {
      synchronized(this) {
        if(_categoryDao == null) {
          _categoryDao = new CategoryDao_Impl(this);
        }
        return _categoryDao;
      }
    }
  }

  @Override
  public SubCategoryDao subCategoryDao() {
    if (_subCategoryDao != null) {
      return _subCategoryDao;
    } else {
      synchronized(this) {
        if(_subCategoryDao == null) {
          _subCategoryDao = new SubCategoryDao_Impl(this);
        }
        return _subCategoryDao;
      }
    }
  }

  @Override
  public EmojiDao emojiDao() {
    if (_emojiDao != null) {
      return _emojiDao;
    } else {
      synchronized(this) {
        if(_emojiDao == null) {
          _emojiDao = new EmojiDao_Impl(this);
        }
        return _emojiDao;
      }
    }
  }

  @Override
  public RecentEmojiDao recentEmojiDao() {
    if (_recentEmojiDao != null) {
      return _recentEmojiDao;
    } else {
      synchronized(this) {
        if(_recentEmojiDao == null) {
          _recentEmojiDao = new RecentEmojiDao_Impl(this);
        }
        return _recentEmojiDao;
      }
    }
  }

  @Override
  public SampleDao sampleDao() {
    if (_sampleDao != null) {
      return _sampleDao;
    } else {
      synchronized(this) {
        if(_sampleDao == null) {
          _sampleDao = new SampleDao_Impl(this);
        }
        return _sampleDao;
      }
    }
  }

  @Override
  public AutoTextDao autoTextDao() {
    if (_autoTextDao != null) {
      return _autoTextDao;
    } else {
      synchronized(this) {
        if(_autoTextDao == null) {
          _autoTextDao = new AutoTextDao_Impl(this);
        }
        return _autoTextDao;
      }
    }
  }
}
