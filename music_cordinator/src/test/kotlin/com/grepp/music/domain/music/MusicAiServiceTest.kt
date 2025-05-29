package com.grepp.music.domain.music

import dev.langchain4j.model.chat.ChatModel
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel
import dev.langchain4j.service.AiServices
import kotlinx.coroutines.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import kotlin.test.Test

class MusicAiServiceTest{
    @Test
    fun testMusicAiService(){
        val model: ChatModel = GoogleAiGeminiChatModel.builder()
            .apiKey("AIzaSyCrqW4mTbGmiqfS2_8HqhTfNN2q2yOHabc")
            .modelName("gemini-2.0-flash-lite")
            .build()

        val musicAiService = AiServices.create(MusicAiService::class.java, model)
        val musics = musicAiService.recommend("오늘 코틀린을 다 배웠어! 너무 신나")
        println(musics)

        runBlocking{
            val savePath = "/Users/eonwy/Programmers/backend/g_kotlin/music/"

            val downloadUrls = musics.musicList.map{ m ->
                async(Dispatchers.Default) {
                    val driver = ChromeDriver()
                    val title = m.title
                    val artist = m.artist
                        driver["https://www.youtube.com/results?search_query=${title}+${artist}"]
                    val element = driver.findElement(By.cssSelector("a[href^=\"/watch?\"]"))
                    val downloadUrl = element.getDomAttribute("href")
                    driver.quit()
                    downloadUrl
                }
            }.awaitAll()

            musics.musicList.zip(downloadUrls).forEach {
                val music = it.first
                val relativeUrl = it.second
                val url = "https://www.youtube.com$relativeUrl"
                val title = music.title
                val artist = music.artist

                launch {
                    val pb = ProcessBuilder(
                        "/opt/homebrew/bin/yt-dlp",
                        "--extract-audio",
                        "--audio-format", "mp3",
                        "-o", "$savePath/${title}_${artist}.mp3",
                        url
                    )
                    pb.start()
                    delay(10000)
                }
            }
        }
    }
}