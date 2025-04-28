/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the virtual circuit attached to the DRG. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualCircuitDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuitDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportOnlyMode")
        private Boolean transportOnlyMode;

        /**
         * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
         *
         * <p>Example: {@code true}
         *
         * @param transportOnlyMode the value to set
         * @return this builder
         */
        public Builder transportOnlyMode(Boolean transportOnlyMode) {
            this.transportOnlyMode = transportOnlyMode;
            this.__explicitlySet__.add("transportOnlyMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitDrgAttachmentNetworkDetails build() {
            VirtualCircuitDrgAttachmentNetworkDetails model =
                    new VirtualCircuitDrgAttachmentNetworkDetails(this.id, this.transportOnlyMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("transportOnlyMode")) {
                this.transportOnlyMode(model.getTransportOnlyMode());
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

    @Deprecated
    public VirtualCircuitDrgAttachmentNetworkDetails(String id, Boolean transportOnlyMode) {
        super(id);
        this.transportOnlyMode = transportOnlyMode;
    }

    /**
     * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportOnlyMode")
    private final Boolean transportOnlyMode;

    /**
     * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getTransportOnlyMode() {
        return transportOnlyMode;
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
        sb.append("VirtualCircuitDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", transportOnlyMode=").append(String.valueOf(this.transportOnlyMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitDrgAttachmentNetworkDetails)) {
            return false;
        }

        VirtualCircuitDrgAttachmentNetworkDetails other =
                (VirtualCircuitDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.transportOnlyMode, other.transportOnlyMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.transportOnlyMode == null ? 43 : this.transportOnlyMode.hashCode());
        return result;
    }
}
