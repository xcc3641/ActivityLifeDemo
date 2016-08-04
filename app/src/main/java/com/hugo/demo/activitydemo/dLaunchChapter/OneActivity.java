package com.hugo.demo.activitydemo.dLaunchChapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by HugoXie on 16/8/3.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class OneActivity extends BaseLaunchActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(OneActivity.this,TwoActivity.class);
                startActivity(intent);
            }
        });
    }
}
