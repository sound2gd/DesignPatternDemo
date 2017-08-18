package com.sound2gd.mediator;

/**
 * 中介者
 *
 * Created by cris on 2017/8/18.
 */
public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember member, Action action);

}
