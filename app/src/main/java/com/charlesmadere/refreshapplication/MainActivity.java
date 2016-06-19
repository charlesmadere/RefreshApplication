package com.charlesmadere.refreshapplication;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeRefreshLayout srl = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        srl.setRefreshing(true);
    }

}
