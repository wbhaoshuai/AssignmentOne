package com.example.assignmentone;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    // Define a unique identifier constant
    public static final int POSITION_FACILITIES = 0;
    public static final int POSITION_EVENTS = 1;
    public static final int POSITION_CLUBS = 2;
    public static final int POSITION_SUPPORT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickFacilities(View view){
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("POSITION", POSITION_FACILITIES);
        startActivity(intent);
    }

    public void onClickEvents(View view){
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("POSITION", POSITION_EVENTS);
        startActivity(intent);
    }

    public void onClickClubs(View view){
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("POSITION", POSITION_CLUBS);
        startActivity(intent);
    }

    public void  onClickSupport(View view){
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("POSITION", POSITION_SUPPORT);
        startActivity(intent);
    }
}