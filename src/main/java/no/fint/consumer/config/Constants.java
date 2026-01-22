package no.fint.consumer.config;

public enum Constants {
;

    public static final String COMPONENT = "arkiv-kodeverk";
    public static final String COMPONENT_CONSUMER = COMPONENT + " consumer";
    public static final String CACHE_SERVICE = "CACHE_SERVICE";

    
    public static final String CACHE_INITIALDELAY_DOKUMENTSTATUS = "${fint.consumer.cache.initialDelay.dokumentstatus:900000}";
    public static final String CACHE_FIXEDRATE_DOKUMENTSTATUS = "${fint.consumer.cache.fixedRate.dokumentstatus:900000}";
    
    public static final String CACHE_INITIALDELAY_DOKUMENTTYPE = "${fint.consumer.cache.initialDelay.dokumenttype:1000000}";
    public static final String CACHE_FIXEDRATE_DOKUMENTTYPE = "${fint.consumer.cache.fixedRate.dokumenttype:900000}";
    
    public static final String CACHE_INITIALDELAY_FORMAT = "${fint.consumer.cache.initialDelay.format:1100000}";
    public static final String CACHE_FIXEDRATE_FORMAT = "${fint.consumer.cache.fixedRate.format:900000}";
    
    public static final String CACHE_INITIALDELAY_JOURNALPOSTTYPE = "${fint.consumer.cache.initialDelay.journalposttype:1200000}";
    public static final String CACHE_FIXEDRATE_JOURNALPOSTTYPE = "${fint.consumer.cache.fixedRate.journalposttype:900000}";
    
    public static final String CACHE_INITIALDELAY_JOURNALSTATUS = "${fint.consumer.cache.initialDelay.journalstatus:1300000}";
    public static final String CACHE_FIXEDRATE_JOURNALSTATUS = "${fint.consumer.cache.fixedRate.journalstatus:900000}";
    
    public static final String CACHE_INITIALDELAY_KLASSIFIKASJONSTYPE = "${fint.consumer.cache.initialDelay.klassifikasjonstype:1400000}";
    public static final String CACHE_FIXEDRATE_KLASSIFIKASJONSTYPE = "${fint.consumer.cache.fixedRate.klassifikasjonstype:900000}";
    
    public static final String CACHE_INITIALDELAY_KORRESPONDANSEPARTTYPE = "${fint.consumer.cache.initialDelay.korrespondanseparttype:1500000}";
    public static final String CACHE_FIXEDRATE_KORRESPONDANSEPARTTYPE = "${fint.consumer.cache.fixedRate.korrespondanseparttype:900000}";
    
    public static final String CACHE_INITIALDELAY_MERKNADSTYPE = "${fint.consumer.cache.initialDelay.merknadstype:1600000}";
    public static final String CACHE_FIXEDRATE_MERKNADSTYPE = "${fint.consumer.cache.fixedRate.merknadstype:900000}";
    
    public static final String CACHE_INITIALDELAY_PARTROLLE = "${fint.consumer.cache.initialDelay.partrolle:1700000}";
    public static final String CACHE_FIXEDRATE_PARTROLLE = "${fint.consumer.cache.fixedRate.partrolle:900000}";
    
    public static final String CACHE_INITIALDELAY_ROLLE = "${fint.consumer.cache.initialDelay.rolle:1800000}";
    public static final String CACHE_FIXEDRATE_ROLLE = "${fint.consumer.cache.fixedRate.rolle:900000}";
    
    public static final String CACHE_INITIALDELAY_SAKSMAPPETYPE = "${fint.consumer.cache.initialDelay.saksmappetype:1900000}";
    public static final String CACHE_FIXEDRATE_SAKSMAPPETYPE = "${fint.consumer.cache.fixedRate.saksmappetype:900000}";
    
    public static final String CACHE_INITIALDELAY_SAKSSTATUS = "${fint.consumer.cache.initialDelay.saksstatus:2000000}";
    public static final String CACHE_FIXEDRATE_SAKSSTATUS = "${fint.consumer.cache.fixedRate.saksstatus:900000}";
    
    public static final String CACHE_INITIALDELAY_SKJERMINGSHJEMMEL = "${fint.consumer.cache.initialDelay.skjermingshjemmel:2100000}";
    public static final String CACHE_FIXEDRATE_SKJERMINGSHJEMMEL = "${fint.consumer.cache.fixedRate.skjermingshjemmel:900000}";
    
    public static final String CACHE_INITIALDELAY_TILGANGSGRUPPE = "${fint.consumer.cache.initialDelay.tilgangsgruppe:2200000}";
    public static final String CACHE_FIXEDRATE_TILGANGSGRUPPE = "${fint.consumer.cache.fixedRate.tilgangsgruppe:900000}";
    
    public static final String CACHE_INITIALDELAY_TILGANGSRESTRIKSJON = "${fint.consumer.cache.initialDelay.tilgangsrestriksjon:2300000}";
    public static final String CACHE_FIXEDRATE_TILGANGSRESTRIKSJON = "${fint.consumer.cache.fixedRate.tilgangsrestriksjon:900000}";
    
    public static final String CACHE_INITIALDELAY_TILKNYTTETREGISTRERINGSOM = "${fint.consumer.cache.initialDelay.tilknyttetregistreringsom:2400000}";
    public static final String CACHE_FIXEDRATE_TILKNYTTETREGISTRERINGSOM = "${fint.consumer.cache.fixedRate.tilknyttetregistreringsom:900000}";
    
    public static final String CACHE_INITIALDELAY_VARIANTFORMAT = "${fint.consumer.cache.initialDelay.variantformat:2500000}";
    public static final String CACHE_FIXEDRATE_VARIANTFORMAT = "${fint.consumer.cache.fixedRate.variantformat:900000}";
    

}
