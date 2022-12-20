def call(Map config=[:]) {
    try {
        def testIssue = [update: [labels: [[add:"${config.label}"]]]]  
        response = jiraEditIssue idOrKey: "${config.issue}", issue: testIssue, site: "${config.site}"
    } catch (Exception e) {
        //echo 'Exception occurred: ' + e.toString()
        sh 'Handle the exception!'
    }
}
