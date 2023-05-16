package biz;

import biz.model.Shoe;
import biz.website_search.Check8a;
import biz.website_search.CheckPolarsport;
import data.ShoeRepository;

import java.util.List;

public class ShoeService {

    private ShoeRepository shoeRepository = new ShoeRepository();

    private Check8a check8a = new Check8a();

    private CheckPolarsport checkPolarsport = new CheckPolarsport();


    public List<Shoe> getShoes() {
        return shoeRepository.getShoes();
    }

    public void showAllShoes() {
        shoeRepository.showAllShoes();
    }
    public void findAShoe(String footVolume, String footType) {
        List<Shoe> shoes = shoeRepository.getShoes();
        for (Shoe shoe : shoes) {
            if (shoe.getFootVolume().toLowerCase().contains(footVolume) && shoe.getFootType().toLowerCase().equalsIgnoreCase(footType)) {
                System.out.println(shoe);
            }
        }
    }

    public void checkShoeOn8A (String brandName, String model, String size) {
        check8a.checkShoesOn8A(brandName, model, size);
    }

    public void checkShoesOnPolarsport(String brandName, String model, String size) {
        checkPolarsport.checkShoesOnPolarsport(brandName, model, size);
    }
}
