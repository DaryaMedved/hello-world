package by.itacademy.hw19;

import java.math.BigDecimal;
public class ServiceHotel {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public ServiceHotel(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
