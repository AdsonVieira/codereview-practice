public class DiscountChecker {
    public boolean isEligible(Customer customer) {
        return customer.getAge() > 18 && customer.getPoints() > 100 && customer.isPremiumMember();
    }
}
