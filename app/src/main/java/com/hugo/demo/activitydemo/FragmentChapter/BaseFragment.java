package com.hugo.demo.activitydemo.FragmentChapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hugo.demo.activitydemo.util.KLog;

/**
 * Created by HugoXie on 16/7/22.
 *
 * Email: Hugo3641@gamil.com
 * GitHub: https://github.com/xcc3641
 * Info:
 */
public class BaseFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        KLog.d(getClass().getSimpleName(), "onAttach");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        KLog.d(getClass().getSimpleName(), "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KLog.d(getClass().getSimpleName(), "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        KLog.d(getClass().getSimpleName(), "onActivityCreated");
    }

    @Override
    public void onResume() {
        super.onResume();
        KLog.d(getClass().getSimpleName(), "onResume");
    }

    @Override
    public void onStart() {
        super.onStart();
        KLog.d(getClass().getSimpleName(), "onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        KLog.d(getClass().getSimpleName(), "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        KLog.d(getClass().getSimpleName(), "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        KLog.d(getClass().getSimpleName(), "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        KLog.d(getClass().getSimpleName(), "onDetach");
    }
}
