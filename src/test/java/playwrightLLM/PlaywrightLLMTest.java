package playwrightLLM;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Test;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

public class PlaywrightLLMTest {

    @Test
    void testSearchFilterAddToCart() {
        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions().setHeadless(true)
            );

            BrowserContext context = browser.newContext(
                new Browser.NewContextOptions()
                    .setRecordVideoDir(Paths.get("videos/"))
                    .setRecordVideoSize(1280, 720)
);
            Page page = context.newPage();

            // Step 1: Go to bookstore
            page.navigate("https://depaul.bncollege.com/");

            // Step 2: Search for earbuds
            page.getByPlaceholder("Enter your search details").fill("earbuds");
            page.getByPlaceholder("Enter your search details").press("Enter");

            // Step 3: Click first product (simplified AI behavior)
            page.locator("a:has-text('Earbuds')").first().click();

            // Step 4: Add to cart
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to Cart")).click();

            // Step 5: Open cart
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Cart")).click();

            // Step 6: Verify cart has item
            String cartText = page.content();
            assertTrue(cartText.contains("1"), "Cart should contain 1 item");

            context.close();
            browser.close();
        }
    }
}