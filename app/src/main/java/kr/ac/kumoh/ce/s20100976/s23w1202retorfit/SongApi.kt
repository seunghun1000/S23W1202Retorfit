package kr.ac.kumoh.ce.s20100976.s23w1202retorfit

import retrofit2.http.GET

interface SongApi {
    @GET("song")
    suspend fun getSongs(): List<Song>
}