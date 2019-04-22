package com.example.comicreader.Service

import android.support.test.rule.ActivityTestRule
import android.view.View
import com.example.comicreader.R
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class RegisterActivityTest {
    @get:Rule
    var activityTestRule = ActivityTestRule(RegisterActivity::class.java)
    private var mActivity = activityTestRule.activity

    @Before
    fun setUp() {
    }

    @Test
    fun layoutTest()
    {
        val view : View = mActivity.findViewById(R.id.linearLayout1)
        assertNotNull(view)
    }
    @After
    fun tearDown() {
    }
}