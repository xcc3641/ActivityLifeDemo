package com.hugo.demo.activitydemo.cViewPagerChapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HugoXie on 16/8/1.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class FtAdapter extends FragmentPagerAdapter {
    private List<OneTextFragment> fragments = new ArrayList<>();

    public FtAdapter(FragmentManager fm) {
        super(fm);
    }

    public FtAdapter(FragmentManager fm, List<OneTextFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
