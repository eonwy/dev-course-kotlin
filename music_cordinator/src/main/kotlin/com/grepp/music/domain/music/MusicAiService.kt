package com.grepp.music.domain.music

import dev.langchain4j.service.SystemMessage
import dev.langchain4j.service.UserMessage

interface MusicAiService {
    @SystemMessage("당신은 상대방 기분에 어울리는 노래를 추천해주는 전문가 입니다. " +
            "사용자 기분에 어울리는 노래를 2곡 추천해주세요.")
    @UserMessage("{{it}} 이 기분에 어울리는 노래 2곡 추천해줘.")
    fun recommend(message:String):MusicList
}