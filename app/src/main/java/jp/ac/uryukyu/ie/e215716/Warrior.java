package jp.ac.uryukyu.ie.e215716;

public class Warrior extends Hero{
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(getHitPoint()<=0){   
        }
        else{
            int damage = (int)(getAttack()*1.5);
            System.out.printf("%sの攻撃！ウェポンスキル発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }   

    }
}
