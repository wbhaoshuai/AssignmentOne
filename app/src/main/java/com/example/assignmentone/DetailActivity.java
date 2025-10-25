package com.example.assignmentone;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 0:Facilities, 1:Events, 2:Clubs, 3:Support
        int itemIndex = getIntent().getIntExtra("POSITION", 0);

        String[] imageNames = getResources().getStringArray(R.array.string_array_images);
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);

        String[] shortTitles = {"Facilities", "Events", "Clubs", "Support"};

        ImageView detailImageView = findViewById(R.id.detailImageView);
        TextView itemTextView = findViewById(R.id.ItemTextView);
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView contentTextView = findViewById(R.id.contentTextView);

        itemTextView.setText(shortTitles[itemIndex]);
        titleTextView.setText(titles[itemIndex].trim());
        contentTextView.setText(contents[itemIndex].trim());

        String imageName = imageNames[itemIndex].trim();
        int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        detailImageView.setImageResource(imageResId);
    }
}