/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * This configuration is used for passing request details to connect outbound cluster(s) to the
 * inbound cluster (coordinating cluster) <br>
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
        builder = OutboundClusterConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OutboundClusterConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "outboundClusters"})
    public OutboundClusterConfig(
            Boolean isEnabled, java.util.List<OutboundClusterSummary> outboundClusters) {
        super();
        this.isEnabled = isEnabled;
        this.outboundClusters = outboundClusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Flag to indicate whether outbound cluster configuration is enabled */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Flag to indicate whether outbound cluster configuration is enabled
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** List of outbound clusters to be connected to the inbound cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundClusters")
        private java.util.List<OutboundClusterSummary> outboundClusters;

        /**
         * List of outbound clusters to be connected to the inbound cluster
         *
         * @param outboundClusters the value to set
         * @return this builder
         */
        public Builder outboundClusters(java.util.List<OutboundClusterSummary> outboundClusters) {
            this.outboundClusters = outboundClusters;
            this.__explicitlySet__.add("outboundClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OutboundClusterConfig build() {
            OutboundClusterConfig model =
                    new OutboundClusterConfig(this.isEnabled, this.outboundClusters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutboundClusterConfig model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("outboundClusters")) {
                this.outboundClusters(model.getOutboundClusters());
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

    /** Flag to indicate whether outbound cluster configuration is enabled */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Flag to indicate whether outbound cluster configuration is enabled
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** List of outbound clusters to be connected to the inbound cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundClusters")
    private final java.util.List<OutboundClusterSummary> outboundClusters;

    /**
     * List of outbound clusters to be connected to the inbound cluster
     *
     * @return the value
     */
    public java.util.List<OutboundClusterSummary> getOutboundClusters() {
        return outboundClusters;
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
        sb.append("OutboundClusterConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", outboundClusters=").append(String.valueOf(this.outboundClusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutboundClusterConfig)) {
            return false;
        }

        OutboundClusterConfig other = (OutboundClusterConfig) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.outboundClusters, other.outboundClusters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundClusters == null ? 43 : this.outboundClusters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
