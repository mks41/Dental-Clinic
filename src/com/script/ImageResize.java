package com.script;

import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.Icon;

public class ImageResize {

    public static ImageIcon resizeIcon(Icon i, int width, int height) {
        ImageIcon icon = (ImageIcon)i;
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
