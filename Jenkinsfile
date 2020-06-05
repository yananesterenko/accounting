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
       stage('Mvn Compile'){
            steps {
             withMaven(maven: 'Maven'){
             sh 'mvn clean compile -DskipTests=true'
             }
           }
       }
        stage('Mvn Package'){
            steps {
                withMaven(maven: 'Maven'){
               sh 'mvn package -DskipTests=true'
               }
            }
       }

        stage("Docker build Image") {
            steps {
                sh 'images -a'
                sh 'docker build -t  yana20200212/demoacc .'
                sh 'images -a'
                }
            }
   }
}