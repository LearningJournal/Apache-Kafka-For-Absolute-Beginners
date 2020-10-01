package guru.learningjournal.kafka.examples;

class AppConfigs {
    final static String applicationID = "StorageDemo";
    final static String bootstrapServers = "localhost:9092,localhost:9093";
    final static String topicName = "invoice";
    final static int numEvents = 500000;
}
