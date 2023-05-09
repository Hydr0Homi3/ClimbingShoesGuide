import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        DataScrape dataScrape = new DataScrape();
        List<Shoe> shoes = dataScrape.parseGuideData();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your foot volume (High, Medium, Low): ");
        String footVolume = scanner.nextLine();
        System.out.println("Enter your foot type (Classic, Square, Centre): ");
        String footType = scanner.nextLine();

        for (Shoe shoe : shoes) {
            if (shoe.getFootVolume().toLowerCase().contains(footVolume) && shoe.getFootType().toLowerCase().equalsIgnoreCase(footType)) {
                System.out.println(shoe);
            }
        }
    }
}
