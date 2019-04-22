package com.example.comicreader

import android.support.test.rule.ActivityTestRule
import android.view.View
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    var activityTestRule = ActivityTestRule(MainActivity::class.java)
    var mActivity = activityTestRule.activity
    @Before
    fun setUp() {
    }

    @Test
    fun MainTest(){
        var view : View
        view = mActivity.findViewById(R.id.btn_show_filter_search)
        assertNotNull(view)

    }

    @After
    fun tearDown() {
    }
}