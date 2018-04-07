package perevozchykov.oleksandr.findrepo

import org.junit.Rule
import android.support.test.espresso.Espresso.onView
import android.R.attr.button
import android.support.test.espresso.action.ViewActions.typeText
import org.junit.Before
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
open class BaseTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

}