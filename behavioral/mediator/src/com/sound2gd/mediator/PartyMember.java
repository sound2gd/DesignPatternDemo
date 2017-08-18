package com.sound2gd.mediator;

/**
 * Created by cris on 2017/8/18.
 */
public interface PartyMember {

    /**
     * 加入party
     * @param party
     */
    void joinParty(Party party);

    /**
     * 如果主角是自己调用的表演方法
     * @param action
     */
    void act(Action action);

    /**
     * 主角不是自己，喝彩类似的方法
     * @param action
     */
    void partyAction(Action action);

}
