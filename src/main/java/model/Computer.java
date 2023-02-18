package model;


import lombok.Data;
import java.math.BigDecimal;

@Data
public abstract class Computer {
    public Long id;
    public String cpu;
    public String gpu;
    public String ram;
    public String memory;
    public BigDecimal price;
    public String details;
    public Boolean isInCart;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Computer{"
                + "id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + ", price=" + price
                + ", details='" + details + '\''
                + ", isInCart=" + isInCart
                + '}';
    }
}
