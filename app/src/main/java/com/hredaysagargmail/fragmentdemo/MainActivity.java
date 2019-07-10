package com.hredaysagargmail.fragmentdemo;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private static final String TAG = MainActivity.class.getSimpleName();

    String[] name = {"Hreday", "Ma", "Baba", "Bunu", "Troyi", "Toma", "Mama", "Mami", "Nerol", "Tasnuva", "David"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;
        if(position==0){

            fragment=new HredayFragment();
            android.app.FragmentManager fragmentManager=getFragmentManager();
            android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId,fragment);
            fragmentTransaction.commit();
        }
        else if(position==1){
            fragment=new MaFragment();
            android.app.FragmentManager fragmentManager=getFragmentManager();
            android.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentId,fragment);
            fragmentTransaction.commit();



        }

    }
}
