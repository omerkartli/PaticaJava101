package ObjectOrientedPrBoxMatch;

public class Fighter {

    String name;
    Integer damage;
    Integer health;
    Integer weight;
    Integer dodge;

    Fighter(String name, Integer damage, int health, Integer weight,Integer dodge){
        this.damage=damage;
        this.name=name;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name+ "=>>"+ foe.name +" YE "+ this.damage + " hasar vurdu");
        if(foe.isDodge()) {
            System.out.println(foe.name + "geleni blokladı");
            return foe.health;
        }
        if( foe.health - this.damage<0 )
            return 0;
        return foe.health-this.damage;


    }
    boolean isDodge(){
        double randomNumber= Math.random()*100;
        return randomNumber<= this.dodge;
    }

}
