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
                sh 'echo ${JOB_NAME}'
                sh 'echo ${JOB_BASE_NAME}'
                sh 'echo ${BUILD_DISPLAY_NAME}'
                sh 'echo env'
                sh 'echo GIT_COMMIT ${GIT_COMMIT}'
                sh 'exho GIT_PREVIOUS_COMMIT ${GIT_PREVIOUS_COMMIT}'
                sh 'exho GIT_PREVIOUS_SUCCESSFUL_COMMIT ${GIT_PREVIOUS_SUCCESSFUL_COMMIT}'
                
            }
        }
    }
    post {
        always {
            //slackSend message: "Tests passed - ${JOB_NAME} #${BUILD_NUMBER} (<${BUILD_URL}|Open>)", color: "good"
            //setBuildStatus(gitUrl:"", context:"", message:"test message", state:"good")
            helloWorld()
            //getIssueIdFromCommitMessage()
            //getJiraTicket(env.GIT_COMMIT)
            //addJiraLabel(label:getJenkinsEnvironment(),issue:getIssueIdFromCommitMessage(),site:"explorer")
        }        
    }
    
}
