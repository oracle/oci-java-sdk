/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Represents hardware information of host <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmHardwareInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmHardwareInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "family",
        "manufacturer",
        "productName",
        "serialNumber",
        "supportedRngSources",
        "uuid",
        "version"
    })
    public OlvmHardwareInformation(
            String family,
            String manufacturer,
            String productName,
            String serialNumber,
            java.util.List<RngSource> supportedRngSources,
            String uuid,
            String version) {
        super();
        this.family = family;
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.supportedRngSources = supportedRngSources;
        this.uuid = uuid;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of host\u2019s CPU. */
        @com.fasterxml.jackson.annotation.JsonProperty("family")
        private String family;

        /**
         * Type of host\u2019s CPU.
         *
         * @param family the value to set
         * @return this builder
         */
        public Builder family(String family) {
            this.family = family;
            this.__explicitlySet__.add("family");
            return this;
        }
        /** Manufacturer of the host\u2019s machine and hardware vendor. */
        @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
        private String manufacturer;

        /**
         * Manufacturer of the host\u2019s machine and hardware vendor.
         *
         * @param manufacturer the value to set
         * @return this builder
         */
        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            this.__explicitlySet__.add("manufacturer");
            return this;
        }
        /** Host\u2019s product name (for example RHEV Hypervisor). */
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * Host\u2019s product name (for example RHEV Hypervisor).
         *
         * @param productName the value to set
         * @return this builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /** Unique ID for host\u2019s chassis. */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * Unique ID for host\u2019s chassis.
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /** Supported sources of random number generator. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedRngSources")
        private java.util.List<RngSource> supportedRngSources;

        /**
         * Supported sources of random number generator.
         *
         * @param supportedRngSources the value to set
         * @return this builder
         */
        public Builder supportedRngSources(java.util.List<RngSource> supportedRngSources) {
            this.supportedRngSources = supportedRngSources;
            this.__explicitlySet__.add("supportedRngSources");
            return this;
        }
        /** Unique ID for each host. */
        @com.fasterxml.jackson.annotation.JsonProperty("uuid")
        private String uuid;

        /**
         * Unique ID for each host.
         *
         * @param uuid the value to set
         * @return this builder
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            this.__explicitlySet__.add("uuid");
            return this;
        }
        /** Unique name for each of the manufacturer. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Unique name for each of the manufacturer.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmHardwareInformation build() {
            OlvmHardwareInformation model =
                    new OlvmHardwareInformation(
                            this.family,
                            this.manufacturer,
                            this.productName,
                            this.serialNumber,
                            this.supportedRngSources,
                            this.uuid,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmHardwareInformation model) {
            if (model.wasPropertyExplicitlySet("family")) {
                this.family(model.getFamily());
            }
            if (model.wasPropertyExplicitlySet("manufacturer")) {
                this.manufacturer(model.getManufacturer());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("supportedRngSources")) {
                this.supportedRngSources(model.getSupportedRngSources());
            }
            if (model.wasPropertyExplicitlySet("uuid")) {
                this.uuid(model.getUuid());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** Type of host\u2019s CPU. */
    @com.fasterxml.jackson.annotation.JsonProperty("family")
    private final String family;

    /**
     * Type of host\u2019s CPU.
     *
     * @return the value
     */
    public String getFamily() {
        return family;
    }

    /** Manufacturer of the host\u2019s machine and hardware vendor. */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    private final String manufacturer;

    /**
     * Manufacturer of the host\u2019s machine and hardware vendor.
     *
     * @return the value
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /** Host\u2019s product name (for example RHEV Hypervisor). */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * Host\u2019s product name (for example RHEV Hypervisor).
     *
     * @return the value
     */
    public String getProductName() {
        return productName;
    }

    /** Unique ID for host\u2019s chassis. */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * Unique ID for host\u2019s chassis.
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** Supported sources of random number generator. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedRngSources")
    private final java.util.List<RngSource> supportedRngSources;

    /**
     * Supported sources of random number generator.
     *
     * @return the value
     */
    public java.util.List<RngSource> getSupportedRngSources() {
        return supportedRngSources;
    }

    /** Unique ID for each host. */
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    private final String uuid;

    /**
     * Unique ID for each host.
     *
     * @return the value
     */
    public String getUuid() {
        return uuid;
    }

    /** Unique name for each of the manufacturer. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Unique name for each of the manufacturer.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
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
        sb.append("OlvmHardwareInformation(");
        sb.append("super=").append(super.toString());
        sb.append("family=").append(String.valueOf(this.family));
        sb.append(", manufacturer=").append(String.valueOf(this.manufacturer));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", supportedRngSources=").append(String.valueOf(this.supportedRngSources));
        sb.append(", uuid=").append(String.valueOf(this.uuid));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmHardwareInformation)) {
            return false;
        }

        OlvmHardwareInformation other = (OlvmHardwareInformation) o;
        return java.util.Objects.equals(this.family, other.family)
                && java.util.Objects.equals(this.manufacturer, other.manufacturer)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.supportedRngSources, other.supportedRngSources)
                && java.util.Objects.equals(this.uuid, other.uuid)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.family == null ? 43 : this.family.hashCode());
        result = (result * PRIME) + (this.manufacturer == null ? 43 : this.manufacturer.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedRngSources == null
                                ? 43
                                : this.supportedRngSources.hashCode());
        result = (result * PRIME) + (this.uuid == null ? 43 : this.uuid.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
