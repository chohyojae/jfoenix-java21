plugins {
    java
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

group = "io.github.chohyojae"
version = "21.0.1"
description = "jfoenix"

java {
    withSourcesJar()
    withJavadocJar()
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

javafx {
    version = "21"
    modules("javafx.controls", "javafx.graphics")
}

val exportsList = listOf(
        "--add-exports=javafx.base/com.sun.javafx.binding=com.jfoenix",
        "--add-exports=javafx.base/com.sun.javafx.event=com.jfoenix",
        "--add-exports=javafx.graphics/com.sun.javafx.geom=com.jfoenix",
        "--add-exports=javafx.graphics/com.sun.javafx.util=com.jfoenix",
        "--add-exports=javafx.graphics/com.sun.javafx.stage=com.jfoenix",
        "--add-exports=javafx.graphics/com.sun.javafx.scene.text=com.jfoenix",
        "--add-exports=javafx.graphics/com.sun.javafx.scene.traversal=com.jfoenix",
        "--add-exports=javafx.controls/com.sun.javafx.scene.control=com.jfoenix",
        "--add-exports=javafx.controls/com.sun.javafx.scene.control.inputmap=com.jfoenix",
        "--add-exports=javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix",
)

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
    options.compilerArgs = exportsList
}