package com.developers.popularmovies2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.developers.popularmovies2.DetailFragment;
import com.developers.popularmovies2.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (savedInstanceState == null) {
            Bundle argument = new Bundle();
            argument.putParcelable(DetailFragment.DETAIL, getIntent().getData());
            DetailFragment detail = new DetailFragment();
            detail.setArguments(argument);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment, detail).commit();
        }
    }
}
