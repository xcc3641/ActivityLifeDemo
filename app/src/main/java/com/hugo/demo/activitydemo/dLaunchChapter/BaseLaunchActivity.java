package com.hugo.demo.activitydemo.dLaunchChapter;

import android.os.Bundle;
import android.widget.Button;
import com.hugo.demo.activitydemo.R;
import com.hugo.demo.activitydemo.aActivityChapter.BaseActivity;

/**
 * Created by HugoXie on 16/8/3.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class BaseLaunchActivity extends BaseActivity {

    protected Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la_mode);
        button = (Button) findViewById(R.id.button);
        button.setText("启动下一个");

    }
}
