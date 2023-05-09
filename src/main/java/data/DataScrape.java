package data;

import biz.model.Shoe;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class DataScrape {
    private WebClient webClient = new WebClient();
    private HtmlPage sizingGuidePage;

    public DataScrape() {
        String url = "https://rockrun.com/blogs/the-flash-rock-run-blog/rock-climbing-shoe-sizing-guide";
        sizingGuidePage = getWebPage(url);
    }

    public HtmlPage getWebPage(String url) {
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        try {
            return webClient.getPage(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
}
