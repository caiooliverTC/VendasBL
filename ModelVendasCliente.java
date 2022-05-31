/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ModelVendasCliente {
    
    private ModelVendas modelVendas;
    private Modelcliente modelCliente;
    private ArrayList<ModelVendasCliente> listaModelVendasClientes;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelCliente
     */
    public Modelcliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(Modelcliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelVendasClientes
     */
    public ArrayList<ModelVendasCliente> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param listaModelVendasClientes the listaModelVendasClientes to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasCliente> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
    
}
