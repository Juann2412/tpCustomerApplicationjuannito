/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package md.juannito.tpcustomerapplicationjuannito.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import md.juannito.tpcustomerapplicationjuannito.entities.DiscountCode;

/**
 *
 * @author ASUS ROG
 */
@Stateless
public class DiscountCodeManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    public List<DiscountCode> getAllDiscountCodes() {
        Query query = em.createNamedQuery("DiscountCode.findAll");
        return query.getResultList();
    }

    public DiscountCode findById(String discountCode) {
        return em.find(DiscountCode.class, discountCode);
    }

    public void persist(DiscountCode discountCode) {
        em.persist(discountCode);
    }
}
