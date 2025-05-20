package TestScripts;

import Data.Methods;

public class midocTestScript {
    public static void main(String[] args) throws InterruptedException {
        Methods obj = new Methods();

        obj.OpenApplication();
        obj.OpenBrowser();
        obj.CloseApplication();
    }
}
