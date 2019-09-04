package com.zawlynn.udicity.p4;

import android.content.Context;

import androidx.core.util.Pair;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.zawlynn.udicity.p4.endpoint.EndpointsAsyncTask;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class JokeTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<Context, String>(activityTestRule.getActivity(), "Manfred"));
        String randomJoke = endpointsAsyncTask.get();

        assertNotNull(randomJoke);
    }
}
