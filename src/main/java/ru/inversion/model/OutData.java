package ru.inversion.model;

public class OutData {
    private Client cusinfo = null;
    private String error;

    public OutData() {
    }

    public Client getCusinfo() {
        return cusinfo;
    }

    public void setCusinfo(Client cusinfo) {
        this.cusinfo = cusinfo;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
