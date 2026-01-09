public class Main5 {
    // input: none output: prints "passed: N" effect: runs tests
    public static void main(String[] args) {
        int pass = 0; 
        Vec2 origin = new Vec2(0, 0);
        Entity x = new Food("Joe", origin);

        // test 1: alive defaults to true
        // would fail for inferior code if alive wasn't initialized to true in Entity
        if (x.alive == true) pass++;

        // test 2: id is set correctly ("Joe")
        // would fail for inferior code if constructor doesn't store _id or Food forgets super(...)
        if (x.id.equals("Joe")) pass++;

        // test 3: position is set to the same Vec2 object we passed in
        // would fail for inferior code if constructor ignores _position or creates a different Vec2
        if (x.position == origin) pass++;

        // test 4: Food can rot (rottenness increases after update)
        // would fail for inferior code if Food.update doesn't increment or rottenness resets
        Food f = (Food) x;
        int before = f.getRottenness();
        x.update(new World());
        int after = f.getRottenness();
        if (after == before + 1) pass++;

        // test 5: World.update() actually causes rotting (calls update on entities in pop)
        // would fail for inferior code if World.update forgets the loop or doesn't call e.update(this)
        World w = new World();
        Food f2 = new Food("Snack", new Vec2(5, 6));
        w.add(f2);
        int r0 = f2.getRottenness();
        w.update();
        int r1 = f2.getRottenness();
        if (r1 == r0 + 1) pass++;

        // test 6: Multiple world updates accumulate rottenness (not just set to 1)
        // would fail for inferior code if update sets rottenness = 1 every time (instead of ++)
        w.update();
        w.update();
        int r3 = f2.getRottenness();
        if (r3 == r0 + 3) pass++;

        System.out.println("passed: " + pass + "/6");
        // test 7: prints out the display to make sure displaying the world works :)
        display.displayworld(w);
    }
}
