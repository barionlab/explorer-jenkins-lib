def call(Map config = [:]) {
  def issueEnv = env.JOB_NAME.split("-")[1]
  echo "rawIssueId = ${issueEnv}"
  return issueEnv  
}