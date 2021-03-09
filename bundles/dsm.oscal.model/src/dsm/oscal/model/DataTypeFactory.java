package dsm.oscal.model;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

public class DataTypeFactory {

	public static URI createURIFromString(String it) {
		if (it == null) {
			return null;
		} else {
			try {
				return new URI(it);
			} catch (URISyntaxException e) {
				OSCALModelActivator.logError("Unable to transform " + it + " into a valid URI : " + e.getMessage(), e);
				return null;
			}
		}
	}

	public static String createStringFromURI(URI it) {
		if (it == null) {
			return null;
		} else {
			return it.toASCIIString();
		}
	}

	public static UUID createUUIDFromString(String it) {
		if (it == null) {
			return null;
		} else {
			try {
				return UUID.fromString(it);
			} catch (IllegalArgumentException e) {
				OSCALModelActivator.logError("Unable to transform " + it + " into a valid UUID : " + e.getMessage(), e);
				return null;

			}
		}
	}

	public static String createStringFromUUID(UUID it) {
		if (it == null) {
			return null;
		} else {
			return it.toString();
		}
	}
}
