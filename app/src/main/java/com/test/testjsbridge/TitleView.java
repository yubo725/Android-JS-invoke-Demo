package com.test.testjsbridge;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by admin on 2017/3/23.
 */

public class TitleView extends RelativeLayout {

    TextView leftBtn;
    TextView titleTv;
    TextView rightBtn;

    public TitleView(Context context) {
        super(context);
        init();
    }

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TitleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.title_view, this);
        leftBtn = (TextView) findViewById(R.id.title_view_left_btn);
        rightBtn = (TextView) findViewById(R.id.title_view_right_btn);
        titleTv = (TextView) findViewById(R.id.title_view_title);
    }

    public void setLeftBtn(String text, OnClickListener listener) {
        if (!TextUtils.isEmpty(text)) {
            leftBtn.setText(text);
            leftBtn.setOnClickListener(listener);
        }
    }

    public void setRightBtn(String text, OnClickListener listener) {
        if (!TextUtils.isEmpty(text)) {
            rightBtn.setText(text);
            rightBtn.setOnClickListener(listener);
        }
    }

    public void setTitle(String title) {
        if (!TextUtils.isEmpty(title)) {
            titleTv.setText(title);
        }
    }

}
