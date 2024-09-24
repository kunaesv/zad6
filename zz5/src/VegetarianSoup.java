class VegetarianSoup extends SoupBase {
    double vegetables;

    public VegetarianSoup(SoupBase soupBase, double vegetables) { // Конструктор для вегетарианского супа из основы
        super(soupBase.water, soupBase.salt);
        this.vegetables = vegetables;
    }

    public VegetarianSoup(double water, double salt, double vegetables) { // Конструктор для вегетарианского супа с нуля
        super(water, salt);
        this.vegetables = vegetables;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}