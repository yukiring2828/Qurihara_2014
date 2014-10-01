package com.example.myfirst.qurihara_2014.app;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(id.butoon);
        button.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Button button =(Button) v;
               Uri uri = Uri.parse("http://navicon.denso.co.jp/setPOI?ver=1.4&addr=%E6%84%9B%E7%9F%A5%E7%9C%8C%E5%88%88%E8%B0%B7%E5%B8%82%E6%98%AD%E5%92%8C%E7%94%BA%EF%BC%91%E4%B8%81%E7%9B%AE%EF%BC%91&appName=12345678&title=%E3%83%87%E3%83%B3%E3%82%BD%E3%83%BCcafe&radKM=15&tel=0566255511&text=%E3%83%87%E3%83%B3%E3%82%BD%E3%83%BC&callURL=ShopSearch%3A%2F%2FShopSearch.co.jp")
               Intent i = new Intent(Intent.ACTION_VIEW,uri);
               startActivity(i);
               /*Toast.makeText(MainActivity.this,"onClick()",
                       Toast.LENGTH_SHORT).show();*/
           }
        });
        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
