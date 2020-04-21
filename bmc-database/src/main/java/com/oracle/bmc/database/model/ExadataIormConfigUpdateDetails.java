/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * IORM Setting details for this Exadata System to be updated
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataIormConfigUpdateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExadataIormConfigUpdateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objective")
        private Objective objective;

        public Builder objective(Objective objective) {
            this.objective = objective;
            this.__explicitlySet__.add("objective");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbPlans")
        private java.util.List<DbIormConfigUpdateDetail> dbPlans;

        public Builder dbPlans(java.util.List<DbIormConfigUpdateDetail> dbPlans) {
            this.dbPlans = dbPlans;
            this.__explicitlySet__.add("dbPlans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataIormConfigUpdateDetails build() {
            ExadataIormConfigUpdateDetails __instance__ =
                    new ExadataIormConfigUpdateDetails(objective, dbPlans);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataIormConfigUpdateDetails o) {
            Builder copiedBuilder = objective(o.getObjective()).dbPlans(o.getDbPlans());

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
     * Value for the IORM objective
     * Default is \"Auto\"
     *
     **/
    public enum Objective {
        LowLatency("LOW_LATENCY"),
        HighThroughput("HIGH_THROUGHPUT"),
        Balanced("BALANCED"),
        Auto("AUTO"),
        Basic("BASIC"),
        ;

        private final String value;
        private static java.util.Map<String, Objective> map;

        static {
            map = new java.util.HashMap<>();
            for (Objective v : Objective.values()) {
                map.put(v.getValue(), v);
            }
        }

        Objective(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Objective create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Objective: " + key);
        }
    };
    /**
     * Value for the IORM objective
     * Default is \"Auto\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objective")
    Objective objective;

    /**
     * Array of IORM Setting for all the database in
     * this Exadata DB System
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbPlans")
    java.util.List<DbIormConfigUpdateDetail> dbPlans;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
