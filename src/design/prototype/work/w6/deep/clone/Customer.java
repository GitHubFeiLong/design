package design.prototype.work.w6.deep.clone;

import java.io.*;
import java.util.Objects;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/12 21:58
 */
public class Customer implements Cloneable, Serializable {
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

        ObjectInputStream ois = null;
        try(
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
        ) {
            // 写数据
            oos.writeObject(this);
            ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
            // 读数据
            return (Customer)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
