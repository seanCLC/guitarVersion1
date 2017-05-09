package guitar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import GuitarEntity;
import jdbc.SQLiteJDBC;

public class GuitarDAO {
	private List<Guitar> guitars;
	private String sql;
	private Connection conn;
	private PreparedStatement pstmt;
	public Inventory() {
		guitars=new LinkedList<Guitar>();
	}
	
		
	}
	public List<Guitar> getGuitarLinkedList(){
		sql="select * from guitar;";  					
			try {
				pstmt =SQLiteJDBC.getConnection().prepareStatement(sql);      			
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()){
					String serialNumber = rs.getString("serialNumber");
					double price = rs.getDouble("price");
			        String builder = rs.getString("builder");
			        String model = rs.getString("model");
			        String type = rs.getString("type");
			        String backWood = rs.getString("backWood");
			        String topWood = rs.getString("topWood");
			        Guitar guitar=new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
					guitars.add(guitar);			    
				}
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return guitars;
		
	}
	public Guitar getGuitar(String serialNumber) {
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSerialNumber().equals(serialNumber)) {
	        return guitar;
	      }
	    }
	    return null;
	  }
	public Guitar search(Guitar searchGuitar) {
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      // Ignore serial number since that's unique
	      // Ignore price since that's unique
	      String builder = searchGuitar.getBuilder();
	      if ((builder != null) && (!builder.equals("")) &&
	          (!builder.equals(guitar.getBuilder().toLowerCase())))
	        continue;
	      String model = searchGuitar.getModel();
	      if ((model != null) && (!model.equals("")) &&
	          (!model.equals(guitar.getModel().toLowerCase())))
	        continue;
	      String type = searchGuitar.getType();
	      if ((type != null) && (!searchGuitar.equals("")) &&
	          (!type.equals(guitar.getType().toLowerCase())))
	        continue;
	      String backWood = searchGuitar.getBackWood();
	      if ((backWood != null) && (!backWood.equals("")) &&
	          (!backWood.equals(guitar.getBackWood().toLowerCase())))
	        continue;
	      String topWood = searchGuitar.getTopWood();
	      if ((topWood != null) && (!topWood.equals("")) &&
	          (!topWood.equals(guitar.getTopWood().toLowerCase())))
	        continue;
	      return guitar;
	    }
	    return null;
	  }
	
	


}
