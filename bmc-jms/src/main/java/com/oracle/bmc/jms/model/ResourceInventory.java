/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceInventory.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceInventory {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeFleetCount",
        "managedInstanceCount",
        "jreCount",
        "installationCount",
        "applicationCount"
    })
    public ResourceInventory(
            Integer activeFleetCount,
            Integer managedInstanceCount,
            Integer jreCount,
            Integer installationCount,
            Integer applicationCount) {
        super();
        this.activeFleetCount = activeFleetCount;
        this.managedInstanceCount = managedInstanceCount;
        this.jreCount = jreCount;
        this.installationCount = installationCount;
        this.applicationCount = applicationCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of _active_ fleets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeFleetCount")
    private final Integer activeFleetCount;

    public Integer getActiveFleetCount() {
        return activeFleetCount;
    }

    /**
     * The number of managed instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    private final Integer managedInstanceCount;

    public Integer getManagedInstanceCount() {
        return managedInstanceCount;
    }

    /**
     * The number of Java Runtimes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jreCount")
    private final Integer jreCount;

    public Integer getJreCount() {
        return jreCount;
    }

    /**
     * The number of Java installations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationCount")
    private final Integer installationCount;

    public Integer getInstallationCount() {
        return installationCount;
    }

    /**
     * The number of applications.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
    private final Integer applicationCount;

    public Integer getApplicationCount() {
        return applicationCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceInventory(");
        sb.append("activeFleetCount=").append(String.valueOf(this.activeFleetCount));
        sb.append(", managedInstanceCount=").append(String.valueOf(this.managedInstanceCount));
        sb.append(", jreCount=").append(String.valueOf(this.jreCount));
        sb.append(", installationCount=").append(String.valueOf(this.installationCount));
        sb.append(", applicationCount=").append(String.valueOf(this.applicationCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceInventory)) {
            return false;
        }

        ResourceInventory other = (ResourceInventory) o;
        return java.util.Objects.equals(this.activeFleetCount, other.activeFleetCount)
                && java.util.Objects.equals(this.managedInstanceCount, other.managedInstanceCount)
                && java.util.Objects.equals(this.jreCount, other.jreCount)
                && java.util.Objects.equals(this.installationCount, other.installationCount)
                && java.util.Objects.equals(this.applicationCount, other.applicationCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeFleetCount == null ? 43 : this.activeFleetCount.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceCount == null
                                ? 43
                                : this.managedInstanceCount.hashCode());
        result = (result * PRIME) + (this.jreCount == null ? 43 : this.jreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.installationCount == null ? 43 : this.installationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationCount == null ? 43 : this.applicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
