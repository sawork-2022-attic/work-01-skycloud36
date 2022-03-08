package com.skycloud;
import com.skycloud.asciiPanel.AsciiFont;
import com.skycloud.asciiPanel.AsciiPanel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");
        AsciiFont asciiFont = context.getBean(AsciiFont.class);
        AsciiFont taffer = AsciiFont.TAFFER_10x10;
        System.out.println("AsciiFont_Default: " + asciiFont.getFontFilename() + " "
                + asciiFont.getWidth() + " " + asciiFont.getHeight());
        System.out.println("AsciiFont_TAFFER: " + taffer.getFontFilename() + " "
                + taffer.getWidth() + " " + taffer.getHeight() );
        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);
        System.out.println("AsciiPanel_Default: " + asciiPanel.getAsciiFont().getFontFilename() + " "
                + asciiPanel.getWidthInCharacters() + " " + asciiPanel.getHeightInCharacters());
        AsciiPanel taff = new AsciiPanel(80, 24, taffer);
        System.out.println("Asciipanel_TAFFER: " + taff.getAsciiFont().getFontFilename() + " "
                + taff.getWidthInCharacters() + " " + taff.getHeightInCharacters());


        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        asciiPanel.write("Welcome SKYCLOUD annotation");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
