package helper;

public class Credentials {
    public static User getValidUserCredentials() {
        User user = new User("Соня", "sonic@gmail.com", "123456");

        return user;
    }


    public static User getUserCredentialsWithInvalidPassword() {
        User user = new User("Соня", "sonic@gmail.com", "12345");

        return user;
    }


}
