package DAO;

import Model.Time;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class TimeDAO {
    private Session session;

    public TimeDAO(Session session) {
        this.session = session;
    }

    public void salva(Time c) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(c);
        tx.commit();
    }

    public void remove(Time c) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(c);
        tx.commit();
    }

    public void atualiza(Time c) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(c);
        tx.commit();
    }
    
    public Time procura(int id) {
        return (Time) 
                this.session.load(Time.class, id);
    }

    public List<Time> listaTudo() {
        return this.session.createCriteria(
                Time.class).list();
    }
    
    public List<Time> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Time.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Time> listaTimes(int id){
        return session.createQuery(
                "from time where id>"+id).list();
    }
    
    public List <Time> listaTimesSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Time.class).list();
    }
}
