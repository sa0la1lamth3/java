package lesson7.lesson73;

import java.util.Arrays;

public class Store {
    private String name;
    private String address;
    private SmartPhone[] phones;

    public Store(String name, String address, SmartPhone[] phones) {
        this.name = name;
        this.address = address;
        this.phones = phones;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

//    Đếm tổng số điện thoại đã bán...

    public int countTotalSold() {
        int count = 0;
        for (SmartPhone smartPhone : phones) {
            count += smartPhone.getTotalSold();
        }
        return count;
    }

//    tổng doanh thu cửa hàng ....

    public float getTotalRevenue() {
        float revenue = 0;
        for (SmartPhone smartPhone : phones) {
            revenue += smartPhone.getTotalSold() * smartPhone.getPrice();
        }
        return revenue;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}
