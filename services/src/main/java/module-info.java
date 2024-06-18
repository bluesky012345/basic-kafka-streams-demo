import io.github.bluesky012345.basic.kafka.streams.demo.services.HandleOccurrenceServiceDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module basic.kafka.streams.demo.services {
    requires transitive basic.kafka.streams.demo.api;

    exports io.github.bluesky012345.basic.kafka.streams.demo.services;

    provides ComponentDescriptor with
            HandleOccurrenceServiceDescriptor;
}
