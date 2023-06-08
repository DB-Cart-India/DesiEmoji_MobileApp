package com.desiemoji.keyboard.ui.keyboard.emoji.adapter

private var cachedEmojiData: MutableList<String>? = null

/**
 * Reads the emoji list at the given [path] and returns an parsed [MutableList]. If the
 * given file path does not exist, an empty [MutableList] is returned.
 *
 * @param context The initiating view's context.
 * @param path The path to the asset file.
 */
//fun parseRawEmojiSpecsFile(context: Context, path: String): MutableList<String> {
//    if (cachedEmojiData != null) {
//        return cachedEmojiData!!
//    }
//
//    val emojis = mutableListOf<String>()
//    var emojiEditorList: MutableList<String>? = null
//    var currentEmojiCategory=""
//
//    fun commitEmojiEditorList() {
//        Log.i("parseRawEmojiSpecsFile","commitEmojiEditorList....")
//        emojiEditorList?.let {
//            // add only the base emoji for now, ignore the variations
//            emojis.add(it.first())
//        }
//        emojiEditorList = null
//    }
//
//    context.assets.open(path).bufferedReader().useLines { lines ->
//        for (line in lines) {
//            Log.i("parseRawEmojiSpecsFile","for (line in lines) ....")
//            if (line.startsWith("#")) {
//                // Comment line
//                Log.i("parseRawEmojiSpecsFile","line.startsWith(\"#\") ....")
//            } else if (line.startsWith("[")) {
//                Log.i("parseRawEmojiSpecsFile","line.startsWith(\"[\") ....")
//                commitEmojiEditorList()
//            } else if (line.trim().isEmpty()) {
//                // Empty line
//                Log.i("parseRawEmojiSpecsFile","line.trim().isEmpty() ....")
//                continue
//            } else {
//                if (!line.startsWith("\t")) {
//                    Log.i("parseRawEmojiSpecsFile","else !line.startsWith(\"\\t\") ....")
//                    commitEmojiEditorList()
//                }
//
//                // Assume it is a data line
//                val data = line.split(";")
//                if (data.size == 3) {
//                    val emoji = data[0].trim()
//                    if (emojiEditorList != null) {
//                        Log.i("parseRawEmojiSpecsFile","else emojiEditorList != null ....")
//                        emojiEditorList!!.add(emoji)
//                    } else {
//                        Log.i("parseRawEmojiSpecsFile","else else ....")
//                        emojiEditorList = mutableListOf(emoji)
//                    }
//                }
//            }
//        }
//        Log.i("parseRawEmojiSpecsFile","for completed ....")
//        commitEmojiEditorList()
//    }
//
//    cachedEmojiData = emojis
//    return emojis
//}
