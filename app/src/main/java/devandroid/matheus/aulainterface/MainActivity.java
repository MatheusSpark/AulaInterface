package devandroid.matheus.aulainterface;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //criando objeto cliente para poder ultilizar
    Cliente cliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //criando um novo objeto cliente
        cliente = new Cliente();
        cliente.setNome("Maddo");
        cliente.setEmail("teste@teste.com");

        //ultilizando os métodos da interface CRUD

        cliente.incluir();
        cliente.alterar();
        cliente.listar();
        cliente.deletar();


    }
}