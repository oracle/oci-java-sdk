/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Information about the cluster's hardened image.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateClusterHardenedImageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateClusterHardenedImageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterId"})
    public UpdateClusterHardenedImageDetails(String clusterId) {
        super();
        this.clusterId = clusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the OpenSearch cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * The OCID of the OpenSearch cluster.
         * @param clusterId the value to set
         * @return this builder
         **/
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateClusterHardenedImageDetails build() {
            UpdateClusterHardenedImageDetails model =
                    new UpdateClusterHardenedImageDetails(this.clusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateClusterHardenedImageDetails model) {
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the OpenSearch cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * The OCID of the OpenSearch cluster.
     * @return the value
     **/
    public String getClusterId() {
        return clusterId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateClusterHardenedImageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterId=").append(String.valueOf(this.clusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateClusterHardenedImageDetails)) {
            return false;
        }

        UpdateClusterHardenedImageDetails other = (UpdateClusterHardenedImageDetails) o;
        return java.util.Objects.equals(this.clusterId, other.clusterId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
