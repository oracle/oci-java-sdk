/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A specific compute shape supported by the Oracle Cloud VMware Solution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SupportedHostShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SupportedHostShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "supportedOperations",
        "shapeFamily",
        "defaultOcpuCount",
        "supportedOcpuCount",
        "isSingleHostSddcSupported",
        "supportedVmwareSoftwareVersions",
        "description",
        "isSupportShieldedInstances",
        "isSupportMonthlyCommitment"
    })
    public SupportedHostShapeSummary(
            String name,
            java.util.List<OperationTypes> supportedOperations,
            String shapeFamily,
            Float defaultOcpuCount,
            java.util.List<Float> supportedOcpuCount,
            Boolean isSingleHostSddcSupported,
            java.util.List<String> supportedVmwareSoftwareVersions,
            String description,
            Boolean isSupportShieldedInstances,
            Boolean isSupportMonthlyCommitment) {
        super();
        this.name = name;
        this.supportedOperations = supportedOperations;
        this.shapeFamily = shapeFamily;
        this.defaultOcpuCount = defaultOcpuCount;
        this.supportedOcpuCount = supportedOcpuCount;
        this.isSingleHostSddcSupported = isSingleHostSddcSupported;
        this.supportedVmwareSoftwareVersions = supportedVmwareSoftwareVersions;
        this.description = description;
        this.isSupportShieldedInstances = isSupportShieldedInstances;
        this.isSupportMonthlyCommitment = isSupportMonthlyCommitment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the supported compute shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the supported compute shape.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The operations where you can use the shape. The operations can be CREATE_SDDC or
         * CREATE_ESXI_HOST.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedOperations")
        private java.util.List<OperationTypes> supportedOperations;

        /**
         * The operations where you can use the shape. The operations can be CREATE_SDDC or
         * CREATE_ESXI_HOST.
         *
         * @param supportedOperations the value to set
         * @return this builder
         */
        public Builder supportedOperations(java.util.List<OperationTypes> supportedOperations) {
            this.supportedOperations = supportedOperations;
            this.__explicitlySet__.add("supportedOperations");
            return this;
        }
        /** The family of the shape. ESXi hosts of one SDDC must have the same shape family. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
        private String shapeFamily;

        /**
         * The family of the shape. ESXi hosts of one SDDC must have the same shape family.
         *
         * @param shapeFamily the value to set
         * @return this builder
         */
        public Builder shapeFamily(String shapeFamily) {
            this.shapeFamily = shapeFamily;
            this.__explicitlySet__.add("shapeFamily");
            return this;
        }
        /** The default OCPU count of the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultOcpuCount")
        private Float defaultOcpuCount;

        /**
         * The default OCPU count of the shape.
         *
         * @param defaultOcpuCount the value to set
         * @return this builder
         */
        public Builder defaultOcpuCount(Float defaultOcpuCount) {
            this.defaultOcpuCount = defaultOcpuCount;
            this.__explicitlySet__.add("defaultOcpuCount");
            return this;
        }
        /** Support OCPU count of the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedOcpuCount")
        private java.util.List<Float> supportedOcpuCount;

        /**
         * Support OCPU count of the shape.
         *
         * @param supportedOcpuCount the value to set
         * @return this builder
         */
        public Builder supportedOcpuCount(java.util.List<Float> supportedOcpuCount) {
            this.supportedOcpuCount = supportedOcpuCount;
            this.__explicitlySet__.add("supportedOcpuCount");
            return this;
        }
        /** Indicates whether the shape supports single host SDDCs. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddcSupported")
        private Boolean isSingleHostSddcSupported;

        /**
         * Indicates whether the shape supports single host SDDCs.
         *
         * @param isSingleHostSddcSupported the value to set
         * @return this builder
         */
        public Builder isSingleHostSddcSupported(Boolean isSingleHostSddcSupported) {
            this.isSingleHostSddcSupported = isSingleHostSddcSupported;
            this.__explicitlySet__.add("isSingleHostSddcSupported");
            return this;
        }
        /** The VMware software versions supported by the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedVmwareSoftwareVersions")
        private java.util.List<String> supportedVmwareSoftwareVersions;

        /**
         * The VMware software versions supported by the shape.
         *
         * @param supportedVmwareSoftwareVersions the value to set
         * @return this builder
         */
        public Builder supportedVmwareSoftwareVersions(
                java.util.List<String> supportedVmwareSoftwareVersions) {
            this.supportedVmwareSoftwareVersions = supportedVmwareSoftwareVersions;
            this.__explicitlySet__.add("supportedVmwareSoftwareVersions");
            return this;
        }
        /** Description of the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the shape.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Indicates whether the shape supports shielded instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSupportShieldedInstances")
        private Boolean isSupportShieldedInstances;

        /**
         * Indicates whether the shape supports shielded instances.
         *
         * @param isSupportShieldedInstances the value to set
         * @return this builder
         */
        public Builder isSupportShieldedInstances(Boolean isSupportShieldedInstances) {
            this.isSupportShieldedInstances = isSupportShieldedInstances;
            this.__explicitlySet__.add("isSupportShieldedInstances");
            return this;
        }
        /** Whether the shape supports "MONTH" Commitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSupportMonthlyCommitment")
        private Boolean isSupportMonthlyCommitment;

        /**
         * Whether the shape supports "MONTH" Commitment.
         *
         * @param isSupportMonthlyCommitment the value to set
         * @return this builder
         */
        public Builder isSupportMonthlyCommitment(Boolean isSupportMonthlyCommitment) {
            this.isSupportMonthlyCommitment = isSupportMonthlyCommitment;
            this.__explicitlySet__.add("isSupportMonthlyCommitment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportedHostShapeSummary build() {
            SupportedHostShapeSummary model =
                    new SupportedHostShapeSummary(
                            this.name,
                            this.supportedOperations,
                            this.shapeFamily,
                            this.defaultOcpuCount,
                            this.supportedOcpuCount,
                            this.isSingleHostSddcSupported,
                            this.supportedVmwareSoftwareVersions,
                            this.description,
                            this.isSupportShieldedInstances,
                            this.isSupportMonthlyCommitment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportedHostShapeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("supportedOperations")) {
                this.supportedOperations(model.getSupportedOperations());
            }
            if (model.wasPropertyExplicitlySet("shapeFamily")) {
                this.shapeFamily(model.getShapeFamily());
            }
            if (model.wasPropertyExplicitlySet("defaultOcpuCount")) {
                this.defaultOcpuCount(model.getDefaultOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("supportedOcpuCount")) {
                this.supportedOcpuCount(model.getSupportedOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("isSingleHostSddcSupported")) {
                this.isSingleHostSddcSupported(model.getIsSingleHostSddcSupported());
            }
            if (model.wasPropertyExplicitlySet("supportedVmwareSoftwareVersions")) {
                this.supportedVmwareSoftwareVersions(model.getSupportedVmwareSoftwareVersions());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isSupportShieldedInstances")) {
                this.isSupportShieldedInstances(model.getIsSupportShieldedInstances());
            }
            if (model.wasPropertyExplicitlySet("isSupportMonthlyCommitment")) {
                this.isSupportMonthlyCommitment(model.getIsSupportMonthlyCommitment());
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

    /** The name of the supported compute shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the supported compute shape.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The operations where you can use the shape. The operations can be CREATE_SDDC or
     * CREATE_ESXI_HOST.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOperations")
    private final java.util.List<OperationTypes> supportedOperations;

    /**
     * The operations where you can use the shape. The operations can be CREATE_SDDC or
     * CREATE_ESXI_HOST.
     *
     * @return the value
     */
    public java.util.List<OperationTypes> getSupportedOperations() {
        return supportedOperations;
    }

    /** The family of the shape. ESXi hosts of one SDDC must have the same shape family. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
    private final String shapeFamily;

    /**
     * The family of the shape. ESXi hosts of one SDDC must have the same shape family.
     *
     * @return the value
     */
    public String getShapeFamily() {
        return shapeFamily;
    }

    /** The default OCPU count of the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultOcpuCount")
    private final Float defaultOcpuCount;

    /**
     * The default OCPU count of the shape.
     *
     * @return the value
     */
    public Float getDefaultOcpuCount() {
        return defaultOcpuCount;
    }

    /** Support OCPU count of the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOcpuCount")
    private final java.util.List<Float> supportedOcpuCount;

    /**
     * Support OCPU count of the shape.
     *
     * @return the value
     */
    public java.util.List<Float> getSupportedOcpuCount() {
        return supportedOcpuCount;
    }

    /** Indicates whether the shape supports single host SDDCs. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddcSupported")
    private final Boolean isSingleHostSddcSupported;

    /**
     * Indicates whether the shape supports single host SDDCs.
     *
     * @return the value
     */
    public Boolean getIsSingleHostSddcSupported() {
        return isSingleHostSddcSupported;
    }

    /** The VMware software versions supported by the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVmwareSoftwareVersions")
    private final java.util.List<String> supportedVmwareSoftwareVersions;

    /**
     * The VMware software versions supported by the shape.
     *
     * @return the value
     */
    public java.util.List<String> getSupportedVmwareSoftwareVersions() {
        return supportedVmwareSoftwareVersions;
    }

    /** Description of the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the shape.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Indicates whether the shape supports shielded instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportShieldedInstances")
    private final Boolean isSupportShieldedInstances;

    /**
     * Indicates whether the shape supports shielded instances.
     *
     * @return the value
     */
    public Boolean getIsSupportShieldedInstances() {
        return isSupportShieldedInstances;
    }

    /** Whether the shape supports "MONTH" Commitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportMonthlyCommitment")
    private final Boolean isSupportMonthlyCommitment;

    /**
     * Whether the shape supports "MONTH" Commitment.
     *
     * @return the value
     */
    public Boolean getIsSupportMonthlyCommitment() {
        return isSupportMonthlyCommitment;
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
        sb.append("SupportedHostShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", supportedOperations=").append(String.valueOf(this.supportedOperations));
        sb.append(", shapeFamily=").append(String.valueOf(this.shapeFamily));
        sb.append(", defaultOcpuCount=").append(String.valueOf(this.defaultOcpuCount));
        sb.append(", supportedOcpuCount=").append(String.valueOf(this.supportedOcpuCount));
        sb.append(", isSingleHostSddcSupported=")
                .append(String.valueOf(this.isSingleHostSddcSupported));
        sb.append(", supportedVmwareSoftwareVersions=")
                .append(String.valueOf(this.supportedVmwareSoftwareVersions));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isSupportShieldedInstances=")
                .append(String.valueOf(this.isSupportShieldedInstances));
        sb.append(", isSupportMonthlyCommitment=")
                .append(String.valueOf(this.isSupportMonthlyCommitment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportedHostShapeSummary)) {
            return false;
        }

        SupportedHostShapeSummary other = (SupportedHostShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.supportedOperations, other.supportedOperations)
                && java.util.Objects.equals(this.shapeFamily, other.shapeFamily)
                && java.util.Objects.equals(this.defaultOcpuCount, other.defaultOcpuCount)
                && java.util.Objects.equals(this.supportedOcpuCount, other.supportedOcpuCount)
                && java.util.Objects.equals(
                        this.isSingleHostSddcSupported, other.isSingleHostSddcSupported)
                && java.util.Objects.equals(
                        this.supportedVmwareSoftwareVersions, other.supportedVmwareSoftwareVersions)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.isSupportShieldedInstances, other.isSupportShieldedInstances)
                && java.util.Objects.equals(
                        this.isSupportMonthlyCommitment, other.isSupportMonthlyCommitment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOperations == null
                                ? 43
                                : this.supportedOperations.hashCode());
        result = (result * PRIME) + (this.shapeFamily == null ? 43 : this.shapeFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultOcpuCount == null ? 43 : this.defaultOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOcpuCount == null
                                ? 43
                                : this.supportedOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleHostSddcSupported == null
                                ? 43
                                : this.isSingleHostSddcSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedVmwareSoftwareVersions == null
                                ? 43
                                : this.supportedVmwareSoftwareVersions.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportShieldedInstances == null
                                ? 43
                                : this.isSupportShieldedInstances.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportMonthlyCommitment == null
                                ? 43
                                : this.isSupportMonthlyCommitment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
