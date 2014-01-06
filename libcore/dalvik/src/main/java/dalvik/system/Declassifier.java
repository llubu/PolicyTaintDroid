package dalvik.system;

import dalvik.system.Taint;

public class Declassifier {

	private static Declassifier instance = null;
	private boolean flag;
	private String source;
	private String sink;
	private Declassifier(){
		
		
	}
	public static Declassifier getInstance(){
		if(instance ==  null){
			instance = new Declassifier();
		}
		return instance;
	}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getSink() {
		return sink;
	}
	public void setSink(String sink) {
		this.sink = sink;
	}
	
	public void untaint(String str){
		if(instance.isFlag()){
			System.out.println("untainting in declassifier");
			Taint.addTaintString(str, Taint.NO_TAINT);
			
	    }
		return;
	}
}
