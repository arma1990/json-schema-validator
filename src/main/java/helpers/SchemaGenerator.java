package helpers;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.OptionPreset;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfig;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import com.github.victools.jsonschema.generator.SchemaVersion;
import model.GetPlaylistResponse;

public class SchemaGenerator {
    public static String generateSchema(Class<?> className) {
        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_6, OptionPreset.PLAIN_JSON);
        SchemaGeneratorConfig config = configBuilder.build();
        com.github.victools.jsonschema.generator.SchemaGenerator generator = new com.github.victools.jsonschema.generator.SchemaGenerator(config);
        JsonNode jsonSchema = generator.generateSchema(className);
        String schemaString = jsonSchema.toPrettyString();
        System.out.println(schemaString);
        return schemaString;
    }
}
