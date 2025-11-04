/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Additional details about the provisioned services <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdditionalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdditionalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assignedConnections",
        "modelId",
        "modelVersion",
        "ociRegion",
        "endpointDetails",
        "privateEndpointId"
    })
    public AdditionalDetails(
            java.util.List<AssignedConnectionDetails> assignedConnections,
            String modelId,
            String modelVersion,
            String ociRegion,
            java.util.List<EndpointAdditional> endpointDetails,
            String privateEndpointId) {
        super();
        this.assignedConnections = assignedConnections;
        this.modelId = modelId;
        this.modelVersion = modelVersion;
        this.ociRegion = ociRegion;
        this.endpointDetails = endpointDetails;
        this.privateEndpointId = privateEndpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** connections assigned to Golden Gate deployment */
        @com.fasterxml.jackson.annotation.JsonProperty("assignedConnections")
        private java.util.List<AssignedConnectionDetails> assignedConnections;

        /**
         * connections assigned to Golden Gate deployment
         *
         * @param assignedConnections the value to set
         * @return this builder
         */
        public Builder assignedConnections(
                java.util.List<AssignedConnectionDetails> assignedConnections) {
            this.assignedConnections = assignedConnections;
            this.__explicitlySet__.add("assignedConnections");
            return this;
        }
        /** OCID of model */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * OCID of model
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /** version of model */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * version of model
         *
         * @param modelVersion the value to set
         * @return this builder
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /** region of cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("ociRegion")
        private String ociRegion;

        /**
         * region of cluster
         *
         * @param ociRegion the value to set
         * @return this builder
         */
        public Builder ociRegion(String ociRegion) {
            this.ociRegion = ociRegion;
            this.__explicitlySet__.add("ociRegion");
            return this;
        }
        /** details of all endpoints assigned to cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointDetails")
        private java.util.List<EndpointAdditional> endpointDetails;

        /**
         * details of all endpoints assigned to cluster
         *
         * @param endpointDetails the value to set
         * @return this builder
         */
        public Builder endpointDetails(java.util.List<EndpointAdditional> endpointDetails) {
            this.endpointDetails = endpointDetails;
            this.__explicitlySet__.add("endpointDetails");
            return this;
        }
        /** OCID of model */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * OCID of model
         *
         * @param privateEndpointId the value to set
         * @return this builder
         */
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalDetails build() {
            AdditionalDetails model =
                    new AdditionalDetails(
                            this.assignedConnections,
                            this.modelId,
                            this.modelVersion,
                            this.ociRegion,
                            this.endpointDetails,
                            this.privateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalDetails model) {
            if (model.wasPropertyExplicitlySet("assignedConnections")) {
                this.assignedConnections(model.getAssignedConnections());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("ociRegion")) {
                this.ociRegion(model.getOciRegion());
            }
            if (model.wasPropertyExplicitlySet("endpointDetails")) {
                this.endpointDetails(model.getEndpointDetails());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
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

    /** connections assigned to Golden Gate deployment */
    @com.fasterxml.jackson.annotation.JsonProperty("assignedConnections")
    private final java.util.List<AssignedConnectionDetails> assignedConnections;

    /**
     * connections assigned to Golden Gate deployment
     *
     * @return the value
     */
    public java.util.List<AssignedConnectionDetails> getAssignedConnections() {
        return assignedConnections;
    }

    /** OCID of model */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * OCID of model
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /** version of model */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * version of model
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /** region of cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("ociRegion")
    private final String ociRegion;

    /**
     * region of cluster
     *
     * @return the value
     */
    public String getOciRegion() {
        return ociRegion;
    }

    /** details of all endpoints assigned to cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointDetails")
    private final java.util.List<EndpointAdditional> endpointDetails;

    /**
     * details of all endpoints assigned to cluster
     *
     * @return the value
     */
    public java.util.List<EndpointAdditional> getEndpointDetails() {
        return endpointDetails;
    }

    /** OCID of model */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * OCID of model
     *
     * @return the value
     */
    public String getPrivateEndpointId() {
        return privateEndpointId;
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
        sb.append("AdditionalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("assignedConnections=").append(String.valueOf(this.assignedConnections));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", ociRegion=").append(String.valueOf(this.ociRegion));
        sb.append(", endpointDetails=").append(String.valueOf(this.endpointDetails));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalDetails)) {
            return false;
        }

        AdditionalDetails other = (AdditionalDetails) o;
        return java.util.Objects.equals(this.assignedConnections, other.assignedConnections)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.ociRegion, other.ociRegion)
                && java.util.Objects.equals(this.endpointDetails, other.endpointDetails)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.assignedConnections == null
                                ? 43
                                : this.assignedConnections.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.ociRegion == null ? 43 : this.ociRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointDetails == null ? 43 : this.endpointDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
