pipeline{
    agent any
    tools{
        jdk 'myjava'
        maven 'mymaven'
    }
    stages{
        stage('Checkout Main Branch'){
            steps{
                git url: 'https://github.com/saigolive/example-repo.git'
                branch: 'main'
            }
        }

        stage('Git Log'){
            steps{
                sh 'git log'
            }
        }
    }
}
