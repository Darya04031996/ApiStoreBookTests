package api;
import models.GenerateTokenModel;
import specs.ApiSpec;
import models.CredentialsModel;
import models.LoginResponseModel;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;

public class AuthorizationApi {

    public LoginResponseModel login(CredentialsModel credentials){

        return given()
                .body(credentials)
                .contentType(JSON)
                .when()
                .post("/Account/v1/Login")
                .then()
                .spec(ApiSpec.successResponseSpec)
                .extract().as(LoginResponseModel.class);
    }
    public GenerateTokenModel generateToken (CredentialsModel credentials){

        return given()
                .body(credentials)
                .contentType(JSON)
                .when()
                .post("/Account/v1/GenerateToken")
                .then()
                .spec(ApiSpec.successResponseSpec)
                .extract().as(GenerateTokenModel.class);
    }
}
