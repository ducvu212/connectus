package com.connect.chat.connectus.presenter.impl;

import com.connect.chat.connectus.base.BasePresenterImp;
import com.connect.chat.connectus.presenter.HomePresenter;
import com.connect.chat.connectus.presenter.MapPresenter;
import com.connect.chat.connectus.ui.activity.HomeView;
import com.connect.chat.connectus.ui.activity.MainView;
import com.connect.chat.connectus.ui.fragment.MapView;

public class MapPresenterImpl extends BasePresenterImp<MapView> implements MapPresenter {
    public MapPresenterImpl(MapView view) {
        super(view);
    }
}
