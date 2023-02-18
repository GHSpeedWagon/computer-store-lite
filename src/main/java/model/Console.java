package model;

import lombok.Data;

@Data
public class Console extends Computer {
    private String teraflops;

    @Override
    public String toString() {
        return "Console{"
                + "id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + ", teraflops='" + teraflops + '\''
                + ", details='" + details + '\''
                + ", price=" + price
                + '}';
    }
}
