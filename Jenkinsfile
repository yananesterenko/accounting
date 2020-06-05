pipeline{
   agent any
   stages {
        stage('Verify Branch') {
            steps {
                echo "$GIT_BRANCH"
            }
       }
       stage('Scm checkout') {
            steps {
                git credentialsId: 'GitHub Connection', url: 'https://github.com/yananesterenko/accounting.git'
            }
       }


        stage("Docker build Image") {
            steps {
                sh 'docker images -a'
                sh 'docker build -t  yana20200212/demoacc .'
                sh 'docker images -a'
                }
            }
   }
}