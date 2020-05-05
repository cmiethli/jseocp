package de.wbstraining.masterdata.util;

public final class MasterdataMappings {

    public static final class Plural {
        public static final String USERS = "users";
        public static final String PRIVILEGES = "privileges";
        public static final String ROLES = "roles";
        public static final String COMPUTERS = "computers";
    }

    public static final class Singular {
        public static final String USER = "user";
        public static final String PRIVILEGE = "privilege";
        public static final String ROLE = "role";
        public static final String COMPUTER = "computer";
    }

    public static final class Hateoas {
        private static final String HATEOAS = "hateoas/";

        public static final String USER = HATEOAS + Plural.USERS;
        public static final String PRIVILEGE = HATEOAS + Plural.PRIVILEGES;
        public static final String ROLES = HATEOAS + Plural.ROLES;
        public static final String COMPUTERS = HATEOAS + Plural.COMPUTERS;
    }

    public static final String AUTHENTICATION = "authentication";

    private MasterdataMappings() {
        throw new AssertionError();
    }

    // API

}
