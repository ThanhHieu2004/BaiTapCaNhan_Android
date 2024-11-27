package com.example.pth_2115_baitapcanhan;

public class Course {
    private String name;
    private String description;
    private int imageResId;

    public Course(String name, String description, int imageResId) {
        this.name = name;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}
