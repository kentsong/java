package httpclient.demo.util;

public class ParamsUnit {
	
	public static String parseArrayParams(Integer[] args){
		StringBuilder sb = new StringBuilder();
		if(args != null && args.length > 0){
			for(int i=0; i<args.length; i++){
				if(i==0){
					sb.append(args[i]);
				} else{
					sb.append(","+args[i]);
				}
			}
		}
		
		return sb.toString();
	}

	public static String parseArrayParams(String[] args){
		StringBuilder sb = new StringBuilder();
		if(args != null && args.length > 0){
			for(int i=0; i<args.length; i++){
				if(i==0){
					sb.append(args[i]);
				} else{
					sb.append(","+args[i]);
				}
			}
		}
		
		return sb.toString();
	}
	

}
