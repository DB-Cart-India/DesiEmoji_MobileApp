package com.desiemoji.keyboard.util

import android.webkit.MimeTypeMap
import java.io.File

/** Class to provide utils that are shared across ewesticker. */
object Utils {

	var BASE_URL= "http://103.118.17.65:82/"

	/**
	 * Get the mimetype of a File
	 *
	 * @param file File file to get the mimetype of
	 * @return String? Return the mimetype or none if it cannot be determined
	 */
	fun getMimeType(file: File): String? {
		return MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.extension)
	}

	/**
	 * Return a MutableList of EweSticker Supported mimetypes
	 *
	 * @return MutableList of EweSticker Supported mimetypes
	 */
	fun getSupportedMimes(): MutableList<String> {
		return mutableListOf(
			"image/gif",
			"image/png",
			"image/webp",
			"image/webp.wasticker",
			"image/jpeg",
			"image/heif",
			"video/3gpp",
			"video/mp4",
			"video/x-matroska",
			"video/webm"
		)
	}
}
