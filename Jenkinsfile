pipeline {
    agent any

    stages {

            stage("GIT") {
              steps {
                sh 'git checkout master'
                sh 'git pull origin master'
              }
            }
            stage("MAVEN BUILD") {
              steps {
                sh 'mvn clean compile'
              }
            }
            stage("SONARQUBE") {
                   steps {
                    sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar"
                   }
            }
              stage("MOCKITO") {
                              steps {
                                sh "mvn test -Dtest=tn.esprit.spring.services.StockServiceImpMock.java"
                              }

              }
               stage('MVN NEXUS') {
                              steps {
                                 sh 'mvn deploy -Dmaven.test.skip=true';
                              }
               }



    }
}