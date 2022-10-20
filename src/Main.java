public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var bothBoxerWight= boxerOne+boxerTwo;
        System.out.println("Общий вес двух бойцов " + bothBoxerWight + " кг!");
        var differensWight=boxerTwo-boxerOne;
        System.out.println("Разница между весами бойцов " + differensWight + " кг!");
        var differens=boxerTwo%boxerOne;
        System.out.println("Разница между весами бойцов, расчет с помощью функции остаток от деления " + differens + " кг!");

        var totalTime=640;
        var workerTime=8;
        var totalWorker=totalTime/workerTime;
        System.out.println("Вего работников в компании " +totalWorker + " человек");

        var newTotalWorker=totalWorker+94;
        var newTotalTime=workerTime*newTotalWorker;
        System.out.println("Если в компании работает " +newTotalWorker + " человек, то всего " + newTotalTime + " часов работы может быть поделено между сотрудниками");
    }
}