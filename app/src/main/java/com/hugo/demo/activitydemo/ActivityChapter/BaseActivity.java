package com.hugo.demo.activitydemo.ActivityChapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.hugo.demo.activitydemo.R;
import com.hugo.demo.activitydemo.util.KLog;

/**
 * Created by HugoXie on 16/7/21.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class BaseActivity extends AppCompatActivity {
    private static final String STATE = "state";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        KLog.d(getClass().getSimpleName(),"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        KLog.d(getClass().getSimpleName(),"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        KLog.d(getClass().getSimpleName(),"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        KLog.d(getClass().getSimpleName(),"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        KLog.d(getClass().getSimpleName(),"onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        KLog.d(getClass().getSimpleName(),"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        KLog.d(getClass().getSimpleName(),"onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        KLog.d(getClass().getSimpleName(),"onSaveInstanceState");
        outState.putString(STATE, "test");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        KLog.d(getClass().getSimpleName(),"[onRestoreInstanceState]: " + savedInstanceState.getString(STATE));
    }
}
