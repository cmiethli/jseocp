package de.wbstraining.masterdata.common;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.time.LocalDateTime;

import com.google.common.collect.Sets;

import de.wbstraining.common.util.RandomDataUtil;
import de.wbstraining.masterdata.persistence.model.Privilege;
import de.wbstraining.masterdata.persistence.model.Probe;
import de.wbstraining.masterdata.persistence.model.Role;
import de.wbstraining.masterdata.persistence.model.User;

public class FixtureEntityFactory {

	private FixtureEntityFactory() {
		throw new AssertionError();
	}

	// Probe
	public static Probe createNewProbe() {
		return createNewProbe(RandomDataUtil.randomLocalDateTime(),
				RandomDataUtil.randomProbeMesswert());
	}

	public static Probe createNewProbe(final LocalDateTime zeitpunkt,
			final Integer messwert) {
		return new Probe(zeitpunkt, messwert);
	}

	// User

	public static User createNewUser() {
		return createNewUser(randomAlphabetic(8), randomAlphabetic(8));
	}

	public static User createNewUser(final String name, final String pass) {
		return new User(name, pass, Sets.<Role>newHashSet());
	}

	// role

	public static Role createNewRole() {
		return createNewRole(randomAlphabetic(8));
	}

	public static Role createNewRole(final String name) {
		return new Role(name, Sets.<Privilege>newHashSet());
	}

	// privilege

	public static Privilege createNewPrivilege() {
		return createNewPrivilege(randomAlphabetic(8));
	}

	public static Privilege createNewPrivilege(final String name) {
		return new Privilege(name);
	}

}
