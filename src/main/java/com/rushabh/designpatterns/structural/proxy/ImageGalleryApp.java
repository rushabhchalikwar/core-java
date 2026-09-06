package com.rushabh.designpatterns.structural.proxy;

public class ImageGalleryApp {
    public static void main(String[] args) {
        System.out.println("Application Started. Initializing image proxies for gallery...");

        Image image1 = new HighResolutionImage("photo1.jpg");
        System.out.println("Actual images loaded: " + image1.getFilename());

        System.out.println("Now displaying images in the gallery:");
        image1.display();


        System.out.println("\nNow creating a proxy for another image (photo2.png)...");
        Image image2 = new ImageProxy("photo2.png");
        System.out.println("Image is not loaded yet. Filename: " + image2.getFilename());
        image2.display(); // This will trigger the loading of the real image
    }
}
