package com.example.pth_2115_baitapcanhan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CourseAdapter extends ArrayAdapter<Course> {

    public CourseAdapter(Context context, ArrayList<Course> courses) {
        super(context, 0, courses);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Inflate the layout if necessary
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.course_item, parent, false);
        }

        // Get the course item
        Course course = getItem(position);

        // Bind data to the views

        TextView nameTextView = convertView.findViewById(R.id.textViewCourseName);
        TextView descriptionTextView = convertView.findViewById(R.id.textViewCourseDescription);
        Button signUpButton = convertView.findViewById(R.id.buttonSignUp);
        ImageButton favoriteButton = convertView.findViewById(R.id.imageButtonFavorite);

        if (course != null) {
            nameTextView.setText(course.getName());
            descriptionTextView.setText(course.getDescription());

            // Set click listeners for buttons
            signUpButton.setOnClickListener(v ->
                    Toast.makeText(getContext(), "Signed up for " + course.getName(), Toast.LENGTH_SHORT).show()
            );

            favoriteButton.setOnClickListener(v ->
                    Toast.makeText(getContext(), course.getName() + " added to favorites!", Toast.LENGTH_SHORT).show()
            );
        }

        return convertView;
    }
}
