package com.example.vishwajeet.spiderg;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class webview extends AppCompatActivity {


    private WebView webview;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        bundle =getIntent().getExtras();
        if(bundle!=null){
           // String string1= getIntent().getExtras().toString();
            webview= (WebView) findViewById(R.id.webView);
            WebSettings settings=webview.getSettings();
            settings.setJavaScriptEnabled(true);
            webview.loadUrl(bundle.getString("videoname"));
            webview.setWebViewClient(new MyWebviewClient());
        }

    }

    private class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if(Uri.parse(url).getHost().equals(bundle.getString("videoname")));
            return false;

        }
    }

}
