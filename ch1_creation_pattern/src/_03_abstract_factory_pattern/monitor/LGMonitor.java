package _03_abstract_factory_pattern.monitor;

public class LGMonitor extends Monitor{

    private String type;

    public LGMonitor() {
        this.type = "LG 모니터";
    }


    @Override
    public String toString() {
        return "LGMonitor{" +
            "type='" + type + '\'' +
            '}';
    }
}
