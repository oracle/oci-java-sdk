/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties related to a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
        private String sparkVersion;

        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            this.__explicitlySet__.add("sparkVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalExecutors")
        private Integer totalExecutors;

        public Builder totalExecutors(Integer totalExecutors) {
            this.totalExecutors = totalExecutors;
            this.__explicitlySet__.add("totalExecutors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceConfiguration build() {
            ResourceConfiguration __instance__ =
                    new ResourceConfiguration(
                            sparkVersion, driverShape, executorShape, totalExecutors);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceConfiguration o) {
            Builder copiedBuilder =
                    sparkVersion(o.getSparkVersion())
                            .driverShape(o.getDriverShape())
                            .executorShape(o.getExecutorShape())
                            .totalExecutors(o.getTotalExecutors());

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
     * The version of the spark used while creating an Oracle Cloud Infrastructure Data Flow application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    String sparkVersion;

    /**
     * The VM shape of the driver used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the driver cores and memory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    String driverShape;

    /**
     * The shape of the executor used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the executor cores and memory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    String executorShape;

    /**
     * Number of executor VMs requested while creating an Oracle Cloud Infrastructure Data Flow application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalExecutors")
    Integer totalExecutors;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
