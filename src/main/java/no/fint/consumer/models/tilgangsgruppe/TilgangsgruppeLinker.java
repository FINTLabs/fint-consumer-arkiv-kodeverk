package no.fint.consumer.models.tilgangsgruppe;

import no.fint.model.resource.arkiv.kodeverk.TilgangsgruppeResource;
import no.fint.model.resource.arkiv.kodeverk.TilgangsgruppeResources;
import no.fint.relations.FintLinker;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

@Component
public class TilgangsgruppeLinker extends FintLinker<TilgangsgruppeResource> {

    public TilgangsgruppeLinker() {
        super(TilgangsgruppeResource.class);
    }

    public void mapLinks(TilgangsgruppeResource resource) {
        super.mapLinks(resource);
    }

    @Override
    public TilgangsgruppeResources toResources(Collection<TilgangsgruppeResource> collection) {
        return toResources(collection.stream(), 0, 0, collection.size());
    }

    @Override
    public TilgangsgruppeResources toResources(Stream<TilgangsgruppeResource> stream, int offset, int size, int totalItems) {
        TilgangsgruppeResources resources = new TilgangsgruppeResources();
        stream.map(this::toResource).forEach(resources::addResource);
        addPagination(resources, offset, size, totalItems);
        return resources;
    }

    @Override
    public String getSelfHref(TilgangsgruppeResource tilgangsgruppe) {
        return getAllSelfHrefs(tilgangsgruppe).findFirst().orElse(null);
    }

    @Override
    public Stream<String> getAllSelfHrefs(TilgangsgruppeResource tilgangsgruppe) {
        Stream.Builder<String> builder = Stream.builder();
        if (!isNull(tilgangsgruppe.getSystemId()) && !isEmpty(tilgangsgruppe.getSystemId().getIdentifikatorverdi())) {
            builder.add(createHrefWithId(tilgangsgruppe.getSystemId().getIdentifikatorverdi(), "systemid"));
        }
        
        return builder.build();
    }

    int[] hashCodes(TilgangsgruppeResource tilgangsgruppe) {
        IntStream.Builder builder = IntStream.builder();
        if (!isNull(tilgangsgruppe.getSystemId()) && !isEmpty(tilgangsgruppe.getSystemId().getIdentifikatorverdi())) {
            builder.add(tilgangsgruppe.getSystemId().getIdentifikatorverdi().hashCode());
        }
        
        return builder.build().toArray();
    }

}

