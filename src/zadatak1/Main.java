package zadatak1;

import zadatak1.a.ImmutableContainerA;
import zadatak1.b.ImmutableContainerB;
import zadatak1.c.ImmutableContainerC;
import zadatak1.d.ImmutableContainerD;

public class Main {
    public static void main(String[] args) {
        zadatak1.ImmutableContainer ic = new zadatak1.ImmutableContainer(1, 2, 3, 4, 5, 6, 7);
//        for (Integer num : ic) {
//            System.out.println(ic);
//        }

        System.out.print("\na) ");
        ImmutableContainerA a = new ImmutableContainerA(1, 2, 3, 4, 5, 6, 7);
        for (Integer num : a) {
            System.out.print(num + " ");
        }

        System.out.print("\nb) ");
        ImmutableContainerB b = new ImmutableContainerB(1, 2, 3, 4, 5, 6, 7);
        for (Integer num : b) {
            System.out.print(num + " ");
        }

        System.out.print("\nc) ");
        ImmutableContainerC c = new ImmutableContainerC(1, 2, 3, 4, 5, 6, 7);
        for (Integer num : c) {
            System.out.print(num + " ");
        }

        System.out.print("\nd) ");
        ImmutableContainerD d = new ImmutableContainerD(1, 2, 3, 4, 5, 6, 7);
        for (Integer num : d) {
            System.out.print(num + " ");
        }

    }
}
