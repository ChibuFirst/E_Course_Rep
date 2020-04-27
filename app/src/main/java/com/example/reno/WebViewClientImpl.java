package com.example.reno;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientImpl extends WebViewClient {
    private Activity activity = null;

    public WebViewClientImpl(Activity activity){
        this.activity = activity;
    }

    @Override
    public boolean
    shouldOverrideUrlLoading(WebView webView, String url){
        if(url.indexOf("https://trendpop.000webhostapp.com/index.html") > -1 ) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        activity.startActivity(intent);
        return true;
    }
}