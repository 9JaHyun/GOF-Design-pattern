package _03_abstract_factory_pattern;

import _03_abstract_factory_pattern.keyboard.KeyBoard;
import _03_abstract_factory_pattern.keyboard.LGKeyBoard;
import _03_abstract_factory_pattern.monitor.LGMonitor;
import _03_abstract_factory_pattern.monitor.Monitor;

public class LGComputerPartFactory implements ComputerPartFactory{
    @Override
    public Monitor createMonitor() {
        return new LGMonitor();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new LGKeyBoard();
    }
}
