package dto;

import Application.annotation.ValidatePhone;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class User {

    @NotNull(message = "name null")
    private String name;

    @Min(value = 19, message = "min is 19")
    private Integer age;

    @Email
    private String email;

    @ValidatePhone
    private String phoneNumber;

}
