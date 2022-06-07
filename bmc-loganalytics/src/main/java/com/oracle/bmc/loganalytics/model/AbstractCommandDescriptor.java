/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Generic command descriptor defining all attributes common to all querylanguage commands for parse output.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name",
    defaultImpl = AbstractCommandDescriptor.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TopCommandDescriptor.class,
        name = "TOP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HighlightCommandDescriptor.class,
        name = "HIGHLIGHT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MultiSearchCommandDescriptor.class,
        name = "MULTI_SEARCH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CompareCommandDescriptor.class,
        name = "COMPARE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StatsCommandDescriptor.class,
        name = "STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeCompareCommandDescriptor.class,
        name = "TIME_COMPARE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TailCommandDescriptor.class,
        name = "TAIL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RegexCommandDescriptor.class,
        name = "REGEX"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeltaCommandDescriptor.class,
        name = "DELTA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LookupCommandDescriptor.class,
        name = "LOOKUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DemoModeCommandDescriptor.class,
        name = "DEMO_MODE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FieldSummaryCommandDescriptor.class,
        name = "FIELD_SUMMARY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GeoStatsCommandDescriptor.class,
        name = "GEO_STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = JsonExtractCommandDescriptor.class,
        name = "JSON_EXTRACT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MapCommandDescriptor.class,
        name = "MAP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EventStatsCommandDescriptor.class,
        name = "EVENT_STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HighlightGroupsCommandDescriptor.class,
        name = "HIGHLIGHT_GROUPS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WhereCommandDescriptor.class,
        name = "WHERE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterSplitCommandDescriptor.class,
        name = "CLUSTER_SPLIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeStatsCommandDescriptor.class,
        name = "TIME_STATS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterCommandDescriptor.class,
        name = "CLUSTER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterDetailsCommandDescriptor.class,
        name = "CLUSTER_DETAILS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeleteCommandDescriptor.class,
        name = "DELETE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClusterCompareCommandDescriptor.class,
        name = "CLUSTER_COMPARE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SearchCommandDescriptor.class,
        name = "SEARCH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BucketCommandDescriptor.class,
        name = "BUCKET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CommandDescriptor.class,
        name = "COMMAND"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DistinctCommandDescriptor.class,
        name = "DISTINCT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LinkCommandDescriptor.class,
        name = "LINK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SortCommandDescriptor.class,
        name = "SORT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExtractCommandDescriptor.class,
        name = "EXTRACT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NlpCommandDescriptor.class,
        name = "NLP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BottomCommandDescriptor.class,
        name = "BOTTOM"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FieldsCommandDescriptor.class,
        name = "FIELDS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HighlightRowsCommandDescriptor.class,
        name = "HIGHLIGHT_ROWS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MacroCommandDescriptor.class,
        name = "MACRO"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClassifyCommandDescriptor.class,
        name = "CLASSIFY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LinkDetailsCommandDescriptor.class,
        name = "LINK_DETAILS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SearchLookupCommandDescriptor.class,
        name = "SEARCH_LOOKUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HeadCommandDescriptor.class,
        name = "HEAD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateViewCommandDescriptor.class,
        name = "CREATE_VIEW"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AddFieldsCommandDescriptor.class,
        name = "ADD_FIELDS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EvalCommandDescriptor.class,
        name = "EVAL"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RenameCommandDescriptor.class,
        name = "RENAME"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = XmlExtractCommandDescriptor.class,
        name = "XML_EXTRACT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AbstractCommandDescriptor {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayQueryString",
        "internalQueryString",
        "category",
        "referencedFields",
        "declaredFields"
    })
    protected AbstractCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields) {
        super();
        this.displayQueryString = displayQueryString;
        this.internalQueryString = internalQueryString;
        this.category = category;
        this.referencedFields = referencedFields;
        this.declaredFields = declaredFields;
    }

    /**
     * Command fragment display string from user specified query string formatted by query builder.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
    private final String displayQueryString;

    public String getDisplayQueryString() {
        return displayQueryString;
    }

    /**
     * Command fragment internal string from user specified query string formatted by query builder.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
    private final String internalQueryString;

    public String getInternalQueryString() {
        return internalQueryString;
    }

    /**
     * querylanguage command designation for example; reporting vs filtering
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    public String getCategory() {
        return category;
    }

    /**
     * Fields referenced in command fragment from user specified query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
    private final java.util.List<AbstractField> referencedFields;

    public java.util.List<AbstractField> getReferencedFields() {
        return referencedFields;
    }

    /**
     * Fields declared in command fragment from user specified query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
    private final java.util.List<AbstractField> declaredFields;

    public java.util.List<AbstractField> getDeclaredFields() {
        return declaredFields;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AbstractCommandDescriptor(");
        sb.append("displayQueryString=").append(String.valueOf(this.displayQueryString));
        sb.append(", internalQueryString=").append(String.valueOf(this.internalQueryString));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", referencedFields=").append(String.valueOf(this.referencedFields));
        sb.append(", declaredFields=").append(String.valueOf(this.declaredFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractCommandDescriptor)) {
            return false;
        }

        AbstractCommandDescriptor other = (AbstractCommandDescriptor) o;
        return java.util.Objects.equals(this.displayQueryString, other.displayQueryString)
                && java.util.Objects.equals(this.internalQueryString, other.internalQueryString)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.referencedFields, other.referencedFields)
                && java.util.Objects.equals(this.declaredFields, other.declaredFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.displayQueryString == null
                                ? 43
                                : this.displayQueryString.hashCode());
        result =
                (result * PRIME)
                        + (this.internalQueryString == null
                                ? 43
                                : this.internalQueryString.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedFields == null ? 43 : this.referencedFields.hashCode());
        result =
                (result * PRIME)
                        + (this.declaredFields == null ? 43 : this.declaredFields.hashCode());
        return result;
    }

    /**
     * Name of querylanguage command
     *
     **/
    public enum Name {
        Command("COMMAND"),
        Search("SEARCH"),
        Stats("STATS"),
        GeoStats("GEO_STATS"),
        TimeStats("TIME_STATS"),
        Sort("SORT"),
        Fields("FIELDS"),
        AddFields("ADD_FIELDS"),
        Link("LINK"),
        LinkDetails("LINK_DETAILS"),
        Cluster("CLUSTER"),
        ClusterDetails("CLUSTER_DETAILS"),
        ClusterSplit("CLUSTER_SPLIT"),
        Eval("EVAL"),
        Extract("EXTRACT"),
        JsonExtract("JSON_EXTRACT"),
        XmlExtract("XML_EXTRACT"),
        EventStats("EVENT_STATS"),
        Bucket("BUCKET"),
        Classify("CLASSIFY"),
        Top("TOP"),
        Bottom("BOTTOM"),
        Head("HEAD"),
        Tail("TAIL"),
        FieldSummary("FIELD_SUMMARY"),
        Regex("REGEX"),
        Rename("RENAME"),
        TimeCompare("TIME_COMPARE"),
        Where("WHERE"),
        ClusterCompare("CLUSTER_COMPARE"),
        Delete("DELETE"),
        Delta("DELTA"),
        Distinct("DISTINCT"),
        SearchLookup("SEARCH_LOOKUP"),
        Lookup("LOOKUP"),
        DemoMode("DEMO_MODE"),
        Macro("MACRO"),
        MultiSearch("MULTI_SEARCH"),
        Highlight("HIGHLIGHT"),
        HighlightRows("HIGHLIGHT_ROWS"),
        HighlightGroups("HIGHLIGHT_GROUPS"),
        CreateView("CREATE_VIEW"),
        Map("MAP"),
        Nlp("NLP"),
        Compare("COMPARE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Name.class);

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Name', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
