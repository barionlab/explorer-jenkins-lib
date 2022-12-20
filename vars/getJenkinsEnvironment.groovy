def call(Map config = [:]) {
  def issueEnv = (env.JOB_NAME.split("-")[1]).toUpperCase()
  echo "rawIssueId = ${issueEnv}"
  return issueEnv  
}