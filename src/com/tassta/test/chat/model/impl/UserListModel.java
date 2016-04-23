package com.tassta.test.chat.model.impl;

import com.tassta.test.chat.model.interfaces.User;
import com.tassta.test.chat.model.interfaces.UserList;
import javafx.collections.ObservableList;

public class UserListModel implements UserList {

    private ObservableList<User> userList;

    @Override
    public ObservableList<User> getUserList() {
        return userList;
    }

    public void setUserList(ObservableList<User> userList) {
        this.userList = userList;
    }
}
