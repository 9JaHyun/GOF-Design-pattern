package _06_flyWeight_pattern._02_after;

import _06_flyWeight_pattern._02_after.part.Camera;
import _06_flyWeight_pattern._02_after.part.Cpu;
import _06_flyWeight_pattern._02_after.part.Display;
import _06_flyWeight_pattern._02_after.part.Memory;


public class Phone {

    // 스마트폰의 등급에 따라 기능이 갈리나, 큰 맥락에서는 비슷한 부품이 쓰인다. (Extrinsit)
    private Camera camera;
    private Cpu cpu;
    private Memory memory;
    private Display display;

    // 보통 등급과 상관없이 공통적으로 쓰이는 부품 (Intrinsit)
    private Basicpart basicpart;

    public Phone(Camera camera, Cpu cpu, Memory memory,
          Display display, Basicpart basicpart) {
        this.camera = camera;
        this.cpu = cpu;
        this.memory = memory;
        this.display = display;
        this.basicpart = basicpart;
    }

    @Override
    public String toString() {
        return "Phone{" +
              "camera=" + camera +
              ", cpu=" + cpu +
              ", memory=" + memory +
              ", display=" + display +
              ", basicpart=" + basicpart +
              '}';
    }
}
