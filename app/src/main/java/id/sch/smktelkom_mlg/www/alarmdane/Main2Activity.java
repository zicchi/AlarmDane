package id.sch.smktelkom_mlg.www.alarmdane;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ImageButton buttonmaps;
    private TextView Java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        Java = (TextView) findViewById(R.id.java_text);
        buttonmaps = (ImageButton) findViewById(R.id.buttonmaps);
        buttonmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri geoLocation = Uri.parse("geo:0,0?q=-6.870563, 107.594126(SMK Telkom Malang)?z=23");
                showMap(geoLocation);
            }

            //method showMap
            private void showMap(Uri geoLocation) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setData(geoLocation);
                if (mapIntent.resolveActivity(getPackageManager())
                        != null) startActivity(mapIntent);
            }
        });


        Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("https://www.udacity.com/learn/java"));
                startActivity(intent);
            }
        });
    }
}
