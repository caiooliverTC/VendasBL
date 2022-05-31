package DAO;

import model.Modelcliente;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author caio oliveira
*/
public class DAOcliente extends ConexaoMySql {

    /**
    * grava cliente
    * @param pModelcliente
    * @return int
    */
    public int salvarclienteDAO(Modelcliente pModelcliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                + ") VALUES ("
                    + "'" + pModelcliente.getCliNome() + "',"
                    + "'" + pModelcliente.getCliEndereco() + "',"
                    + "'" + pModelcliente.getCliBairro() + "',"
                    + "'" + pModelcliente.getCliCidade() + "',"
                    + "'" + pModelcliente.getCliUf() + "',"
                    + "'" + pModelcliente.getCliCep() + "',"
                    + "'" + pModelcliente.getCliTelefone() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera cliente
    * @param pId_cliente
    * @return Modelcliente
    */
    public Modelcliente getclienteDAO(int pId_cliente){
        Modelcliente modelcliente = new Modelcliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pId_cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcliente.setId_cliente(this.getResultSet().getInt(1));
                modelcliente.setCliNome(this.getResultSet().getString(2));
                modelcliente.setCliEndereco(this.getResultSet().getString(3));
                modelcliente.setCliBairro(this.getResultSet().getString(4));
                modelcliente.setCliCidade(this.getResultSet().getString(5));
                modelcliente.setCliUf(this.getResultSet().getString(6));
                modelcliente.setCliCep(this.getResultSet().getString(7));
                modelcliente.setCliTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelcliente;
    }

    public Modelcliente getclienteDAO(String pNomeCliente){
        Modelcliente modelcliente = new Modelcliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " cli_nome = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcliente.setId_cliente(this.getResultSet().getInt(1));
                modelcliente.setCliNome(this.getResultSet().getString(2));
                modelcliente.setCliEndereco(this.getResultSet().getString(3));
                modelcliente.setCliBairro(this.getResultSet().getString(4));
                modelcliente.setCliCidade(this.getResultSet().getString(5));
                modelcliente.setCliUf(this.getResultSet().getString(6));
                modelcliente.setCliCep(this.getResultSet().getString(7));
                modelcliente.setCliTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelcliente;
    }
    
    
    
    /**
    * recupera uma lista de cliente
        * @return ArrayList
    */
    public ArrayList<Modelcliente> getListaclienteDAO(){
        ArrayList<Modelcliente> listamodelcliente = new ArrayList();
        Modelcliente modelcliente = new Modelcliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcliente = new Modelcliente();
                modelcliente.setId_cliente(this.getResultSet().getInt(1));
                modelcliente.setCliNome(this.getResultSet().getString(2));
                modelcliente.setCliEndereco(this.getResultSet().getString(3));
                modelcliente.setCliBairro(this.getResultSet().getString(4));
                modelcliente.setCliCidade(this.getResultSet().getString(5));
                modelcliente.setCliUf(this.getResultSet().getString(6));
                modelcliente.setCliCep(this.getResultSet().getString(7));
                modelcliente.setCliTelefone(this.getResultSet().getString(8));
                listamodelcliente.add(modelcliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelcliente;
    }

    /**
    * atualiza cliente
    * @param pModelcliente
    * @return boolean
    */
    public boolean atualizarclienteDAO(Modelcliente pModelcliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelcliente.getId_cliente() + "',"
                    + "cli_nome = '" + pModelcliente.getCliNome() + "',"
                    + "cli_endereco = '" + pModelcliente.getCliEndereco() + "',"
                    + "cli_bairro = '" + pModelcliente.getCliBairro() + "',"
                    + "cli_cidade = '" + pModelcliente.getCliCidade() + "',"
                    + "cli_uf = '" + pModelcliente.getCliUf() + "',"
                    + "cli_cep = '" + pModelcliente.getCliCep() + "',"
                    + "cli_telefone = '" + pModelcliente.getCliTelefone() + "'"
                + " WHERE "
                    + "pk_id_cliente = '" + pModelcliente.getId_cliente() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui cliente
    * @param pId_cliente
    * @return boolean
    */
    public boolean excluirclienteDAO(int pId_cliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "pk_id_cliente = '" + pId_cliente + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}