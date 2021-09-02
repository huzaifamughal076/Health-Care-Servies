package com.example.healthcareservices.Activities;

import androidx.annotation.NavigationRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.healthcareservices.Adapters.MyListAdapter;
import com.example.healthcareservices.Adapters.MyListData;
import com.example.healthcareservices.Fragments.ChatsFragment;
import com.example.healthcareservices.Fragments.DoctorFragment;
import com.example.healthcareservices.Fragments.HomeFragment;
import com.example.healthcareservices.Fragments.ProfileFragment;
import com.example.healthcareservices.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends AppCompatActivity {

    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    FrameLayout frame;


    HomeFragment homeFragment;
    ChatsFragment chatsFragment;
    ProfileFragment profileFragment;
    DoctorFragment doctorFragment;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = (NavigationView) findViewById(R.id.navigationView);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, (R.string.Close));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        homeFragment = new HomeFragment();
        chatsFragment = new ChatsFragment();
        profileFragment = new ProfileFragment();
        doctorFragment = new DoctorFragment();

        setfragment(homeFragment);
        navigationView.setCheckedItem(R.id.HomeFragments);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.HomeFragments:
                        setfragment(homeFragment);
                        break;
                    case R.id.chat:
                        setfragment(chatsFragment);
                        break;

                    case R.id.doctor:
                        setfragment(doctorFragment);
                        break;

                    case R.id.settings:
                        setfragment(profileFragment);
                        break;

                }

                return true;
            }
        });




    }


    private void setfragment(Fragment page) {

        drawerLayout.closeDrawer(GravityCompat.START);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, page);
        fragmentTransaction.commit();

    }
}