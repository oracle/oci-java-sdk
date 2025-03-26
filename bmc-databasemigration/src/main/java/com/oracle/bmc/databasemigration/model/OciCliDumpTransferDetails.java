/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional dump transfer details for OCI-CLI-based dump transfer in source or target host.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OciCliDumpTransferDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciCliDumpTransferDetails extends HostDumpTransferDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
        private String walletLocation;

        public Builder walletLocation(String walletLocation) {
            this.walletLocation = walletLocation;
            this.__explicitlySet__.add("walletLocation");
            return this;
        }
        /**
         * Path to the OCI CLI installation in the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ociHome")
        private String ociHome;

        /**
         * Path to the OCI CLI installation in the node.
         * @param ociHome the value to set
         * @return this builder
         **/
        public Builder ociHome(String ociHome) {
            this.ociHome = ociHome;
            this.__explicitlySet__.add("ociHome");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciCliDumpTransferDetails build() {
            OciCliDumpTransferDetails model =
                    new OciCliDumpTransferDetails(this.walletLocation, this.ociHome);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciCliDumpTransferDetails model) {
            if (model.wasPropertyExplicitlySet("walletLocation")) {
                this.walletLocation(model.getWalletLocation());
            }
            if (model.wasPropertyExplicitlySet("ociHome")) {
                this.ociHome(model.getOciHome());
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

    @Deprecated
    public OciCliDumpTransferDetails(String walletLocation, String ociHome) {
        super(walletLocation);
        this.ociHome = ociHome;
    }

    /**
     * Path to the OCI CLI installation in the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociHome")
    private final String ociHome;

    /**
     * Path to the OCI CLI installation in the node.
     * @return the value
     **/
    public String getOciHome() {
        return ociHome;
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
        sb.append("OciCliDumpTransferDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ociHome=").append(String.valueOf(this.ociHome));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciCliDumpTransferDetails)) {
            return false;
        }

        OciCliDumpTransferDetails other = (OciCliDumpTransferDetails) o;
        return java.util.Objects.equals(this.ociHome, other.ociHome) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ociHome == null ? 43 : this.ociHome.hashCode());
        return result;
    }
}
