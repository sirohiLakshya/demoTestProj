pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/sirohiLakshya/demoTestProj.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "Deployment Stage Successful!"'
            }
        }
    }
}
