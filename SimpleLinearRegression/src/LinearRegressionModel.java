
public class LinearRegressionModel {
	
	int i;

	double Total_Of_UpperPart = 0;
	double variance = 0;
	double covariance = 0;
	double TotalPartForCovariance = 0;
	double beta;
	double alpha;
	
	
	
	
	public void fit(double [] x, double []y){
		
		
		for( i = 0 ; i<x.length;i++){
			Total_Of_UpperPart += Math.pow((x[i] - meanX(x)), 2);
		}
		variance = Total_Of_UpperPart/(i-1);
		
		
		for( i = 0 ; i<x.length;i++){
			
			TotalPartForCovariance +=( (y[i]-meanY(y)) * (x[i]-meanX(x)));
	
			
		}
		
		
		covariance = TotalPartForCovariance/(i-1);	
		
		beta = covariance/variance;
		
		alpha = meanY(y) - (beta*meanX(x));
	
	
		
		
	}
	public double getBeta() {
		return beta;
	}

	public double getAlpha() {
		return alpha;
	}

	public double predict(double x){
		double y  = 0;
		
		y = (getBeta()*x)  + getAlpha();
		
		return y;
	}
	
	
	public double score(double [] x, double [] y){
		
		double sum_of_squares = 0;
		
		double residual_sum_of_squares = 0;
		
		for(int i = 0;i<y.length;i++){
			sum_of_squares += Math.pow(y[i]-meanY(y), 2);
			
			residual_sum_of_squares += Math.pow(y[i]-predict(x[i]), 2);
			
		}
		
		return (1-(residual_sum_of_squares/sum_of_squares));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double meanX(double [] x){
		
		double sum =0;
		double mean_X = 0;
		int i;
		
		for( i =0 ;i<x.length;i++ ){
			
			sum += x[i];					
		}
		mean_X = sum/(i);
		
		return mean_X;
	}
	
	public double  meanY(double [] y) {
		
		
		double sum =0;
		double mean_Y = 0;
		int i;
		
		for( i =0 ;i<y.length;i++ ){
			
			sum += y[i];					
		}
		mean_Y = sum/(i);
		
		return mean_Y;
		
	}
	 public double beta(double x,double y){
		 
		 return x/y;
	 }
	 
	 
	

}
