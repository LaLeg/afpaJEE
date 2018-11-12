package fr.leghtas.client.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

	private static Logger LOGGER = LoggerFactory.getLogger(Utils.class);
	/* Méthode : Vérification Email */
	public static Boolean verifierEmail(String email) {
		Boolean correct = true;
		if (email == null) {
			LOGGER.info("L'adresse mail est null");
			correct = false;
		}else if ("".equals(email)) {
			LOGGER.info("L'adresse mail est vide");
			correct = false;
		}else if (!email.contains("@")) {
			LOGGER.info("L'adresse mail n'est pas valide : ne conient pas le caractère @");
			correct = false;
		}else if (!email.endsWith(".fr")&& !email.endsWith(".com")) {
			LOGGER.info("L'adresse mail n'est pas valide : ne contient pas le .fr ou .com à la fin");
			correct = false;
		}

		return correct;

	}
}
