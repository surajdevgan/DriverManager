package drivermng.app.com.drivermanager.driver;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import drivermng.app.com.drivermanager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DriverFragment extends Fragment {


    public DriverFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_driver, container, false);
    }

}
