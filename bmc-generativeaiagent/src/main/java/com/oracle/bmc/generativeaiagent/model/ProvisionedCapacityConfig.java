/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration includes the provisioned capacity id and component runtime (tool versions, and
 * other relevant information). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProvisionedCapacityConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProvisionedCapacityConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "provisionedCapacityId",
        "platformRuntimeConfig",
        "toolRuntimeConfigs"
    })
    public ProvisionedCapacityConfig(
            String provisionedCapacityId,
            PlatformRuntimeConfig platformRuntimeConfig,
            java.util.List<ToolRuntimeConfig> toolRuntimeConfigs) {
        super();
        this.provisionedCapacityId = provisionedCapacityId;
        this.platformRuntimeConfig = platformRuntimeConfig;
        this.toolRuntimeConfigs = toolRuntimeConfigs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An OCID that uniquely identifies an Provisioned Capacity. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedCapacityId")
        private String provisionedCapacityId;

        /**
         * An OCID that uniquely identifies an Provisioned Capacity.
         *
         * @param provisionedCapacityId the value to set
         * @return this builder
         */
        public Builder provisionedCapacityId(String provisionedCapacityId) {
            this.provisionedCapacityId = provisionedCapacityId;
            this.__explicitlySet__.add("provisionedCapacityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformRuntimeConfig")
        private PlatformRuntimeConfig platformRuntimeConfig;

        public Builder platformRuntimeConfig(PlatformRuntimeConfig platformRuntimeConfig) {
            this.platformRuntimeConfig = platformRuntimeConfig;
            this.__explicitlySet__.add("platformRuntimeConfig");
            return this;
        }
        /** RAG and SQL will be tools. */
        @com.fasterxml.jackson.annotation.JsonProperty("toolRuntimeConfigs")
        private java.util.List<ToolRuntimeConfig> toolRuntimeConfigs;

        /**
         * RAG and SQL will be tools.
         *
         * @param toolRuntimeConfigs the value to set
         * @return this builder
         */
        public Builder toolRuntimeConfigs(java.util.List<ToolRuntimeConfig> toolRuntimeConfigs) {
            this.toolRuntimeConfigs = toolRuntimeConfigs;
            this.__explicitlySet__.add("toolRuntimeConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProvisionedCapacityConfig build() {
            ProvisionedCapacityConfig model =
                    new ProvisionedCapacityConfig(
                            this.provisionedCapacityId,
                            this.platformRuntimeConfig,
                            this.toolRuntimeConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProvisionedCapacityConfig model) {
            if (model.wasPropertyExplicitlySet("provisionedCapacityId")) {
                this.provisionedCapacityId(model.getProvisionedCapacityId());
            }
            if (model.wasPropertyExplicitlySet("platformRuntimeConfig")) {
                this.platformRuntimeConfig(model.getPlatformRuntimeConfig());
            }
            if (model.wasPropertyExplicitlySet("toolRuntimeConfigs")) {
                this.toolRuntimeConfigs(model.getToolRuntimeConfigs());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** An OCID that uniquely identifies an Provisioned Capacity. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedCapacityId")
    private final String provisionedCapacityId;

    /**
     * An OCID that uniquely identifies an Provisioned Capacity.
     *
     * @return the value
     */
    public String getProvisionedCapacityId() {
        return provisionedCapacityId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("platformRuntimeConfig")
    private final PlatformRuntimeConfig platformRuntimeConfig;

    public PlatformRuntimeConfig getPlatformRuntimeConfig() {
        return platformRuntimeConfig;
    }

    /** RAG and SQL will be tools. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolRuntimeConfigs")
    private final java.util.List<ToolRuntimeConfig> toolRuntimeConfigs;

    /**
     * RAG and SQL will be tools.
     *
     * @return the value
     */
    public java.util.List<ToolRuntimeConfig> getToolRuntimeConfigs() {
        return toolRuntimeConfigs;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProvisionedCapacityConfig(");
        sb.append("super=").append(super.toString());
        sb.append("provisionedCapacityId=").append(String.valueOf(this.provisionedCapacityId));
        sb.append(", platformRuntimeConfig=").append(String.valueOf(this.platformRuntimeConfig));
        sb.append(", toolRuntimeConfigs=").append(String.valueOf(this.toolRuntimeConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProvisionedCapacityConfig)) {
            return false;
        }

        ProvisionedCapacityConfig other = (ProvisionedCapacityConfig) o;
        return java.util.Objects.equals(this.provisionedCapacityId, other.provisionedCapacityId)
                && java.util.Objects.equals(this.platformRuntimeConfig, other.platformRuntimeConfig)
                && java.util.Objects.equals(this.toolRuntimeConfigs, other.toolRuntimeConfigs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.provisionedCapacityId == null
                                ? 43
                                : this.provisionedCapacityId.hashCode());
        result =
                (result * PRIME)
                        + (this.platformRuntimeConfig == null
                                ? 43
                                : this.platformRuntimeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.toolRuntimeConfigs == null
                                ? 43
                                : this.toolRuntimeConfigs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
