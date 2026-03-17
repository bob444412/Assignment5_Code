package playwrightTraditional;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import java.nio.file.Paths;

public class PlaywrightTest {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(false)
            );

            BrowserContext context = browser.newContext(
                    new Browser.NewContextOptions()
                            .setRecordVideoDir(Paths.get("target/videos/"))
                            .setRecordVideoSize(1280, 720)
            );

            Page page = context.newPage();

            
            page.navigate("https://depaul.bncollege.com/");

            
            page.getByPlaceholder("Enter your search details").click();
            page.getByPlaceholder("Enter your search details").fill("earbuds");
            page.getByPlaceholder("Enter your search details").press("Enter");

            
            page.getByText("Brand").click();
            page.getByLabel("JBL").click();

            page.getByText("Color").click();
            page.getByLabel("Black").click();

            page.getByText("Price").click();
            page.getByLabel("Over $50").click();

            
            page.getByText("JBL Quantum True Wireless Noise Cancelling").click();

           
            assert page.locator("h1").textContent().contains("JBL");

            
            page.getByRole(AriaRole.BUTTON,
                    new Page.GetByRoleOptions().setName("Add to Cart")).click();

            
            assert page.locator("text=1 Items").isVisible();

            // TEST CASE 2
            page.getByRole(AriaRole.LINK,
                    new Page.GetByRoleOptions().setName("Cart")).click();

            assert page.locator("text=Your Shopping Cart").isVisible();
            assert page.locator("text=JBL").isVisible();
            assert page.locator("text=$149.98").isVisible();

            
            page.getByText("FAST In-Store Pickup").click();

           
            page.getByPlaceholder("Promo Code").fill("TEST");
            page.getByText("APPLY").click();

            
            assert page.locator("text").isVisible();

           
            page.getByText("PROCEED TO CHECKOUT").click();

            // TEST CASE 3
            assert page.locator("text=Create Account").isVisible();
            page.getByText("Proceed as Guest").click();

            //TEST CASE 4
            page.getByPlaceholder("First Name").fill("Veeksha");
            page.getByPlaceholder("Last Name").fill("P");
            page.getByPlaceholder("Email").fill("test@email.com");
            page.getByPlaceholder("Phone").fill("1234567890");

            page.getByText("CONTINUE").click();

            //TEST CASE 5
            assert page.locator("text=Pickup").isVisible();
            assert page.locator("text=DePaul").isVisible();

            page.getByText("CONTINUE").click();

            // TEST CASE 6
            assert page.locator("text=Total").isVisible();

            page.getByText("BACK TO CART").click();

            // TEST CASE 7
            page.getByText("Remove").click();

            assert page.locator("text=empty").isVisible();

            context.close();
            browser.close();

        }
    }
}