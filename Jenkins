pipeline{
   agent any
   stages {
       stage('Scm checkout') {
            steps {
                git credentialsId: 'github-cred', url: 'https://github.com/yananesterenko/accounting.git'
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

   }
}