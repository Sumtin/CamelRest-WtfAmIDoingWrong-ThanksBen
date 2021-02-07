package com.example.restdemo;


import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;


public class XmlStreamRoute extends RouteBuilder {
	public void configure() throws Exception {
//		restConfiguration()
//				.contextPath("/rest/*")
//				.apiContextPath("/api-doc")
//				.apiProperty("api.title", "Spring Boot Camel Postgres Rest API.")
//				.apiProperty("api.version", "1.0")
//				.apiProperty("cors", "true")
//				.apiContextRouteId("doc-api")
//				.bindingMode(RestBindingMode.xml);

		restConfiguration()
			.component("servlet")
			.port(8080)
			.host("localhost")
			.bindingMode(RestBindingMode.xml);

		rest()
				.get("/hello-world").route()
				.log("HELLO from GET!")
				.setBody(constant("HELLO!!!!!"))

//				.endRest()
//				.put("/").route()
//				.log("HELLO from PUT!")
//				.to("{{route.saveMessageToFile}}")
				.end();

//		from("{{route.saveMessageToFile}}")
//				.log("Received Body ${body}")
//				.to("file:target/messages/");
	}
}
