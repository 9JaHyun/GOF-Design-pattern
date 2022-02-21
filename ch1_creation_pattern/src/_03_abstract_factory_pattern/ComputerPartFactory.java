package _03_abstract_factory_pattern;

import _03_abstract_factory_pattern.keyboard.KeyBoard;
import _03_abstract_factory_pattern.monitor.Monitor;

public interface ComputerPartFactory {

    Monitor createMonitor();
    KeyBoard createKeyBoard();
}
