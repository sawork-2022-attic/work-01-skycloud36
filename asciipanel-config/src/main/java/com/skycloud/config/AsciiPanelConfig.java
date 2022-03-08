package com.skycloud.config;

import com.skycloud.asciiPanel.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiPanelConfig {
    @Bean
    public AsciiFont asciiFont() {
        return new AsciiFont();
    }

    @Bean
    public int width(){
        return 15;
    }

    @Bean
    public int height(){
        return 15;
    }

    @Bean
    public String fontFilename(){
        return "png_resources/talryth_square_15x15.png";
    }

    @Bean
    public AsciiPanel asciiPanel(){
        return new AsciiPanel(80, 40);
    }

}
