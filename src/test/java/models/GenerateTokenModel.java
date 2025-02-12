package models;


import lombok.Data;

@Data
public class GenerateTokenModel {

    String token;
    String expires;
    String status;
    String result;
}
