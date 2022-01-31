pipeline {
agent any
    tools {
        maven 'Maven' 
        jdk 'Jdk'
    }
  stages {
    stage('test') {
      steps {
        bat 'mvn compile'
      }
    }

    stage('build') {
      steps {
        bat 'mvn test'
      }
    }

    stage('deploy on test') {
      steps {
        echo 'executing deploy on test'
      }
    }

    stage('deploy on prod') {
        input {
                message "Should we continue?"
                ok "Yes, we should."
            }
      steps {
        echo 'executing deploy on prod'
      }
    }

  }
}
