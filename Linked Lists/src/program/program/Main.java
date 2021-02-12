package program.program;

public class Main {

    public static void main(String[] args) {


        DLL list = new DLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);


        System.out.println(list);

        System.out.println(list.remove(10));
        System.out.println(list.remove(9));
        System.out.println(list.remove(1));
        System.out.println(list.remove(2));
        System.out.println(list.remove(4));

        System.out.println(list);




    }


}
