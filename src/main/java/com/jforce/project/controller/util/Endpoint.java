package com.jforce.project.controller.util;

/**
 * @author Iraz Şanlı
 */
public final class Endpoint {

    //ROOT
    public static final String API = "/api/v1";

    //BASE
    private static final String AUTH = API + "/auth";
    private static final String COMMON = API + "/common";

    private static final String EMPLOYEE = API + "/employee";
    private static final String ADMIN = API + "/admin";

    private Endpoint() {
    }

    //AUTH
    public static class Auth {
        public static final String VALIDATE = AUTH + "/validate";
        public static final String RESEND = AUTH + "/resend";

        public static final String SEND_FORGOT_PASSWORD = AUTH + "/sendForgotPassword";
        public static final String VALIDATE_FORGOT_PASSWORD = AUTH + "/validateForgotPassword";
    }

    //COMMON
    public static class Common {
        public static final String LOGIN = COMMON + "/login";
        public static final String LOGOUT = COMMON + "/logout";
    }

    //EMPLOYEE
    public static class Employee {
        public static final String ADD = EMPLOYEE + "/add";
        public static final String ADD_CARD = ADD + "/dailyWorkCard";
        public static final String ADD_PROJECT = ADD + "/project";

        public static final String SHOW = EMPLOYEE + "/show";
        public static final String SHOW_CARD = SHOW + "/dailyWorkCard/{id}";
        public static final String SHOW_CARDS = SHOW + "/myCards";

    }

    //ADMIN
    public static class Admin {
        public static final String ADD = ADMIN + "/add";
        public static final String ADD_USER = ADD + "/user";
        public static final String ADD_PROJECT = ADD + "/project";
        public static final String ADD_TEAMS = ADD + "/teams";

        public static final String SHOW_USERS = ADMIN + "/users";
        public static final String SHOW_USER = ADMIN + "/user/{userId}";

    }
}
