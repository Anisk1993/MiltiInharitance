public class Dispatcher {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Phone[] p = {p1, p2, m2.makePhone()};
        Computer[] c = {c1, c2, m1};
        System.out.println("Computer shop:");
        for (Computer item : c) {
            item.process();
        }
        System.out.println("\nPhones shop:");
        for (Phone item : p) {
            item.process();
        }
    }
}
