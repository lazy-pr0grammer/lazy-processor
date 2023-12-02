plugins {
    kotlin("jvm")
    id("com.google.devtools.ksp") version "1.9.0-1.0.13"
}

dependencies {
    //noinspection GradleDependency
    implementation("com.google.devtools.ksp:symbol-processing-api:1.9.0-1.0.13")
}