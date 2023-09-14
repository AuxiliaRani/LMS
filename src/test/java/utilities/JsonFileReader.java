package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class JsonFileReader {

	public static List<ProgramPOJO> readJosnDataFromFile() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		InputStream in = new FileInputStream(new File(ConfigReader.getJsonFilePath()));
		CollectionType collectionType = mapper.getTypeFactory().constructCollectionType(List.class, ProgramPOJO.class);

		List<ProgramPOJO> listPrograms = mapper.readValue(in, collectionType);
		return listPrograms;
	}

}
