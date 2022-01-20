import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.2"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("com.arenagod.gradle.MybatisGenerator") version "1.4"
	kotlin("jvm") version "1.4.0"
	kotlin("plugin.spring") version "1.4.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.mybatis:mybatis:3.5.6")
	implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.2.1")
	implementation("mysql:mysql-connector-java:8.0.23")
//	implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
	implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9") //Kotlin coroutines用ライブラリ(async, await)
//	implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9") //Kotlin coroutines用ライブラリ(async, await)
	mybatisGenerator("org.mybatis.generator:mybatis-generator-core:1.4.0")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

mybatisGenerator{
	verbose = true
	configFile = "${projectDir}/src/main/resources/generatorConfig.xml"
}