package DAO;

import Model.Cidade;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class CidadeDAO {
    private Session session;

    public CidadeDAO(Session session) {
        this.session = session;
    }

    public void salva(Cidade c) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(c);
        tx.commit();
    }

    public void remove(Cidade c) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(c);
        tx.commit();
    }

    public void atualiza(Cidade c) {
        Transaction tx = this.session.beginTransaction();
        this.session.update(c);
        tx.commit();
    }
    
    public Cidade procura(int id) {
        return (Cidade) 
                this.session.load(Cidade.class, id);
    }

    public List<Cidade> listaTudo() {
        return this.session.createCriteria(
                Cidade.class).list();
    }
    
    public List<Cidade> pagina(int inicio, int quantia) {
        return this.session.createCriteria(Cidade.class)
                .setMaxResults(quantia)
                .setFirstResult(inicio).list();
    }

    public List <Cidade> listaCidades(int id){
        return session.createQuery(
                "from cidade where id>"+id).list();
    }
    
    public List <Cidade> listacidadesSQL(String sql){
        return session.createSQLQuery(sql).addEntity(
                Cidade.class).list();
    }
}
