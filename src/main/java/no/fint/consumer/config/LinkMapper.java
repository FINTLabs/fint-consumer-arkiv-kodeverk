package no.fint.consumer.config;

import no.fint.consumer.utils.RestEndpoints;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

import no.fint.model.arkiv.kodeverk.*;

public class LinkMapper {

    public static Map<String, String> linkMapper(String contextPath) {
        return ImmutableMap.<String,String>builder()
            .put(DokumentStatus.class.getName(), contextPath + RestEndpoints.DOKUMENTSTATUS)
            .put(DokumentType.class.getName(), contextPath + RestEndpoints.DOKUMENTTYPE)
            .put(JournalpostType.class.getName(), contextPath + RestEndpoints.JOURNALPOSTTYPE)
            .put(JournalStatus.class.getName(), contextPath + RestEndpoints.JOURNALSTATUS)
            .put(Klassifikasjonstype.class.getName(), contextPath + RestEndpoints.KLASSIFIKASJONSTYPE)
            .put(KorrespondansepartType.class.getName(), contextPath + RestEndpoints.KORRESPONDANSEPARTTYPE)
            .put(Merknadstype.class.getName(), contextPath + RestEndpoints.MERKNADSTYPE)
            .put(PartRolle.class.getName(), contextPath + RestEndpoints.PARTROLLE)
            .put(Rolle.class.getName(), contextPath + RestEndpoints.ROLLE)
            .put(Saksstatus.class.getName(), contextPath + RestEndpoints.SAKSSTATUS)
            .put(Skjermingshjemmel.class.getName(), contextPath + RestEndpoints.SKJERMINGSHJEMMEL)
            .put(Tilgangsrestriksjon.class.getName(), contextPath + RestEndpoints.TILGANGSRESTRIKSJON)
            .put(TilknyttetRegistreringSom.class.getName(), contextPath + RestEndpoints.TILKNYTTETREGISTRERINGSOM)
            .put(Variantformat.class.getName(), contextPath + RestEndpoints.VARIANTFORMAT)
            /* .put(TODO,TODO) */
            .build();
    }

}
