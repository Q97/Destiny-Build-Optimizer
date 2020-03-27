package com.example.destinybuildoptimizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

//import static com.example.destinybuildoptimizer.DApplication.account;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        /*final Account account = DApplication.getAccount();
        final ArmourPiece currentItem = (ArmourPiece)DApplication.getCurrentItem();

        final TextView detailName = findViewById(R.id.detail_name);
        final ImageView detailIcon = findViewById(R.id.detail_icon);
        final ImageView detailPreview = findViewById(R.id.detail_preview);

        final ProgressBar detailStat1Bar = findViewById(R.id.detail_stat1_bar);
        final ProgressBar detailStat2Bar = findViewById(R.id.detail_stat2_bar);
        final ProgressBar detailStat3Bar = findViewById(R.id.detail_stat3_bar);
        final ProgressBar detailStat4Bar = findViewById(R.id.detail_stat4_bar);
        final ProgressBar detailStat5Bar = findViewById(R.id.detail_stat5_bar);
        final ProgressBar detailStat6Bar = findViewById(R.id.detail_stat6_bar);

        final TextView detailStat1Value = findViewById(R.id.detail_stat1_value);
        final TextView detailStat2Value = findViewById(R.id.detail_stat2_value);
        final TextView detailStat3Value = findViewById(R.id.detail_stat3_value);
        final TextView detailStat4Value = findViewById(R.id.detail_stat4_value);
        final TextView detailStat5Value = findViewById(R.id.detail_stat5_value);
        final TextView detailStat6Value = findViewById(R.id.detail_stat6_value);

        final ImageButton detailToCharacter1 = findViewById(R.id.detail_toCharacter1);
        final ImageButton detailToCharacter2 = findViewById(R.id.detail_toCharacter2);
        final ImageButton detailToCharacter3 = findViewById(R.id.detail_toCharacter3);
        final ImageButton backButton = findViewById(R.id.backbtnDetails);

        detailName.setText(currentItem.name);

        detailStat1Bar.setProgress((Integer)currentItem.getStats().get("mobility"));
        detailStat2Bar.setProgress((Integer)currentItem.getStats().get("resilience"));
        detailStat3Bar.setProgress((Integer)currentItem.getStats().get("recovery"));
        detailStat4Bar.setProgress((Integer)currentItem.getStats().get("discipline"));
        detailStat5Bar.setProgress((Integer)currentItem.getStats().get("intellect"));
        detailStat6Bar.setProgress((Integer)currentItem.getStats().get("strength"));

        detailStat1Value.setText(((Integer)currentItem.getStats().get("mobility")).toString());
        detailStat2Value.setText(((Integer)currentItem.getStats().get("resilience")).toString());
        detailStat3Value.setText(((Integer)currentItem.getStats().get("recovery")).toString());
        detailStat4Value.setText(((Integer)currentItem.getStats().get("discipline")).toString());
        detailStat5Value.setText(((Integer)currentItem.getStats().get("intellect")).toString());
        detailStat6Value.setText(((Integer)currentItem.getStats().get("strength")).toString());

        detailToCharacter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DApplication.setCurrentCharacter(0);
                account.equipItem(currentItem);
                startActivity(new Intent(DetailActivity.this, TabScreensActivity.class));
            }
        });

        detailToCharacter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DApplication.setCurrentCharacter(1);
                account.equipItem(currentItem);
                startActivity(new Intent(DetailActivity.this, TabScreensActivity.class));
            }
        });

        detailToCharacter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DApplication.setCurrentCharacter(2);
                account.equipItem(currentItem);
                startActivity(new Intent(DetailActivity.this, TabScreensActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });*/
    }
}
