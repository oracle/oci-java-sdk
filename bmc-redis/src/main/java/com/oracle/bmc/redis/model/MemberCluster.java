/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * The details of a cluster participating in the replication setup. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MemberCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MemberCluster extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ociCacheClusterId", "region"})
    public MemberCluster(String ociCacheClusterId, String region) {
        super();
        this.ociCacheClusterId = ociCacheClusterId;
        this.region = region;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the OCI Cache cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ociCacheClusterId")
        private String ociCacheClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the OCI Cache cluster.
         *
         * @param ociCacheClusterId the value to set
         * @return this builder
         */
        public Builder ociCacheClusterId(String ociCacheClusterId) {
            this.ociCacheClusterId = ociCacheClusterId;
            this.__explicitlySet__.add("ociCacheClusterId");
            return this;
        }
        /** The OCI region to which the cluster belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The OCI region to which the cluster belongs.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemberCluster build() {
            MemberCluster model = new MemberCluster(this.ociCacheClusterId, this.region);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemberCluster model) {
            if (model.wasPropertyExplicitlySet("ociCacheClusterId")) {
                this.ociCacheClusterId(model.getOciCacheClusterId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the OCI Cache cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ociCacheClusterId")
    private final String ociCacheClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the OCI Cache cluster.
     *
     * @return the value
     */
    public String getOciCacheClusterId() {
        return ociCacheClusterId;
    }

    /** The OCI region to which the cluster belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The OCI region to which the cluster belongs.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
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
        sb.append("MemberCluster(");
        sb.append("super=").append(super.toString());
        sb.append("ociCacheClusterId=").append(String.valueOf(this.ociCacheClusterId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemberCluster)) {
            return false;
        }

        MemberCluster other = (MemberCluster) o;
        return java.util.Objects.equals(this.ociCacheClusterId, other.ociCacheClusterId)
                && java.util.Objects.equals(this.region, other.region)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ociCacheClusterId == null ? 43 : this.ociCacheClusterId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
