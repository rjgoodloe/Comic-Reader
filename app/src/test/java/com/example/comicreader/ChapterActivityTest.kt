package com.example.comicreader

import android.support.test.rule.ActivityTestRule
import android.view.View
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class ChapterActivityTest {
    @get:Rule
    var activityTestRule = ActivityTestRule(ChapterActivity::class.java)
    var mActivity = activityTestRule.activity

    @Before
    fun setUp() {
    }
    @Test
    fun ChapterTest()
    {
        var view : View
        view = mActivity.findViewById(R.id.toolbar)
        assertNotNull(view)
    }
    @After
    fun tearDown() {
    }
}