package com.example.iqramazhar1.foodtracker_dv;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class MainTabActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";
    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_tracker_dv_tabbed);
        Log.d(TAG, "OnCreateStarting");
        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        SetupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void SetupViewPager(ViewPager viewPager) {
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new progress_fragment(), "Progress");
        adapter.addFragment(new already_eaten_fragment(), "Already Eaten");
        adapter.addFragment(new recommendations_fragment(), "Recommendation");
        viewPager.setAdapter(adapter);
    }
}






