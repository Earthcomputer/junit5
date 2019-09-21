plugins {
	`java-library-conventions`
}

apply(from = "$rootDir/gradle/testing.gradle.kts")

description = "JUnit Vintage Engine"

dependencies {
	api(platform(project(":dependencies")))

	api("org.apiguardian:apiguardian-api")
	api(project(":junit-platform-engine"))
	api("junit:junit")

	testImplementation(project(":junit-platform-launcher"))
	testImplementation(project(":junit-jupiter-api"))
	testImplementation(project(":junit-platform-runner"))
	testImplementation(project(path = ":junit-jupiter-engine", configuration = "testArtifacts"))
	testImplementation(project(":junit-platform-testkit"))
}
