package in.blogspot.randomcompiler.singleton.pattern.demo;

import in.blogspot.randomcompiler.singleton.pattern.impl.Configuration;


public class SingletonPatternDemo {

	public static void main(String[] args) {
		Configuration conf = Configuration.getConfiguration();
		conf.printConfiguration();
	}

}
