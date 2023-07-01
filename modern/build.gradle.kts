repositories {
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    // Local Dependencies
    compileOnly(project(":api"))

    // Spigot API
    compileOnly("org.spigotmc:spigot-api:1.14.4-R0.1-SNAPSHOT")
}
