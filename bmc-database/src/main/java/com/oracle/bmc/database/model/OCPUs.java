/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The details of the available and consumed CPU cores of the Autonomous Exadata Infrastructure instance, including consumption by database workload type.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OCPUs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class OCPUs {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpu")
        private Float totalCpu;

        public Builder totalCpu(Float totalCpu) {
            this.totalCpu = totalCpu;
            this.__explicitlySet__.add("totalCpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consumedCpu")
        private Float consumedCpu;

        public Builder consumedCpu(Float consumedCpu) {
            this.consumedCpu = consumedCpu;
            this.__explicitlySet__.add("consumedCpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("byWorkloadType")
        private WorkloadType byWorkloadType;

        public Builder byWorkloadType(WorkloadType byWorkloadType) {
            this.byWorkloadType = byWorkloadType;
            this.__explicitlySet__.add("byWorkloadType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OCPUs build() {
            OCPUs __instance__ = new OCPUs(totalCpu, consumedCpu, byWorkloadType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OCPUs o) {
            Builder copiedBuilder =
                    totalCpu(o.getTotalCpu())
                            .consumedCpu(o.getConsumedCpu())
                            .byWorkloadType(o.getByWorkloadType());

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
     * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpu")
    Float totalCpu;

    /**
     * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumedCpu")
    Float consumedCpu;

    @com.fasterxml.jackson.annotation.JsonProperty("byWorkloadType")
    WorkloadType byWorkloadType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
