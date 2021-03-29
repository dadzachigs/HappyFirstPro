package co.zw.techsolutes.happyfirst.Mainpage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home.GetPadsFragment;
import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home.InfoFragment;

public class TabAdapter extends FragmentPagerAdapter {

    int totalTabs;
    String [] tittle ={"My Information", "Get Pads"};
    public TabAdapter (FragmentManager fm, int totalTabs) {
        super(fm);


        this.totalTabs = totalTabs;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tittle[position];
    }


    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                InfoFragment homeFragment = new InfoFragment();
                return homeFragment;
            case 1:
                GetPadsFragment sportFragment = new GetPadsFragment();
                return sportFragment;

            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
