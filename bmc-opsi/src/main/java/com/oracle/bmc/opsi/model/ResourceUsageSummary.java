/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains resource usage summary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceUsageSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exadataInsightId",
        "exadataDisplayName",
        "usage",
        "capacity",
        "utilizationPercent",
        "usageChangePercent",
        "totalHostCapacity"
    })
    public ResourceUsageSummary(
            String exadataInsightId,
            String exadataDisplayName,
            Double usage,
            Double capacity,
            Double utilizationPercent,
            Double usageChangePercent,
            Double totalHostCapacity) {
        super();
        this.exadataInsightId = exadataInsightId;
        this.exadataDisplayName = exadataDisplayName;
        this.usage = usage;
        this.capacity = capacity;
        this.utilizationPercent = utilizationPercent;
        this.usageChangePercent = usageChangePercent;
        this.totalHostCapacity = totalHostCapacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         * @param exadataInsightId the value to set
         * @return this builder
         **/
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }
        /**
         * The user-friendly name for the Exadata system. The name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
        private String exadataDisplayName;

        /**
         * The user-friendly name for the Exadata system. The name does not have to be unique.
         * @param exadataDisplayName the value to set
         * @return this builder
         **/
        public Builder exadataDisplayName(String exadataDisplayName) {
            this.exadataDisplayName = exadataDisplayName;
            this.__explicitlySet__.add("exadataDisplayName");
            return this;
        }
        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         * @param usage the value to set
         * @return this builder
         **/
        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }
        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE) for a set of databases.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE) for a set of databases.
         *
         * @param capacity the value to set
         * @return this builder
         **/
        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }
        /**
         * Resource utilization in percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
        private Double utilizationPercent;

        /**
         * Resource utilization in percentage
         * @param utilizationPercent the value to set
         * @return this builder
         **/
        public Builder utilizationPercent(Double utilizationPercent) {
            this.utilizationPercent = utilizationPercent;
            this.__explicitlySet__.add("utilizationPercent");
            return this;
        }
        /**
         * Change in resource utilization in percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        /**
         * Change in resource utilization in percentage
         * @param usageChangePercent the value to set
         * @return this builder
         **/
        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }
        /**
         * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only applies to CPU and does not not apply for Autonomous Databases.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalHostCapacity")
        private Double totalHostCapacity;

        /**
         * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only applies to CPU and does not not apply for Autonomous Databases.
         *
         * @param totalHostCapacity the value to set
         * @return this builder
         **/
        public Builder totalHostCapacity(Double totalHostCapacity) {
            this.totalHostCapacity = totalHostCapacity;
            this.__explicitlySet__.add("totalHostCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceUsageSummary build() {
            ResourceUsageSummary model =
                    new ResourceUsageSummary(
                            this.exadataInsightId,
                            this.exadataDisplayName,
                            this.usage,
                            this.capacity,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.totalHostCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceUsageSummary model) {
            if (model.wasPropertyExplicitlySet("exadataInsightId")) {
                this.exadataInsightId(model.getExadataInsightId());
            }
            if (model.wasPropertyExplicitlySet("exadataDisplayName")) {
                this.exadataDisplayName(model.getExadataDisplayName());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("utilizationPercent")) {
                this.utilizationPercent(model.getUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("usageChangePercent")) {
                this.usageChangePercent(model.getUsageChangePercent());
            }
            if (model.wasPropertyExplicitlySet("totalHostCapacity")) {
                this.totalHostCapacity(model.getTotalHostCapacity());
            }
            return this;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * @return the value
     **/
    public String getExadataInsightId() {
        return exadataInsightId;
    }

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
    private final String exadataDisplayName;

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     * @return the value
     **/
    public String getExadataDisplayName() {
        return exadataDisplayName;
    }

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Double usage;

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     * @return the value
     **/
    public Double getUsage() {
        return usage;
    }

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE) for a set of databases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Double capacity;

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE) for a set of databases.
     *
     * @return the value
     **/
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Resource utilization in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
    private final Double utilizationPercent;

    /**
     * Resource utilization in percentage
     * @return the value
     **/
    public Double getUtilizationPercent() {
        return utilizationPercent;
    }

    /**
     * Change in resource utilization in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
    private final Double usageChangePercent;

    /**
     * Change in resource utilization in percentage
     * @return the value
     **/
    public Double getUsageChangePercent() {
        return usageChangePercent;
    }

    /**
     * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only applies to CPU and does not not apply for Autonomous Databases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalHostCapacity")
    private final Double totalHostCapacity;

    /**
     * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only applies to CPU and does not not apply for Autonomous Databases.
     *
     * @return the value
     **/
    public Double getTotalHostCapacity() {
        return totalHostCapacity;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(", exadataDisplayName=").append(String.valueOf(this.exadataDisplayName));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", utilizationPercent=").append(String.valueOf(this.utilizationPercent));
        sb.append(", usageChangePercent=").append(String.valueOf(this.usageChangePercent));
        sb.append(", totalHostCapacity=").append(String.valueOf(this.totalHostCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceUsageSummary)) {
            return false;
        }

        ResourceUsageSummary other = (ResourceUsageSummary) o;
        return java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.exadataDisplayName, other.exadataDisplayName)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.utilizationPercent, other.utilizationPercent)
                && java.util.Objects.equals(this.usageChangePercent, other.usageChangePercent)
                && java.util.Objects.equals(this.totalHostCapacity, other.totalHostCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDisplayName == null
                                ? 43
                                : this.exadataDisplayName.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result =
                (result * PRIME)
                        + (this.utilizationPercent == null
                                ? 43
                                : this.utilizationPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.usageChangePercent == null
                                ? 43
                                : this.usageChangePercent.hashCode());
        result =
                (result * PRIME)
                        + (this.totalHostCapacity == null ? 43 : this.totalHostCapacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
