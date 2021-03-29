package co.zw.techsolutes.happyfirst.Mainpage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home.HomeFragment;
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




    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
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
            };
}