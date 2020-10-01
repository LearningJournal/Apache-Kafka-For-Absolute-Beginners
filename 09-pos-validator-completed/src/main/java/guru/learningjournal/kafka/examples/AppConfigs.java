package guru.learningjournal.kafka.examples;

public class AppConfigs {
    public final static String applicationID = "PosValidator";
    public final static String bootstrapServers = "localhost:9092,localhost:9093";
    public final static String groupID = "PosValidatorGroup";
    public final static String[] sourceTopicNames = {"pos"};
    public final static String validTopicName = "valid-pos";
    public final static String invalidTopicName = "invalid-pos";
}
