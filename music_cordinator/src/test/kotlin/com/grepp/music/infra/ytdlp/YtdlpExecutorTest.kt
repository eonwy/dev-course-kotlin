package com.grepp.music.infra.ytdlp

import org.junit.jupiter.api.Assertions.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.test.Test

class YtdlpExecutorTest {
    @Test
    fun testProcessBuilder() = runBlocking{
        val savePath = "/Users/eonwy/Programmers/backend/g_kotlin/music/"
        val url = "https://www.youtube.com/watch?v=5UE2kT5LxE0&ab_channel=ArianaGrandeVevo"

        listOf(0,1).forEach {
            launch {
                val pb = ProcessBuilder()
                pb.command(
                    "/opt/homebrew/bin/yt-dlp",
                    "--extract-audio",
                    "--audio-format", "mp3",
                    "-o", "$savePath/twilight_zone$it.mp3",
                    url
                )
                val process = pb.start()
                delay(10000)
            }
        }
    }
}