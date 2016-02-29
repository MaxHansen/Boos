package com.tictactoe.max.testing;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class WebView extends AppCompatActivity {

    android.webkit.WebView webTheView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webTheView = (android.webkit.WebView) findViewById(R.id.webTheView);
        webTheView.setWebViewClient(new MyWebClient());
        webTheView.getSettings().setJavaScriptEnabled(true);
        webTheView.loadUrl("https://www.google.dk");

    }
}
