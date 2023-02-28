/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Description of the VM target environment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VmTargetEnvironment.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetEnvironmentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VmTargetEnvironment extends TargetEnvironment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }
        /** Availability Domain of the VM configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability Domain of the VM configuration.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** Fault domain of the VM configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * Fault domain of the VM configuration.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /** OCID of the VM configuration VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcn")
        private String vcn;

        /**
         * OCID of the VM configuration VCN.
         *
         * @param vcn the value to set
         * @return this builder
         */
        public Builder vcn(String vcn) {
            this.vcn = vcn;
            this.__explicitlySet__.add("vcn");
            return this;
        }
        /** OCID of the VM configuration subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnet")
        private String subnet;

        /**
         * OCID of the VM configuration subnet.
         *
         * @param subnet the value to set
         * @return this builder
         */
        public Builder subnet(String subnet) {
            this.subnet = subnet;
            this.__explicitlySet__.add("subnet");
            return this;
        }
        /** OCID of the dedicated VM configuration host. */
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHost")
        private String dedicatedVmHost;

        /**
         * OCID of the dedicated VM configuration host.
         *
         * @param dedicatedVmHost the value to set
         * @return this builder
         */
        public Builder dedicatedVmHost(String dedicatedVmHost) {
            this.dedicatedVmHost = dedicatedVmHost;
            this.__explicitlySet__.add("dedicatedVmHost");
            return this;
        }
        /** Microsoft license for the VM configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
        private String msLicense;

        /**
         * Microsoft license for the VM configuration.
         *
         * @param msLicense the value to set
         * @return this builder
         */
        public Builder msLicense(String msLicense) {
            this.msLicense = msLicense;
            this.__explicitlySet__.add("msLicense");
            return this;
        }
        /** Preferred VM shape type provided by the customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
        private VmTargetAsset.PreferredShapeType preferredShapeType;

        /**
         * Preferred VM shape type provided by the customer.
         *
         * @param preferredShapeType the value to set
         * @return this builder
         */
        public Builder preferredShapeType(VmTargetAsset.PreferredShapeType preferredShapeType) {
            this.preferredShapeType = preferredShapeType;
            this.__explicitlySet__.add("preferredShapeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmTargetEnvironment build() {
            VmTargetEnvironment model =
                    new VmTargetEnvironment(
                            this.targetCompartmentId,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.vcn,
                            this.subnet,
                            this.dedicatedVmHost,
                            this.msLicense,
                            this.preferredShapeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmTargetEnvironment model) {
            if (model.wasPropertyExplicitlySet("targetCompartmentId")) {
                this.targetCompartmentId(model.getTargetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("vcn")) {
                this.vcn(model.getVcn());
            }
            if (model.wasPropertyExplicitlySet("subnet")) {
                this.subnet(model.getSubnet());
            }
            if (model.wasPropertyExplicitlySet("dedicatedVmHost")) {
                this.dedicatedVmHost(model.getDedicatedVmHost());
            }
            if (model.wasPropertyExplicitlySet("msLicense")) {
                this.msLicense(model.getMsLicense());
            }
            if (model.wasPropertyExplicitlySet("preferredShapeType")) {
                this.preferredShapeType(model.getPreferredShapeType());
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

    @Deprecated
    public VmTargetEnvironment(
            String targetCompartmentId,
            String availabilityDomain,
            String faultDomain,
            String vcn,
            String subnet,
            String dedicatedVmHost,
            String msLicense,
            VmTargetAsset.PreferredShapeType preferredShapeType) {
        super(targetCompartmentId);
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.vcn = vcn;
        this.subnet = subnet;
        this.dedicatedVmHost = dedicatedVmHost;
        this.msLicense = msLicense;
        this.preferredShapeType = preferredShapeType;
    }

    /** Availability Domain of the VM configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability Domain of the VM configuration.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** Fault domain of the VM configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * Fault domain of the VM configuration.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /** OCID of the VM configuration VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcn")
    private final String vcn;

    /**
     * OCID of the VM configuration VCN.
     *
     * @return the value
     */
    public String getVcn() {
        return vcn;
    }

    /** OCID of the VM configuration subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnet")
    private final String subnet;

    /**
     * OCID of the VM configuration subnet.
     *
     * @return the value
     */
    public String getSubnet() {
        return subnet;
    }

    /** OCID of the dedicated VM configuration host. */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHost")
    private final String dedicatedVmHost;

    /**
     * OCID of the dedicated VM configuration host.
     *
     * @return the value
     */
    public String getDedicatedVmHost() {
        return dedicatedVmHost;
    }

    /** Microsoft license for the VM configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
    private final String msLicense;

    /**
     * Microsoft license for the VM configuration.
     *
     * @return the value
     */
    public String getMsLicense() {
        return msLicense;
    }

    /** Preferred VM shape type provided by the customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredShapeType")
    private final VmTargetAsset.PreferredShapeType preferredShapeType;

    /**
     * Preferred VM shape type provided by the customer.
     *
     * @return the value
     */
    public VmTargetAsset.PreferredShapeType getPreferredShapeType() {
        return preferredShapeType;
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
        sb.append("VmTargetEnvironment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", vcn=").append(String.valueOf(this.vcn));
        sb.append(", subnet=").append(String.valueOf(this.subnet));
        sb.append(", dedicatedVmHost=").append(String.valueOf(this.dedicatedVmHost));
        sb.append(", msLicense=").append(String.valueOf(this.msLicense));
        sb.append(", preferredShapeType=").append(String.valueOf(this.preferredShapeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmTargetEnvironment)) {
            return false;
        }

        VmTargetEnvironment other = (VmTargetEnvironment) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.vcn, other.vcn)
                && java.util.Objects.equals(this.subnet, other.subnet)
                && java.util.Objects.equals(this.dedicatedVmHost, other.dedicatedVmHost)
                && java.util.Objects.equals(this.msLicense, other.msLicense)
                && java.util.Objects.equals(this.preferredShapeType, other.preferredShapeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.vcn == null ? 43 : this.vcn.hashCode());
        result = (result * PRIME) + (this.subnet == null ? 43 : this.subnet.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHost == null ? 43 : this.dedicatedVmHost.hashCode());
        result = (result * PRIME) + (this.msLicense == null ? 43 : this.msLicense.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredShapeType == null
                                ? 43
                                : this.preferredShapeType.hashCode());
        return result;
    }
}
