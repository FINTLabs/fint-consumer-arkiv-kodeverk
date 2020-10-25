package no.fint.consumer.models.journalposttype;

import no.fint.model.resource.arkiv.kodeverk.JournalpostTypeResource;
import no.fint.model.resource.arkiv.kodeverk.JournalpostTypeResources;
import no.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class JournalpostTypeLinker extends FintLinker<JournalpostTypeResource> {

    public JournalpostTypeLinker() {
        super(JournalpostTypeResource.class);
    }

    public void mapLinks(JournalpostTypeResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public JournalpostTypeResources toResources(Collection<JournalpostTypeResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public JournalpostTypeResources toResources(Stream<JournalpostTypeResource> stream, int offset, int size, int totalItems) {
        JournalpostTypeResources resources = new JournalpostTypeResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(JournalpostTypeResource journalposttype) {
        return getAllSelfHrefs(journalposttype).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(JournalpostTypeResource journalposttype) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(journalposttype.getSystemId()) && !isEmpty(journalposttype.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(journalposttype.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(JournalpostTypeResource journalposttype) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(journalposttype.getSystemId()) && !isEmpty(journalposttype.getSystemId().getIdentifikatorverdi())) {
            builder.add(journalposttype.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

