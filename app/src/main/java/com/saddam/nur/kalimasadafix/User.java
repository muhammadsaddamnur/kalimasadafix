package com.saddam.nur.kalimasadafix;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by acer on 3/31/2018.
 */

class User {
    @SerializedName("id_user")
    @Expose
    private String idUser;
    @SerializedName("email")
    @Expose
    private String email;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
