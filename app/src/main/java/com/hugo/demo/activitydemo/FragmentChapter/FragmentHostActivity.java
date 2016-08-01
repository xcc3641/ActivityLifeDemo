package com.hugo.demo.activitydemo.FragmentChapter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.hugo.demo.activitydemo.ActivityChapter.BaseActivity;
import com.hugo.demo.activitydemo.R;

/**
 * Created by HugoXie on 16/7/22.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class FragmentHostActivity extends BaseActivity {
    private Button showHide;
    private Button replace;
    private FrameLayout frameLayout;

    TestFragment testFragment;

    boolean isShow = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        showHide = (Button) findViewById(R.id.show_hide);
        replace = (Button) findViewById(R.id.replace);
        frameLayout = (FrameLayout) findViewById(R.id.frame_layout);
        testFragment = new TestFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, testFragment).commit();

        showHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isShow) {
                    getSupportFragmentManager().beginTransaction().hide(testFragment).commit();
                    isShow = false;
                } else {
                    getSupportFragmentManager().beginTransaction().show(testFragment).commit();
                    isShow = true;
                }
            }
        });

        replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new OtherFragment()).commit();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
