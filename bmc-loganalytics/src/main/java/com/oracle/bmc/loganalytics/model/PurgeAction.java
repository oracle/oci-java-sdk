/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Purge action for scheduled task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PurgeAction.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PurgeAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("purgeDuration")
        private String purgeDuration;

        public Builder purgeDuration(String purgeDuration) {
            this.purgeDuration = purgeDuration;
            this.__explicitlySet__.add("purgeDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("purgeCompartmentId")
        private String purgeCompartmentId;

        public Builder purgeCompartmentId(String purgeCompartmentId) {
            this.purgeCompartmentId = purgeCompartmentId;
            this.__explicitlySet__.add("purgeCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
        private Boolean compartmentIdInSubtree;

        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            this.__explicitlySet__.add("compartmentIdInSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PurgeAction build() {
            PurgeAction __instance__ =
                    new PurgeAction(
                            queryString,
                            dataType,
                            purgeDuration,
                            purgeCompartmentId,
                            compartmentIdInSubtree);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PurgeAction o) {
            Builder copiedBuilder =
                    queryString(o.getQueryString())
                            .dataType(o.getDataType())
                            .purgeDuration(o.getPurgeDuration())
                            .purgeCompartmentId(o.getPurgeCompartmentId())
                            .compartmentIdInSubtree(o.getCompartmentIdInSubtree());

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

    @Deprecated
    public PurgeAction(
            String queryString,
            StorageDataType dataType,
            String purgeDuration,
            String purgeCompartmentId,
            Boolean compartmentIdInSubtree) {
        super();
        this.queryString = queryString;
        this.dataType = dataType;
        this.purgeDuration = purgeDuration;
        this.purgeCompartmentId = purgeCompartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
    }

    /**
     * Purge query string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    String queryString;

    /**
     * the type of the log data to be purged
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    StorageDataType dataType;

    /**
     * The duration of data to be retained, which is used to
     * calculate the timeDataEnded when the task fires.
     * The value should be negative.
     * Purge duration in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The largest supported unit is D, e.g. -P365D (not -P1Y) or -P14D (not -P2W).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeDuration")
    String purgeDuration;

    /**
     * the compartment OCID under which the data will be purged
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeCompartmentId")
    String purgeCompartmentId;

    /**
     * if true, purge child compartments data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIdInSubtree")
    Boolean compartmentIdInSubtree;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
