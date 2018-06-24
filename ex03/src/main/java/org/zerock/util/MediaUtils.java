package org.zerock.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;

public class MediaUtils {


		private static Map<String, MediaType> MediaMap;

		static {

			MediaMap = new HashMap<String, MediaType>();
			MediaMap.put("JPG", MediaType.IMAGE_JPEG);
			MediaMap.put("GIF", MediaType.IMAGE_GIF);
			MediaMap.put("GIF", MediaType.IMAGE_PNG);
		}

		public static MediaType getMediaType(String type) {
			return MediaMap.get(type.toUpperCase());
		}

}
