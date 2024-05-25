package com.example.mcm10.RecyclerView;

public class Items {
    private  String title;
    private String date;

    private int image;

    public Items(String title, String date, int image){
        this.title = title;
        this.date = date;
        this.image = image;

    }

    @Override
    public String toString() {
        return "Items{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}