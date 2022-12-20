def sendSlackMessage(Map config = [:] ) {
  slackSend message: "Tests passed - ${JOB_NAME} #${BUILD_NUMBER} (<${BUILD_URL}|Open>)", color: "good"  
}