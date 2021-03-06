package Renderer;

import Base.Vector2D;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageRenderer implements Renderer {

    private BufferedImage image;
    private int width;
    private int height;

    public ImageRenderer(String path, int width, int height) {
        this.width = width;
        this.height = height;
        this.image = this.loadImage(path);
    }

    @Override
    public void render(Graphics graphics, Vector2D position) {
        graphics.drawImage(this.image, (int) position.x - this.width / 2, (int) position.y - this.height / 2, this.width, this.height, null);
    }

    //TAI SAO PHAI WIDTH/2, HEIGHT/2

    private BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}









//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
//public class Renderer.ImageRenderer {
//
//    private BufferedImage image;
//    private int width;
//    private int height;
//    private Color color;
//
//    public Renderer.ImageRenderer(String path, int width, int height) {
//        this.width = width;
//        this.height = height;
//        this.image = this.loadImage(path);
////        for (int i = 0; i < this.image.getWidth(); i++) {
////            for (int j = 0; j < this.image.getHeight(); j++) {
////                if (this.image.getRGB(i, j) == Color.WHITE.getRGB()) {
////                    this.image.setRGB(i, j, color.getRGB());
////                }
////            }
////        }
//    }
//
//    public void render(Graphics graphics, Base.Vector2D position) {
//        graphics.drawImage(this.image, (int) position.x, (int) position.y, this.width, this.height, null);
//    }
//
//    private BufferedImage loadImage(String path) {
//        try {
//            return ImageIO.read(new File(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
