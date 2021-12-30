package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Compras {

    public static final Target SEARCH = Target.the("Buscar").located(By.id("search_query_top"));
    public static final Target SHIRT = Target.the("Camisa").located(By.xpath("//img[@class='replace-2x img-responsive' and @src='http://automationpractice.com/img/p/1/1-home_default.jpg']"));
    public static final Target SIZE = Target.the("Talla").located(By.id("group_1"));
    public static final Target ADD = Target.the("Añadir").located(By.id("//*[@id=\"add_to_cart\"]/button"));


}
