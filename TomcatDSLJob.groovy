pipeline {
     agent any
     
     stages {
        stage('cloning repo ... ') {
            steps {
                git 'https://github.com/chram37/wirecard.git'
            }
        }

        stage('build'){
            steps{
                shell([
                  '#!/bin/bash',
                  'set -euxo pipefail',
                  '',
                  'ansible-playbook playbook.yaml -i hosts --user=devops_jenkins',
                  '',
                ].join('\n'))
            }
        }

    }
    post{
        success{
            echo "Cool :)"
        }
    }
}     
