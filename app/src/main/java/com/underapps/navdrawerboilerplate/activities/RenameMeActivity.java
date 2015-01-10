package com.underapps.navdrawerboilerplate.activities;

import android.os.Bundle;
import com.underapps.navdrawerboilerplate.R;


public class RenameMeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.quiz_layout;
    }
}
