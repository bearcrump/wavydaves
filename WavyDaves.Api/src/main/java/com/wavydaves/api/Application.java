package com.wavydaves.api;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


@RestController
@RequestMapping("/")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/zoned_date_time")
	public String getZonedDateTimeNow() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		return zonedDateTime.toString();
	}

	@GetMapping("/java_sql_timestamp")
	public String getJavaSqlTimestampNow() {
		Timestamp timestamp = Timestamp.valueOf(getJavaSqlTimestampNow());
		return timestamp.toString();
	}

	@PostMapping("/zoned_date_time")
    public String receiveZonedDateTime(@RequestBody ZonedDateTime zonedDateTime) {
        return "Received: " + zonedDateTime.toString();
    }

}
