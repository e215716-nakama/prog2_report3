package jp.ac.uryukyu.ie.e215716;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public int getAttack(){
        return this.attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    
    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public boolean isDead(){
        return this.dead;
    }
    public void setDead(boolean dead){
        this.dead= dead;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void attack(LivingThing opponent){
        if(hitPoint<=0){   
        }
        else{
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }    
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
