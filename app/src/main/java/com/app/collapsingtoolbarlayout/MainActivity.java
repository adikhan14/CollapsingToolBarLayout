package com.app.collapsingtoolbarlayout;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
    //    mToolbar.setTitle("ToolBar Title");

        CollapsingToolbarLayout mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        mCollapsingToolbarLayout.setTitle("Collapsing Toolbar");

    }
}
