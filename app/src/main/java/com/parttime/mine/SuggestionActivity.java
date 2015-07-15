package com.parttime.mine;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parttime.base.WithTitleActivity;
import com.qingmu.jianzhidaren.R;

/**
 * Created by cjz on 2015/7/14.
 */
public class SuggestionActivity extends WithTitleActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_suggestion);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initViews() {
        super.initViews();
        center(R.string.suggestion);
        left(TextView.class, R.string.back);
    }

    @Override
    protected ViewGroup getLeftWrapper() {
        return null;
    }

    @Override
    protected ViewGroup getRightWrapper() {
        return null;
    }

    @Override
    protected TextView getCenter() {
        return null;
    }
}