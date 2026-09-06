package com.rushabh.designpatterns.structural.proxy;

public class ImageProxy implements Image{
    private String fileName;
    private HighResolutionImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("ImageProxy: Created for " + fileName + ". Real image not loaded yet.");
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImage(fileName);
        }
        realImage.display();
    }

    @Override
    public String getFilename() {
        return fileName;
    }
}
