/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the capacity configs that the Dedicated Virtual Machine Host (DVMH) Shape could
 * support. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CapacityConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CapacityConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "capacityConfigName",
        "supportedCapabilities",
        "isDefault",
        "capacityBins"
    })
    public CapacityConfig(
            String capacityConfigName,
            SupportedCapabilities supportedCapabilities,
            Boolean isDefault,
            java.util.List<CapacityBinPreview> capacityBins) {
        super();
        this.capacityConfigName = capacityConfigName;
        this.supportedCapabilities = supportedCapabilities;
        this.isDefault = isDefault;
        this.capacityBins = capacityBins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of each capacity config. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityConfigName")
        private String capacityConfigName;

        /**
         * The name of each capacity config.
         *
         * @param capacityConfigName the value to set
         * @return this builder
         */
        public Builder capacityConfigName(String capacityConfigName) {
            this.capacityConfigName = capacityConfigName;
            this.__explicitlySet__.add("capacityConfigName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedCapabilities")
        private SupportedCapabilities supportedCapabilities;

        public Builder supportedCapabilities(SupportedCapabilities supportedCapabilities) {
            this.supportedCapabilities = supportedCapabilities;
            this.__explicitlySet__.add("supportedCapabilities");
            return this;
        }
        /** Whether this capacity config is the default config. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Whether this capacity config is the default config.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /** A list of total CPU and memory per capacity bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityBins")
        private java.util.List<CapacityBinPreview> capacityBins;

        /**
         * A list of total CPU and memory per capacity bucket.
         *
         * @param capacityBins the value to set
         * @return this builder
         */
        public Builder capacityBins(java.util.List<CapacityBinPreview> capacityBins) {
            this.capacityBins = capacityBins;
            this.__explicitlySet__.add("capacityBins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CapacityConfig build() {
            CapacityConfig model =
                    new CapacityConfig(
                            this.capacityConfigName,
                            this.supportedCapabilities,
                            this.isDefault,
                            this.capacityBins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CapacityConfig model) {
            if (model.wasPropertyExplicitlySet("capacityConfigName")) {
                this.capacityConfigName(model.getCapacityConfigName());
            }
            if (model.wasPropertyExplicitlySet("supportedCapabilities")) {
                this.supportedCapabilities(model.getSupportedCapabilities());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("capacityBins")) {
                this.capacityBins(model.getCapacityBins());
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

    /** The name of each capacity config. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityConfigName")
    private final String capacityConfigName;

    /**
     * The name of each capacity config.
     *
     * @return the value
     */
    public String getCapacityConfigName() {
        return capacityConfigName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("supportedCapabilities")
    private final SupportedCapabilities supportedCapabilities;

    public SupportedCapabilities getSupportedCapabilities() {
        return supportedCapabilities;
    }

    /** Whether this capacity config is the default config. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Whether this capacity config is the default config.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /** A list of total CPU and memory per capacity bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityBins")
    private final java.util.List<CapacityBinPreview> capacityBins;

    /**
     * A list of total CPU and memory per capacity bucket.
     *
     * @return the value
     */
    public java.util.List<CapacityBinPreview> getCapacityBins() {
        return capacityBins;
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
        sb.append("CapacityConfig(");
        sb.append("super=").append(super.toString());
        sb.append("capacityConfigName=").append(String.valueOf(this.capacityConfigName));
        sb.append(", supportedCapabilities=").append(String.valueOf(this.supportedCapabilities));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", capacityBins=").append(String.valueOf(this.capacityBins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapacityConfig)) {
            return false;
        }

        CapacityConfig other = (CapacityConfig) o;
        return java.util.Objects.equals(this.capacityConfigName, other.capacityConfigName)
                && java.util.Objects.equals(this.supportedCapabilities, other.supportedCapabilities)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.capacityBins, other.capacityBins)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.capacityConfigName == null
                                ? 43
                                : this.capacityConfigName.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedCapabilities == null
                                ? 43
                                : this.supportedCapabilities.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.capacityBins == null ? 43 : this.capacityBins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
