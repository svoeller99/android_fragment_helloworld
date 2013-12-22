package com.voeller.android.fragment.helloworld.test;

import android.test.ActivityInstrumentationTestCase2;
import com.voeller.android.fragment.helloworld.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

