def call(Map config = [:]) {
  def testIssue = [fields: [ project: [id: '10000'],
                            summary: 'New JIRA Created from Jenkins.',
                            description: 'New JIRA Created from Jenkins.',
                            issuetype: [id: '3']]]

  response = jiraEditIssue idOrKey: 'TEST-01', issue: testIssue, site: 'LOCAL'
}