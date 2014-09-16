package in.blogspot.randomcompiler.singleton.pattern.impl;

public class Configuration {
	private static Configuration instance = new Configuration();
	
	private Configuration() {
		
	}
	
	public static Configuration getConfiguration() {
		return instance;
	}

	public void printConfiguration() {
		System.out.println("Configuration");
	}
}
