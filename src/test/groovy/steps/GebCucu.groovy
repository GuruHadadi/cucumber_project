package steps

import cucumber.api.PendingException
import geb.Browser
import pages.*
import static   cucumber.api.groovy.EN.*


Given(~/^I register for a Salesforce Developer account$/) { ->
    Browser.drive {
        to SalesforceDevPage
    }
}