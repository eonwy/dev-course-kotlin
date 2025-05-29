package com.grepp.music.domain.music

import com.fasterxml.jackson.annotation.JsonProperty

data class Music(
    @JsonProperty("title")
    val title:String,
    @JsonProperty("artist")
    val artist:String,
    @JsonProperty("reason")
    val reason:String
)

data class MusicList(
    @JsonProperty("musicList")
    val musicList: List<Music>
)