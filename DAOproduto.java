package DAO;

import model.ModelProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author caio oliveira
*/
public class DAOproduto extends ConexaoMySql {

    /**
    * grava produto
    * @param pModelproduto
    * @return int
    */
    public int salvarprodutoDAO(ModelProdutos pModelproduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                + ") VALUES ("
                    + "'" + pModelproduto.getProNome() + "',"
                    + "'" + pModelproduto.getProValor() + "',"
                    + "'" + pModelproduto.getProEstoque() + "'"
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
    * recupera produto
    * @param pIdproduto
    * @return Modelproduto
    */
    public ModelProdutos retornarprodutoDAO(int pIdproduto){
        ModelProdutos modelprodutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " pk_id_produto = '" + pIdproduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelprodutos.setIdProduto(this.getResultSet().getInt(1));
                modelprodutos.setProNome(this.getResultSet().getString(2));
                modelprodutos.setProValor(this.getResultSet().getDouble(3));
                modelprodutos.setProEstoque(this.getResultSet().getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelprodutos;
    }

    
    public ModelProdutos retornarprodutoDAO(String pNomeProduto){
        ModelProdutos modelprodutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " pro_nome = '" + pNomeProduto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelprodutos.setIdProduto(this.getResultSet().getInt(1));
                modelprodutos.setProNome(this.getResultSet().getString(2));
                modelprodutos.setProValor(this.getResultSet().getDouble(3));
                modelprodutos.setProEstoque(this.getResultSet().getInt(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelprodutos;
    }
    
    /**
    * recupera uma lista de produto
        * @return ArrayList
    */
    public ArrayList<ModelProdutos> retornarListaprodutoDAO(){
        ArrayList<ModelProdutos> listamodelproduto = new ArrayList();
        ModelProdutos modelproduto = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + " pro_nome,"
                    + " pro_valor,"
                    + " pro_estoque"
                 + " FROM"
                     + " tbl_produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelproduto = new ModelProdutos();
                modelproduto.setIdProduto(this.getResultSet().getInt(1));
                modelproduto.setProNome(this.getResultSet().getString(2));
                modelproduto.setProValor(this.getResultSet().getDouble(3));
                modelproduto.setProEstoque(this.getResultSet().getInt(4));
                listamodelproduto.add(modelproduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelproduto;
    }

    /**
    * atualiza produto
    * @param pModelproduto
    * @return boolean
    */
    public boolean atualizarprodutoDAO(ModelProdutos pModelproduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelproduto.getIdProduto() + "',"
                    + " pro_nome = '" + pModelproduto.getProNome() + "',"
                    + " pro_valor = '" + pModelproduto.getProValor() + "',"
                    + " pro_estoque = '" + pModelproduto.getProEstoque() + "'"
                + " WHERE "
                    + "pk_id_produto = '" + pModelproduto.getIdProduto() + "'"
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
    * exclui produto
    * @param pIdproduto
    * @return boolean
    */
    public boolean excluirprodutoDAO(int pIdproduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_produto "
                + " WHERE "
                    + "pk_id_produto = '" + pIdproduto + "'"
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
     * alterar dados do produto
     * @param pModelProdutos
     * @return  boolean 
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos){
        try{
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET"
                    +" pro_nome = '" + pModelProdutos.getProNome()+"',"
                    +" pro_valor = '" + pModelProdutos.getProValor()+"',"
                    +" pro_estoque = '" + pModelProdutos.getProEstoque()+"',"
                    + " WHERE pk_id_produto = '" + pModelProdutos.getIdProduto()+"'"
            );
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally {
            this.fecharConexao();
        }
    }

    public boolean alterarEstoqueProdutoDAO(ArrayList<ModelProdutos> plistaModelProduto) {
        try {
            this.conectar();
            for(int i = 0; i < plistaModelProduto.size(); i++){
                this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET"
                    +" pro_estoque = '" + plistaModelProduto.get(i).getProEstoque()+"',"
                    + " WHERE pk_id_produto = '" + plistaModelProduto.get(i).getIdProduto()+"'"
                );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally {
            this.fecharConexao();
        }
    }  
}