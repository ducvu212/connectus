package com.connect.chat.connectus.ui.activity;


import com.connect.chat.connectus.base.BaseView;
import com.connect.chat.connectus.presenter.MainPresenter;

import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Blue on 1/8/2018.
 */

public interface MainView extends BaseView<MainPresenter> {
    void bindingdata(ArrayList<JSONObject> data);
}
