package com.hugo.demo.activitydemo.cViewPagerChapter;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.hugo.demo.activitydemo.aActivityChapter.BaseActivity;
import com.hugo.demo.activitydemo.R;
import java.util.ArrayList;

/**
 * Created by HugoXie on 16/8/1.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class ViewPagerHostActivity extends BaseActivity {
    ViewPager viewPager;
    ArrayList<OneTextFragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        fragmentList.add(new OneTextFragment());
        fragmentList.add(new TwoTextFragment());
        fragmentList.add(new ThreeTextFragment());
        viewPager.setAdapter(new FtAdapter(getSupportFragmentManager(), fragmentList));
    }
}
