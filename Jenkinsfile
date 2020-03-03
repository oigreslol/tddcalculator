pipeline {
    agent {
        docker {
            image 'gradle:latest'
            args '-p 3000:3000'
        }
    }
    environment {
        CI = 'true'
    }
    stages {
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
        stage('Deliver') {
            steps {
                sh 'gradle build'
            }
        }
    }
}