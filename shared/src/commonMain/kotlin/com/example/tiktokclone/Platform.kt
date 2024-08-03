package com.example.tiktokclone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform