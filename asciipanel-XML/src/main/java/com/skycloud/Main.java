package com.skycloud;

import com.skycloud.asciiPanel.AsciiFont;
import com.skycloud.asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        AsciiFont asciiFont = context.getBean("asciiFont", AsciiFont.class);
        System.out.println( "asciiFont: " + asciiFont.getFontFilename() + " " +
                asciiFont.getWidth() + " " + asciiFont.getHeight() );

        AsciiPanel asciiPanel = context.getBean("asciiPanel", AsciiPanel.class);
        System.out.println("asciiPanel: " + asciiPanel.getAsciiFont().getFontFilename() + " " +
                asciiPanel.getAsciiFont().getWidth() + " " + asciiPanel.getAsciiFont().getHeight());

        asciiPanel.write("Welcome to SKYCLOUD homework");
        JFrame jFrame = new JFrame();
        jFrame.add(asciiPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
