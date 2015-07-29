package note.pattern.behavioral.Visitor.sample;

import note.pattern.behavioral.Visitor.sample.customer.Customer;

public class Service {
	private Visitor visitor = new VisitorImpl();
    public void doService(Customer customer) {
        customer.doCustomer();
        ((Visitable) customer).accept(visitor);
        customer.pay();
    }
}
