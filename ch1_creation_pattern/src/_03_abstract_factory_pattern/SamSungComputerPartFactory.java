package _03_abstract_factory_pattern;

import _03_abstract_factory_pattern.keyboard.KeyBoard;
import _03_abstract_factory_pattern.keyboard.SamsungKeyBoard;
import _03_abstract_factory_pattern.monitor.Monitor;
import _03_abstract_factory_pattern.monitor.SamsungMonitor;

public class SamSungComputerPartFactory implements ComputerPartFactory{
    @Override
    public Monitor createMonitor() {
        return new SamsungMonitor();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new SamsungKeyBoard();
    }
}
