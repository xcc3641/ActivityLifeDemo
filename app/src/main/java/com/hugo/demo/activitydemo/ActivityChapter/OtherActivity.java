package com.hugo.demo.activitydemo.ActivityChapter;

import android.os.Bundle;
import android.widget.Button;
import com.hugo.demo.activitydemo.R;

/**
 * Created by HugoXie on 16/7/21.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class OtherActivity extends BaseActivity {
    Button content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = (Button) findViewById(R.id.bt_content);
        content.setText("第二个活动已经启动");
    }

}
