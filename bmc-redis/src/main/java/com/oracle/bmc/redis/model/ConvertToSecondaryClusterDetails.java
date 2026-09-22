/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * The information required to convert a cluster into a secondary cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConvertToSecondaryClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConvertToSecondaryClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"primaryClusterId"})
    public ConvertToSecondaryClusterDetails(String primaryClusterId) {
        super();
        this.primaryClusterId = primaryClusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of the primary cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryClusterId")
        private String primaryClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of the primary cluster.
         * @param primaryClusterId the value to set
         * @return this builder
         **/
        public Builder primaryClusterId(String primaryClusterId) {
            this.primaryClusterId = primaryClusterId;
            this.__explicitlySet__.add("primaryClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConvertToSecondaryClusterDetails build() {
            ConvertToSecondaryClusterDetails model =
                    new ConvertToSecondaryClusterDetails(this.primaryClusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConvertToSecondaryClusterDetails model) {
            if (model.wasPropertyExplicitlySet("primaryClusterId")) {
                this.primaryClusterId(model.getPrimaryClusterId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of the primary cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryClusterId")
    private final String primaryClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of the primary cluster.
     * @return the value
     **/
    public String getPrimaryClusterId() {
        return primaryClusterId;
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
        sb.append("ConvertToSecondaryClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("primaryClusterId=").append(String.valueOf(this.primaryClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConvertToSecondaryClusterDetails)) {
            return false;
        }

        ConvertToSecondaryClusterDetails other = (ConvertToSecondaryClusterDetails) o;
        return java.util.Objects.equals(this.primaryClusterId, other.primaryClusterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.primaryClusterId == null ? 43 : this.primaryClusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
