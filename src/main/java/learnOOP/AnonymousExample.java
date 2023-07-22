package learnOOP;

public class AnonymousExample {

    public static void main(String[] args) {

        var pOne = new Person(){

            @Override
            void talk() {
                super.talk();
                System.out.println("Anonymous person taking  bla bla bla...");
            }

            void work(){
                System.out.println("Anonymous person working ...");
            }
        };

        pOne.talk();
        pOne.work();

    }


}
