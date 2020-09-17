package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebUTest {


    public static final net.serenitybdd.screenplay.targets.Target registrar = Target.the("boton").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final net.serenitybdd.screenplay.targets.Target nombre = Target.the("El Nombre").located(By.id("firstName"));
    public static final net.serenitybdd.screenplay.targets.Target apellido = Target.the("El apellido").located(By.id("lastName"));
    public static final net.serenitybdd.screenplay.targets.Target correo = Target.the("El correo").located(By.id("email"));
    public static final net.serenitybdd.screenplay.targets.Target mes = Target.the("El mes").located(By.id("birthMonth"));
    public static final net.serenitybdd.screenplay.targets.Target dia = Target.the("El dia").located(By.id("birthDay"));
    public static final net.serenitybdd.screenplay.targets.Target ano = Target.the("El ano").located(By.id("birthYear"));
    public static final net.serenitybdd.screenplay.targets.Target lenguaje = Target.the("El ").located(By.className("ui-select-search input-xs ng-valid ng-dirty ng-touched ng-empty"));
    public static final net.serenitybdd.screenplay.targets.Target nextlocation = Target.the("El ").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final net.serenitybdd.screenplay.targets.Target postal = Target.the("El ").located(By.id("zip"));
    public static final net.serenitybdd.screenplay.targets.Target nextdevices = Target.the("El ").located(By.xpath("//a[@class='btn btn-blue pull-right']//span"));
    public static final net.serenitybdd.screenplay.targets.Target nextlast = Target.the("El ").located(By.xpath("//a[@aria-label='Next - final step']"));
    public static final net.serenitybdd.screenplay.targets.Target password = Target.the("El ").located(By.id("password"));
    public static final net.serenitybdd.screenplay.targets.Target passwordconfir = Target.the("El ").located(By.id("confirmPassword"));
    public static final net.serenitybdd.screenplay.targets.Target check1 = Target.the("El ").located(By.cssSelector("main.registration section.col-md-8.col-lg-8.col-sm-12.col-xs-12:nth-child(3) div.container-fluid div.sign-up-form-container div.ui-view div:nth-child(1) form.form-group-box.user-form.ng-invalid.ng-invalid-required.ng-valid-validation-match.ng-dirty.ng-valid-parse.invalid:nth-child(1) div.row.col-xs-12:nth-child(6) label.input-check-box.signup-consent > span.checkmark.signup-consent__checkbox:nth-child(3)"));
    public static final net.serenitybdd.screenplay.targets.Target check2 = Target.the("El ").located(By.cssSelector("main.registration section.col-md-8.col-lg-8.col-sm-12.col-xs-12:nth-child(3) div.container-fluid div.sign-up-form-container div.ui-view div:nth-child(1) form.form-group-box.user-form.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-validation-match:nth-child(1) div.row.col-xs-12:nth-child(5) label.input-check-box.signup-consent > span.checkmark.signup-consent__checkbox.error:nth-child(4)"));
    public static final net.serenitybdd.screenplay.targets.Target complete = Target.the("El ").located(By.id("laddaBtn"));
    public static final net.serenitybdd.screenplay.targets.Target respuesta= Target.the("El ").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));





}
