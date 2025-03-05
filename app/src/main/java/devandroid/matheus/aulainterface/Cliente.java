package devandroid.matheus.aulainterface;

import android.util.Log;

//implementando a interface em uma classe
public class Cliente implements ICrud {
    private static final String TAG = "CRUD: ";
    private String nome;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir Cliente");
    }

    @Override
    public void listar() {
        Log.i(TAG, "listar Clientes");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "alterar Cliente");
    }

    @Override
    public void deletar() {
        Log.i(TAG, "excluir Cliente");
    }
}
