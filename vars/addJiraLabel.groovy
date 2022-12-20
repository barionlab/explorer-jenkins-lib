def call(Map config=[:]) {
    def testIssue = [update: [labels: [[add:"${config.label}"]]]]  
    response = jiraEditIssue idOrKey: "${config.issue}", issue: testIssue, site: "${config.site}"
}
