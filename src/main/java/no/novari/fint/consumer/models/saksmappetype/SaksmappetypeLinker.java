package no.novari.fint.consumer.models.saksmappetype;

import no.novari.fint.model.resource.arkiv.kodeverk.SaksmappetypeResource;
import no.novari.fint.model.resource.arkiv.kodeverk.SaksmappetypeResources;
import no.novari.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class SaksmappetypeLinker extends FintLinker<SaksmappetypeResource> {

    public SaksmappetypeLinker() {
        super(SaksmappetypeResource.class);
    }

    public void mapLinks(SaksmappetypeResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public SaksmappetypeResources toResources(Collection<SaksmappetypeResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public SaksmappetypeResources toResources(Stream<SaksmappetypeResource> stream, int offset, int size, int totalItems) {
        SaksmappetypeResources resources = new SaksmappetypeResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(SaksmappetypeResource saksmappetype) {
        return getAllSelfHrefs(saksmappetype).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(SaksmappetypeResource saksmappetype) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(saksmappetype.getSystemId()) && !isEmpty(saksmappetype.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(saksmappetype.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(SaksmappetypeResource saksmappetype) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(saksmappetype.getSystemId()) && !isEmpty(saksmappetype.getSystemId().getIdentifikatorverdi())) {
            builder.add(saksmappetype.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

