/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendas;
import model.ModelVendasCliente;
import model.Modelcliente;

/**
 *
 * @author caio
 */
public class DAOVendasCliente extends ConexaoMySql {
    
    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO(){
        ArrayList<ModelVendasCliente> listamodelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        Modelcliente modelCliente = new Modelcliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    +"tbl_vendas.pk_id_vendas, "
                    + "tbl_vendas.fk_cliente, "
                    + "tbl_vendas.ven_data_venda, "
                    + "tbl_vendas.ven_valor_liquido, "
                    + "tbl_vendas.ven_valor_bruto, "
                    + "tbl_vendas.ven_desconto, "
                    + "tbl_cliente.pk_id_cliente, "
                    + "tbl_cliente.cli_nome, "
                    + "tbl_cliente.cli_endereco, "
                    + "tbl_cliente.cli_bairro, "
                    + "tbl_cliente.cli_cidade, "
                    + "tbl_cliente.cli_uf, "
                    + "tbl_cliente.cli_cep, "
                    + "tbl_cliente.cli_telefone, "
                    + "FROM "
                    + "tbl_vendas INNER JOIN  tbl_cliente "
                    + "ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente;"
                    + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelCliente = new Modelcliente();
                modelVendasCliente = new ModelVendasCliente();
                
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                // dados cliente
                modelCliente.setId_cliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliUf(this.getResultSet().getString(6));
                modelCliente.setCliCep(this.getResultSet().getString(7));
                modelCliente.setCliTelefone(this.getResultSet().getString(8));
                
                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelCliente(modelCliente);
                
                listamodelVendasCliente.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasCliente;
    }
}
