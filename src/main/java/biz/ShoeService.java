package biz;

import biz.model.Shoe;
import data.ShoeRepository;

import java.util.List;

public class ShoeService {

    private ShoeRepository shoeRepository = new ShoeRepository();


    public List<Shoe> getShoes() {
        return shoeRepository.getShoes();
    }

    public void addShoe(Shoe shoe) {
        shoeRepository.addShoe(shoe);
    }

    public void deleteShoe(int index) {
        shoeRepository.deleteShoe(index);
    }

    public void deleteAllShoes() {
        shoeRepository.deleteAllShoes();
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
}
