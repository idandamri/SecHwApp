package com.example.idan.sechwapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Official_website extends WebViewFragment {

//    WebView web_view;
//        web_view = (WebView) rootview.findViewById(R.id.official_site_wv);
//        web_view.loadUrl("http://www.realmadrid.com");
    View rootview;

    public Official_website() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);

        WebView wv = getWebView();
        wv.loadUrl("http://www.realmadrid.com");
        wv.getSettings().setJavaScriptEnabled(true);

//        wv.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return false;
//            }
//        });
        return wv;
    }


}
