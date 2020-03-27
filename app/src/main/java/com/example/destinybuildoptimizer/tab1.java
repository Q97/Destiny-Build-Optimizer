package com.example.destinybuildoptimizer;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
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

        final TextView mobilityVal = view.findViewById(R.id.mobilityvalue_tab1);
        final TextView resilienceVal = view.findViewById(R.id.resiliencevalue_tab1);
        final TextView recoveryVal = view.findViewById(R.id.recoveryvalue_tab1);
        final TextView disciplineVal = view.findViewById(R.id.disciplinevalue_tab1);
        final TextView intellectVal = view.findViewById(R.id.intellectvalue_tab1);
        final TextView strengthVal = view.findViewById(R.id.strengthvalue_tab1);

        final ImageButton mobilityBtn = view.findViewById(R.id.mobility_tab1);
        mobilityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(true);

                builder.setMessage("Optimize for mobility?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mobilityVal.setText("95");
                        resilienceVal.setText("53");
                        recoveryVal.setText("10");
                        disciplineVal.setText("21");
                        intellectVal.setText("15");
                        strengthVal.setText("46");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        final ImageButton resilienceBtn = view.findViewById(R.id.resilience_tab1);
        resilienceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(true);

                builder.setMessage("Optimize for resilience?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mobilityVal.setText("60");
                        resilienceVal.setText("83");
                        recoveryVal.setText("22");
                        disciplineVal.setText("32");
                        intellectVal.setText("13");
                        strengthVal.setText("40");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        final ImageButton recoveryBtn = view.findViewById(R.id.recovery_tab1);
        recoveryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(true);

                builder.setMessage("Optimize for recovery?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mobilityVal.setText("32");
                        resilienceVal.setText("54");
                        recoveryVal.setText("92");
                        disciplineVal.setText("8");
                        intellectVal.setText("14");
                        strengthVal.setText("42");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        final ImageButton disciplineBtn = view.findViewById(R.id.discipline_tab1);
        disciplineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(true);

                builder.setMessage("Optimize for discipline?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mobilityVal.setText("32");
                        resilienceVal.setText("42");
                        recoveryVal.setText("69");
                        disciplineVal.setText("83");
                        intellectVal.setText("54");
                        strengthVal.setText("33");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        final ImageButton intellectBtn = view.findViewById(R.id.intellect_tab1);
        intellectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(true);

                builder.setMessage("Optimize for intellect?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mobilityVal.setText("14");
                        resilienceVal.setText("8");
                        recoveryVal.setText("10");
                        disciplineVal.setText("22");
                        intellectVal.setText("100");
                        strengthVal.setText("26");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        final ImageButton strengthBtn = view.findViewById(R.id.strength_tab1);
        strengthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setCancelable(true);

                builder.setMessage("Optimize for strength?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        mobilityVal.setText("10");
                        resilienceVal.setText("53");
                        recoveryVal.setText("14");
                        disciplineVal.setText("66");
                        intellectVal.setText("34");
                        strengthVal.setText("89");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

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
