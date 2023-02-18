import model.Console;
import model.Laptop;
import model.PC;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataInitializer {
    private PC pc;
    private Laptop laptop;
    private Console console;

    public Map init() {
        Map<Long, Object> products = new HashMap<>();
        PC pc = new PC();
        pc.setId(1l);
        pc.setCpu("Ryzen 5 5600");
        pc.setGpu("rtx 4090");
        pc.setMotherBoard("asus b 550 tomahawk");
        pc.setMemory("1024 GB");
        pc.setRam("kingston fury 32");
        pc.setPowerUnit("asus 1000 w");
        pc.setPrice(BigDecimal.valueOf(1700));
        pc.setDetails("Good pc for games in 4k resolution");

        Laptop laptop = new Laptop();
        laptop.setId(11l);
        laptop.setCpu("Ryzen 5 3600U");
        laptop.setGpu("rtx 3060 laptop version");
        laptop.setMotherBoard("b 550");
        laptop.setMonitor("1920x1080");
        laptop.setMemory("216 gb m2");
        laptop.setRam("kingston fury 16 gb");
        laptop.setBatterySize("4000 Ah");
        laptop.setPrice(BigDecimal.valueOf(900));
        laptop.setDetails("good laptop for working in cafe");

        Console console = new Console();
        console.setId(30l);
        console.setCpu("Ryzen 3");
        console.setGpu("integrated");
        console.setMemory("1024 GB");
        console.setRam("GDDR 6 16");
        console.setTeraflops("10,27 TFLOPS");
        console.setPrice(BigDecimal.valueOf(1200));
        console.setDetails("Sony PS 5 it good console for games in 4k resolution on big tv in 60hz");
        products.put(pc.id, pc);
        products.put(laptop.id,laptop);
        products.put(console.id,console);
        return products;
    }
}
