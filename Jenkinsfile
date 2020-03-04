pipeline {
    agent {
        docker {
            image 'gradle'
            args '-p 3000:3000'
        }
    }
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