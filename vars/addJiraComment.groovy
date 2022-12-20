def call(Map config = [:]) {
    //sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
    def comment = [ body: 'test comment' ]
    jiraAddComment site: "${config.site}", idOrKey: "${config.ticket}", input: comment
}