public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;

    var x = 19;
    var y = x + 2;
    var z = y / 7;
    var friend = (x + ",") + (y + ",") + (z + ",");

        var o = 3.5;
        var l = o * 10;
        var m = l  / 3.5;
        var n = m + 4;
        var frog = (o + ",") + (l + ",") + (m + ",") + (n + ",");

        var boxMas1 = 78.2;
        var boxMas2 = 82.7;
        var sumMass = boxMas1 + boxMas2;
        var difMass = boxMas2 - boxMas1;
        var masRem = boxMas2 % boxMas1;

        var allTime = 640;
        var workTime = 8;
        var workers = allTime / workTime;
        var workers2 = workers + 94;
        var workTime2 = allTime / workers2;





        System.out.println(dog + 4 - 3.5);

        System.out.println(cat + 4 - 1.6);

        System.out.println(paper + 4 - 7639);

        System.out.println(friend);

        System.out.println(frog);

        System.out.println((sumMass + ",") + (difMass + ",") + (masRem + ",") );

        System.out.println("Всего работников в компании - " + workers + " человек.");

        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + workTime2 + " часа работы может быть поделено между сотрудниками");
    }
}
