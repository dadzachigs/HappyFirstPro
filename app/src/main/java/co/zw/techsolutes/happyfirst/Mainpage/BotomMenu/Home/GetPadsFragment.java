package co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.zw.techsolutes.happyfirst.R;


public class GetPadsFragment extends Fragment {



    public GetPadsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getContext().getTheme().applyStyle(R.style.AppStyle, true);
        View view= inflater.inflate(R.layout.fragment_get_pads, container, false);
        return view;
    }
}