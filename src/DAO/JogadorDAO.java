package DAO;

import Model.Jogador;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class JogadorDAO {
    private Session session;

    public JogadorDAO(Session session) {
        this.session = session;
    }

    public void salva(Jogador c) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(c);
        tx.commit();
    }

    public void remove(Jogador c) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(c);
        tx.commit();
    }

    public void atualiza(Jogador c) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(c);
        tx.commit();
    }
    
    public Jogador procura(int id) {
        return (Jogador) 
                this.session.load(Jogador.class, id);
    }

    public List<Jogador> listaTudo() {
        return this.session.createCriteria(
                Jogador.class).list();
    }
    
    public List<Jogador> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Jogador.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Jogador> listaJogador(int id){
        return session.createQuery(
                "from jogador where id>"+id).list();
    }
    
    public List <Jogador> listaJogadorSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Jogador.class).list();
    }
}
