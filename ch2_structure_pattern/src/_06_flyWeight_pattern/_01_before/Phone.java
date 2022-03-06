package _06_flyWeight_pattern._01_before;

import _06_flyWeight_pattern._01_before.part.Bluetooth;
import _06_flyWeight_pattern._01_before.part.Camera;
import _06_flyWeight_pattern._01_before.part.Charge;
import _06_flyWeight_pattern._01_before.part.ControlButton;
import _06_flyWeight_pattern._01_before.part.Cpu;
import _06_flyWeight_pattern._01_before.part.Display;
import _06_flyWeight_pattern._01_before.part.Memory;
import _06_flyWeight_pattern._01_before.part.PhoneCall;
import _06_flyWeight_pattern._01_before.part.Wifi;

public class Phone {

    // 스마트폰의 등급에 따라 기능이 갈리나, 큰 맥락에서는 비슷한 부품이 쓰인다.
    private Camera camera;
    private Cpu cpu;
    private Memory memory;
    private Display display;

    // 보통 등급과 상관없이 공통적으로 쓰이는 부품 (Intrinsit)
    private Wifi wifi;
    private Bluetooth bluetooth;
    private ControlButton button;
    private Charge charge;
    private PhoneCall phoneCall;

    public Phone(Camera camera, Cpu cpu, Memory memory,
          Display display, Wifi wifi, Bluetooth bluetooth,
          ControlButton button, Charge charge, PhoneCall phoneCall) {
        this.camera = camera;
        this.cpu = cpu;
        this.memory = memory;
        this.display = display;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.button = button;
        this.charge = charge;
        this.phoneCall = phoneCall;
    }
}
