package de.wbstraining.masterdata.util;

public final class MasterdataMappings {

	public static final class Plural {
		public static final String USERS = "users";
		public static final String PRIVILEGES = "privileges";
		public static final String ROLES = "roles";
		public static final String COMPUTERS = "computers";
		public static final String PROBES = "proben";
//	Lotto Projekt
		public static final String GEBUEHRS = "gebuehren";
		public static final String ADRESSES = "adressen";
		public static final String BANKVERBINDUNGS = "bankverbindungen";
		public static final String GEWINNKLASSES = "gewinnklassen";
		public static final String GEWINNKLASSEZIEHUNGQUOTES = "gewinnklasseziehungsquoten";
		public static final String GROUPS = "groups";
		public static final String JACKPOTS = "jackpots";
		public static final String KUNDES = "kunden";
		public static final String LOTTOSCHEINS = "lottoscheine";
		public static final String LOTTOSCHEINZIEHUNGS = "lottoscheinziehungen";
		public static final String LOTTOSCHEINZIEHUNG6AUS49S = "lottoscheinziehungen6aus49";
		public static final String SPIELS = "spiele";
		public static final String USERROLES = "userroles";
		public static final String USERSS = "userss";
		public static final String USERS2S = "users2";
		public static final String ZIEHUNGS = "ziehungen";
	}

	public static final class Singular {
		public static final String USER = "user";
		public static final String PRIVILEGE = "privilege";
		public static final String ROLE = "role";
		public static final String COMPUTER = "computer";
		public static final String PROBE = "probe";
//		Lotto Projekt
		public static final String GEBUEHR = "gebuehr";
		public static final String ADRESSE = "adresse";
		public static final String BANKVERBINDUNG = "bankverbindung";
		public static final String GEWINNKLASSE = "gewinnklasse";
		public static final String GEWINNKLASSEZIEHUNGQUOTE = "gewinnklasseziehungsquote";
		public static final String GROUP = "groups";
		public static final String JACKPOT = "jackpot";
		public static final String KUNDE = "kunde";
		public static final String LOTTOSCHEIN = "lottoschein";
		public static final String LOTTOSCHEINZIEHUNG = "lottoscheinziehung";
		public static final String LOTTOSCHEINZIEHUNG6AUS49 = "lottoscheinziehung6aus49";
		public static final String SPIEL = "spiel";
		public static final String USERROLE = "userrole";
		public static final String USERS = "users";
		public static final String USERS2 = "users2";
		public static final String ZIEHUNG = "ziehung";
	}

	public static final class Hateoas {
		private static final String HATEOAS = "hateoas/";

		public static final String USER = HATEOAS + Plural.USERS;
		public static final String PRIVILEGE = HATEOAS + Plural.PRIVILEGES;
		public static final String ROLES = HATEOAS + Plural.ROLES;
		public static final String COMPUTERS = HATEOAS + Plural.COMPUTERS;
		public static final String PROBES = HATEOAS + Plural.PROBES;
//		Lotto Projekt
		public static final String GEBUEHRS = HATEOAS + Plural.GEBUEHRS;
		public static final String ADRESSES = HATEOAS + Plural.ADRESSES;
		public static final String BANKVERBINDUNGS = HATEOAS
			+ Plural.BANKVERBINDUNGS;
		public static final String GEWINNKLASSES = HATEOAS + Plural.GEWINNKLASSES;
		public static final String GEWINNKLASSEZIEHUNGQUOTES = HATEOAS
			+ Plural.GEWINNKLASSEZIEHUNGQUOTES;
		public static final String GROUPS = HATEOAS + Plural.GROUPS;
		public static final String JACKPOTS = HATEOAS + Plural.JACKPOTS;
		public static final String KUNDES = HATEOAS + Plural.KUNDES;
		public static final String LOTTOSCHEINS = HATEOAS + Plural.LOTTOSCHEINS;
		public static final String LOTTOSCHEINZIEHUNGS = HATEOAS
			+ Plural.LOTTOSCHEINZIEHUNGS;
		public static final String LOTTOSCHEINZIEHUNG4AUS49S = HATEOAS
			+ Plural.LOTTOSCHEINZIEHUNG6AUS49S;
		public static final String SPIELS = HATEOAS + Plural.SPIELS;
		public static final String USERROLES = HATEOAS + Plural.USERROLES;
		public static final String USERSS = HATEOAS + Plural.USERSS;
		public static final String USERS2S = HATEOAS + Plural.USERS2S;
		public static final String ZIEHUNGS = HATEOAS + Plural.ZIEHUNGS;
	}

	public static final String AUTHENTICATION = "authentication";

	private MasterdataMappings() {
		throw new AssertionError();
	}

	// API

}
