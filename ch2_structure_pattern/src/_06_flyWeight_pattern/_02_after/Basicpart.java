package _06_flyWeight_pattern._02_after;

import _06_flyWeight_pattern._02_after.part.Bluetooth;
import _06_flyWeight_pattern._02_after.part.Charge;
import _06_flyWeight_pattern._02_after.part.ControlButton;
import _06_flyWeight_pattern._02_after.part.PhoneCall;
import _06_flyWeight_pattern._02_after.part.Wifi;

// 변하지 않는 부품(Intrinsit)들을 모아놓는 곳 => Final로 선언해도 문제없다.
public final class Basicpart {
    private final Wifi wifi;
    private final Bluetooth bluetooth;
    private final ControlButton button;
    private final Charge charge;
    private final PhoneCall phoneCall;

    public Basicpart(Wifi wifi, Bluetooth bluetooth,
          ControlButton button, Charge charge, PhoneCall phoneCall) {
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.button = button;
        this.charge = charge;
        this.phoneCall = phoneCall;
    }

    @Override
    public String toString() {
        return "Basicpart{" +
              "wifi=" + wifi +
              ", bluetooth=" + bluetooth +
              ", button=" + button +
              ", charge=" + charge +
              ", phoneCall=" + phoneCall +
              '}';
    }

    public Wifi getWifi() {
        return wifi;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public ControlButton getButton() {
        return button;
    }

    public Charge getCharge() {
        return charge;
    }

    public PhoneCall getPhoneCall() {
        return phoneCall;
    }
}
