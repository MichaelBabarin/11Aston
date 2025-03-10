public class InputAnimals {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog2 = new Dog();
        dog1.run(150);
        dog1.swim(8);

        cat1.run(150);
        cat1.eat(5);
        cat2.eat(5);


        Cat.addFood(10);


        cat1.eat(5);
        cat2.eat(3);


        System.out.println("Кот 1 сытость: " + cat1.isFull());
        System.out.println("Кот 2 сытость: " + cat2.isFull());

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
    }
}