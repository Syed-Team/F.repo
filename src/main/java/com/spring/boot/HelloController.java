package com.spring.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "\n" +
		"Assalamu alaikum bhaijaan, I am  from Spring!<br> " +
			"Sing Out Loud Children’s Songs<br>" +
		"LYRICS:<br>" +
			"TWINKLE, TWINKLE, LITTLE STAR<br>" +
			"Twinkle, twinkle, little star,<br>" +
			 "how I wonder what you are.<br>" +
			"<br>" +
			 "Up above the world so high,<br>" +
			"like a diamond in the sky. <br>" +
			"Twinkle, twinkle, little star,<br>" + 
			"<br>" +
			"how I wonder what you are.<br>" +
			 "When the blazing sun is set,<br>" + 
			"and the grass with dew is wet.<br> " +
			"<br>" +
			"Then you show your little light,<br> " +
			"twinkle, twinkle all the night. <br>" +
			"Twinkle, twinkle little star, <br>" +
			"<br>" +
			"how I wonder what you are.<br>" +
			"Then the traveler in the dark<br>" + 
			"thanks you for your tiny spark. <br>" +
			"<br>" +
			"How could he see where to<br>" +
			"go if you did not twinkle so? <br>" +
			"Twinkle, twinkle little star, <br>" +
			"<br>" +
			"how I wonder what you are.<br>" +
			"As your bright and tiny spark lights <br>" +
			"the traveler in the dark, <br>" +
			" <br>"  +
			"though I know not what you are, <br>" +
			"twinkle, twinkle, little star. <br>" +
			"Twinkle, twinkle, little star, <br>" +
			"how I wonder what you are.<br>";
    }
}
