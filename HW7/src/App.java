public class App {
    public static void main(String args[]) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setName("spot");
        dog2.setName("scruffy");

        dog1.setSay("Ruff!");
        dog2.setSay("Wurf!");

        dog1.voice();
        dog2.voice();

        System.out.println("Let's compare with ==:");
        System.out.print(dog1 == dog2);

        System.out.println("\nCompare using equals():");
        System.out.println(dog1.equals(dog2));

        Dog anotherSpot = dog1;

        System.out.println("\nCompare the new link with dog1 using ==:");
        System.out.print(anotherSpot == dog1);

        System.out.println("\nWe compare the new link with dog1 using equals():");
        System.out.print(anotherSpot.equals(dog1));
    }
}