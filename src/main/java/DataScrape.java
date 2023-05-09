import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

//separate class for HTMLUnit scrape as it needs main method not to blow up and I don't want it in my main lmfao
public class DataScrape {

    WebClient webClient = new WebClient();
    HtmlPage sizingGuidePage;

    public DataScrape() throws IOException {
        String url = "https://rockrun.com/blogs/the-flash-rock-run-blog/rock-climbing-shoe-sizing-guide";
        sizingGuidePage = getWebPage(url);
    }

    public HtmlPage getWebPage(String url) throws IOException {
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        return webClient.getPage(url);
    }


    public List<Shoe> parseGuideData() {
        HtmlTable table = (HtmlTable) sizingGuidePage.getByXPath("//table").get(1);
        List<Shoe> shoes = table.getBodies().get(0).getRows().stream()
                .map(row -> new Shoe(
                        row.getCell(0).getTextContent().trim(),
                        row.getCell(1).getTextContent().trim(),
                        row.getCell(2).getTextContent().trim(),
                        row.getCell(3).getTextContent().trim(),
                        row.getCell(4).getTextContent().trim(),
                        row.getCell(5).getTextContent().trim(),
                        row.getCell(6).getTextContent().trim()
                )).collect(Collectors.toList());
        return shoes;
    }

    public static void main(String[] args) throws IOException {

    }
}
