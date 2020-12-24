plugins {
    id("java-library")
    id("net.flintmc.flint-gradle")
}

repositories {
    mavenCentral()
    maven {
        setUrl("https://dist.labymod.net/api/v1/maven/release")
        name = "Flint"
    }
}

group = "your.group"
version = "1.0.0"

flint {
    // Enter the newest Flint version here
    flintVersion = "2.0.5"
    minecraftVersions("1.15.2")
    authors = arrayOf("Your Name")
    runs {
        overrideMainClass("net.flintmc.launcher.FlintLauncher")
    }
}

dependencies {
    annotationProcessor(flintApi("annotation-processing-autoload"))
    internalAnnotationProcessor(flintApi("annotation-processing-autoload"))

    api(flintApi("framework-eventbus"))
    api(flintApi("framework-inject"))
    api(flintApi("mcapi"))
    api(flintApi("util-task-executor"))

    minecraft("1.15.2") {
        annotationProcessor(flintApi("annotation-processing-autoload"))
    }
}