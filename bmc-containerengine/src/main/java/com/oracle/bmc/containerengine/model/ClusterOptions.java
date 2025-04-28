/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Options for creating or updating clusters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"kubernetesVersions", "clusterPodNetworkOptions"})
    public ClusterOptions(
            java.util.List<String> kubernetesVersions,
            java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions) {
        super();
        this.kubernetesVersions = kubernetesVersions;
        this.clusterPodNetworkOptions = clusterPodNetworkOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Available Kubernetes versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersions")
        private java.util.List<String> kubernetesVersions;

        /**
         * Available Kubernetes versions.
         *
         * @param kubernetesVersions the value to set
         * @return this builder
         */
        public Builder kubernetesVersions(java.util.List<String> kubernetesVersions) {
            this.kubernetesVersions = kubernetesVersions;
            this.__explicitlySet__.add("kubernetesVersions");
            return this;
        }
        /** Available CNIs and network options for existing and new node pools of the cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPodNetworkOptions")
        private java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions;

        /**
         * Available CNIs and network options for existing and new node pools of the cluster
         *
         * @param clusterPodNetworkOptions the value to set
         * @return this builder
         */
        public Builder clusterPodNetworkOptions(
                java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions) {
            this.clusterPodNetworkOptions = clusterPodNetworkOptions;
            this.__explicitlySet__.add("clusterPodNetworkOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterOptions build() {
            ClusterOptions model =
                    new ClusterOptions(this.kubernetesVersions, this.clusterPodNetworkOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterOptions model) {
            if (model.wasPropertyExplicitlySet("kubernetesVersions")) {
                this.kubernetesVersions(model.getKubernetesVersions());
            }
            if (model.wasPropertyExplicitlySet("clusterPodNetworkOptions")) {
                this.clusterPodNetworkOptions(model.getClusterPodNetworkOptions());
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

    /** Available Kubernetes versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersions")
    private final java.util.List<String> kubernetesVersions;

    /**
     * Available Kubernetes versions.
     *
     * @return the value
     */
    public java.util.List<String> getKubernetesVersions() {
        return kubernetesVersions;
    }

    /** Available CNIs and network options for existing and new node pools of the cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPodNetworkOptions")
    private final java.util.List<ClusterPodNetworkOptionDetails> clusterPodNetworkOptions;

    /**
     * Available CNIs and network options for existing and new node pools of the cluster
     *
     * @return the value
     */
    public java.util.List<ClusterPodNetworkOptionDetails> getClusterPodNetworkOptions() {
        return clusterPodNetworkOptions;
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
        sb.append("ClusterOptions(");
        sb.append("super=").append(super.toString());
        sb.append("kubernetesVersions=").append(String.valueOf(this.kubernetesVersions));
        sb.append(", clusterPodNetworkOptions=")
                .append(String.valueOf(this.clusterPodNetworkOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterOptions)) {
            return false;
        }

        ClusterOptions other = (ClusterOptions) o;
        return java.util.Objects.equals(this.kubernetesVersions, other.kubernetesVersions)
                && java.util.Objects.equals(
                        this.clusterPodNetworkOptions, other.clusterPodNetworkOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.kubernetesVersions == null
                                ? 43
                                : this.kubernetesVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPodNetworkOptions == null
                                ? 43
                                : this.clusterPodNetworkOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
