plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "8.3"
   id("us.ihmc.ihmc-cd") version "1.24"
}

ihmc {
   loadProductProperties("../group.gradle.properties")

   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("us.ihmc:jfoenix:source")

   api("javax.annotation:javax.annotation-api:1.3.2")
   api("io.datafx:datafx:8.0.1")
   api("io.datafx:flow:8.0.1")
   
    api("org.kordamp.ikonli:ikonli-javafx:2.4.0")
    api("org.kordamp.ikonli:ikonli-fontawesome5-pack:2.4.0")
}

testDependencies {
}
