package com.github.sergio.igwt.kfaker

internal object ResourceLoader {
    private val classLoader = this::class.java.classLoader

    fun getResource(relativePath: String) = classLoader.getResource(relativePath)

    fun getResourceAsStream(relativePath: String) = classLoader.getResourceAsStream(relativePath)
}