package _03_abstract_factory_pattern;

public class ComputerFactory {

    private final ComputerPartFactory computerPartFactory;

    public ComputerFactory(ComputerPartFactory computerPartFactory) {
        this.computerPartFactory = computerPartFactory;
    }

    public Computer createComputer() {
        Computer computer = new Computer();
        computer.setMonitor(computerPartFactory.createMonitor());
        computer.setKeyBoard(computerPartFactory.createKeyBoard());

        return computer;
    }
}
