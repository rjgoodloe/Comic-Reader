package com.example.comicreader.Service

import android.support.test.rule.ActivityTestRule
import android.view.View
import com.example.comicreader.R
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class LoginActivityTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(LoginActivity::class.java)
    var mActivity = activityTestRule.activity

    @Before
    fun setUp() {
    }
    @Test
    fun LayoutTest(){
        var view : View
        view = mActivity.findViewById(R.id.linearLayout)
        assertNotNull(view)
    }
    @Test
    fun LayoutTest1(){
        var view : View
        view = mActivity.findViewById(R.id.linearLayout1)
        assertNotNull(view)
    }


    @After
    fun tearDown() {
    }
}