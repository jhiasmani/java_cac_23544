package ar.com.codoacodo.interfaces;

public class MainLogger {

	
	public static void main(String[] args) {
		
		
		Ilogger[] loggers = new Ilogger[3];
		loggers[0] = LoogerManager.getLogger("A");
		loggers[1] = LoogerManager.getLogger("B");
		loggers[2] = LoogerManager.getLogger("C");
		
		for(Ilogger ilogger:loggers) {
		
		 ilogger.log();
		}
	}

	/*
	 *********************************************
	 *Main sin vector
	 
	 ********************************************* 
	 
	public static void main(String[] args) {
	String target = getTargetFromDB();
	LoogerManager lm = new LoogerManager(target);
	Ilogger logger = lm.getLogger();
	looger.log();
	}//aca termina el main
	
	public static String getTargetFromDB() {
   
		return "A";
		
	}*/
	
}
