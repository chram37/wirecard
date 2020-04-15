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
                  'ansible-playbook playbook.yaml -i hosts',
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
