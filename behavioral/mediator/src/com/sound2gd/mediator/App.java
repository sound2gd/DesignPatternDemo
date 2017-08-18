package com.sound2gd.mediator;

/**
 * Created by cris on 2017/8/18.
 */
public class App {

    public static void main(String[] args) {
        Party party = new PartyImpl();
        Wizzard wizzard = new Wizzard();
        Hunter hunter = new Hunter();
        Rogue rogue = new Rogue();
        Hobbit hobbit = new Hobbit();

        // 加入party
        party.addMember(wizzard);
        party.addMember(hunter);
        party.addMember(rogue);
        party.addMember(hobbit);

        // 对于调用者来说，party隐藏了wizzard,hunter,rogue,hobbit之间的交互细节
        // 只需要调用wizzard的act方法，自动触发了别的对象的partyAct方法,调用者并不知道细节是如何发生的

        // act actions
        wizzard.act(Action.ENEMY);
        hunter.act(Action.HUNT);
        rogue.act(Action.GOLD);
        hobbit.act(Action.TALE);
    }
}
