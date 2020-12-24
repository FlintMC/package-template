pluginManagement {
    plugins {
        // make sure to use the newest version
        id("net.flintmc.flint-gradle") version "2.7.1"
    }
    buildscript {
        dependencies {
            classpath("net.flintmc", "flint-gradle", "2.7.1")
        }
        repositories {
            maven {
                setUrl("https://dist.labymod.net/api/v1/maven/release")
                name = "Flint"
            }
            mavenCentral()
        }
    }
}