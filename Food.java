public class Food extends Entity {

    private int rottenness = 0;

    // input: id (String), position (Vec2) output: none effect: none
    public Food(String id, Vec2 position) {
        super(id, position);
    }

    // input: none output: rottenness (int) effect: none
    public int getRottenness() {
        return rottenness;
    }

    // input: w (World) output: none effect: rottenness increases by 1
    public void update(World w) {
        rottenness++;
    }
}
