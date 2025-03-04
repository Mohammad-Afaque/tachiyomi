package tachiyomi.source.local.image

import eu.kanade.tachiyomi.source.model.SManga
import java.io.File
import java.io.InputStream

interface LocalCoverManager {

    fun find(mangaUrl: String): File?

    fun update(manga: SManga, inputStream: InputStream): File?
}
