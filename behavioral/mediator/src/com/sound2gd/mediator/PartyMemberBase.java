package com.sound2gd.mediator;

/**
 * Created by cris on 2017/8/18.
 */
public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinParty(Party party) {
        System.out.println(this + " 加入了 party");
        this.party = party;
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " 表演了 " + action);
            party.act(this, action);
        }
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this +" "+ action.getDescription());
    }

    @Override
    public abstract String toString();
}
