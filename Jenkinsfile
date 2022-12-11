pipeline {

    agent any

    stages{
        
        stage('checkout'){

            steps{
                git branch: 'main', url: 'https://github.com/rrnlab/java-hello-app.git'
            }
        }
        stage('unit test'){

            steps{
                sh 'mvn test'
            }
        }
        stage('clean install'){

            steps{
                sh 'mvn clean install'
            }
        }
        stage('integration testing'){

            steps{
                sh 'mvn verify -DskipUnitTest'
            }
        }
        stage('build docker image'){
            
            steps{
                script{
                    sh 'docker build -t test/spring-boot-hello-app .'
                }
            }
        }
    }
}