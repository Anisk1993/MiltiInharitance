public class Mobile extends Computer{
    void process(){
        System.out.println("Mobile");
    }
    Phone makePhone(){
        return new Phone(){
            void process() {
                System.out.println("Mobile for method \"makePhone\"");
            }
        };
    }
}
