package com.example.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.camel.main.Main;


@SpringBootApplication
public class RestApiDemoApplication  {

		/**
		 * A main() so we can easily run these routing rules in our IDE
		 */
		public static void main(String... args) throws Exception {
//			Main main = new Main();
//			main.configure().addRoutesBuilder(new XmlStreamRoute());
//			main.run(args);
			SpringApplication.run(RestApiDemoApplication.class, args);
		}


}
