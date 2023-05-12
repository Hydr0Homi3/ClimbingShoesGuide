package data;

import biz.model.Shoe;

import java.util.List;

public class ShoeRepository {
    DataScrape dataScrape = new DataScrape();
    List<Shoe> shoes = dataScrape.parseGuideData();

    public List<Shoe> getShoes() {
        return shoes;
    }

    public void showAllShoes() {
        if (shoes.size() > 0) {
            for (Shoe shoe : shoes) {
                System.out.println(shoe);
            }
        }
    }
}
