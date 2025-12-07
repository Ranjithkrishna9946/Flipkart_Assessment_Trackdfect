pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK11'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/Ranjithkrishna9946/Flipkart_Assessment_Trackdfect', branch: 'master'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Run TestNG Tests') {
            steps {
                bat 'mvn test -DsuiteXmlFile=testng.xml'
            }
        }

        stage('Publish Reports') {
            steps {
                junit 'test-output/testng-results.xml'
                archiveArtifacts artifacts: 'test-output/**/*.html', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            echo 'Cleaning workspace...'
            deleteDir()
        }
    }
}
