plugins {
    application
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"
application { mainClass.set("hexlet.code.App") }

checkstyle {
    toolVersion = "10.12.4"
}


repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
