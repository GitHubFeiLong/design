package design.prototype.work.w6.shallow.clone;

import java.util.Objects;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:58
 */
public class Customer implements Cloneable{
    //~fields
    //==================================================================================================================
    private Address address;

    //~methods
    //==================================================================================================================

    public Customer(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer)super.clone();
    }
}
