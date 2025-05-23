package org.kkvc.concertation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform