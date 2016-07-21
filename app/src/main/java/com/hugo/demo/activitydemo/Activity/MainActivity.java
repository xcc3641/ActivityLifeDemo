package com.hugo.demo.activitydemo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.hugo.demo.activitydemo.R;

public class MainActivity extends BaseActivity {

    Button content;
    Button btShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        content = (Button) findViewById(R.id.bt_content);
        content.setText("启动其他活动");
        content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OtherActivity.class));
            }
        });

        btShowDialog = (Button) findViewById(R.id.bt_showdialog);
        btShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DialogActivity.class));
            }
        });
    }

}
