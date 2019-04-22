package com.example.comicreader

import android.support.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class UploadComicActivityTest {
    @get:Rule
    var activityTestRule = ActivityTestRule(UploadComicActivity::class.java)
    var mActivity = activityTestRule.activity

    @Before
    fun setUp() {
    }
    @Test
    fun UploadTest()
    {

    }

    @After
    fun tearDown() {
    }
}