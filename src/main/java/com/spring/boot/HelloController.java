package com.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "\n" +
		"Assalamu alaikum bhaijaan, I am  from Spring!\n " +
			"Sing Out Loud Children’s Songs\n" +
		"LYRICS:<br>" +
			"TWINKLE, TWINKLE, LITTLE STAR<br>" +
			"Twinkle, twinkle, little star,<br>" +
			 "how I wonder what you are.<br>" +
			"\n" +
			 "Up above the world so high,\n" +
			"like a diamond in the sky. \n" +
			"Twinkle, twinkle, little star,\n" + 
			"\n" +
			"how I wonder what you are.\n" +
			 "When the blazing sun is set,\n" + 
			"and the grass with dew is wet.\n " +
			"\n" +
			"Then you show your little light,\n " +
			"twinkle, twinkle all the night. \n" +
			"Twinkle, twinkle little star, \n" +
			"\n" +
			"how I wonder what you are.\n" +
			"Then the traveler in the dark\n" + 
			"thanks you for your tiny spark. \n" +
			"\n" +
			"How could he see where to\n" +
			"go if you did not twinkle so? \n" +
			"Twinkle, twinkle little star, \n" +
			"\n" +
			"how I wonder what you are.\n" +
			"As your bright and tiny spark lights \n" +
			"the traveler in the dark, \n" +
			" \n"  +
			"though I know not what you are, \n" +
			"twinkle, twinkle, little star. \n" +
			"Twinkle, twinkle, little star, \n" +
			"how I wonder what you are.\n";
    }
}
