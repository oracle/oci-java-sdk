/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * GGCS details required to provision deployments and connections. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GgcsDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GgcsDetail extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "ocpu",
        "subnetId",
        "publicSubnetId",
        "passwordSecretId",
        "oggVersion",
        "connections"
    })
    public GgcsDetail(
            String instanceId,
            Integer ocpu,
            String subnetId,
            String publicSubnetId,
            String passwordSecretId,
            String oggVersion,
            java.util.List<GgcsConnectionDetails> connections) {
        super();
        this.instanceId = instanceId;
        this.ocpu = ocpu;
        this.subnetId = subnetId;
        this.publicSubnetId = publicSubnetId;
        this.passwordSecretId = passwordSecretId;
        this.oggVersion = oggVersion;
        this.connections = connections;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Id for the GGCS instance to provision. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Id for the GGCS instance to provision.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The Minimum number of OCPUs to be made available for this Deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpu")
        private Integer ocpu;

        /**
         * The Minimum number of OCPUs to be made available for this Deployment.
         *
         * @param ocpu the value to set
         * @return this builder
         */
        public Builder ocpu(Integer ocpu) {
            this.ocpu = ocpu;
            this.__explicitlySet__.add("ocpu");
            return this;
        }
        /** The OCID of the subnet of the GGCS deployment's private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet of the GGCS deployment's private endpoint.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The OCID of a public subnet in the customer tenancy. Can be provided only for public GGCS
         * deployments.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicSubnetId")
        private String publicSubnetId;

        /**
         * The OCID of a public subnet in the customer tenancy. Can be provided only for public GGCS
         * deployments.
         *
         * @param publicSubnetId the value to set
         * @return this builder
         */
        public Builder publicSubnetId(String publicSubnetId) {
            this.publicSubnetId = publicSubnetId;
            this.__explicitlySet__.add("publicSubnetId");
            return this;
        }
        /** The OCID of the Secret where the deployment password is stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The OCID of the Secret where the deployment password is stored.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /** Version of OGG. */
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG.
         *
         * @param oggVersion the value to set
         * @return this builder
         */
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }
        /** Connection details to be associated with the Goldengate deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("connections")
        private java.util.List<GgcsConnectionDetails> connections;

        /**
         * Connection details to be associated with the Goldengate deployment.
         *
         * @param connections the value to set
         * @return this builder
         */
        public Builder connections(java.util.List<GgcsConnectionDetails> connections) {
            this.connections = connections;
            this.__explicitlySet__.add("connections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgcsDetail build() {
            GgcsDetail model =
                    new GgcsDetail(
                            this.instanceId,
                            this.ocpu,
                            this.subnetId,
                            this.publicSubnetId,
                            this.passwordSecretId,
                            this.oggVersion,
                            this.connections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgcsDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("ocpu")) {
                this.ocpu(model.getOcpu());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("publicSubnetId")) {
                this.publicSubnetId(model.getPublicSubnetId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
            }
            if (model.wasPropertyExplicitlySet("connections")) {
                this.connections(model.getConnections());
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

    /** Id for the GGCS instance to provision. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Id for the GGCS instance to provision.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The Minimum number of OCPUs to be made available for this Deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpu")
    private final Integer ocpu;

    /**
     * The Minimum number of OCPUs to be made available for this Deployment.
     *
     * @return the value
     */
    public Integer getOcpu() {
        return ocpu;
    }

    /** The OCID of the subnet of the GGCS deployment's private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet of the GGCS deployment's private endpoint.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The OCID of a public subnet in the customer tenancy. Can be provided only for public GGCS
     * deployments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicSubnetId")
    private final String publicSubnetId;

    /**
     * The OCID of a public subnet in the customer tenancy. Can be provided only for public GGCS
     * deployments.
     *
     * @return the value
     */
    public String getPublicSubnetId() {
        return publicSubnetId;
    }

    /** The OCID of the Secret where the deployment password is stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The OCID of the Secret where the deployment password is stored.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /** Version of OGG. */
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG.
     *
     * @return the value
     */
    public String getOggVersion() {
        return oggVersion;
    }

    /** Connection details to be associated with the Goldengate deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("connections")
    private final java.util.List<GgcsConnectionDetails> connections;

    /**
     * Connection details to be associated with the Goldengate deployment.
     *
     * @return the value
     */
    public java.util.List<GgcsConnectionDetails> getConnections() {
        return connections;
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
        sb.append("GgcsDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", ocpu=").append(String.valueOf(this.ocpu));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", publicSubnetId=").append(String.valueOf(this.publicSubnetId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", connections=").append(String.valueOf(this.connections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgcsDetail)) {
            return false;
        }

        GgcsDetail other = (GgcsDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.ocpu, other.ocpu)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.publicSubnetId, other.publicSubnetId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(this.connections, other.connections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.ocpu == null ? 43 : this.ocpu.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.publicSubnetId == null ? 43 : this.publicSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result = (result * PRIME) + (this.connections == null ? 43 : this.connections.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
