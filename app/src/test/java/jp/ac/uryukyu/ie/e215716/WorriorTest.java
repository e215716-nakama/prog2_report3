package jp.ac.uryukyu.ie.e215716;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorriorTest {

    @Test
    void worriorAttackTest(){
        int defaultWarriorAttack = 2;
        int enemyHp = 10;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき",  enemyHp , 100);
        for(int i = 0; i < 3; i++){
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(defaultWarriorAttack * 1.5, enemyHp - slime.getHitPoint());
            slime.setHitPoint(10);
        }
    }
    
}
