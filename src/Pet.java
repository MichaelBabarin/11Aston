class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        super();
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть больше 10 м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;
    private static int foodBowl = 0;

    public Cat() {
        super();
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public void eat(int amount) {
        if (amount <= 0) {
            System.out.println("Количество еды должно быть положительным.");
            return;
        }
        if (amount <= foodBowl) {
            foodBowl -= amount;
            this.isFull = true;
            System.out.println("Кот поел " + amount + " ед. еды.");
        } else {
            System.out.println("Не хватает еды в миске для кота.");
        }
    }

    public static void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Количество добавляемой еды должно быть положительным.");
            return;
        }
        foodBowl += amount;
        System.out.println("В миску добавлено " + amount + " ед. еды. Теперь в миске " + foodBowl + " ед. еды.");
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static int getFoodBowl() {
        return foodBowl;
    }
