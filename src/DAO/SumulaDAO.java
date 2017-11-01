package DAO;

import Model.Sumula;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class SumulaDAO {
    private Session session;

    public SumulaDAO(Session session) {
        this.session = session;
    }

    public void salva(Sumula c) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(c);
        tx.commit();
    }

    public void remove(Sumula c) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(c);
        tx.commit();
    }

    public void atualiza(Sumula c) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(c);
        tx.commit();
    }
    
    public Sumula procura(int id) {
        return (Sumula) 
                this.session.load(Sumula.class, id);
    }

    public List<Sumula> listaTudo() {
        return this.session.createCriteria(
                Sumula.class).list();
    }
    
    public List<Sumula> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Sumula.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Sumula> listaSumulas(int id){
        return session.createQuery(
                "from time where id>"+id).list();
    }
    
    public List <Sumula> listaSumulasSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Sumula.class).list();
    }
}
