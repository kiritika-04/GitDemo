package TestProject;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="Hospital_Orders")
public class Orders {
	@Column(name="orderid")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String order_name;
	private int quantity;
	private int price;
	
	public Orders() {
		
	}
	
	public Orders(String order_name,int quantity,int price) {
		this.order_name=order_name;
		this.quantity=quantity;
		this.price=price;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", order_name=" + order_name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
}
