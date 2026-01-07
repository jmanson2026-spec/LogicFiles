//written by Jessie Manson on Thursday, December 18, 2025
//problem statement: Implement Entity and make it abstract

public abstract class Entity {
    public String id;
    public Vec2 position;
    public boolean alive = true;

    // input: id (String), position (Vec2) output: none effect: none
    public Entity(String id, Vec2 position) {
        this.id = id; //note: could've used id = _id; but this is clearer to me!
        this.position = position;
    }

    // input: w (World) output: none effect: none
    public abstract void update(World w);
}
