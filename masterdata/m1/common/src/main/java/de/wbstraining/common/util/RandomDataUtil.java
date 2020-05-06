package de.wbstraining.common.util;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public final class RandomDataUtil {

	private RandomDataUtil() {
		throw new AssertionError();
	}

	// API

	public static String randomEmail() {
		return randomAlphabetic(6) + "@" + randomAlphabetic(4) + ".com";
	}

	public static LocalDateTime randomLocalDateTime() {
		LocalTime t = LocalTime.MIN;
		int thisYear = LocalDate.now()
				.getYear();
		LocalDate d = LocalDate.ofEpochDay(ThreadLocalRandom.current()
				.nextInt(365))
				.withYear(thisYear);
		return LocalDateTime.of(d, t);
	}

}
