
public class FileIoTest {

	public static void main(String[] args) {
		String s = "a,b,c,d,e,f,g\n1,2,3,4,5,6,7\np,q,r,s,t,u,v"; //3 rows with 7 characters
		//you can concatenate s+= "1,2,3,4,5,6,7\n";
		//s+= "p,1,r,s,t,u,v";
		String[] rows = s.split("\n") ; //\n is delimiter, splits list on \n                //{"a","b","c","d","e"};


		for(String row : rows) {
		//	System.out.println(row);
			String[] cols = row.split(",");
			for(String col : cols) {
				System.out.print(col + "\t"); //tab
			}
			System.out.println();
		}
	}

}
