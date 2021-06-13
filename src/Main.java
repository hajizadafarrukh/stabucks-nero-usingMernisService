import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;
import MernisService.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		
		Customer cust1 = new Customer();
		cust1.setId(1);
		cust1.setNationalityId("tcnumaranizToLong");
		cust1.setFirstName("adniziuppercase");
		cust1.setLastName("soyadinizUppercase");
		cust1.setDateofBirth(LocalDate.of(1990, 07, 15));
		Customer cust2 = new Customer();
		cust2.setNationalityId("2222222222");
		cust2.setId(2);
		cust2.setFirstName("Farrukh");
		cust2.setLastName("Hajizada");
		cust2.setDateofBirth(LocalDate.of(1900, 05, 14));
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		BaseCustomerManager starbucksCuustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		neroCustomerManager.save(cust1);
		neroCustomerManager.save(cust2);
		starbucksCuustomerManager.save(cust1);
		starbucksCuustomerManager.save(cust2);
		
		
//		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		//boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("tc numaraniz"), "isminiz-uppercase",
		//"soyadiniz uppercase", dogumyiliniz);
		
		//System.out.println("Dogrulama: "+ (result ? "successful" : "unsuccessful"));
	}
	

}
