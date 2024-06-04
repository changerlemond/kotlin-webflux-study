import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // spring boot
    id("org.springframework.boot") version "3.3.0"
    // spring dependency
    id("io.spring.dependency-management") version "1.1.5"
    // kotlin jvm
    kotlin("jvm") version "1.9.24"
    // spring plugin
    kotlin("plugin.spring") version "1.9.24"
    // spring jpa plugin
    kotlin("plugin.jpa") version "1.9.24"
}

group = "com.study"
version = "0.0.1-SNAPSHOT"

// java verison
java {
    sourceCompatibility = JavaVersion.VERSION_17
}

// Setting up the repository to fetch dependencies
repositories {
    // maven center repo
    mavenCentral()
    // gradle plugin portal
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    // webflux
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    // json
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // reactor
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    // reflection
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    // coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    // actuator
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    // h2 database (temp)
    runtimeOnly("com.h2database:h2")
    // spring boot test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // reactor test
    testImplementation("io.projectreactor:reactor-test")
    // junit test
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// kotlin compiler
tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

// test task setting
tasks.withType<Test> {
    useJUnitPlatform()
}
