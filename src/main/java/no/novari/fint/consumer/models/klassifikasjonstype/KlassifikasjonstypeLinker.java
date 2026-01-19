package no.novari.fint.consumer.models.klassifikasjonstype;

import no.novari.fint.model.resource.arkiv.kodeverk.KlassifikasjonstypeResource;
import no.novari.fint.model.resource.arkiv.kodeverk.KlassifikasjonstypeResources;
import no.novari.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class KlassifikasjonstypeLinker extends FintLinker<KlassifikasjonstypeResource> {

    public KlassifikasjonstypeLinker() {
        super(KlassifikasjonstypeResource.class);
    }

    public void mapLinks(KlassifikasjonstypeResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public KlassifikasjonstypeResources toResources(Collection<KlassifikasjonstypeResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public KlassifikasjonstypeResources toResources(Stream<KlassifikasjonstypeResource> stream, int offset, int size, int totalItems) {
        KlassifikasjonstypeResources resources = new KlassifikasjonstypeResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(KlassifikasjonstypeResource klassifikasjonstype) {
        return getAllSelfHrefs(klassifikasjonstype).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(KlassifikasjonstypeResource klassifikasjonstype) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(klassifikasjonstype.getSystemId()) && !isEmpty(klassifikasjonstype.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(klassifikasjonstype.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(KlassifikasjonstypeResource klassifikasjonstype) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(klassifikasjonstype.getSystemId()) && !isEmpty(klassifikasjonstype.getSystemId().getIdentifikatorverdi())) {
            builder.add(klassifikasjonstype.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

