package com.desiemoji.keyboard.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.desiemoji.keyboard.data.local.sample.SampleDao
import com.desiemoji.keyboard.data.local.sample.SampleEntity
import com.desiemoji.keyboard.data.local.autotext.AutoTextDao
import com.desiemoji.keyboard.data.local.autotext.AutoTextEntity
import com.desiemoji.keyboard.data.local.category.CategoryDao
import com.desiemoji.keyboard.data.local.category.CategoryEntity
import com.desiemoji.keyboard.data.local.db.AppDatabase.Companion.DATABASE_NAME
import com.desiemoji.keyboard.data.local.emoji.EmojiDao
import com.desiemoji.keyboard.data.local.emoji.EmojiEntity
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiDao
import com.desiemoji.keyboard.data.local.recentemoji.RecentEmojiEntity
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryDao
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity


@Database(
    entities = [
        CategoryEntity::class,
        SubCategoryEntity::class,
        EmojiEntity::class,
        RecentEmojiEntity::class,
        SampleEntity::class,
        AutoTextEntity::class
    ], version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao
    abstract fun subCategoryDao(): SubCategoryDao
    abstract fun emojiDao(): EmojiDao
    abstract fun recentEmojiDao(): RecentEmojiDao
    abstract fun sampleDao(): SampleDao
    abstract fun autoTextDao(): AutoTextDao

    companion object {

        private const val DATABASE_NAME = "desiemoji.db"

        fun newInstance(context: Context): AppDatabase {
            return buildDatabase(context)
        }

        private fun buildDatabase(context: Context): AppDatabase {
//            return if (BuildConfig.DEBUG) {
//                Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, DATABASE_NAME)
//                    .fallbackToDestructiveMigration() // FOR DEVELOPMENT ONLY !!!!
//                    .build()
//            } else {
//                Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, DATABASE_NAME)
//                    .build()
//            }

            return  Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, DATABASE_NAME)
                .build()
        }

    }
}