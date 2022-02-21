package _03_abstract_factory_pattern;

// 관련있는 여러 Instance를 생성하는 Interface
/** Factory_method vs Abstract_factory
 *  Factory을 사용하는 Client에게 초점을 맞춘다 -> Abstract_factory
 *  Client Code를 Interface 기반으로 만들어주는 기능을 담당. (ComputerFactory.class)
 */
public class App {

    public static void main(String[] args) {
        ComputerFactory SamsungFactory = new ComputerFactory(new LGComputerPartFactory());
        ComputerFactory LGFactory = new ComputerFactory(new SamSungComputerPartFactory());

        Computer samsungOdyssey = SamsungFactory.createComputer();
        Computer lgGram = LGFactory.createComputer();
        System.out.println(samsungOdyssey);
        System.out.println(lgGram);
    }

}
