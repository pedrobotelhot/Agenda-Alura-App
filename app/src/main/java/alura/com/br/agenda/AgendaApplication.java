package alura.com.br.agenda;

import android.app.Application;

import alura.com.br.agenda.dao.AlunoDAO;
import alura.com.br.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Alex", "2312312321", "alex@gmail.com"));
        dao.salva(new Aluno("Fran", "21231231321", "fran@gmail.com"));
    }
}
