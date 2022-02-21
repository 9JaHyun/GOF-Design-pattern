package _04_builder_pattern._02_after_;

public class InnerHamburger {
    private final int bun;
    private final int patty;
    private final int cheese;
    private final int onion;
    private final int bacon;
    private final int lettuce;
    private final int pickle;
    private final int sauce1;
    private final int sauce2;
    private final int sauce3;

    private InnerHamburger(InnerHamburgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.onion = builder.onion;
        this.bacon = builder.bacon;
        this.lettuce = builder.lettuce;
        this.pickle = builder.pickle;
        this.sauce1 = builder.sauce1;
        this.sauce2 = builder.sauce2;
        this.sauce3 = builder.sauce3;
    }

    public static class InnerHamburgerBuilder {
        private int bun;
        private int patty;
        private int cheese;
        private int onion;
        private int bacon;
        private int lettuce;
        private int pickle;
        private int sauce1;
        private int sauce2;
        private int sauce3;

        public InnerHamburgerBuilder bun(int bun) {
            this.bun = bun;
            return this;
        }

        public InnerHamburgerBuilder patty(int patty) {
            this.patty = patty;
            return this;
        }

        public InnerHamburgerBuilder cheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        public InnerHamburgerBuilder onion(int onion) {
            this.onion = onion;
            return this;
        }

        public InnerHamburgerBuilder bacon(int bacon) {
            this.bacon = bacon;
            return this;
        }

        public InnerHamburgerBuilder lettuce(int lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public InnerHamburgerBuilder pickle(int pickle) {
            this.pickle = pickle;
            return this;
        }

        public InnerHamburgerBuilder sauce1(int sauce1) {
            this.sauce1 = sauce1;
            return this;
        }

        public InnerHamburgerBuilder sauce2(int sauce2) {
            this.sauce2 = sauce2;
            return this;
        }

        public InnerHamburgerBuilder sauce3(int sauce3) {
            this.sauce3 = sauce3;
            return this;
        }

        public InnerHamburger build() {
            return new InnerHamburger(this);
        }
    }
    @Override
    public String toString() {
        return "Hamburger{" +
            "bun=" + bun +
            ", patty=" + patty +
            ", cheese=" + cheese +
            ", onion=" + onion +
            ", bacon=" + bacon +
            ", lettuce=" + lettuce +
            ", pickle=" + pickle +
            ", sauce1=" + sauce1 +
            ", sauce2=" + sauce2 +
            ", sauce3=" + sauce3 +
            '}';
    }
}
