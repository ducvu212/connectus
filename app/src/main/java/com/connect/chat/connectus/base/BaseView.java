package com.connect.chat.connectus.base;

/**
 * Created by Gnaoh Peih on 1/4/2018.
 */

public interface BaseView <BPresenter extends BasePresenter> {
    BPresenter getPresenter();

    BPresenter createPresenter();
}
