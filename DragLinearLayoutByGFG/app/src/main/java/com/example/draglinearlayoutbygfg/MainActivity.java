package com.example.draglinearlayoutbygfg;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.jmedeisis.draglinearlayout.DragLinearLayout;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// below lines is to initialize our Drag linear layout
        DragLinearLayout dragLayout = findViewById(R.id.container);

        for(int i=0; i<dragLayout.getChildCount();i++){
            // below is the child inside dragger layout
            View chile = dragLayout.getChildAt(i);
            // below line will set all children draggable
            // except the header layout.
            // the child is its own drag handle.
            dragLayout.setViewDraggable(child,child);
        }
    }
}