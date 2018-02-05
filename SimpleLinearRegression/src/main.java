
public class main {
	
	
	public static void main(String [] args){
		
		LinearRegressionModel linearmodel = new LinearRegressionModel();
		
		double [] x = {8,9,11,16,12};
		double  [] y = {11,8.5,15,18,11};
		
		
		
		linearmodel.fit(x, y);
		System.out.println(linearmodel.predict(14));
		
		System.out.println(linearmodel.score(x, y));
		
		
	}

}
