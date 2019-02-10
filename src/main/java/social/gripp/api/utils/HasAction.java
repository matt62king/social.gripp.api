package social.gripp.api.utils;

import social.gripp.api.global.models.action.Action;

public interface HasAction {
    void setAction(Action action);
    Action getAction();
}
