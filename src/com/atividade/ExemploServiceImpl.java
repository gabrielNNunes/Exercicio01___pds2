package com.atividade;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.atividade.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }
}