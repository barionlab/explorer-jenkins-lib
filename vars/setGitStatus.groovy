void setBuildStatus(Map config = [:]) {
  step([
      $class: "GitHubCommitStatusSetter",
      reposSource: [$class: "ManuallyEnteredRepositorySource", url: "${config.gitUrl}"],
      contextSource: [$class: "ManuallyEnteredCommitContextSource", context: "${config.context ?: 'Jenkins'}"],
      errorHandlers: [[$class: "ChangingBuildStatusErrorHandler", result: "UNSTABLE"]],
      statusResultSource: [ $class: "ConditionalStatusResultSource", results: [[$class: "AnyBuildResult", message: ${config.message}, state: ${config.state}]] ]
  ]);
}