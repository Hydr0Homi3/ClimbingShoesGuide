import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        WebClient webClient = new WebClient();
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        HtmlPage sizingGuidePage = webClient.getPage("https://rockrun.com/blogs/the-flash-rock-run-blog/rock-climbing-shoe-sizing-guide");
        List<Shoe> shoes = parseGuideData(sizingGuidePage);

        for (Shoe shoe : shoes) {
            System.out.println(shoe);
        }
    }

    private static List<Shoe> parseGuideData(HtmlPage sizingGuidePage) {
        HtmlTable table = (HtmlTable) sizingGuidePage.getByXPath("//table").get(1);
        List<Shoe> shoes = table.getBodies().get(0).getRows().stream()
                .map(row -> new Shoe(
                        row.getCell(0).getTextContent(),
                        row.getCell(1).getTextContent(),
                        row.getCell(2).getTextContent(),
                        row.getCell(3).getTextContent(),
                        row.getCell(4).getTextContent(),
                        row.getCell(5).getTextContent(),
                        row.getCell(6).getTextContent()
                )).collect(Collectors.toList());
        return shoes;
    }
}
