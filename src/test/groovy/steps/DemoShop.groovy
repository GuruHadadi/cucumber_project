package steps

import cucumber.api.PendingException

/**
 * Created by guru on 20/11/17.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^I am in login page$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}