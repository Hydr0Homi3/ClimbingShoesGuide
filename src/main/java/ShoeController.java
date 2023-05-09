import java.util.List;

public class ShoeController {

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
}
