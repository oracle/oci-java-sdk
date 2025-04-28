/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides information about where a desktop is hosted. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostingOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostingOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"image", "connectAddress"})
    public HostingOptions(DesktopImage image, String connectAddress) {
        super();
        this.image = image;
        this.connectAddress = connectAddress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private DesktopImage image;

        public Builder image(DesktopImage image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /** The connection address of the desktop. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectAddress")
        private String connectAddress;

        /**
         * The connection address of the desktop.
         *
         * @param connectAddress the value to set
         * @return this builder
         */
        public Builder connectAddress(String connectAddress) {
            this.connectAddress = connectAddress;
            this.__explicitlySet__.add("connectAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostingOptions build() {
            HostingOptions model = new HostingOptions(this.image, this.connectAddress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostingOptions model) {
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("connectAddress")) {
                this.connectAddress(model.getConnectAddress());
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

    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final DesktopImage image;

    public DesktopImage getImage() {
        return image;
    }

    /** The connection address of the desktop. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectAddress")
    private final String connectAddress;

    /**
     * The connection address of the desktop.
     *
     * @return the value
     */
    public String getConnectAddress() {
        return connectAddress;
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
        sb.append("HostingOptions(");
        sb.append("super=").append(super.toString());
        sb.append("image=").append(String.valueOf(this.image));
        sb.append(", connectAddress=").append(String.valueOf(this.connectAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostingOptions)) {
            return false;
        }

        HostingOptions other = (HostingOptions) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.connectAddress, other.connectAddress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result =
                (result * PRIME)
                        + (this.connectAddress == null ? 43 : this.connectAddress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
