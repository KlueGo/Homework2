public class Main {
    public static void main(String[] args) {

        //Task 1,2,3

    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;

    dog += 4;
    cat += 4;
    paper += 4;

    dog -= 3.5;
    cat -= 1.6;
    paper -= 7639;

    System.out.println(dog + "," + cat + "," + paper + ",");


        //Task4

    var friend = 19;
        System.out.println(friend);
    friend += 2;
        System.out.println(friend);
    friend /=7;
        System.out.println(friend);


        //Task5

    var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


        //Task6,7

        var boxMas1 = 78.2;
        var boxMas2 = 82.7;
        var sumMass = boxMas1 + boxMas2;
        var difMass = boxMas2 - boxMas1;
        var masRem = boxMas2 % boxMas1;

        System.out.println((sumMass + ",") + (difMass + ",") + (masRem + ",") );

        //Task8

        var allTime = 640;
        var workTime = 8;
        var workers = allTime / workTime;
        var workers2 = workers + 94;
        var workTime2 = allTime / workers2;

        System.out.println("Всего работников в компании - " + workers + " человек.");

        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + workTime2 + " часа работы может быть поделено между сотрудниками");
    }
}
