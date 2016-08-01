package com.hugo.demo.activitydemo.ViewPagerChapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hugo.demo.activitydemo.FragmentChapter.BaseFragment;
import com.hugo.demo.activitydemo.R;

/**
 * Created by HugoXie on 16/8/1.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class OneTextFragment extends BaseFragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_text, container, false);
        textView = (TextView) view.findViewById(R.id.tv_content);
        textView.setText(getClass().getSimpleName());
        return view;
    }
}
