package com.example.pth_2115_baitapcanhan;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class CourseListActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_list); // Use the XML layout

        // Initialize the ListView
        ListView listView = findViewById(R.id.listview);

        // Prepare data for the ListView
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course("Mathematics", "Learn algebra, geometry, and calculus.", R.drawable.home_ic_maths));
        courseList.add(new Course("Science", "Explore physics, chemistry, and biology.", R.drawable.home_ic_biology));
        courseList.add(new Course("History", "Dive into world history and ancient civilizations.", R.drawable.home_ic_geography));

        // Create and set the adapter
        CourseAdapter adapter = new CourseAdapter(this, courseList);
        listView.setAdapter(adapter);
    }

}
