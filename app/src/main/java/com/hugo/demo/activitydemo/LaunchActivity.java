package com.hugo.demo.activitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.hugo.demo.activitydemo.aActivityChapter.MainActivity;
import com.hugo.demo.activitydemo.bFragmentChapter.FragmentHostActivity;
import com.hugo.demo.activitydemo.cViewPagerChapter.ViewPagerHostActivity;
import com.hugo.demo.activitydemo.dLaunchChapter.OneActivity;

/**
 * Created by HugoXie on 16/8/1.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btActivity;
    private Button btFragment;
    private Button btViewpager;
    private Button btLaunchmode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        btActivity = (Button) findViewById(R.id.bt_activity);
        btFragment = (Button) findViewById(R.id.bt_fragment);
        btViewpager = (Button) findViewById(R.id.bt_viewpager);
        btLaunchmode = (Button) findViewById(R.id.bt_launchmode);

        btActivity.setOnClickListener(this);
        btFragment.setOnClickListener(this);
        btViewpager.setOnClickListener(this);
        btLaunchmode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_activity:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.bt_fragment:
                startActivity(new Intent(this, FragmentHostActivity.class));
                break;
            case R.id.bt_viewpager:
                startActivity(new Intent(this, ViewPagerHostActivity.class));
                break;
            case R.id.bt_launchmode:
                startActivity(new Intent(this, OneActivity.class));
                break;
        }
    }
}
