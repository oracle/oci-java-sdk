/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details to reference an existing Oracle Managed Kubernetes environment. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OmkDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OmkDetail extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "clusterNamespaceId",
        "clusterId",
        "namespaceName"
    })
    public OmkDetail(
            String instanceId, String clusterNamespaceId, String clusterId, String namespaceName) {
        super();
        this.instanceId = instanceId;
        this.clusterNamespaceId = clusterNamespaceId;
        this.clusterId = clusterId;
        this.namespaceName = namespaceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for an omk instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Unique identifier for an omk instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** OCID of existing OMK cluster-namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterNamespaceId")
        private String clusterNamespaceId;

        /**
         * OCID of existing OMK cluster-namespace.
         *
         * @param clusterNamespaceId the value to set
         * @return this builder
         */
        public Builder clusterNamespaceId(String clusterNamespaceId) {
            this.clusterNamespaceId = clusterNamespaceId;
            this.__explicitlySet__.add("clusterNamespaceId");
            return this;
        }
        /** OCID of cluster assigned to OMK cluster-namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * OCID of cluster assigned to OMK cluster-namespace.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** Kubernetes namespace-name of OMK cluster-namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Kubernetes namespace-name of OMK cluster-namespace.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OmkDetail build() {
            OmkDetail model =
                    new OmkDetail(
                            this.instanceId,
                            this.clusterNamespaceId,
                            this.clusterId,
                            this.namespaceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OmkDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("clusterNamespaceId")) {
                this.clusterNamespaceId(model.getClusterNamespaceId());
            }
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
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

    /** Unique identifier for an omk instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Unique identifier for an omk instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** OCID of existing OMK cluster-namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterNamespaceId")
    private final String clusterNamespaceId;

    /**
     * OCID of existing OMK cluster-namespace.
     *
     * @return the value
     */
    public String getClusterNamespaceId() {
        return clusterNamespaceId;
    }

    /** OCID of cluster assigned to OMK cluster-namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * OCID of cluster assigned to OMK cluster-namespace.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** Kubernetes namespace-name of OMK cluster-namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Kubernetes namespace-name of OMK cluster-namespace.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
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
        sb.append("OmkDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", clusterNamespaceId=").append(String.valueOf(this.clusterNamespaceId));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OmkDetail)) {
            return false;
        }

        OmkDetail other = (OmkDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.clusterNamespaceId, other.clusterNamespaceId)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterNamespaceId == null
                                ? 43
                                : this.clusterNamespaceId.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
