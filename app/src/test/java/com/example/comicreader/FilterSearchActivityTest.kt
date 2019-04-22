package com.example.comicreader

import android.support.test.rule.ActivityTestRule
import android.view.View
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class FilterSearchActivityTest {
    @get:Rule
    var activityTestRule = ActivityTestRule(FilterSearchActivity::class.java)
    var mActivity = activityTestRule.activity

    @Before
    fun setUp() {
    }
    @Test
    fun FilterTest()
    {
        var view : View
        view = mActivity.findViewById(R.id.chipGroup)
        assertNotNull(view)
    }
    @After
    fun tearDown() {
    }
}