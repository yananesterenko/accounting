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
                git credentialsId: 'github-cred', url: 'https://github.com/yananesterenko/accounting.git'
            }
       }
       stage('Mvn Compile'){
           steps {
           echo "Mvn Compile!!!!!!!!!!!"
            withMaven(maven: 'maven_3_6_3'){
            sh "ls -la ${MVN_CMD_DIR}"
                      sh "cat ${MVN_CMD_DIR}/mvn*"
                      sh "/bin/sh -c 'which mvn'"
                      sh "mvn -v"
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
                sh 'docker images -a'
                sh 'docker build -t  yana20200212/demoacc .'
                sh 'docker images -a'
                }
            }
   }
}