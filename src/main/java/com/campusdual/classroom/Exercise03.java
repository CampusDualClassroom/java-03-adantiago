package com.campusdual.classroom;

public class Exercise03 {

    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }

    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

    public static void checkUser(String user, String pass) {
        String validUser = "Sebas";
        String validPass = "sebas01";

        if (user.equals(validUser) && pass.equals(validPass)) {
            System.out.println(greetings(user));
        } else {
            System.out.println(error(validUser));
        }
    }

    public static void main(String[] args) {
    }
}
