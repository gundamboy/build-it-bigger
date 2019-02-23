package com.udacity.gradle.builditbigger;


import android.text.TextUtils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest implements JesterTaskListener {
    CountDownLatch countDownLatch;
    String result;

    public AsyncTaskTest() { }

    @Test
    public void getJoke() {
        try {
            countDownLatch = new CountDownLatch(1);
            new EndpointAsyncTask().execute(this);
            countDownLatch.await();

            assertFalse(TextUtils.isEmpty(result));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onComplete(String result) {
        this.result = result;
        countDownLatch.countDown();
    }
}