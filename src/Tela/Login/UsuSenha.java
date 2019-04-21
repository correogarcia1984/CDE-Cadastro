/*
Clase que salva os dados pessoales do usuaro ligado ao programa
 */
package Tela.Login;

/**
 * @author ENGENHEIRO EDWIN BELY GARCIA HENO
 */
public class UsuSenha {    
    static int idUsuario;//variável que terá a identidade do usuario
    static String senha;//variável que terá a senha do usuario
    static String nome;//variável que terá o nome do usuario    
    static String autorizado = "Não";//variável que terá se a senha e identidade do usuario sao correta    

    
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
       
    public String getautorizado() {
        return autorizado;
    }

    public void setautorizado(String autorizado) {
        this.autorizado = autorizado;
    }
    
    public int getidUsuario() {
        return idUsuario;
    }

    public void setidUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }   
}
