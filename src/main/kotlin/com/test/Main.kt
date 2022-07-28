package com.test

import org.apache.tika.Tika
import java.nio.file.Path

fun main() {
    val path = "files/"
    val resource = {}::class.java.classLoader.getResource(path)

    val tika = Tika()
    val folder = Path.of(resource!!.toURI()).toFile()
    for (file in folder.listFiles()!!) {
        println("${file.name}: ${tika.detect(file.inputStream())}")
    }
}