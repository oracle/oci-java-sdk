/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Virtual Node Pool Cycling Details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualNodePoolCyclingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualNodePoolCyclingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maximumUnavailable",
        "maximumSurge",
        "isVirtualNodeCyclingEnabled"
    })
    public VirtualNodePoolCyclingDetails(
            String maximumUnavailable, String maximumSurge, Boolean isVirtualNodeCyclingEnabled) {
        super();
        this.maximumUnavailable = maximumUnavailable;
        this.maximumSurge = maximumSurge;
        this.isVirtualNodeCyclingEnabled = isVirtualNodeCyclingEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Maximum active virtual nodes that would be terminated from virtual nodepool during the
         * cycling virtual nodepool process. OKE supports both integer and percentage input.
         * Defaults to 0, Ranges from 0 to Virtual Nodepool size or 0% to 100%
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumUnavailable")
        private String maximumUnavailable;

        /**
         * Maximum active virtual nodes that would be terminated from virtual nodepool during the
         * cycling virtual nodepool process. OKE supports both integer and percentage input.
         * Defaults to 0, Ranges from 0 to Virtual Nodepool size or 0% to 100%
         *
         * @param maximumUnavailable the value to set
         * @return this builder
         */
        public Builder maximumUnavailable(String maximumUnavailable) {
            this.maximumUnavailable = maximumUnavailable;
            this.__explicitlySet__.add("maximumUnavailable");
            return this;
        }
        /**
         * Maximum additional new virtual nodes that would be temporarily created and added to
         * virtual nodepool during the cycling virtual nodepool process. OKE supports both integer
         * and percentage input. Defaults to 1, Ranges from 0 to Virtual Nodepool size or 0% to 100%
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumSurge")
        private String maximumSurge;

        /**
         * Maximum additional new virtual nodes that would be temporarily created and added to
         * virtual nodepool during the cycling virtual nodepool process. OKE supports both integer
         * and percentage input. Defaults to 1, Ranges from 0 to Virtual Nodepool size or 0% to 100%
         *
         * @param maximumSurge the value to set
         * @return this builder
         */
        public Builder maximumSurge(String maximumSurge) {
            this.maximumSurge = maximumSurge;
            this.__explicitlySet__.add("maximumSurge");
            return this;
        }
        /** If virtual nodes in the virtual nodepool will be cycled to have new changes. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVirtualNodeCyclingEnabled")
        private Boolean isVirtualNodeCyclingEnabled;

        /**
         * If virtual nodes in the virtual nodepool will be cycled to have new changes.
         *
         * @param isVirtualNodeCyclingEnabled the value to set
         * @return this builder
         */
        public Builder isVirtualNodeCyclingEnabled(Boolean isVirtualNodeCyclingEnabled) {
            this.isVirtualNodeCyclingEnabled = isVirtualNodeCyclingEnabled;
            this.__explicitlySet__.add("isVirtualNodeCyclingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualNodePoolCyclingDetails build() {
            VirtualNodePoolCyclingDetails model =
                    new VirtualNodePoolCyclingDetails(
                            this.maximumUnavailable,
                            this.maximumSurge,
                            this.isVirtualNodeCyclingEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualNodePoolCyclingDetails model) {
            if (model.wasPropertyExplicitlySet("maximumUnavailable")) {
                this.maximumUnavailable(model.getMaximumUnavailable());
            }
            if (model.wasPropertyExplicitlySet("maximumSurge")) {
                this.maximumSurge(model.getMaximumSurge());
            }
            if (model.wasPropertyExplicitlySet("isVirtualNodeCyclingEnabled")) {
                this.isVirtualNodeCyclingEnabled(model.getIsVirtualNodeCyclingEnabled());
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
     * Maximum active virtual nodes that would be terminated from virtual nodepool during the
     * cycling virtual nodepool process. OKE supports both integer and percentage input. Defaults to
     * 0, Ranges from 0 to Virtual Nodepool size or 0% to 100%
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumUnavailable")
    private final String maximumUnavailable;

    /**
     * Maximum active virtual nodes that would be terminated from virtual nodepool during the
     * cycling virtual nodepool process. OKE supports both integer and percentage input. Defaults to
     * 0, Ranges from 0 to Virtual Nodepool size or 0% to 100%
     *
     * @return the value
     */
    public String getMaximumUnavailable() {
        return maximumUnavailable;
    }

    /**
     * Maximum additional new virtual nodes that would be temporarily created and added to virtual
     * nodepool during the cycling virtual nodepool process. OKE supports both integer and
     * percentage input. Defaults to 1, Ranges from 0 to Virtual Nodepool size or 0% to 100%
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumSurge")
    private final String maximumSurge;

    /**
     * Maximum additional new virtual nodes that would be temporarily created and added to virtual
     * nodepool during the cycling virtual nodepool process. OKE supports both integer and
     * percentage input. Defaults to 1, Ranges from 0 to Virtual Nodepool size or 0% to 100%
     *
     * @return the value
     */
    public String getMaximumSurge() {
        return maximumSurge;
    }

    /** If virtual nodes in the virtual nodepool will be cycled to have new changes. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVirtualNodeCyclingEnabled")
    private final Boolean isVirtualNodeCyclingEnabled;

    /**
     * If virtual nodes in the virtual nodepool will be cycled to have new changes.
     *
     * @return the value
     */
    public Boolean getIsVirtualNodeCyclingEnabled() {
        return isVirtualNodeCyclingEnabled;
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
        sb.append("VirtualNodePoolCyclingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maximumUnavailable=").append(String.valueOf(this.maximumUnavailable));
        sb.append(", maximumSurge=").append(String.valueOf(this.maximumSurge));
        sb.append(", isVirtualNodeCyclingEnabled=")
                .append(String.valueOf(this.isVirtualNodeCyclingEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualNodePoolCyclingDetails)) {
            return false;
        }

        VirtualNodePoolCyclingDetails other = (VirtualNodePoolCyclingDetails) o;
        return java.util.Objects.equals(this.maximumUnavailable, other.maximumUnavailable)
                && java.util.Objects.equals(this.maximumSurge, other.maximumSurge)
                && java.util.Objects.equals(
                        this.isVirtualNodeCyclingEnabled, other.isVirtualNodeCyclingEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maximumUnavailable == null
                                ? 43
                                : this.maximumUnavailable.hashCode());
        result = (result * PRIME) + (this.maximumSurge == null ? 43 : this.maximumSurge.hashCode());
        result =
                (result * PRIME)
                        + (this.isVirtualNodeCyclingEnabled == null
                                ? 43
                                : this.isVirtualNodeCyclingEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
