package com.example.destinybuildoptimizer;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab4 extends Fragment {

    public static final int REQUEST_CODE = 1;
    ImageButton slot1;
    ImageButton slot2;

    public tab4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab4, container, false);

        slot2 =(ImageButton) view.findViewById(R.id.vault_slot2);

        slot1 = (ImageButton) view.findViewById(R.id.vault_slot1);
        slot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DetailActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        return view;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){

        if (requestCode == 1) {

            if (resultCode == RESULT_OK) {
                slot1.setImageResource(R.drawable.reverie_dawn_casque_icon1);
                slot2.setImageResource(R.drawable.empty_slot);

            }
            if (resultCode == RESULT_CANCELED) {
                //Do nothing?
            }
        }

    }

}
