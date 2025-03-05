pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                bat 'mvn clean package install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/**/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                recordCoverage(tools: [[parser: 'JACOCO']])
            }
        }
    }
}