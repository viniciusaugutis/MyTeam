package DAO;

import Model.Arbitro;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ArbitroDAO {
    private Session session;

    public ArbitroDAO(Session session) {
        this.session = session;
    }

    public void salva(Arbitro c) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(c);
        tx.commit();
    }

    public void remove(Arbitro c) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(c);
        tx.commit();
    }

    public void atualiza(Arbitro c) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(c);
        tx.commit();
    }
    
    public Arbitro procura(int id) {
        return (Arbitro) 
                this.session.load(Arbitro.class, id);
    }

    public List<Arbitro> listaTudo() {
        return this.session.createCriteria(
                Arbitro.class).list();
    }
    
    public List<Arbitro> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Arbitro.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Arbitro> listaArbitros(int id){
        return session.createQuery(
                "from arbitro where id>"+id).list();
    }
    
    public List <Arbitro> listaArbitrosSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Arbitro.class).list();
    }
}
