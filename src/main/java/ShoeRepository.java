import java.util.List;

public class ShoeRepository {
    private List<Shoe> shoes;

    public List<Shoe> getShoes() {
        return shoes;
    }
    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }

    public void deleteShoe(int index) {
        shoes.remove(shoes.remove(index));
    }

    public void deleteAllShoes() {
        shoes.clear();
    }

    public void showAllShoes() {
        if (shoes.size() > 0) {
            for (Shoe shoe : shoes) {
                System.out.println(shoe);
            }
        }
    }
}
