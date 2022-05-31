package controller;

import model.Modelcliente;
import DAO.DAOcliente;
import java.util.ArrayList;

/**
*
* @author caio oliveira
*/
public class Controllercliente {

    private DAOcliente daocliente = new DAOcliente();

    /**
    * grava cliente
    * @param pModelcliente
    * @return int
    */
    public int salvarclienteController(Modelcliente pModelcliente){
        return this.daocliente.salvarclienteDAO(pModelcliente);
    }

    /**
    * recupera cliente
    * @param pId_cliente
    * @return Modelcliente
    */
    public Modelcliente getclienteController(int pId_cliente){
        return this.daocliente.getclienteDAO(pId_cliente);
    }
    /**
    * recupera cliente
    * @param pId_cliente
    * @return Modelcliente
    */
    public Modelcliente getclienteController(String pNomeCliente){
        return this.daocliente.getclienteDAO(pNomeCliente);
    }
    /**
    * recupera uma lista decliente
    * @param pId_cliente
    * @return ArrayList
    */
    public ArrayList<Modelcliente> getListaclienteController(){
        return this.daocliente.getListaclienteDAO();
    }

    /**
    * atualiza cliente
    * @param pModelcliente
    * @return boolean
    */
    public boolean atualizarclienteController(Modelcliente pModelcliente){
        return this.daocliente.atualizarclienteDAO(pModelcliente);
    }

    /**
    * exclui cliente
    * @param pId_cliente
    * @return boolean
    */
    public boolean excluirclienteController(int pId_cliente){
        return this.daocliente.excluirclienteDAO(pId_cliente);
    }

    
}