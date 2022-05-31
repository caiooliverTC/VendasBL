/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOproduto;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author caio
 */
public class ControllerProdutos {
    
        private DAOproduto daoProdutos = new DAOproduto();
        
        
        /**
         * salvar produtos controller
         * @param pModelProdutos
         * @return int
         */
        public int salvarProdutoController(ModelProdutos pModelProdutos){
            return this.daoProdutos.salvarprodutoDAO(pModelProdutos);
        }
        
        /**
         * excluir um produto pelo codigo
         * @param pCodigo
         * @return boolean
         */
        public boolean excluirProdutoController(int pCodigo){
            return this.daoProdutos.excluirprodutoDAO(pCodigo);
        }
        
        /**
         * alterar protudo
         * @param pModelProdutos
         * @return boolean
         */
        public boolean atualizarProdutoController(ModelProdutos pModelProdutos){
            return this.daoProdutos.atualizarprodutoDAO(pModelProdutos);
        }
        
        /**
         * retornar produto pelo codigo
         * @param pCodigo
         * @return modelProduto
         */
        public ModelProdutos retornarProdutoController(int pCodigo){
            return this.daoProdutos.retornarprodutoDAO(pCodigo);
        }
        
        /**
         * retornar produto pelo codigo
         * @param pNomeProduto
         * @return modelProduto
         */
        public ModelProdutos retornarProdutoController(String pNomeProduto){
            return this.daoProdutos.retornarprodutoDAO(pNomeProduto);
        }
        
        /**
         * retornar uma lista de produtos
         * @return lista model produtos
         */
        public ArrayList<ModelProdutos>retornarListaProdutoController(){
            return this.daoProdutos.retornarListaprodutoDAO();
        }

    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> plistaModelProduto) {
        return this.daoProdutos.alterarEstoqueProdutoDAO(plistaModelProduto);
    }
}
