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
public class tab3 extends Fragment {


    public tab3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        final ImageButton helmetbtn = (ImageButton) view.findViewById(R.id.helmet_tab3);
        helmetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton armsbtn = (ImageButton) view.findViewById(R.id.arms_tab3);
        armsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton chestbtn = (ImageButton) view.findViewById(R.id.chest_tab3);
        chestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton legsbtn = (ImageButton) view.findViewById(R.id.legs_tab3);
        legsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });

        final ImageButton classitembtn = (ImageButton) view.findViewById(R.id.classitem_tab3);
        classitembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), InventoryActivity.class));
            }
        });
        return view;
    }

}
