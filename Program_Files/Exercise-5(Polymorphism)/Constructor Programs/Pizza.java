public class Pizza {
    private final String size;
    
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean mushrooms = false;

    public static class Builder {
        private final String size;
        
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean mushrooms = false;

        public Builder(String size) {
            this.size = size;
        }

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza: " + size + 
               (cheese ? " +cheese" : "") +
               (pepperoni ? " +pepperoni" : "") +
               (mushrooms ? " +mushrooms" : "");
    }

    public static void main(String[] args) {
        Pizza myPizza = new Pizza.Builder("Large")
                            .addCheese()
                            .addPepperoni()
                            .build();

        System.out.println(myPizza);
    }
}