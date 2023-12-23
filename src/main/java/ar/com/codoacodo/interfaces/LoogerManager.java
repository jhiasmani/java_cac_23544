package ar.com.codoacodo.interfaces;

//LA logica es que se tiene que elegir una clase segun

public class LoogerManager {

	private String target;
	
	//el this no puede ser utilizado en un metodo estatico porque
	//el objeto no puede ser instanciado
	
	public static Ilogger getLogger(String target) {
	 	 
		//A> FsLogger
		//B> EmailLooger
		//C> SMSLoger
		//instanciamos
		
		//elegimos esta forma para :
		//Interface i = new ClaseQueImplementa();
		
		//Ilogger i = new SMSLogger();
		//Ilogger i2 = new FSLooger();
		//Ilogger i3 = new EmailLogger();
		
		Ilogger logger;
		switch (target) {
			case "A":
				logger = new SMSLogger();
				((SMSLogger)logger).setNumber("3132123");
				break;
			case "B":
				logger = new FSLooger();
				break;
			case "C":
				logger = new EmailLogger();
				break;
			default:
				logger = null;
		}
		return logger;
	}
		
	public LoogerManager(String target) {
		this.target = target;
		
	}
	
	public  Ilogger getLogger() {
		 
			//A> FsLogger
			//B> EmailLooger
			//C> SMSLoger
			//Interface i = new ClaseQueImplementa();
		
			Ilogger logger;
			switch (this.target) {
				case "A":
					logger = new SMSLogger();
					((SMSLogger)logger).setNumber("3132123");
					break;
				case "B":
					logger = new FSLooger();
					break;
				case "C":
					logger = new EmailLogger();
					break;
				default:
					logger = null;
			}
			return logger;
			
			
		}

	
	
}
