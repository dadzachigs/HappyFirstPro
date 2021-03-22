package co.zw.techsolutes.happyfirst.Mainpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.HomeFragment;
import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.PersonalFragment;
import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.ResourcesFragment;
import co.zw.techsolutes.happyfirst.R;

public class MainPage extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new HomeFragment()).commit();
        }
    }
    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            item -> {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        openFragment(HomeFragment.newInstance("", ""));
                        return true;
                    case R.id.navigation_sms:
                        openFragment(ResourcesFragment.newInstance("", ""));
                        return true;
                    case R.id.navigation_notifications:
                        openFragment(PersonalFragment.newInstance("", ""));
                        return true;
                }
                return false;
            };

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.navigation_sms:
                            selectedFragment = new ResourcesFragment();
                            break;
                        case R.id.navigation_notifications:
                            selectedFragment = new PersonalFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,
                            selectedFragment).commit();
                    return true;
                }
            };
}