plugins {
    kotlin("jvm") version "1.9.0"
    id("com.google.devtools.ksp") version "1.9.0-1.0.13"
    id("maven-publish")
}

java {
   withSourcesJar()
}

dependencies {
    //noinspection GradleDependency
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.0")
    //noinspection GradleDependency
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.0-1.0.13")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}