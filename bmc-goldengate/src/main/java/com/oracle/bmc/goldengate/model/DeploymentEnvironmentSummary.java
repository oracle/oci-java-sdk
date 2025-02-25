/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The metadata specific to a production or development/testing environment.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeploymentEnvironmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeploymentEnvironmentSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "environmentType",
        "category",
        "displayName",
        "minCpuCoreCount",
        "defaultCpuCoreCount",
        "maxCpuCoreCount",
        "isAutoScalingEnabledByDefault",
        "networkBandwidthPerOcpuInGbps",
        "memoryPerOcpuInGBs",
        "storageUsageLimitPerOcpuInGBs"
    })
    public DeploymentEnvironmentSummary(
            EnvironmentType environmentType,
            DeploymentCategory category,
            String displayName,
            Integer minCpuCoreCount,
            Integer defaultCpuCoreCount,
            Integer maxCpuCoreCount,
            Boolean isAutoScalingEnabledByDefault,
            Integer networkBandwidthPerOcpuInGbps,
            Integer memoryPerOcpuInGBs,
            Integer storageUsageLimitPerOcpuInGBs) {
        super();
        this.environmentType = environmentType;
        this.category = category;
        this.displayName = displayName;
        this.minCpuCoreCount = minCpuCoreCount;
        this.defaultCpuCoreCount = defaultCpuCoreCount;
        this.maxCpuCoreCount = maxCpuCoreCount;
        this.isAutoScalingEnabledByDefault = isAutoScalingEnabledByDefault;
        this.networkBandwidthPerOcpuInGbps = networkBandwidthPerOcpuInGbps;
        this.memoryPerOcpuInGBs = memoryPerOcpuInGBs;
        this.storageUsageLimitPerOcpuInGBs = storageUsageLimitPerOcpuInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether the deployment is used in a production or development/testing environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
        private EnvironmentType environmentType;

        /**
         * Specifies whether the deployment is used in a production or development/testing environment.
         *
         * @param environmentType the value to set
         * @return this builder
         **/
        public Builder environmentType(EnvironmentType environmentType) {
            this.environmentType = environmentType;
            this.__explicitlySet__.add("environmentType");
            return this;
        }
        /**
         * The deployment category defines the broad separation of the deployment type into three categories.
         * Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and 'DATA_TRANSFORMS'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private DeploymentCategory category;

        /**
         * The deployment category defines the broad separation of the deployment type into three categories.
         * Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and 'DATA_TRANSFORMS'.
         *
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(DeploymentCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The minimum CPU core count.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minCpuCoreCount")
        private Integer minCpuCoreCount;

        /**
         * The minimum CPU core count.
         *
         * @param minCpuCoreCount the value to set
         * @return this builder
         **/
        public Builder minCpuCoreCount(Integer minCpuCoreCount) {
            this.minCpuCoreCount = minCpuCoreCount;
            this.__explicitlySet__.add("minCpuCoreCount");
            return this;
        }
        /**
         * The default CPU core count.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCpuCoreCount")
        private Integer defaultCpuCoreCount;

        /**
         * The default CPU core count.
         *
         * @param defaultCpuCoreCount the value to set
         * @return this builder
         **/
        public Builder defaultCpuCoreCount(Integer defaultCpuCoreCount) {
            this.defaultCpuCoreCount = defaultCpuCoreCount;
            this.__explicitlySet__.add("defaultCpuCoreCount");
            return this;
        }
        /**
         * The maximum CPU core count.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCoreCount")
        private Integer maxCpuCoreCount;

        /**
         * The maximum CPU core count.
         *
         * @param maxCpuCoreCount the value to set
         * @return this builder
         **/
        public Builder maxCpuCoreCount(Integer maxCpuCoreCount) {
            this.maxCpuCoreCount = maxCpuCoreCount;
            this.__explicitlySet__.add("maxCpuCoreCount");
            return this;
        }
        /**
         * Specifies whether the "Auto scaling" option should be enabled by default or not.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabledByDefault")
        private Boolean isAutoScalingEnabledByDefault;

        /**
         * Specifies whether the "Auto scaling" option should be enabled by default or not.
         *
         * @param isAutoScalingEnabledByDefault the value to set
         * @return this builder
         **/
        public Builder isAutoScalingEnabledByDefault(Boolean isAutoScalingEnabledByDefault) {
            this.isAutoScalingEnabledByDefault = isAutoScalingEnabledByDefault;
            this.__explicitlySet__.add("isAutoScalingEnabledByDefault");
            return this;
        }
        /**
         * The multiplier value between CPU core count and network bandwidth.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthPerOcpuInGbps")
        private Integer networkBandwidthPerOcpuInGbps;

        /**
         * The multiplier value between CPU core count and network bandwidth.
         *
         * @param networkBandwidthPerOcpuInGbps the value to set
         * @return this builder
         **/
        public Builder networkBandwidthPerOcpuInGbps(Integer networkBandwidthPerOcpuInGbps) {
            this.networkBandwidthPerOcpuInGbps = networkBandwidthPerOcpuInGbps;
            this.__explicitlySet__.add("networkBandwidthPerOcpuInGbps");
            return this;
        }
        /**
         * The multiplier value between CPU core count and memory size.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOcpuInGBs")
        private Integer memoryPerOcpuInGBs;

        /**
         * The multiplier value between CPU core count and memory size.
         *
         * @param memoryPerOcpuInGBs the value to set
         * @return this builder
         **/
        public Builder memoryPerOcpuInGBs(Integer memoryPerOcpuInGBs) {
            this.memoryPerOcpuInGBs = memoryPerOcpuInGBs;
            this.__explicitlySet__.add("memoryPerOcpuInGBs");
            return this;
        }
        /**
         * The multiplier value between CPU core count and storage usage limit size.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsageLimitPerOcpuInGBs")
        private Integer storageUsageLimitPerOcpuInGBs;

        /**
         * The multiplier value between CPU core count and storage usage limit size.
         *
         * @param storageUsageLimitPerOcpuInGBs the value to set
         * @return this builder
         **/
        public Builder storageUsageLimitPerOcpuInGBs(Integer storageUsageLimitPerOcpuInGBs) {
            this.storageUsageLimitPerOcpuInGBs = storageUsageLimitPerOcpuInGBs;
            this.__explicitlySet__.add("storageUsageLimitPerOcpuInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentEnvironmentSummary build() {
            DeploymentEnvironmentSummary model =
                    new DeploymentEnvironmentSummary(
                            this.environmentType,
                            this.category,
                            this.displayName,
                            this.minCpuCoreCount,
                            this.defaultCpuCoreCount,
                            this.maxCpuCoreCount,
                            this.isAutoScalingEnabledByDefault,
                            this.networkBandwidthPerOcpuInGbps,
                            this.memoryPerOcpuInGBs,
                            this.storageUsageLimitPerOcpuInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentEnvironmentSummary model) {
            if (model.wasPropertyExplicitlySet("environmentType")) {
                this.environmentType(model.getEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("minCpuCoreCount")) {
                this.minCpuCoreCount(model.getMinCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("defaultCpuCoreCount")) {
                this.defaultCpuCoreCount(model.getDefaultCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("maxCpuCoreCount")) {
                this.maxCpuCoreCount(model.getMaxCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabledByDefault")) {
                this.isAutoScalingEnabledByDefault(model.getIsAutoScalingEnabledByDefault());
            }
            if (model.wasPropertyExplicitlySet("networkBandwidthPerOcpuInGbps")) {
                this.networkBandwidthPerOcpuInGbps(model.getNetworkBandwidthPerOcpuInGbps());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOcpuInGBs")) {
                this.memoryPerOcpuInGBs(model.getMemoryPerOcpuInGBs());
            }
            if (model.wasPropertyExplicitlySet("storageUsageLimitPerOcpuInGBs")) {
                this.storageUsageLimitPerOcpuInGBs(model.getStorageUsageLimitPerOcpuInGBs());
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
     * Specifies whether the deployment is used in a production or development/testing environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentType")
    private final EnvironmentType environmentType;

    /**
     * Specifies whether the deployment is used in a production or development/testing environment.
     *
     * @return the value
     **/
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * The deployment category defines the broad separation of the deployment type into three categories.
     * Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and 'DATA_TRANSFORMS'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final DeploymentCategory category;

    /**
     * The deployment category defines the broad separation of the deployment type into three categories.
     * Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and 'DATA_TRANSFORMS'.
     *
     * @return the value
     **/
    public DeploymentCategory getCategory() {
        return category;
    }

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The minimum CPU core count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minCpuCoreCount")
    private final Integer minCpuCoreCount;

    /**
     * The minimum CPU core count.
     *
     * @return the value
     **/
    public Integer getMinCpuCoreCount() {
        return minCpuCoreCount;
    }

    /**
     * The default CPU core count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCpuCoreCount")
    private final Integer defaultCpuCoreCount;

    /**
     * The default CPU core count.
     *
     * @return the value
     **/
    public Integer getDefaultCpuCoreCount() {
        return defaultCpuCoreCount;
    }

    /**
     * The maximum CPU core count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCoreCount")
    private final Integer maxCpuCoreCount;

    /**
     * The maximum CPU core count.
     *
     * @return the value
     **/
    public Integer getMaxCpuCoreCount() {
        return maxCpuCoreCount;
    }

    /**
     * Specifies whether the "Auto scaling" option should be enabled by default or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabledByDefault")
    private final Boolean isAutoScalingEnabledByDefault;

    /**
     * Specifies whether the "Auto scaling" option should be enabled by default or not.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingEnabledByDefault() {
        return isAutoScalingEnabledByDefault;
    }

    /**
     * The multiplier value between CPU core count and network bandwidth.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthPerOcpuInGbps")
    private final Integer networkBandwidthPerOcpuInGbps;

    /**
     * The multiplier value between CPU core count and network bandwidth.
     *
     * @return the value
     **/
    public Integer getNetworkBandwidthPerOcpuInGbps() {
        return networkBandwidthPerOcpuInGbps;
    }

    /**
     * The multiplier value between CPU core count and memory size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOcpuInGBs")
    private final Integer memoryPerOcpuInGBs;

    /**
     * The multiplier value between CPU core count and memory size.
     *
     * @return the value
     **/
    public Integer getMemoryPerOcpuInGBs() {
        return memoryPerOcpuInGBs;
    }

    /**
     * The multiplier value between CPU core count and storage usage limit size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsageLimitPerOcpuInGBs")
    private final Integer storageUsageLimitPerOcpuInGBs;

    /**
     * The multiplier value between CPU core count and storage usage limit size.
     *
     * @return the value
     **/
    public Integer getStorageUsageLimitPerOcpuInGBs() {
        return storageUsageLimitPerOcpuInGBs;
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
        sb.append("DeploymentEnvironmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("environmentType=").append(String.valueOf(this.environmentType));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", minCpuCoreCount=").append(String.valueOf(this.minCpuCoreCount));
        sb.append(", defaultCpuCoreCount=").append(String.valueOf(this.defaultCpuCoreCount));
        sb.append(", maxCpuCoreCount=").append(String.valueOf(this.maxCpuCoreCount));
        sb.append(", isAutoScalingEnabledByDefault=")
                .append(String.valueOf(this.isAutoScalingEnabledByDefault));
        sb.append(", networkBandwidthPerOcpuInGbps=")
                .append(String.valueOf(this.networkBandwidthPerOcpuInGbps));
        sb.append(", memoryPerOcpuInGBs=").append(String.valueOf(this.memoryPerOcpuInGBs));
        sb.append(", storageUsageLimitPerOcpuInGBs=")
                .append(String.valueOf(this.storageUsageLimitPerOcpuInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentEnvironmentSummary)) {
            return false;
        }

        DeploymentEnvironmentSummary other = (DeploymentEnvironmentSummary) o;
        return java.util.Objects.equals(this.environmentType, other.environmentType)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.minCpuCoreCount, other.minCpuCoreCount)
                && java.util.Objects.equals(this.defaultCpuCoreCount, other.defaultCpuCoreCount)
                && java.util.Objects.equals(this.maxCpuCoreCount, other.maxCpuCoreCount)
                && java.util.Objects.equals(
                        this.isAutoScalingEnabledByDefault, other.isAutoScalingEnabledByDefault)
                && java.util.Objects.equals(
                        this.networkBandwidthPerOcpuInGbps, other.networkBandwidthPerOcpuInGbps)
                && java.util.Objects.equals(this.memoryPerOcpuInGBs, other.memoryPerOcpuInGBs)
                && java.util.Objects.equals(
                        this.storageUsageLimitPerOcpuInGBs, other.storageUsageLimitPerOcpuInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.environmentType == null ? 43 : this.environmentType.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.minCpuCoreCount == null ? 43 : this.minCpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultCpuCoreCount == null
                                ? 43
                                : this.defaultCpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxCpuCoreCount == null ? 43 : this.maxCpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabledByDefault == null
                                ? 43
                                : this.isAutoScalingEnabledByDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.networkBandwidthPerOcpuInGbps == null
                                ? 43
                                : this.networkBandwidthPerOcpuInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOcpuInGBs == null
                                ? 43
                                : this.memoryPerOcpuInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsageLimitPerOcpuInGBs == null
                                ? 43
                                : this.storageUsageLimitPerOcpuInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
