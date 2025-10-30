pipeline {
	agent {
		docker {
			image 'gradle:8.10.2-jdk17'   // ARM 지원
			args '-v $HOME/.gradle:/home/gradle/.gradle'
		}
	}
 stages {
 stage("Compile") {
 steps {
 sh "./gradlew compileJava"
 }
 }
 stage("Build") {
 steps {
 sh "./gradlew build"
 }
 }
 stage("Unit test") {
 steps {
 sh "./gradlew test" }
                      }
                      }
                     }