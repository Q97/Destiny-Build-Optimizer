package com.example.destinybuildoptimizer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TabScreensActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PageAdapter adapter;
    private TabLayout tabLayout;
    private TabItem tab1,tab2,tab3,tab4;
    private Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabscreens);

        tabLayout = findViewById(R.id.tabs);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        tab4 = findViewById(R.id.tab4);

        viewPager = findViewById(R.id.pager);
        adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        account = DApplication.getAccount();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0) {
                    account.setCurrentCharacter(0);
                    adapter.notifyDataSetChanged();
                    tabLayout.setBackground(getDrawable(R.drawable.fullemblem1));

                }
                else if(tab.getPosition()==1) {
                    account.setCurrentCharacter(1);
                    adapter.notifyDataSetChanged();
                    tabLayout.setBackground(getDrawable(R.drawable.fullemblem2));
                }
                else if(tab.getPosition()==2) {
                    account.setCurrentCharacter(2);
                    adapter.notifyDataSetChanged();
                    tabLayout.setBackground(getDrawable(R.drawable.fullemblem3));
                }
                else if(tab.getPosition()==3) {
                    adapter.notifyDataSetChanged();
                    tabLayout.setBackground(getDrawable(R.drawable.fullemblem4));
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        final Button settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TabScreensActivity.this, SettingsActivity.class));
            }
        });
    }
}
