package helper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static com.codeborne.selenide.Selenide.open;
import static io.restassured.http.ContentType.JSON;

public class Helper {
    public static final String BASE_URL= "https://stellarburgers.nomoreparties.site/";

    public static RequestSpecification getBaseSpec(){
        return new RequestSpecBuilder()
                .setContentType(JSON)
                .setBaseUri(BASE_URL)
                .build();
    }

}
