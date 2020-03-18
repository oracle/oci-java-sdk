/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifications for the putting of a table row.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateRowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateRowDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.Map<String, Object> value;

        public Builder value(java.util.Map<String, Object> value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("option")
        private Option option;

        public Builder option(Option option) {
            this.option = option;
            this.__explicitlySet__.add("option");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGetReturnRow")
        private Boolean isGetReturnRow;

        public Builder isGetReturnRow(Boolean isGetReturnRow) {
            this.isGetReturnRow = isGetReturnRow;
            this.__explicitlySet__.add("isGetReturnRow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
        private Integer timeoutInMs;

        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            this.__explicitlySet__.add("timeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTtlUseTableDefault")
        private Boolean isTtlUseTableDefault;

        public Builder isTtlUseTableDefault(Boolean isTtlUseTableDefault) {
            this.isTtlUseTableDefault = isTtlUseTableDefault;
            this.__explicitlySet__.add("isTtlUseTableDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityCacheSize")
        private Integer identityCacheSize;

        public Builder identityCacheSize(Integer identityCacheSize) {
            this.identityCacheSize = identityCacheSize;
            this.__explicitlySet__.add("identityCacheSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isExactMatch")
        private Boolean isExactMatch;

        public Builder isExactMatch(Boolean isExactMatch) {
            this.isExactMatch = isExactMatch;
            this.__explicitlySet__.add("isExactMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRowDetails build() {
            UpdateRowDetails __instance__ =
                    new UpdateRowDetails(
                            compartmentId,
                            value,
                            option,
                            isGetReturnRow,
                            timeoutInMs,
                            ttl,
                            isTtlUseTableDefault,
                            identityCacheSize,
                            isExactMatch);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRowDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .value(o.getValue())
                            .option(o.getOption())
                            .isGetReturnRow(o.getIsGetReturnRow())
                            .timeoutInMs(o.getTimeoutInMs())
                            .ttl(o.getTtl())
                            .isTtlUseTableDefault(o.getIsTtlUseTableDefault())
                            .identityCacheSize(o.getIdentityCacheSize())
                            .isExactMatch(o.getIsExactMatch());

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
     * The OCID of the table's compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and compartmentId is supplied, the latter
     * must match the identified table's compartmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The map of values from a row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    java.util.Map<String, Object> value;
    /**
     * Specifies a condition for the put operation.
     **/
    public enum Option {
        IfAbsent("IF_ABSENT"),
        IfPresent("IF_PRESENT"),
        ;

        private final String value;
        private static java.util.Map<String, Option> map;

        static {
            map = new java.util.HashMap<>();
            for (Option v : Option.values()) {
                map.put(v.getValue(), v);
            }
        }

        Option(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Option create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Option: " + key);
        }
    };
    /**
     * Specifies a condition for the put operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("option")
    Option option;

    /**
     * If true, and the put fails due to an option setting, then
     * the existing row will be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGetReturnRow")
    Boolean isGetReturnRow;

    /**
     * Timeout setting for the put.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    Integer timeoutInMs;

    /**
     * Time-to-live for the row, in days.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    Integer ttl;

    /**
     * If true, set time-to-live for this row to the table's default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTtlUseTableDefault")
    Boolean isTtlUseTableDefault;

    /**
     * Sets the number of generated identity values that are
     * requested from the server during a put. If present and greater than 0,
     * this value takes precedence over a default value for the table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identityCacheSize")
    Integer identityCacheSize;

    /**
     * If present and true, the presented row value must exactly
     * match the table's schema.  Otherwise, rows with missing
     * non-key fields or extra fields can be written successfully.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isExactMatch")
    Boolean isExactMatch;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
