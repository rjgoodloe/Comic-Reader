package com.example.comicreader

import android.support.test.rule.ActivityTestRule
import android.view.View
import com.example.comicreader.Service.RegisterActivity
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class AddChapterActivityTest {

    @get:Rule
    var activityTestRule = ActivityTestRule(AddChapterActivity::class.java)
    var mActivity = activityTestRule.activity

    @Before
    fun setUp() {
    }
    @Test
    fun Chapter_Test()
    {
        var view : View
        view = mActivity.findViewById(R.id.image_list)
        assertNotNull(view)

    }
    @After
    fun tearDown() {
    }
}