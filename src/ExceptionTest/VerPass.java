package ExceptionTest;

public class VerPass {

	public VerPass() {
		
	}
	
	public void verRes(String password)throws MyException{
		
		if(password.length() > 6 || password.length() < 4){
			MyException e = new MyException("密码不符合格式要求，应由4-6位数字组成");
			throw e;
		}else{
			for(int i = 0;i < password.length(); i++){
				if(!(password.charAt(i) >= '0' && password.charAt(i) <='9')){
					MyException e = new MyException("密码不符合格式要求，应由4-6位数字组成");
					throw e;
				}
			}
			
		}
	}
}
