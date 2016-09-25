package controllers;


import com.google.inject.Inject;
import com.google.inject.Singleton;
import dao.UserDao;
import forms.UserRegistrationForm;
import ninja.Result;
import ninja.Results;
import ninja.session.Session;
import ninja.validation.FieldViolation;
import ninja.validation.JSR303Validation;
import ninja.validation.Validation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Inject
    private UserDao userDao;

    public Result registerUserForm() {
        LOGGER.debug("registration form");
        return Results.html();
    }

    public Result registerConfirmation() {
        return Results.html();
    }

    public Result registerUser(@JSR303Validation UserRegistrationForm form, Session session, Validation validation) {
        LOGGER.debug("firstName: {}", form.getFirstName());
        LOGGER.debug("lastName: {}", form.getLastName());

        if (validation.hasBeanViolations()){
            for (FieldViolation fieldViolation: validation.getFieldViolations()){
                LOGGER.debug("wwwww violites here: {}", fieldViolation.field);
            }
        }

        return Results.redirect("/register-confirm/");
    }

    public Result login(){
        return Results.html();
    }


}
