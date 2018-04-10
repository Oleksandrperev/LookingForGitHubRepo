package perevozchykov.oleksandr.findrepo

import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.*
import org.junit.Test
import java.util.regex.Pattern.matches
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal.COUNTRY
import android.support.test.espresso.Espresso.onData
import org.hamcrest.CoreMatchers.*
import java.util.EnumSet.allOf
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.ViewAssertion
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.Espresso.onData
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.Espresso.onData
import org.hamcrest.Matchers
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.web.assertion.WebViewAssertions
import android.support.test.espresso.web.model.Atoms
import android.support.test.espresso.web.sugar.Web
import android.support.test.espresso.web.webdriver.DriverAtoms
import android.support.test.espresso.web.webdriver.Locator
import android.widget.ListView
import org.hamcrest.CoreMatchers
import perevozchykov.oleksandr.findrepo.Screens.SearchingScreen
import java.util.*


class FindRepoTest: BaseTest() {

    @Test
    fun searchRepoByName() {

        val searchingScreen = SearchingScreen()
        searchingScreen.typeRepoName("Espresso Kotlin")
        searchingScreen.clickSearchRepoButton()
        val randomNumber = Random().nextInt(5)
        Thread.sleep(2000)
        searchingScreen.clickRepoByIndex(randomNumber)

    }

    @Test
    fun searhRepoByUser() {

        val searchingScreen = SearchingScreen()
        searchingScreen.typeUserName("bay-qa")
        searchingScreen.clickSearchUserButton()
        val randomNumber = Random().nextInt(5)
        Thread.sleep(2000)
        searchingScreen.clickUserByIndex(randomNumber)
    }

}




