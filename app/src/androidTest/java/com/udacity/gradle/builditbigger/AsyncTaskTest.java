package com.udacity.gradle.builditbigger;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {
        EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask();
        endpointAsyncTask.execute(mainActivityActivityTestRule.getActivity());

        String joke = endpointAsyncTask.get();
        assertNotNull(joke);
    }
}