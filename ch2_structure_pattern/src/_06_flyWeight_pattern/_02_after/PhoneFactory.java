package _06_flyWeight_pattern._02_after;

import _06_flyWeight_pattern._02_after.part.Bluetooth;
import _06_flyWeight_pattern._02_after.part.Charge;
import _06_flyWeight_pattern._02_after.part.ControlButton;
import _06_flyWeight_pattern._02_after.part.PhoneCall;
import _06_flyWeight_pattern._02_after.part.Wifi;
import java.util.HashMap;
import java.util.Map;

// 기존에 저장해둔 Intrinsit(부품) 을 제공하기 위한 캐시가 필요.
public class PhoneFactory {

    private Map<String, Basicpart> cache = new HashMap<>();

    public Basicpart getBasicPart(String part) {
        if (cache.containsKey(part)) {
            System.out.println("Get BasicPart from Cache");
            return cache.get(part);
        } else {
            Basicpart newBasicPart = new Basicpart(new Wifi(part + "용 Wifi"),
                  new Bluetooth(part + "용 Wifi"), new ControlButton(part + "용 버튼"),
                  new Charge(part + "용 충전단자"),
                  new PhoneCall(part + "용 전화기능"));
            System.out.println("Put BasicPart from Cache");
            cache.put(part, newBasicPart);
            return newBasicPart;
        }
    }
}
