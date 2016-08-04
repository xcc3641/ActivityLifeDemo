package com.hugo.demo.activitydemo.aActivityChapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.hugo.demo.activitydemo.R;

public class MainActivity extends BaseActivity {

    Button content;
    Button btShowDialog;

    CheckBox checkbox;

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
                if (checkbox.isChecked()) {
                    startActivity(new Intent(MainActivity.this, DialogActivity.class));
                } else {
                    new AlertDialog.Builder(MainActivity.this).setMessage("这里是普通的 Dialog").show();
                }
            }
        });

        checkbox = (CheckBox) findViewById(R.id.checkbox);
    }
}
