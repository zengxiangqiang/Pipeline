Jenkinsfile (Declarative Pipeline)
pipeline{
    agent any
    stages{
        stage('Bulid'){
            steps{
                echo "make"
            }
        }
        stage('Test'){
            steps{
                echo "make check || true"
            }
        }
        stage('Deploy'){
            steps{
                echo "make publish"
            }
        }
    }
}