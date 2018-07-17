# Simple Gradle Plugin

This project is a backbone for teams starting with Gradle who want to use separate centralized configuration files for the code building & deplyment process.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8

### Build

```
./gradlew clean build
```

NOTE: Make sure to release a version (or SNAPSHOT) to Nexus before using it.

### Usage

Once you build the `flado-gradle-plugin.jar` you can make use of it in a new project by including and applying it in a `build.gradle` configuration:

```
buildscript {
    ext {
        fladoGradlePluginVersion = '1.0.0'
    }
    repositories {
        maven { url 'https://nexus/content/groups/public' }
        maven { url 'https://nexus/content/repositories/inhouse' }
        mavenCentral()
    }
    dependencies {
        classpath("au.com.flado.gradle:flado-gradle-plugin:${fladoGradlePluginVersion}")
    }
}

apply plugin: 'groovy'
apply plugin: 'maven'
apply plugin: 'maven-publish'
apply plugin: 'au.com.flado.gradle'
```