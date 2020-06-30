/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * The usage metrics for a request.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RequestUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RequestUsage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("readUnitsConsumed")
        private Integer readUnitsConsumed;

        public Builder readUnitsConsumed(Integer readUnitsConsumed) {
            this.readUnitsConsumed = readUnitsConsumed;
            this.__explicitlySet__.add("readUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("writeUnitsConsumed")
        private Integer writeUnitsConsumed;

        public Builder writeUnitsConsumed(Integer writeUnitsConsumed) {
            this.writeUnitsConsumed = writeUnitsConsumed;
            this.__explicitlySet__.add("writeUnitsConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestUsage build() {
            RequestUsage __instance__ = new RequestUsage(readUnitsConsumed, writeUnitsConsumed);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestUsage o) {
            Builder copiedBuilder =
                    readUnitsConsumed(o.getReadUnitsConsumed())
                            .writeUnitsConsumed(o.getWriteUnitsConsumed());

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
     * Read Units consumed by this operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readUnitsConsumed")
    Integer readUnitsConsumed;

    /**
     * Write Units consumed by this operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeUnitsConsumed")
    Integer writeUnitsConsumed;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
