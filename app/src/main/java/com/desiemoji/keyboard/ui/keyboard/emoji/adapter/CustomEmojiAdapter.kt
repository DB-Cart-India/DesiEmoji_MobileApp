package com.desiemoji.keyboard.ui.keyboard.emoji.adapter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.desiemoji.keyboard.R
import com.desiemoji.keyboard.data.local.emoji.EmojiEntity
import com.desiemoji.keyboard.ui.keyboard.StickerSender
import java.io.File

class CustomEmojiAdapter (
    var stickerSender: StickerSender,
    val context: Context,
    var items: List<EmojiEntity>,
    val itemClick: (emoji: String) -> Unit,

) : RecyclerView.Adapter<CustomEmojiAdapter.ViewHolder>() {
    private val layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutId = R.layout.item_keyboard_custom_emoji
        val view = layoutInflater.inflate(layoutId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bindView(item) { itemView ->
            setupEmoji(itemView, item)
        }
    }

    override fun getItemCount() = items.size

    private fun setupEmoji(view: View, emoji: EmojiEntity) {
       val tvLabel= view.findViewById<TextView>(R.id.tv_emoji)
        val ivEmoji= view.findViewById<ImageView>(R.id.iv_emoji)

        if(emoji.tableId==0){
            tvLabel.visibility=View.VISIBLE
            ivEmoji.visibility=View.GONE
            tvLabel.text=emoji.emojiKeyword
        }else{
            tvLabel.visibility=View.GONE
            ivEmoji.visibility=View.VISIBLE
            if(emoji.emojiIconPath!=null&&emoji.emojiIconPath.isNotEmpty()){
                val imgFile = File(emoji.emojiIconPath)
                if (imgFile.exists()) {
                    val myBitmap: Bitmap = BitmapFactory.decodeFile(imgFile.absolutePath)
                    ivEmoji.setImageBitmap(myBitmap)
                }
            }
        }

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(emoji: EmojiEntity, callback: (itemView: View) -> Unit): View {
            return itemView.apply {
                callback(this)
                setOnClickListener {
                    itemClick.invoke("")
//                    val file =File(context.filesDir.absolutePath+"/stickers", "test.png")
//                    stickerSender.sendSticker(file)

//                    val file =File(context.filesDir.absolutePath+"/stickers","custom.webp.wasticker")
//                    Log.i("StickerClick","StickerClick 1 :"+file.absolutePath)
//                    val file =File(emoji.emojiIconPath)
//                    Log.i("StickerClick","StickerClick 2 :"+file.absolutePath)
                    val fileWebP =File(emoji.emojiIconWebpPath)
                    Log.i("StickerClick","StickerClick WebP:"+fileWebP.absolutePath)
                    val filePng =File(emoji.emojiIconPath)
                    Log.i("StickerClick","StickerClick PNG:"+fileWebP.absolutePath)
                    stickerSender.sendSticker(filePng,fileWebP)
                }
            }
        }
    }
}
