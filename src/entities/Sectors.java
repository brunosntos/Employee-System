package entities;

public enum Sectors {
    SALES{
        @Override
        public double calculateBonus(double value) {
            return value * 0.2;
        }
    },
    ADMINISTRATIVE{
        @Override
        public double calculateBonus(double value) {
            return value * 0.25;
        }
    },
    PRODUCTION{
        @Override
        public double calculateBonus(double value) {
            return value * 0.1;
        }
    };

    public abstract double calculateBonus(double value);

}
