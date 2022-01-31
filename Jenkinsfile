pipeline {
agent any
    tools {
        maven 'Maven' 
    }
  stages {
    stage('test') {
      steps {
        bat 'mvn --version'
      }
    }

    stage('build') {
      steps {
        echo 'test stage'
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
