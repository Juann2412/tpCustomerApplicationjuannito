/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package md.juannito.tpcustomerapplicationjuannito.managedbeans;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import md.juannito.tpcustomerapplicationjuannito.entities.Customer;
import md.juannito.tpcustomerapplicationjuannito.session.CustomerManager;


/**
 * Backing bean de la page CustomerList.xhtml.
 */
@Named(value = "customerMBean")  
@ViewScoped  
public class CustomerMBean implements Serializable {  
  private List<Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  
        
  public CustomerMBean() {  }  
        
  /** 
   * Retourne la liste des clients pour affichage dans une DataTable 
   * @return 
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
