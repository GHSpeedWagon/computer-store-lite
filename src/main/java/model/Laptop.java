package model;

import lombok.Data;

@Data
public class Laptop extends Computer {
    private String motherBoard;
    private String monitor;
    private String batterySize;

    @Override
    public String toString() {
        return "Laptop{"
                + "id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + ", motherBoard='" + motherBoard + '\''
                + ", monitor='" + monitor + '\''
                + ", batterySize='" + batterySize + '\''
                + ", details='" + details + '\''
                + ", price=" + price
                + '}';
    }
}
