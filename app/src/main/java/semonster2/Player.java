package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  LinkedList<Integer> nameNumList;// randomな0~4の数値を必要な数保存しておく
  LinkedList<Integer> rareNumList;

  Player(LinkedList<Integer> nameNumList, LinkedList<Integer> rareNumList) {
    this.nameNumList = nameNumList;
    this.rareNumList = rareNumList;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.monsterDeck.add(new Monster(this.nameNumList.pop(), this.rareNumList.pop()));
    }
  }

  public void showDeck() {
    for (Monster m : this.monsterDeck) {
      System.out.println(m);
    }
  }
}
