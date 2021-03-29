package co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.ResourcesFragment;
import co.zw.techsolutes.happyfirst.Mainpage.TabAdapter;
import co.zw.techsolutes.happyfirst.R;

public class HomeFragment extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;

    RecyclerView recyclerView;
    List<DisplayData> contactsData= new ArrayList<>();
    DisplayAdapter contactsAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_home_fragement, container, false);



        //final TabAdapter pageAdapter = new TabAdapter(getParentFragmentManager(), tabLayout.getTabCount());
       // viewPager.setAdapter(pageAdapter);
        //tabLayout.setupWithViewPager(viewPager);
       // viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        recyclerView = view.findViewById(R.id.recycler_view_selfscreen);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity() , LinearLayoutManager.VERTICAL,false));

        contactsAdapter = new DisplayAdapter(contactsData, getActivity());
        recyclerView.setAdapter(contactsAdapter);
        getData();




        /*tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                //


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/
return view;
    }

    private List<DisplayData> getData() {

        contactsData.add(new DisplayData("I got my period and I haven't told my mom yet. It's really hard for me to talk about things\\n\" +\n" +
                "                    \"like this. I have a lot of questions. What should I do?\"", "Lots of girls have the same concern. Your mom will be one of your best resources when you\n" +
                "have questions about your period, so try to start the conversation yourself! Know that she will be\n" +
                "understanding and helpful. Actually, she may be your best friend during this time in your life.\n" +
                "Still don’t feel like you can talk to your mom? An aunt, friend’s mom or older sister are also\n" +
                "great women to ask",R.drawable.pad2));
        contactsData.add(new DisplayData("Is it OK to have a bath or shower when I have my period?", "Yep! During your period, it’s important to keep yourself fresh and clean. They’re a simple way\n" +
                "to stay feeling feminine and fresh. Always Incredibly Thin Liners and Always Xtra Protection\n" +
                "Liners are great choices for daily liners that help you feel dry, fresh and confident every day.",R.drawable.bleeding));
        contactsData.add(new DisplayData("Is there anything I won’t be able to do when I have my period?", "Your period doesn’t have to stop you from doing things you usually do. You can still go to\n" +
                "school, help at home, see your friends, play sports and do all the things you’d normally do.\n" +
                "Tip: See the whole line of Always products so you can pick the best fit for your lifestyle and\n" +
                "flow",R.drawable.firstr));
        contactsData.add(new DisplayData("Will anyone, like boys or my mom, notice when I have my period? ", "No — not unless you tell them! If they ask you, it’s totally up to you to share or not.",R.drawable.mensu));
        contactsData.add(new DisplayData("When will I stop having my period for good? ", "Women get periods until menopause, which is when menstruation and the ability to have\n" +
                "children stops. In most women, it usually happens in their late 40sor early 50s. But menopause\n" +
                "can happen earlier or later. Some women may stop menstruation by the time they're 35 years old,\n" +
                "and others may not stop until their late 50s.",R.drawable.menstrualcalender2));

        return contactsData;
    }
}