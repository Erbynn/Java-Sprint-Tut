package arrayObj;

public class Hobbit {
    String name;

    public static void main(String[] args) {
        Hobbit[] h = new Hobbit[3];
        int c = 0;

        while (c < h.length){
            h[c] = new Hobbit();
            h[c].name = "bilbo";

            if(c == 1) h[c].name = "frodo";
            if(c == 2) h[c].name = "sam";

            System.out.println(h[c].name);
            c = c + 1;
        }
    }
}
