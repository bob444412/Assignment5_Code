package org.example;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class PlaywrightTest {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(
        new BrowserType.LaunchOptions().setHeadless(false)
      );

      BrowserContext context = browser.newContext();
      Page page = context.newPage();

      page.navigate("https://depaul.bncollege.com/");

      // Paste the recorded code here
      page.navigate("https://depaul.bncollege.com/");
      page.getByPlaceholder("Enter your search details (").click();
      page.getByPlaceholder("Enter your search details (").fill("sweater");
      page.getByPlaceholder("Enter your search details (").press("Enter");
      page.getByText("Men's Cutter & Buck Heather Charcoal DePaul Blue Demons Primary Logo Adapt Knit").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to Cart")).click();
      page.locator("label").filter(new Locator.FilterOptions().setHasText("S")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to Cart")).click();

    }
  }
}