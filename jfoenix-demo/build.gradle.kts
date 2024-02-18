plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

java {
    withSourcesJar()
    withJavadocJar()
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    implementation(project(":jfoenix"))
    implementation("io.datafx:datafx:8.0.1")
    implementation("io.datafx:flow:8.0.1")

    implementation("org.kordamp.ikonli:ikonli-javafx:2.4.0")
    implementation("org.kordamp.ikonli:ikonli-fontawesome5-pack:2.4.0")
}


javafx {
    version = "21"
    modules("javafx.controls", "javafx.graphics", "javafx.fxml")
}