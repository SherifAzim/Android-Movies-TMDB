package com.dev.aman.movies_tmdb.utils

object ApiConstants {
    const val BASE_URL = "https://api.themoviedb.org/3/"
    const val BASE_URL_IMAGE = "http://image.tmdb.org/t/p/w185"

    // Trending API URL
    const val TRENDING_WEEKS_ALL = "trending/all/week"
    const val TRENDING_WEEKS_MOVIES = "trending/movie/week"
    const val TRENDING_WEEKS_TV = "trending/tv/week"
    const val TRENDING_WEEKS_PERSON = "trending/person/week"

    const val TRENDING_DAY_ALL = "trending/all/day"
    const val TRENDING_DAY_MOVIES = "trending/movie/day"
    const val TRENDING_DAY_TV = "trending/tv/day"
    const val TRENDING_DAY_PERSON = "trending/person/day"

    // Movies URL
    const val NOW_PLAYING = "movie/now_playing?language=en-US&region=IN"
    const val UPCOMING_MPVIES = "movie/upcoming?language=en-US&region=IN"

    // Popular People
    const val POPULAR_PEOPLE = "person/popular?language=en-US"
}