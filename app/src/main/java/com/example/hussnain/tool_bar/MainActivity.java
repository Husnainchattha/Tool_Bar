package com.example.hussnain.tool_bar;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private FragmentPagerAdapter adapterViewPager;
    private ViewPager vpPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout=findViewById(R.id.tablayout);
        vpPager = findViewById(R.id.viewpgr);
        tabLayout.setupWithViewPager(vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
    }

    public class MyPagerAdapter extends FragmentPagerAdapter {
        private String tabTitles[] = new String[]{"Friends", "Suggested Friends", "Status","chattha"};

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FirstFragment.newInstance(0, "Page # 1");

                case 1:
                    return FirstFragment.newInstance(1, "Page # 2");

                case 2:
                    return FirstFragment.newInstance(2, "Page # 3");

                case 3:
                    return FirstFragment.newInstance(3, "Page # 4");
                case 4:
                    throw new IllegalArgumentException("fdsf");
                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

    }
}
