package com.springlearn.beans;

public class Certifcate {

    public Certifcate(String certName, String certDate) {
        this.certName = certName;
        this.certDate = certDate;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public String getCertDate() {
        return certDate;
    }

    public void setCertDate(String certDate) {
        this.certDate = certDate;
    }

    private String certName;
    private String certDate;


    @Override
    public String toString() {
        return "Certifcate{" +
                "certName='" + certName + '\'' +
                ", certDate='" + certDate + '\'' +
                '}';
    }
}
