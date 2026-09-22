/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * One CBOM item representing a cryptographic component or configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CryptoAssessmentCbomItemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentCbomItemSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "componentType",
        "feature",
        "protocol",
        "algorithm",
        "format",
        "keySize",
        "configurationLocation",
        "complianceDriver"
    })
    public CryptoAssessmentCbomItemSummary(
            String componentType,
            String feature,
            String protocol,
            String algorithm,
            String format,
            String keySize,
            java.util.List<String> configurationLocation,
            String complianceDriver) {
        super();
        this.componentType = componentType;
        this.feature = feature;
        this.protocol = protocol;
        this.algorithm = algorithm;
        this.format = format;
        this.keySize = keySize;
        this.configurationLocation = configurationLocation;
        this.complianceDriver = complianceDriver;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of component represented in the CBOM item. */
        @com.fasterxml.jackson.annotation.JsonProperty("componentType")
        private String componentType;

        /**
         * Type of component represented in the CBOM item.
         *
         * @param componentType the value to set
         * @return this builder
         */
        public Builder componentType(String componentType) {
            this.componentType = componentType;
            this.__explicitlySet__.add("componentType");
            return this;
        }
        /** Feature name represented by the CBOM item. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private String feature;

        /**
         * Feature name represented by the CBOM item.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(String feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }
        /** Protocol used by the cryptographic feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * Protocol used by the cryptographic feature.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** Cryptographic algorithm or integrity/checksum value observed for the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private String algorithm;

        /**
         * Cryptographic algorithm or integrity/checksum value observed for the feature.
         *
         * @param algorithm the value to set
         * @return this builder
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /** Cryptographic format used by the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private String format;

        /**
         * Cryptographic format used by the feature.
         *
         * @param format the value to set
         * @return this builder
         */
        public Builder format(String format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }
        /** Observed key size for the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("keySize")
        private String keySize;

        /**
         * Observed key size for the feature.
         *
         * @param keySize the value to set
         * @return this builder
         */
        public Builder keySize(String keySize) {
            this.keySize = keySize;
            this.__explicitlySet__.add("keySize");
            return this;
        }
        /** Locations where this item is configured or stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationLocation")
        private java.util.List<String> configurationLocation;

        /**
         * Locations where this item is configured or stored.
         *
         * @param configurationLocation the value to set
         * @return this builder
         */
        public Builder configurationLocation(java.util.List<String> configurationLocation) {
            this.configurationLocation = configurationLocation;
            this.__explicitlySet__.add("configurationLocation");
            return this;
        }
        /** Static compliance standards applicable to the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("complianceDriver")
        private String complianceDriver;

        /**
         * Static compliance standards applicable to the feature.
         *
         * @param complianceDriver the value to set
         * @return this builder
         */
        public Builder complianceDriver(String complianceDriver) {
            this.complianceDriver = complianceDriver;
            this.__explicitlySet__.add("complianceDriver");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentCbomItemSummary build() {
            CryptoAssessmentCbomItemSummary model =
                    new CryptoAssessmentCbomItemSummary(
                            this.componentType,
                            this.feature,
                            this.protocol,
                            this.algorithm,
                            this.format,
                            this.keySize,
                            this.configurationLocation,
                            this.complianceDriver);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentCbomItemSummary model) {
            if (model.wasPropertyExplicitlySet("componentType")) {
                this.componentType(model.getComponentType());
            }
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
            }
            if (model.wasPropertyExplicitlySet("keySize")) {
                this.keySize(model.getKeySize());
            }
            if (model.wasPropertyExplicitlySet("configurationLocation")) {
                this.configurationLocation(model.getConfigurationLocation());
            }
            if (model.wasPropertyExplicitlySet("complianceDriver")) {
                this.complianceDriver(model.getComplianceDriver());
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

    /** Type of component represented in the CBOM item. */
    @com.fasterxml.jackson.annotation.JsonProperty("componentType")
    private final String componentType;

    /**
     * Type of component represented in the CBOM item.
     *
     * @return the value
     */
    public String getComponentType() {
        return componentType;
    }

    /** Feature name represented by the CBOM item. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final String feature;

    /**
     * Feature name represented by the CBOM item.
     *
     * @return the value
     */
    public String getFeature() {
        return feature;
    }

    /** Protocol used by the cryptographic feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * Protocol used by the cryptographic feature.
     *
     * @return the value
     */
    public String getProtocol() {
        return protocol;
    }

    /** Cryptographic algorithm or integrity/checksum value observed for the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final String algorithm;

    /**
     * Cryptographic algorithm or integrity/checksum value observed for the feature.
     *
     * @return the value
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /** Cryptographic format used by the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final String format;

    /**
     * Cryptographic format used by the feature.
     *
     * @return the value
     */
    public String getFormat() {
        return format;
    }

    /** Observed key size for the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("keySize")
    private final String keySize;

    /**
     * Observed key size for the feature.
     *
     * @return the value
     */
    public String getKeySize() {
        return keySize;
    }

    /** Locations where this item is configured or stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationLocation")
    private final java.util.List<String> configurationLocation;

    /**
     * Locations where this item is configured or stored.
     *
     * @return the value
     */
    public java.util.List<String> getConfigurationLocation() {
        return configurationLocation;
    }

    /** Static compliance standards applicable to the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("complianceDriver")
    private final String complianceDriver;

    /**
     * Static compliance standards applicable to the feature.
     *
     * @return the value
     */
    public String getComplianceDriver() {
        return complianceDriver;
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
        sb.append("CryptoAssessmentCbomItemSummary(");
        sb.append("super=").append(super.toString());
        sb.append("componentType=").append(String.valueOf(this.componentType));
        sb.append(", feature=").append(String.valueOf(this.feature));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", keySize=").append(String.valueOf(this.keySize));
        sb.append(", configurationLocation=").append(String.valueOf(this.configurationLocation));
        sb.append(", complianceDriver=").append(String.valueOf(this.complianceDriver));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentCbomItemSummary)) {
            return false;
        }

        CryptoAssessmentCbomItemSummary other = (CryptoAssessmentCbomItemSummary) o;
        return java.util.Objects.equals(this.componentType, other.componentType)
                && java.util.Objects.equals(this.feature, other.feature)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.keySize, other.keySize)
                && java.util.Objects.equals(this.configurationLocation, other.configurationLocation)
                && java.util.Objects.equals(this.complianceDriver, other.complianceDriver)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.componentType == null ? 43 : this.componentType.hashCode());
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.keySize == null ? 43 : this.keySize.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationLocation == null
                                ? 43
                                : this.configurationLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceDriver == null ? 43 : this.complianceDriver.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
