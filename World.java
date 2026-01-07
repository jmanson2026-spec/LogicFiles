import java.util.ArrayList;

public class World {

    public ArrayList<Entity> pop = new ArrayList<Entity>();

    // input: none output: none effect: none
    public World() {}

    // input: e (Entity) output: none effect: none
    public void add(Entity e) {
        pop.add(e);
    }

    // input: none output: none effect: none
    public void update() {
        for (Entity e : pop) {
            e.update(this);
        }
    }
}
