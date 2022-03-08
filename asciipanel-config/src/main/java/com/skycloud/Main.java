package com.skycloud;

import com.skycloud.asciiPanel.AsciiFont;
import com.skycloud.asciiPanel.AsciiPanel;
import com.skycloud.config.AsciiPanelConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.skycloud.config.AsciiPanelConfig.class);

        AsciiFont asciiFont = context.getBean("asciiFont", AsciiFont.class);
        System.out.println( "asciiFont: " + asciiFont.getFontFilename() + " " +
                asciiFont.getWidth() + " " + asciiFont.getHeight() );

        AsciiPanel asciiPanel = context.getBean("asciiPanel", AsciiPanel.class);
        System.out.println("asciiPanel: " + asciiPanel.getAsciiFont().getFontFilename() + " " +
                asciiPanel.getWidthInCharacters() + " " + asciiPanel.getHeightInCharacters());

        asciiPanel.write("Welcome to SKYCLOUD java-config");
        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
