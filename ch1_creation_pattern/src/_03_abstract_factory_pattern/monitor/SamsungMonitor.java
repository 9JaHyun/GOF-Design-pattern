package _03_abstract_factory_pattern.monitor;

public class SamsungMonitor extends Monitor{
    private String type;

    public SamsungMonitor() {
        this.type = "삼성 모니터";
    }

    @Override
    public String toString() {
        return "SamsungMonitor{" +
            "type='" + type + '\'' +
            '}';
    }
}
