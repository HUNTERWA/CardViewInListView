package com.ats.rohit.cardviewinlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Toolbar toolbar;
    ListView lv_languages;


    LanguagesListAdapter list_adapter;
    String[] languages = new String[] { "SQL",
            "JAVA",
            "JAVA SCRIPT",
            "C#",
            "PYTHON",
            "C++",
            "PHP",
            "IOS",
            "ANDROID"
    };

    public static int [] language_images={R.drawable.back,
            R.drawable.buy,
            R.drawable.paid,
            R.drawable.logo,
            R.drawable.json,
            R.drawable.cool,
            R.drawable.fafaf,
            R.drawable.jack,
            R.mipmap.ic_launcher};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        lv_languages.setAdapter(list_adapter);


    }

    private void init() {

        //toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("List Cards");
        list_adapter = new LanguagesListAdapter(this,languages, language_images);
        lv_languages = (ListView) findViewById(R.id.lv_languages);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

//noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
