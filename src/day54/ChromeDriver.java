package day54;

public class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigate to " + url + " using Chrome Browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximazing Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }
}
