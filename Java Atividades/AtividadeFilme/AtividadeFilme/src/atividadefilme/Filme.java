
package atividadefilme;

import javax.swing.JOptionPane;

/**
 *
 * @author Ian
 */
public class Filme {
    private String titulo;
    private String categoria;
    private boolean disponivel = true;

    public Filme(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    public void status()
    {
        JOptionPane.showMessageDialog(null, "Título: "+this.getTitulo());
        JOptionPane.showMessageDialog(null, "Categoria: "+this.getCategoria());
        if (this.disponivel == true)
        {
            JOptionPane.showMessageDialog(null, "Livro disponível");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Livro indisponível");
        }
    }
    
    public void alocar()
    {
        if (this.disponivel == true)
        {
            this.disponivel = false;
            JOptionPane.showMessageDialog(null, "Livro alugado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Livro indisponível");
        }
    }
    public void devolver()
    {
        this.disponivel = true;
    }
}
