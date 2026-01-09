public class display {
    public static void printchar(char[][] my) {
         String v = "";
         for(char[] a:my) {
             for(int x=0; x<a.length; x++) {
                 if(x==0) v = v + "[";
                 if(x!=a.length-1) v = v + a[x] + " ";
                 if(x==a.length-1) v = v + a[x] + "]";
             }
         System.out.println(v);
         v = "";
         }
    }

    public static char itemid(Entity name) {
        char item;
        String id = name.id;
        if(id.equals("Snack")) item = (char) 'S';
        else if(id.equals("Joe")) item = 'J';
        else item = '0';
        return item;
    }
    public static void displayworld(World w) {
        char[][] cc = {
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'},
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'},
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'},
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'},
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'},
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'},
            {'\s', '\s', '\s', '\s', '\s', '\s', '\s'}
        };
        for(Entity z:w.pop) {
            double posX = z.position.x;
            double posY = z.position.y;
            char item = itemid(z);
            cc[(int)posX][(int)posY] = item;
        }
        printchar(cc);
    }
}
