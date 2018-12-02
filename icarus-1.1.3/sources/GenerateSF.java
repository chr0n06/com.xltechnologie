
import com.xltechnologie.controller.utils.EncryptionUtils;
import com.xltechnologie.dao.CategoryDAO;
import com.xltechnologie.dao.HibernateUtil;
import com.xltechnologie.entities.Category;
import com.xltechnologie.entities.Member;
import com.xltechnologie.entities.Store;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author max_p
 */
public class GenerateSF {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            /*Create an object*/
 /*
            Member newMember = new Member("Alain", "Gignac", "gigal@hotmail.com", "soleil"); // Create a Member object         
            session.beginTransaction(); // Start transaction           
            session.save(newMember); //Save the Member
            session.getTransaction().commit(); // Commit the transaction 
             */

 /*Read object from database with ID */
 /*
            session.beginTransaction(); // Start transaction 
            Member myMember = (Member) session.get(Member.class, Long.parseLong("1"));
            System.out.println(myMember.getEmail());
            session.getTransaction().commit();
             */
 /*QUERY SELECT*/
 /*
            session.beginTransaction();
            
            List<Member> theMembers = session
                    .createQuery("from Member")
                    //.createQuery("from Member m where m.firstName='Maxime'")
                    .list();
            //Display Member
            for (Member member : theMembers) {
                System.out.println(member.toString());
            }
               
            session.getTransaction().commit();
            System.out.println("Done!");           
            
             */
 /*UPDATE*/
 /*
            session.beginTransaction(); // Start transaction 
            Member myMember = (Member) session.get(Member.class, Long.parseLong("1"));
            myMember.setPassword("FULZJsuuy0EAew/14X6m6Q==");
            System.out.println(myMember.getPassword());
            session.getTransaction().commit();
             */
 /*Create DAO*/
 /*
            MemberDAO dao = new MemberDAO();
            Member member = dao.getMemberById(Long.parseLong("1"));
            System.out.println(member.getPassword());
             */
 /*Login page*/
 /*
            String input = "Prieure4126"; //Method parameter
            EncryptionUtils eu = new EncryptionUtils();
            String hashedPwd = eu.encrypt(input);

            
            session.beginTransaction();
            String requete = "from Member where email = :param1 and password = :param2";
            Query query = session.createQuery(requete);
            query.setParameter("param1", "maxime.laniel@outlook.com");
            query.setParameter("param2", hashedPwd);
            List<Member> theMembers;
            theMembers = query.list();

            //Display Member
            if (theMembers.size() == 0) {
                System.out.println("Size of the list = " + theMembers.size());
                System.out.println("No Member has been founded!");
            } else {
                System.out.println("Size of the list = " + theMembers.size());
                for (Member member : theMembers) {
                    System.out.println(member.toString());
                }
            }

            //session.getTransaction().commit();
             */

 /*Collecting category*/
 /*
            session.beginTransaction();
            String requete = "from Category";
            Query query = session.createQuery(requete);
            List<Category> theCategories;
            theCategories = query.list();

            //Display Member
            if (theCategories.size() == 0) {
                System.out.println("Size of the list = " + theCategories.size());
                System.out.println("No Category has been founded!");
            } else {
                System.out.println("Size of the list = " + theCategories.size());
                for (Category category : theCategories) {
                    System.out.println(category.toString());
                }
            }

            //session.getTransaction().commit();
            System.out.println("Done!");
             */
 /*Collecting stores*/
 /*
            session.beginTransaction();
            List<Store> stores = session.getNamedQuery("selectAllStore")
                    .list();

            //Display Member
            if (stores.size() == 0) {
                System.out.println("Size of the list = " + stores.size());
                System.out.println("No Category has been founded!");
            } else {
                System.out.println("Size of the list = " + stores.size());
                for (Store store : stores) {
                    System.out.println(store.toString());
                }
            }

            //session.getTransaction().commit();
            session.close();
            System.out.println("Done!");
             */
 /*
 CategoryDAO categoryDAO = new CategoryDAO();
            //categoryDAO.createCategory(new Category("Escalade"));
            categoryDAO.updateCategory(Long.parseLong(String.valueOf(23)), "Sports");
             */
 
 /*
            CategoryDAO categoryDAO = new CategoryDAO();
            List<Category> categories = categoryDAO.getAllCategoriesByStoreID(Long.parseLong("3"));

            //Display
            if (categories.size() == 0) {
                System.out.println("No Category has been founded!");
            } else {
                System.out.println("Size of the list = " + categories.size());
                for (Category category : categories) {
                    System.out.println(category.getName());
                }
            }
            System.out.println("Done!");
*/
 
            Store store = new Store();
            store.setCategories(Long.parseLong("2"));
            for (Category x : store.getCategories()) {
                System.out.println(x.getName());
            }
            
                    
 
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            factory.close();
        }
    }
}
