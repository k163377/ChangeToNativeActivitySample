package com.wrongrong.changetonativeactivitysample;

import android.app.NativeActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("native-activity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
    }

    //タップイベントで、nativeactivityに遷移する
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent intent[] = new Intent[1];
        intent[0] = new Intent(MainActivity.this, NativeActivity.class);
        startActivities(intent);

        return true;
    }
}
