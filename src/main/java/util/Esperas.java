package util;

import net.thucydides.core.pages.PageObject;

public class Esperas extends PageObject {

   public void tiempo(){

       waitFor(4).second();
   }
}
