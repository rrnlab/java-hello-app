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
    }
}