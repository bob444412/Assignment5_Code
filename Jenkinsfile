pipeline {
    agent any

    stages {
        stage('Install') {
            steps {
                echo 'Installing dependencies...'
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }
    }
}
