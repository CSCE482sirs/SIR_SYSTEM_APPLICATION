package util;
/**
 * 
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;
import pojo.Product;
import pojo.Developer;
import pojo.User;
/**
 * @author Chris
 *
 */
public interface DatabaseInterfaceBase {

	public abstract SIR_Config getConfig( Developer dev );
	public abstract List<Product> get_products( Developer Dev);
	public abstract Map<Product, Map<Product, Double>> get_products_collaborative_vectors( Developer dev, Collection<Product> products );
	public abstract Map<Product, Map<String, Double>> get_products_content_vector( Developer dev, Collection<Product> products );
	public abstract Map<Product, Double> get_user_collaborative_vector( Developer dev, Collection<Product> products, User user );
	public abstract Map<String, Double> get_user_content_vector( Developer dev, User user );
}
