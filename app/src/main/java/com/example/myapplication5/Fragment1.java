package com.example.myapplication5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        Button goToFragment2Button = view.findViewById(R.id.go_to_fragment2_button);
        goToFragment2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exampleData = "Закиров";
                Bundle bundle = new Bundle();
                bundle.putString("example", exampleData);
                Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment2, bundle);
            }
        });

        return view;
    }
}