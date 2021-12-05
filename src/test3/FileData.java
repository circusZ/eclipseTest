package test3;

import java.io.Serializable;

public class FileData implements Serializable{
	private double data[] = new double[5];

	public FileData(double d1,double d2,double d3,double d4,double d5) {
		data[0] = d1; 
		data[1] = d2; 
		data[2] = d3; 
		data[3] = d4; 
		data[4] = d5; 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s1 = "";
		for(int i=0;i<5;i++){
			s1 += data[i];
			s1 += ",";
		}
		return s1;
	}
	
	
	public void dataSort(){
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				if(data[j] < data[j+1]){
					double temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	
}