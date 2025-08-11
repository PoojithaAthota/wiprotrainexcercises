package com.wipro.threads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) {

        String sourcePath = "C:\\Users\\LENOVO\\Screenshot (131).png";
        String destinationPath = "C:\\Users\\LENOVO\\copy.jpg";

        try (
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("Image copied successfully from:");
            System.out.println(sourcePath);
            System.out.println("to");
            System.out.println(destinationPath);
        } catch (IOException e) {
            System.out.println("Error copying image: " + e.getMessage());
        }
    }
}

