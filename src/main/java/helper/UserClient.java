package helper;

import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static helper.Helper.getBaseSpec;
import static helper.Paths.USER_PATH;
import static io.restassured.RestAssured.given;


public class UserClient {

    // Логин пользователя
    public static ValidatableResponse userLogin(User user) {
        ValidatableResponse userLoginResponse = given()
                .spec(getBaseSpec())
                .and()
                .body(user)
                .post(USER_PATH + "/login")
                .then();
        return userLoginResponse;
    }


    // Метод удаления пользователя
    public void userDelete(User user) {
        // Отправляем запрос логина, что бы получить id
        Response responseLogin = given()
                .spec(getBaseSpec())
                .and()
                .body(user)
                .post(USER_PATH + "/login");


        AuthResponse authResponse = responseLogin.as(AuthResponse.class);

        // Отправляем запрос на удаление с использованием id
        Response responseDelete = given()
                .spec(getBaseSpec())
                .header(new Header("Authorization", authResponse.getAccessToken()))
                .and()
                //.body(responseLogin.getBody().print())
                .delete(USER_PATH + "/user");
    }


}
