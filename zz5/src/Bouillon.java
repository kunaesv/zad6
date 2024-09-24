class Bouillon extends SoupBase {
    double meat;

    public Bouillon(SoupBase soupBase, double meat) { // Конструктор для бульона из основы
        super(soupBase.water, soupBase.salt);
        this.meat = meat;
    }

    public Bouillon(double water, double salt, double meat) { // Конструктор для бульона с нуля
        super(water, salt);
        this.meat = meat;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты бульона:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
    }
}