/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Depends on object for Subnet Variables. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubnetVariableDependsOn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubnetVariableDependsOn
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vcnId",
        "compartmentId",
        "hidePublicSubnet",
        "hidePrivateSubnet",
        "hideRegionalSubnet",
        "hideAdSubnet"
    })
    public SubnetVariableDependsOn(
            String vcnId,
            String compartmentId,
            String hidePublicSubnet,
            String hidePrivateSubnet,
            String hideRegionalSubnet,
            String hideAdSubnet) {
        super();
        this.vcnId = vcnId;
        this.compartmentId = compartmentId;
        this.hidePublicSubnet = hidePublicSubnet;
        this.hidePrivateSubnet = hidePrivateSubnet;
        this.hideRegionalSubnet = hideRegionalSubnet;
        this.hideAdSubnet = hideAdSubnet;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * OCID of the VCN.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** If present, hides public subnets. */
        @com.fasterxml.jackson.annotation.JsonProperty("hidePublicSubnet")
        private String hidePublicSubnet;

        /**
         * If present, hides public subnets.
         *
         * @param hidePublicSubnet the value to set
         * @return this builder
         */
        public Builder hidePublicSubnet(String hidePublicSubnet) {
            this.hidePublicSubnet = hidePublicSubnet;
            this.__explicitlySet__.add("hidePublicSubnet");
            return this;
        }
        /** If present, hides private subnets. */
        @com.fasterxml.jackson.annotation.JsonProperty("hidePrivateSubnet")
        private String hidePrivateSubnet;

        /**
         * If present, hides private subnets.
         *
         * @param hidePrivateSubnet the value to set
         * @return this builder
         */
        public Builder hidePrivateSubnet(String hidePrivateSubnet) {
            this.hidePrivateSubnet = hidePrivateSubnet;
            this.__explicitlySet__.add("hidePrivateSubnet");
            return this;
        }
        /** If present, hides regional subnets. */
        @com.fasterxml.jackson.annotation.JsonProperty("hideRegionalSubnet")
        private String hideRegionalSubnet;

        /**
         * If present, hides regional subnets.
         *
         * @param hideRegionalSubnet the value to set
         * @return this builder
         */
        public Builder hideRegionalSubnet(String hideRegionalSubnet) {
            this.hideRegionalSubnet = hideRegionalSubnet;
            this.__explicitlySet__.add("hideRegionalSubnet");
            return this;
        }
        /** If present, hides AD subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("hideAdSubnet")
        private String hideAdSubnet;

        /**
         * If present, hides AD subnet.
         *
         * @param hideAdSubnet the value to set
         * @return this builder
         */
        public Builder hideAdSubnet(String hideAdSubnet) {
            this.hideAdSubnet = hideAdSubnet;
            this.__explicitlySet__.add("hideAdSubnet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubnetVariableDependsOn build() {
            SubnetVariableDependsOn model =
                    new SubnetVariableDependsOn(
                            this.vcnId,
                            this.compartmentId,
                            this.hidePublicSubnet,
                            this.hidePrivateSubnet,
                            this.hideRegionalSubnet,
                            this.hideAdSubnet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubnetVariableDependsOn model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hidePublicSubnet")) {
                this.hidePublicSubnet(model.getHidePublicSubnet());
            }
            if (model.wasPropertyExplicitlySet("hidePrivateSubnet")) {
                this.hidePrivateSubnet(model.getHidePrivateSubnet());
            }
            if (model.wasPropertyExplicitlySet("hideRegionalSubnet")) {
                this.hideRegionalSubnet(model.getHideRegionalSubnet());
            }
            if (model.wasPropertyExplicitlySet("hideAdSubnet")) {
                this.hideAdSubnet(model.getHideAdSubnet());
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

    /** OCID of the VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * OCID of the VCN.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** If present, hides public subnets. */
    @com.fasterxml.jackson.annotation.JsonProperty("hidePublicSubnet")
    private final String hidePublicSubnet;

    /**
     * If present, hides public subnets.
     *
     * @return the value
     */
    public String getHidePublicSubnet() {
        return hidePublicSubnet;
    }

    /** If present, hides private subnets. */
    @com.fasterxml.jackson.annotation.JsonProperty("hidePrivateSubnet")
    private final String hidePrivateSubnet;

    /**
     * If present, hides private subnets.
     *
     * @return the value
     */
    public String getHidePrivateSubnet() {
        return hidePrivateSubnet;
    }

    /** If present, hides regional subnets. */
    @com.fasterxml.jackson.annotation.JsonProperty("hideRegionalSubnet")
    private final String hideRegionalSubnet;

    /**
     * If present, hides regional subnets.
     *
     * @return the value
     */
    public String getHideRegionalSubnet() {
        return hideRegionalSubnet;
    }

    /** If present, hides AD subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("hideAdSubnet")
    private final String hideAdSubnet;

    /**
     * If present, hides AD subnet.
     *
     * @return the value
     */
    public String getHideAdSubnet() {
        return hideAdSubnet;
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
        sb.append("SubnetVariableDependsOn(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hidePublicSubnet=").append(String.valueOf(this.hidePublicSubnet));
        sb.append(", hidePrivateSubnet=").append(String.valueOf(this.hidePrivateSubnet));
        sb.append(", hideRegionalSubnet=").append(String.valueOf(this.hideRegionalSubnet));
        sb.append(", hideAdSubnet=").append(String.valueOf(this.hideAdSubnet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubnetVariableDependsOn)) {
            return false;
        }

        SubnetVariableDependsOn other = (SubnetVariableDependsOn) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hidePublicSubnet, other.hidePublicSubnet)
                && java.util.Objects.equals(this.hidePrivateSubnet, other.hidePrivateSubnet)
                && java.util.Objects.equals(this.hideRegionalSubnet, other.hideRegionalSubnet)
                && java.util.Objects.equals(this.hideAdSubnet, other.hideAdSubnet)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.hidePublicSubnet == null ? 43 : this.hidePublicSubnet.hashCode());
        result =
                (result * PRIME)
                        + (this.hidePrivateSubnet == null ? 43 : this.hidePrivateSubnet.hashCode());
        result =
                (result * PRIME)
                        + (this.hideRegionalSubnet == null
                                ? 43
                                : this.hideRegionalSubnet.hashCode());
        result = (result * PRIME) + (this.hideAdSubnet == null ? 43 : this.hideAdSubnet.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
