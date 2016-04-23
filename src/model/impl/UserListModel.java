package sample.model.impl;

import sample.model.interfaces.User;
import sample.model.interfaces.UserList;
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
