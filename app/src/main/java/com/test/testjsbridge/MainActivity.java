package com.test.testjsbridge;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

    TitleView titleView;
    WebView webView;
    JSInterface jsInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        titleView = (TitleView) findViewById(R.id.title_view);
        webView = (WebView) findViewById(R.id.web_view);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);

        jsInterface = new JSInterface(this, titleView, webView);
        webView.addJavascriptInterface(jsInterface, "js_interface");
        webView.loadUrl("file:///android_asset/index.html");

        titleView.setLeftBtn("LeftBtn", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("javascript:changeEditTextContent('你点击了TitleView的LeftBtn！')");
            }
        });

        titleView.setRightBtn("RightBtn", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadUrl("javascript:changeEditTextContent('你点击了TitleView的RightBtn！')");
            }
        });
    }
}
