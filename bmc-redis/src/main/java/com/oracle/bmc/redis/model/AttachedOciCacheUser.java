/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * OciCacheUser attached to the OciCacheCluster. <br>
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
        builder = AttachedOciCacheUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttachedOciCacheUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ociCacheUserId"})
    public AttachedOciCacheUser(String ociCacheUserId) {
        super();
        this.ociCacheUserId = ociCacheUserId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the OciCacheUser */
        @com.fasterxml.jackson.annotation.JsonProperty("ociCacheUserId")
        private String ociCacheUserId;

        /**
         * OCID of the OciCacheUser
         *
         * @param ociCacheUserId the value to set
         * @return this builder
         */
        public Builder ociCacheUserId(String ociCacheUserId) {
            this.ociCacheUserId = ociCacheUserId;
            this.__explicitlySet__.add("ociCacheUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachedOciCacheUser build() {
            AttachedOciCacheUser model = new AttachedOciCacheUser(this.ociCacheUserId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachedOciCacheUser model) {
            if (model.wasPropertyExplicitlySet("ociCacheUserId")) {
                this.ociCacheUserId(model.getOciCacheUserId());
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

    /** OCID of the OciCacheUser */
    @com.fasterxml.jackson.annotation.JsonProperty("ociCacheUserId")
    private final String ociCacheUserId;

    /**
     * OCID of the OciCacheUser
     *
     * @return the value
     */
    public String getOciCacheUserId() {
        return ociCacheUserId;
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
        sb.append("AttachedOciCacheUser(");
        sb.append("super=").append(super.toString());
        sb.append("ociCacheUserId=").append(String.valueOf(this.ociCacheUserId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachedOciCacheUser)) {
            return false;
        }

        AttachedOciCacheUser other = (AttachedOciCacheUser) o;
        return java.util.Objects.equals(this.ociCacheUserId, other.ociCacheUserId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ociCacheUserId == null ? 43 : this.ociCacheUserId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
