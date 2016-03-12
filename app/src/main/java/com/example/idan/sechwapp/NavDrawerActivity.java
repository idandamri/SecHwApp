package com.example.idan.sechwapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.idan.sechwapp.Fragments.Official_website;

public class NavDrawerActivity extends Activity
        implements NavigationView.OnNavigationItemSelectedListener {

    Official_website ow;
    WebView wv1;
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer);
        init();
    }

    private void init() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        toolbar.setTitle("Madridista");

        wv1 = (WebView) findViewById(R.id.main_web_view);
        wv1.setWebViewClient(new WebViewClient());
        wv1.getSettings().setJavaScriptEnabled(true);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

//        ow = new Official_website();
//        getSupportFragmentManager().beginTransaction().replace(R.id.official_site_wv,ow).commit();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {




        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.news) {
            // Handle the camera action
        } else if (id == R.id.players) {

        } else if (id == R.id.official_website) {
            link = "http://www.realmadrid.com/";
            wv1.loadUrl(link);
//            Official_website ow = new Official_website();
//            FragmentManager fm = getFragmentManager();
//            FragmentTransaction fragmentTransaction = fm.beginTransaction();
//            fragmentTransaction.replace(R.id.fragment, ow);
//            fragmentTransaction.commit();

        } else if (id == R.id.twitter) {
            link = "https://twitter.com/realmadrid";
            wv1.loadUrl(link);
        } else if (id == R.id.history) {

        } else if (id == R.id.titles) {

        }else if (id == R.id.future_games) {

        }else if (id == R.id.facebook) {
            link = "https://www.facebook.com/RealMadrid/";
            wv1.loadUrl(link);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
