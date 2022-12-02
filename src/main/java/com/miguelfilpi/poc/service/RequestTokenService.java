package com.miguelfilpi.poc.service;

import org.springframework.stereotype.Service;

@Service
public class RequestTokenService {

    private String dsEmail = "skyline.integracao@skychart.com.br";

    private String dsSenha = "6P03AlWP@vwqhsIQ$kbH*RaGC0WS80";
    private String token;

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getDsSenha() {
        return dsSenha;
    }

    public void setDsSenha(String dsSenha) {
        this.dsSenha = dsSenha;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
