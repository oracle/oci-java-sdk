/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The request details for retrieving metric definitions. Specify optional properties to filter the returned results.
 * Use an asterisk (\"\\*\") as a wildcard character, placed anywhere in the string.
 * For example, to search for all metrics with names that begin with \"disk\", specify \"name\" as \"disk\\*\".
 * If no properties are specified, then all metric definitions within the request scope are returned.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ListMetricsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ListMetricsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensionFilters")
        private java.util.Map<String, String> dimensionFilters;

        public Builder dimensionFilters(java.util.Map<String, String> dimensionFilters) {
            this.dimensionFilters = dimensionFilters;
            this.__explicitlySet__.add("dimensionFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private java.util.List<String> groupBy;

        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListMetricsDetails build() {
            ListMetricsDetails __instance__ =
                    new ListMetricsDetails(
                            name, namespace, dimensionFilters, groupBy, sortBy, sortOrder);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListMetricsDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .namespace(o.getNamespace())
                            .dimensionFilters(o.getDimensionFilters())
                            .groupBy(o.getGroupBy())
                            .sortBy(o.getSortBy())
                            .sortOrder(o.getSortOrder());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The metric name to use when searching for metric definitions.
     * <p>
     * Example: `CpuUtilization`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The source service or application to use when searching for metric definitions.
     * <p>
     * Example: `oci_computeagent`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * Qualifiers that you want to use when searching for metric definitions.
     * Available dimensions vary by metric namespace. Each dimension takes the form of a key-value pair.
     * <p>
     * Example: { \"resourceId\": \"<var>&lt;instance_OCID&gt;</var>\" }
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionFilters")
    java.util.Map<String, String> dimensionFilters;

    /**
     * Group metrics by these fields in the response. For example, to list all metric namespaces available
     * in a compartment, groupBy the \"namespace\" field.
     * <p>
     * Example - group by namespace and resource:
     * `[ \"namespace\", \"resourceId\" ]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    java.util.List<String> groupBy;
    /**
     * The field to use when sorting returned metric definitions. Only one sorting level is provided.
     * <p>
     * Example: `NAMESPACE`
     *
     **/
    public enum SortBy {
        Namespace("NAMESPACE"),
        Name("NAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SortBy: " + key);
        }
    };
    /**
     * The field to use when sorting returned metric definitions. Only one sorting level is provided.
     * <p>
     * Example: `NAMESPACE`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    SortBy sortBy;
    /**
     * The sort order to use when sorting returned metric definitions. Ascending (ASC) or
     * descending (DESC).
     * <p>
     * Example: `ASC`
     *
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid SortOrder: " + key);
        }
    };
    /**
     * The sort order to use when sorting returned metric definitions. Ascending (ASC) or
     * descending (DESC).
     * <p>
     * Example: `ASC`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    SortOrder sortOrder;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
