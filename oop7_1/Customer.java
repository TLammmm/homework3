package oop7_1;

public class Customer {

    private String name;
    private boolean member = false;
    private DiscountRate.CustomerType memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public DiscountRate.CustomerType getMemberType() {
        return memberType;
    }

    public void setMemberType(DiscountRate.CustomerType memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}