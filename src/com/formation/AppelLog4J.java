package com.formation;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class AppelLog4J
 */

public class AppelLog4J {

	private static Logger logger = Logger.getLogger(AppelLog4J.class);

	public static void main(String[] args) {
		logger.debug("Ceci est debug");
		logger.info("Ceci est une info");
		logger.warn("Ceci est un warning");
		logger.error("Attention erreur");
		logger.fatal("Vous ne voyez pas ce message");
	}

}
