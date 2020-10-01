package guru.learningjournal.kafka.examples;

class AppConfigs {
    final static String applicationID = "Multi-Threaded-Producer";
    final static String topicName = "nse-eod-topic";
    final static String kafkaConfigFileLocation = "kafka.properties";
    final static String[] eventFiles = {"data/NSE05NOV2018BHAV.csv","data/NSE06NOV2018BHAV.csv"};
}
