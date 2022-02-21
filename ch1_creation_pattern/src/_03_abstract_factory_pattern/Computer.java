package _03_abstract_factory_pattern;

import _03_abstract_factory_pattern.keyboard.KeyBoard;
import _03_abstract_factory_pattern.monitor.Monitor;

public class Computer {

    private Monitor monitor;
    private KeyBoard keyBoard;

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
            "monitor=" + monitor +
            ", keyBoard=" + keyBoard +
            '}';
    }
}
