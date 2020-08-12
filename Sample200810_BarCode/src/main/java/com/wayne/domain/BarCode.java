package com.wayne.domain;

public class BarCode {
    private int barCodeID;
    private String color;
    private String size;
    private String imageUrl;

    @Override
    public String toString() {
        return "BarCode{" +
                "barCodeID=" + barCodeID +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public int getBarCodeID() {
        return barCodeID;
    }

    public void setBarCodeID(int barCodeID) {
        this.barCodeID = barCodeID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}