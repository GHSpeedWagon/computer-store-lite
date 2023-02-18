package model;

import lombok.Data;

@Data
public class PC extends Computer {
    private String motherBoard;
    private String powerUnit;

    @Override
    public String toString() {
        return "PC{"
                + "id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + ", motherBoard='" + motherBoard + '\''
                + ", powerUnit='" + powerUnit + '\''
                + ", price=" + price
                + ", details='" + details + '\''
                + '}';
    }
}