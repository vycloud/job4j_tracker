package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() { }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("### Error info ###");
        System.out.println("Is active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error01 = new Error();
        error01.printInfo();
        Error error02 = new Error(true, 401, "Unauthorized");
        error02.printInfo();
        Error error03 = new Error(false, 200, "OK");
        error03.printInfo();
    }
}
