package com.example.destinybuildoptimizer;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1 extends Fragment {

    public static final int REQUEST_CODE = 1;
    public tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        final ImageButton helmetbtn = (ImageButton) view.findViewById(R.id.helmet_tab1);
        helmetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InventoryActivity.class);
                 startActivityForResult(intent, REQUEST_CODE);
            }
        });

        final ImageButton armsbtn = (ImageButton) view.findViewById(R.id.arms_tab1);
        armsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InventoryActivity.class);
                 startActivityForResult(intent, REQUEST_CODE);
            }
        });

        final ImageButton chestbtn = (ImageButton) view.findViewById(R.id.chest_tab1);
        chestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InventoryActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        final ImageButton legsbtn = (ImageButton) view.findViewById(R.id.legs_tab1);
        legsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InventoryActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        final ImageButton classitembtn = (ImageButton) view.findViewById(R.id.classitem_tab1);
        classitembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), InventoryActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });


        return view;
    }
}
