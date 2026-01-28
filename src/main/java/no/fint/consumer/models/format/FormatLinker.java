package no.fint.consumer.models.format;

import no.novari.fint.model.resource.arkiv.kodeverk.FormatResource;
import no.novari.fint.model.resource.arkiv.kodeverk.FormatResources;
import no.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class FormatLinker extends FintLinker<FormatResource> {

    public FormatLinker() {
        super(FormatResource.class);
    }

    public void mapLinks(FormatResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public FormatResources toResources(Collection<FormatResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public FormatResources toResources(Stream<FormatResource> stream, int offset, int size, int totalItems) {
        FormatResources resources = new FormatResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(FormatResource format) {
        return getAllSelfHrefs(format).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(FormatResource format) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(format.getSystemId()) && !isEmpty(format.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(format.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(FormatResource format) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(format.getSystemId()) && !isEmpty(format.getSystemId().getIdentifikatorverdi())) {
            builder.add(format.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

