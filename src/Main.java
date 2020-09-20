import java.math.BigDecimal;

import com.solid.example.Client;
import com.solid.example.Delivery;
import com.solid.example.DeliveryToCompany;
import com.solid.example.Payment;
import com.solid.example.Transaction;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Oscar Duarte", "111", 123456);
		Client counterpart = new Client("Sergio Duarte", "222", 234567);
		Transaction T1 = new Delivery();
		T1.setClient(client);
		T1.setCounterpart(counterpart);
		T1.setValue(BigDecimal.valueOf(15000));
		T1.saveTransaction();
		
		Transaction T2 = new DeliveryToCompany();
		T2.setClient(client);
		T2.setCounterpart(counterpart);
		T2.setValue(BigDecimal.valueOf(15000));
		T2.saveTransaction();
		
		Transaction P1 = new Payment();
		P1.setClient(client);
		P1.setCounterpart(counterpart);
		P1.setValue(BigDecimal.valueOf(15000));
		P1.saveTransaction();
	}

}
