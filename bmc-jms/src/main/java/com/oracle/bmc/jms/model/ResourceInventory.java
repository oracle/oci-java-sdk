/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Inventory of JMS resources in a compartment during a specified time period.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceInventory.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceInventory {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("activeFleetCount")
        private Integer activeFleetCount;

        public Builder activeFleetCount(Integer activeFleetCount) {
            this.activeFleetCount = activeFleetCount;
            this.__explicitlySet__.add("activeFleetCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
        private Integer managedInstanceCount;

        public Builder managedInstanceCount(Integer managedInstanceCount) {
            this.managedInstanceCount = managedInstanceCount;
            this.__explicitlySet__.add("managedInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jreCount")
        private Integer jreCount;

        public Builder jreCount(Integer jreCount) {
            this.jreCount = jreCount;
            this.__explicitlySet__.add("jreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installationCount")
        private Integer installationCount;

        public Builder installationCount(Integer installationCount) {
            this.installationCount = installationCount;
            this.__explicitlySet__.add("installationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
        private Integer applicationCount;

        public Builder applicationCount(Integer applicationCount) {
            this.applicationCount = applicationCount;
            this.__explicitlySet__.add("applicationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceInventory build() {
            ResourceInventory __instance__ =
                    new ResourceInventory(
                            activeFleetCount,
                            managedInstanceCount,
                            jreCount,
                            installationCount,
                            applicationCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceInventory o) {
            Builder copiedBuilder =
                    activeFleetCount(o.getActiveFleetCount())
                            .managedInstanceCount(o.getManagedInstanceCount())
                            .jreCount(o.getJreCount())
                            .installationCount(o.getInstallationCount())
                            .applicationCount(o.getApplicationCount());

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
     * The number of _active_ fleets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeFleetCount")
    Integer activeFleetCount;

    /**
     * The number of managed instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    Integer managedInstanceCount;

    /**
     * The number of Java Runtimes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreCount")
    Integer jreCount;

    /**
     * The number of Java installations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationCount")
    Integer installationCount;

    /**
     * The number of applications.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
    Integer applicationCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
