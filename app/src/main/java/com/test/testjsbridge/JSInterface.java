package com.test.testjsbridge;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/**
 * Created by admin on 2017/3/23.
 */

public class JSInterface {

    private Context context;
    private TitleView titleView;
    private WebView webView;

    public JSInterface(Context context, TitleView titleView, WebView webView) {
        this.context = context;
        this.titleView = titleView;
        this.webView = webView;
    }

    @JavascriptInterface
    public void setPageTitle(String title) {
        if (titleView != null) {
            titleView.setTitle(title);
        }
    }

}
