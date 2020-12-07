package com.example.socialmedianetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ListView listView = findViewById(R.id.search_list);
        List<String> searchList = new ArrayList<>();
        searchList.add("christmas");
        searchList.add("atHome");
        searchList.add("studying");
        searchList.add("lockdown");
        searchList.add("christmasLove");
        searchList.add("christmasCookies");
        searchList.add("karantinaNo2");
        searchList.add("melomakarona");
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, searchList);
        listView.setAdapter(arrayAdapter);

        Toast.makeText(getApplicationContext(),"search activity here",Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view, menu);
        MenuItem menuItem = menu.findItem(R.id.search_icon);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}