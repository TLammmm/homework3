package oop7_1;

public class DiscountRate {
    public enum CustomerType {
        PREMIUM, GOLD, SILVER;
    }

    public static double serviceDiscountPremium = 0.2;
    public static double serviceDiscountGold = 0.15;
    public static double serviceDiscountSilver = 0.1;
    public static double productDiscountPremium = 0.1;
    public static double productDiscountGold = 0.1;
    public static double productDiscountSilver = 0.1;
    public static double getServiceDiscountRate(CustomerType type) {
        if (type != null) {
            switch (type) {
                case PREMIUM:
                    return serviceDiscountPremium;
                case GOLD:
                    return serviceDiscountGold;
                case SILVER:
                    return serviceDiscountSilver;
            }
        }
        return 0.0;
    }
    public static double getProductDiscountRate(CustomerType type) {
        if (type != null) {
            switch (type) {
                case PREMIUM:
                    return productDiscountPremium;
                case GOLD:
                    return productDiscountGold;
                case SILVER:
                    return productDiscountSilver;
            }
        }
        return 0.0;
    }
    }
