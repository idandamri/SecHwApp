package com.example.idan.sechwapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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
        WebView wv1 = getWebView();
        wv1.setWebViewClient(new WebViewClient());
        wv1.getSettings().setJavaScriptEnabled(true);
        String link = "http://www.google.com";
        wv1.loadUrl(link);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
//        Bundle extras = new Bundle();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
//            extras.putBinder(EXTRA_CUSTOM_TABS_SESSION,null);
//        }
//        intent.putExtras(extras);

//        wv.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return false;
//            }
//        });
        return view;
    }



}
