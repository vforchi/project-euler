plugins {
    java
    antlr
    application
}

group = "euler"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.16")
    annotationProcessor("org.projectlombok:lombok:1.18.16")

    implementation("io.vavr:vavr:0.10.3")
    implementation("org.apache.commons:commons-lang3:3.11")
    implementation("org.apache.commons:commons-collections4:4.4")

    //testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
    //testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(15))
    }
}

application {
    mainClass.set("me.vforchi.euler.Main")
}
