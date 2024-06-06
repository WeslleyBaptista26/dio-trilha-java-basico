public class Usuario {
    private String cpf;
    private String dataNascimento;
    private String senha;

    public Usuario(String cpf, String dataNascimento, String senha) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
