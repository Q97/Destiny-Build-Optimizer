package com.example.destinybuildoptimizer;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab2 extends Fragment {


    public tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        final ImageButton helmetbtn = (ImageButton) view.findViewById(R.id.helmet_tab2);
        helmetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton armsbtn = (ImageButton) view.findViewById(R.id.arms_tab2);
        armsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton chestbtn = (ImageButton) view.findViewById(R.id.chest_tab2);
        chestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton legsbtn = (ImageButton) view.findViewById(R.id.legs_tab2);
        legsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton classitembtn = (ImageButton) view.findViewById(R.id.classitem_tab2);
        classitembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        return view;
    }

}
