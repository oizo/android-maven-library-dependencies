package io.hvam.android.mavendependencies.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import io.hvam.android.dependencies.LibraryWrapper;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Test if the library bintray script correctly included it's dependencies, if not crash.
        int dp = 20;
        int px = LibraryWrapper.dpToPx(dp, this);
        String text = getString(R.string.pixel_value, dp, px);
        ((TextView) findViewById(R.id.textView)).setText(text);
    }
}
