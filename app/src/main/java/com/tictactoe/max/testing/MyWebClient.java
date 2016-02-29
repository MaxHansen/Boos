package com.tictactoe.max.testing;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Max on 26-02-2016.
 */
public class MyWebClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;

    }
}
