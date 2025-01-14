/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * force patching a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ForcePatchClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ForcePatchClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterId", "flexShape"})
    public ForcePatchClusterDetails(String clusterId, String flexShape) {
        super();
        this.clusterId = clusterId;
        this.flexShape = flexShape;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the Opensearch Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * OCID of the Opensearch Cluster.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** flex shape name for the instances in the cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("flexShape")
        private String flexShape;

        /**
         * flex shape name for the instances in the cluster
         *
         * @param flexShape the value to set
         * @return this builder
         */
        public Builder flexShape(String flexShape) {
            this.flexShape = flexShape;
            this.__explicitlySet__.add("flexShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ForcePatchClusterDetails build() {
            ForcePatchClusterDetails model =
                    new ForcePatchClusterDetails(this.clusterId, this.flexShape);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ForcePatchClusterDetails model) {
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("flexShape")) {
                this.flexShape(model.getFlexShape());
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

    /** OCID of the Opensearch Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * OCID of the Opensearch Cluster.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** flex shape name for the instances in the cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("flexShape")
    private final String flexShape;

    /**
     * flex shape name for the instances in the cluster
     *
     * @return the value
     */
    public String getFlexShape() {
        return flexShape;
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
        sb.append("ForcePatchClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", flexShape=").append(String.valueOf(this.flexShape));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForcePatchClusterDetails)) {
            return false;
        }

        ForcePatchClusterDetails other = (ForcePatchClusterDetails) o;
        return java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.flexShape, other.flexShape)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.flexShape == null ? 43 : this.flexShape.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
