package com.example.tboy.frangranceperfume;

public class Perfume {
    private String title;
    private  String name;
    private  String type;
    private  String size;
    private  int image;

    public Perfume(String title, String name, String type, String size, int image) {
        this.title = title;
        this.name = name;
        this.type = type;
        this.size = size;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getImage() {
        return image;
    }
}
