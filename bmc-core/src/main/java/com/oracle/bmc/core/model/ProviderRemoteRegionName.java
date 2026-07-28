/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A pair of OCI region and Provider remote region names for FastConnect MultiCloud interconnect.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProviderRemoteRegionName.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProviderRemoteRegionName
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ociRegionName", "providerRegionName"})
    public ProviderRemoteRegionName(String ociRegionName, String providerRegionName) {
        super();
        this.ociRegionName = ociRegionName;
        this.providerRegionName = providerRegionName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCI region name associated with the provider remote region.
         * Example: {@code us-ashburn-1}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ociRegionName")
        private String ociRegionName;

        /**
         * The OCI region name associated with the provider remote region.
         * Example: {@code us-ashburn-1}.
         *
         * @param ociRegionName the value to set
         * @return this builder
         **/
        public Builder ociRegionName(String ociRegionName) {
            this.ociRegionName = ociRegionName;
            this.__explicitlySet__.add("ociRegionName");
            return this;
        }
        /**
         * The provider remote region name associated with the OCI region.
         * Example: {@code us-east-1}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerRegionName")
        private String providerRegionName;

        /**
         * The provider remote region name associated with the OCI region.
         * Example: {@code us-east-1}.
         *
         * @param providerRegionName the value to set
         * @return this builder
         **/
        public Builder providerRegionName(String providerRegionName) {
            this.providerRegionName = providerRegionName;
            this.__explicitlySet__.add("providerRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProviderRemoteRegionName build() {
            ProviderRemoteRegionName model =
                    new ProviderRemoteRegionName(this.ociRegionName, this.providerRegionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProviderRemoteRegionName model) {
            if (model.wasPropertyExplicitlySet("ociRegionName")) {
                this.ociRegionName(model.getOciRegionName());
            }
            if (model.wasPropertyExplicitlySet("providerRegionName")) {
                this.providerRegionName(model.getProviderRegionName());
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
     * The OCI region name associated with the provider remote region.
     * Example: {@code us-ashburn-1}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociRegionName")
    private final String ociRegionName;

    /**
     * The OCI region name associated with the provider remote region.
     * Example: {@code us-ashburn-1}.
     *
     * @return the value
     **/
    public String getOciRegionName() {
        return ociRegionName;
    }

    /**
     * The provider remote region name associated with the OCI region.
     * Example: {@code us-east-1}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerRegionName")
    private final String providerRegionName;

    /**
     * The provider remote region name associated with the OCI region.
     * Example: {@code us-east-1}.
     *
     * @return the value
     **/
    public String getProviderRegionName() {
        return providerRegionName;
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
        sb.append("ProviderRemoteRegionName(");
        sb.append("super=").append(super.toString());
        sb.append("ociRegionName=").append(String.valueOf(this.ociRegionName));
        sb.append(", providerRegionName=").append(String.valueOf(this.providerRegionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProviderRemoteRegionName)) {
            return false;
        }

        ProviderRemoteRegionName other = (ProviderRemoteRegionName) o;
        return java.util.Objects.equals(this.ociRegionName, other.ociRegionName)
                && java.util.Objects.equals(this.providerRegionName, other.providerRegionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ociRegionName == null ? 43 : this.ociRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerRegionName == null
                                ? 43
                                : this.providerRegionName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
