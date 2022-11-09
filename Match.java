package ObjectOrientedPrBoxMatch;

public class Match {

    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void run(){
       if( isCheck()) {
           while (this.f1.health>0 && this.f2.health>0){
               System.out.println("======YENI RAUND======");
               this.f2.health=this.f1.hit(this.f2);
               System.out.println(this.f2.name +"nin kalan canı "+this.f2.health);
               if(isWin()){
                   break;
               }
               this.f1.health=this.f2.hit(this.f1);
               System.out.println(this.f1.name+ "nin kalan canı " +this.f1.health);
               if(isWin()) {
                   break;
               }



           }

       }
       else {
           System.out.println("Sporcuların sikletleri uymuyor");
       }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);

    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" kazandı");
            return true;
        }
        if(this.f2.health==0) {
            System.out.println(this.f1.name + " kazandı");
            return true;
        }
        else
            return false;

    }

}
