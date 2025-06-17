/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * OciCacheCluster to which the OciCacheUser is attached. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AttachedOciCacheCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttachedOciCacheCluster
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ociCacheClusterId"})
    public AttachedOciCacheCluster(String ociCacheClusterId) {
        super();
        this.ociCacheClusterId = ociCacheClusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the OciCacheCluster */
        @com.fasterxml.jackson.annotation.JsonProperty("ociCacheClusterId")
        private String ociCacheClusterId;

        /**
         * OCID of the OciCacheCluster
         *
         * @param ociCacheClusterId the value to set
         * @return this builder
         */
        public Builder ociCacheClusterId(String ociCacheClusterId) {
            this.ociCacheClusterId = ociCacheClusterId;
            this.__explicitlySet__.add("ociCacheClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachedOciCacheCluster build() {
            AttachedOciCacheCluster model = new AttachedOciCacheCluster(this.ociCacheClusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachedOciCacheCluster model) {
            if (model.wasPropertyExplicitlySet("ociCacheClusterId")) {
                this.ociCacheClusterId(model.getOciCacheClusterId());
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

    /** OCID of the OciCacheCluster */
    @com.fasterxml.jackson.annotation.JsonProperty("ociCacheClusterId")
    private final String ociCacheClusterId;

    /**
     * OCID of the OciCacheCluster
     *
     * @return the value
     */
    public String getOciCacheClusterId() {
        return ociCacheClusterId;
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
        sb.append("AttachedOciCacheCluster(");
        sb.append("super=").append(super.toString());
        sb.append("ociCacheClusterId=").append(String.valueOf(this.ociCacheClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachedOciCacheCluster)) {
            return false;
        }

        AttachedOciCacheCluster other = (AttachedOciCacheCluster) o;
        return java.util.Objects.equals(this.ociCacheClusterId, other.ociCacheClusterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ociCacheClusterId == null ? 43 : this.ociCacheClusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
