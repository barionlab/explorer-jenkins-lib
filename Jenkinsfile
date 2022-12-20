@Library("explorer-jenkins-lib") _

pipeline {
    agent {
        node {
            label 'aws-ec2-docker'
        }
    }
    stages {
        stage('Yarn install') {
            agent { 
              docker {
                image 'node:14' 
                reuseNode true
                args  '--entrypoint=""'
              }
            }
            steps {
                helloWorld() 
                sh 'echo ${GIT_COMMIT}'
                sh 'echo ${JOB_NAME}'
                sh 'echo ${JOB_BASE_NAME}'
                sh 'echo ${BUILD_DISPLAY_NAME}'
            }
        }
    }
    post {
        always {
            //slackSend message: "Tests passed - ${JOB_NAME} #${BUILD_NUMBER} (<${BUILD_URL}|Open>)", color: "good"
            //setBuildStatus(gitUrl:"", context:"", message:"test message", state:"good")
            helloWorld()
            getIssueIdFromCommitMessage()
            //getJiraTicket(env.GIT_COMMIT)
            //addJiraLabel(label:"STAGE",issue:getJiraTicket(env.GIT_COMMIT),site:"explorer")
        }        
    }
    
}