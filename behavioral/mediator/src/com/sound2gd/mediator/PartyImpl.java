package com.sound2gd.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cris on 2017/8/18.
 */
public class PartyImpl implements Party{

    private List<PartyMember> members = new ArrayList<>();

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        // 找到不是主角的其余参与者，调用partyAction
        for (PartyMember partyMember : members) {
            if (!actor.equals(partyMember)) {
                partyMember.partyAction(action);
            }
        }
    }
}
