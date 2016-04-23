package sample;

import sample.model.interfaces.User;

/**
 * Handles event of user's data change. For instance online state, name, etc.
 */
public interface UserStateChangeHandler
{
    void handle(int id, User newValue);
}
