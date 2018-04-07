package perevozchykov.oleksandr.findrepo.Screens

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.anything
import perevozchykov.oleksandr.findrepo.R
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.Espresso.onView
import android.support.v7.widget.RecyclerView
import android.support.annotation.IdRes
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.web.assertion.WebViewAssertions.webMatches
import android.support.test.espresso.web.model.Atoms.getCurrentUrl
import android.support.test.espresso.web.sugar.Web.onWebView
import android.support.test.espresso.web.webdriver.DriverAtoms.*
import android.support.test.espresso.web.webdriver.Locator
import org.hamcrest.CoreMatchers.containsString
import java.util.regex.Matcher


class SearchingScreen: BaseScreen() {

    private val editTextSearchRepo = onView(ViewMatchers.withId(R.id.searchEditText))

    private val searhRepoButton = onView(ViewMatchers.withId(R.id.searchButton))

    private val editUserSearchRepo = onView(ViewMatchers.withId(R.id.userRepoEditText))

    private val searchUserButton = onView(ViewMatchers.withId(R.id.userRepoButton))

    fun typeRepoName (text: String) {
        editTextSearchRepo.perform(ViewActions.typeText(text))
    }

    fun clickSearchRepoButton () {
        searhRepoButton.perform(ViewActions.click())
        onView(ViewMatchers.withId(R.id.repoListView))
                .check(ViewAssertions
                        .matches(ViewMatchers.isDisplayed()))
    }

    fun clickRepoByIndex (index: Int) {
        onData(anything()).inAdapterView(ViewMatchers.withId(R.id.repoListView))
                .atPosition(index)
                .perform(ViewActions.click())
    }

    fun typeUserName (text: String) {
        editUserSearchRepo.perform(ViewActions.typeText(text))
    }

    fun clickSearchUserButton () {
        searchUserButton.perform(ViewActions.click())
        onView(ViewMatchers.withId(R.id.repoListView))
                .check(ViewAssertions
                        .matches(ViewMatchers.isDisplayed()))
    }

    fun clickUserByIndex (index: Int) {
        onData(anything()).inAdapterView(ViewMatchers.withId(R.id.repoListView))
                .atPosition(index)
                .perform(ViewActions.click())
    }
    

}