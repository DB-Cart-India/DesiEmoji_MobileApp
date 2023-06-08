package com.desiemoji.keyboard.data.local.db;

import java.lang.System;

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */
@androidx.room.Database(entities = {com.desiemoji.keyboard.data.local.category.CategoryEntity.class, com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity.class, com.desiemoji.keyboard.data.local.emoji.EmojiEntity.class, com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity.class, com.desiemoji.keyboard.data.local.sample.SampleEntity.class, com.desiemoji.keyboard.data.local.autotext.AutoTextEntity.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/desiemoji/keyboard/data/local/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "autoTextDao", "Lcom/desiemoji/keyboard/data/local/autotext/AutoTextDao;", "categoryDao", "Lcom/desiemoji/keyboard/data/local/category/CategoryDao;", "emojiDao", "Lcom/desiemoji/keyboard/data/local/emoji/EmojiDao;", "recentEmojiDao", "Lcom/desiemoji/keyboard/data/local/recentemoji/RecentEmojiDao;", "sampleDao", "Lcom/desiemoji/keyboard/data/local/sample/SampleDao;", "subCategoryDao", "Lcom/desiemoji/keyboard/data/local/subcategory/SubCategoryDao;", "Companion", "desiemoji_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.desiemoji.keyboard.data.local.db.AppDatabase.Companion Companion = null;
    private static final java.lang.String DATABASE_NAME = "desiemoji.db";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.desiemoji.keyboard.data.local.category.CategoryDao categoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.desiemoji.keyboard.data.local.subcategory.SubCategoryDao subCategoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.desiemoji.keyboard.data.local.emoji.EmojiDao emojiDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao recentEmojiDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.desiemoji.keyboard.data.local.sample.SampleDao sampleDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.desiemoji.keyboard.data.local.autotext.AutoTextDao autoTextDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/desiemoji/keyboard/data/local/db/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "buildDatabase", "Lcom/desiemoji/keyboard/data/local/db/AppDatabase;", "context", "Landroid/content/Context;", "newInstance", "desiemoji_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.desiemoji.keyboard.data.local.db.AppDatabase newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.desiemoji.keyboard.data.local.db.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}