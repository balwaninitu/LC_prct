import java.util.ArrayList;
import java.util.Arrays;

public class AddBorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] picture = {"abc","xyz",
		           "ded"};
		
		ArrayList<String> edge = new ArrayList<>();
		
		String aster = "";
		
		//get length of first string 
	    int lengthPic = picture[0].length();
        //add two extra aster than length of first string hence length+2
   	    for(int i = 0; i < lengthPic + 2; i++) {
				aster = aster + "*";
		}
	    //add * front & at end to each element of array
	    for(int i = 0; i < picture.length; i++) {
				picture[i] = "*"+picture[i]+"*";
		}
	    //add first border
	    edge.add(aster);
		//add array element
	    for(int i = 0; i < picture.length; i++) {
	        edge.add(picture[i]);
	    }
			//add last border
      	    edge.add(aster);
	    //convert list to array and return
	    String[] result = edge.toArray(new String[edge.size()]);
	    
	   System.out.println(Arrays.toString(result));

	}

}
/*
 * 
 
String [] picture = {"abc","xyz",
"ded"};

ArrayList<> list = new ArrayList<>;
String aster ="";
//add * in front of array 2 more than length of first element
 for (i=0;i<picture[0].length+2;i++){
  aster = aster + "*";
 }
 
 //add * after each element
  for(i=0;i<picture.length;i++){
  picture[i] = "*"+picture[i]+"*"
  }
  list.add(aster)
  for(i=0;i<picture.length;i++){
  list.add[picture[i]
  }
 list.add(aster)
 
 //convert list to array
  String[] array = list.toArray(new String[list.size()])

System.out.println(Arrays.toString(result));
*/