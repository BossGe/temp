package java8ppt.time.demo1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;

public class ShowTime {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		
		//System.out.println(ZoneId.getAvailableZoneIds());
		//ZoneId zoneId = ZoneId.of("Asia/Shanghai");
		ZoneId zoneId = ZoneId.of("Asia/Aden");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
		System.out.println(zonedDateTime);
		
		
		Duration duration = Duration.between(LocalTime.now(), time);
		System.out.println(duration.getSeconds());
		
		Period period = Period.between(LocalDate.now(), LocalDate.now().plusDays(5));
		System.out.println(period.getDays());
		
		
	}

}
