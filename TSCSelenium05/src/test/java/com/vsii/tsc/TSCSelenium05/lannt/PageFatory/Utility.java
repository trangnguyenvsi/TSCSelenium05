package com.vsii.tsc.TSCSelenium05.lannt.PageFatory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {
		public static Properties readConfig() throws IOException {
		// Create new properties variable
		Properties p = new Properties();
		// Read object properties file
		InputStream stream = new FileInputStream("./properties/config.properties");
		// Load input stream file
		p.load(stream);
		return p;
		}
}
