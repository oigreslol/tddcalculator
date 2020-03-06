pipeline {
    /* TO RUN GRADLE AND PROJECT INSIDE A DOCKER*/
    agent {
        docker {
            image 'gradle'
            args '-p 3000:3000'
        }
    }
    /*agent any
    tools{
        gradle "gradle"
    }*/
    stages {
        stage('Creation'){
            steps{
                sh 'gradle clean'
            }
        }
        stage('Build') {
            steps {
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
        /*stage('SonarQube Analysis'){
            def scannerHome = tool 'sonarScanner';
            withSonarQubeEnv("SonarQube") {
                //sh './gradlew sonarqube'
                sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=fr.demo:my-project -Dsonar.sources=. -Dsonar.java.binaries=."
            }
        }*/
        stage('Deliver') {
            steps {
                sh 'gradle build'
            }
        }
    }
    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}