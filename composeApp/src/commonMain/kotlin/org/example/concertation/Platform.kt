package org.example.concertation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform