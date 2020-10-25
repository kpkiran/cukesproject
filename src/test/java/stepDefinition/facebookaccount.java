package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class facebookaccount {
	
	@Given("^I open facebook url$")
    public void i_open_facebook_url() throws Throwable {
        System.out.println("Facebook url opened");
    }
	
//	@And("^fill up the new account form with the following data$")
//    public void fill_up_the_new_account_form_with_the_following_data(DataTable data) throws Throwable {
//        List<Map<String, String>> mylist = data.asMaps(String.class, String.class);
//        System.out.println(mylist.get(0).get("First Name"));
//        System.out.println(mylist.get(0).get("Last Name"));
//        System.out.println(mylist.get(0).get("Phone No"));
//        System.out.println(mylist.get(0).get("Password"));
//        System.out.println(mylist.get(0).get("DOB day"));
//        System.out.println(mylist.get(0).get("DOB month"));
//        System.out.println(mylist.get(0).get("DOB year"));
//        System.out.println(mylist.get(0).get("Gender"));
//    }
	
//	@And("^fill up the new account form with the following data$")
//	public void fill_up_the_new_account_form_with_the_following_data(DataTable data) throws Throwable {
//		List<List<String>> mylist = data.asLists();
//		System.out.println(mylist.get(1).get(0));
//        System.out.println(mylist.get(1).get(1));
//        System.out.println(mylist.get(1).get(2));
//        System.out.println(mylist.get(1).get(3));
//        System.out.println(mylist.get(1).get(4));
//        System.out.println(mylist.get(1).get(5));
//        System.out.println(mylist.get(1).get(6));
//        System.out.println(mylist.get(1).get(7));
//	}
	
	@And("^fill up the new account form with the following data$")
	public void fill_up_the_new_account_form_with_the_following_data(DataTable data) throws Throwable {
		List<Map<String, String>> mylist = data.asMaps(String.class, String.class);
 		for (int i = 0; i <= mylist.size() ; i++ ) {
 			System.out.println(mylist.get(i).get("First Name"));
 			System.out.println(mylist.get(i).get("Last Name"));
 			System.out.println(mylist.get(i).get("Phone No"));
 			System.out.println(mylist.get(i).get("Password"));
 			System.out.println(mylist.get(i).get("DOB day"));
 			System.out.println(mylist.get(i).get("DOB month"));
 			System.out.println(mylist.get(i).get("DOB year"));
 			System.out.println(mylist.get(i).get("Gender"));
 		}
	}
}
