/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author Admin
 */
public class ProdutoDAO {
    public void create(Produto p){
    
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO produtos (descricao, estoque, preco) VALUES (?,?,?)");
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao salvar " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
   public List<Produto> read (){
      Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Produto> produtos = new ArrayList();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
                    
            while (rs.next()){
            
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("estoque"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
   }  
   
   
   public void update(Produto p){
    
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE produtos SET descricao = ?, estoque = ?, preco = ? WHERE id = ?");
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4, p.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao atualizar " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
   
   
   
   public void delete(Produto p){
    
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE id = ?");
           
            stmt.setInt(1, p.getId());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
   
    
     public List<Produto> readForDesc(String desc){
      Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       List<Produto> produtos = new ArrayList();
       
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE descricao LIKE ?");
            stmt.setString(1,"%"+desc+ "%");
            rs = stmt.executeQuery();
                    
            while (rs.next()){
            
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("estoque"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
         ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return produtos;
   } 
    
}
