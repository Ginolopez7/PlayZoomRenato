package com.gino.playzoom.data.response;

import com.gino.playzoom.model.Shows;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShowResponse {

    @SerializedName(("shows"))
    public List<Shows> showsList;

    public List<Shows> getShowsList() {
        return showsList;
    }

    public void setShowsList(List<Shows> showsList) {
        this.showsList = showsList;
    }
}
