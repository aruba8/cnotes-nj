package forms;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class UserRegistrationForm {

    @NotBlank
    @Max(80)
    @Min(3)
    private String firstName;

    @NotBlank
    @Max(80)
    @Min(3)
    private String lastName;

    @Max(80)
    private String middleName;

    @Email
    @NotBlank
    @Max(100)
    private String email;

    @NotBlank
    @Max(256)
    @Min(3)
    private String password;

    @NotBlank
    @Max(256)
    @Min(3)
    private String passwordConfirm;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
