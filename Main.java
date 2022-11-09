package ObjectOrientedPrBoxMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1= new Fighter("CRE ", 10, 120, 92,60);
        Fighter f2 =new Fighter("ALI ",20,85,93,45);

        Match match=new Match(f1,f2, 85,100);
        match.run();


    }
}
