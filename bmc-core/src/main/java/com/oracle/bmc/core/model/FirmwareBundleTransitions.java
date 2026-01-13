/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A map of firmware bundle upgrades/downgrades validated by OCI. <br>
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
        builder = FirmwareBundleTransitions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FirmwareBundleTransitions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"upgrades", "downgrades"})
    public FirmwareBundleTransitions(
            java.util.List<String> upgrades, java.util.List<String> downgrades) {
        super();
        this.upgrades = upgrades;
        this.downgrades = downgrades;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * validated firmware bundle upgrades.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upgrades")
        private java.util.List<String> upgrades;

        /**
         * An array of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * validated firmware bundle upgrades.
         *
         * @param upgrades the value to set
         * @return this builder
         */
        public Builder upgrades(java.util.List<String> upgrades) {
            this.upgrades = upgrades;
            this.__explicitlySet__.add("upgrades");
            return this;
        }
        /**
         * An array of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * validated firmware bundle downgrades.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("downgrades")
        private java.util.List<String> downgrades;

        /**
         * An array of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * validated firmware bundle downgrades.
         *
         * @param downgrades the value to set
         * @return this builder
         */
        public Builder downgrades(java.util.List<String> downgrades) {
            this.downgrades = downgrades;
            this.__explicitlySet__.add("downgrades");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FirmwareBundleTransitions build() {
            FirmwareBundleTransitions model =
                    new FirmwareBundleTransitions(this.upgrades, this.downgrades);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FirmwareBundleTransitions model) {
            if (model.wasPropertyExplicitlySet("upgrades")) {
                this.upgrades(model.getUpgrades());
            }
            if (model.wasPropertyExplicitlySet("downgrades")) {
                this.downgrades(model.getDowngrades());
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
     * An array of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * validated firmware bundle upgrades.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upgrades")
    private final java.util.List<String> upgrades;

    /**
     * An array of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * validated firmware bundle upgrades.
     *
     * @return the value
     */
    public java.util.List<String> getUpgrades() {
        return upgrades;
    }

    /**
     * An array of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * validated firmware bundle downgrades.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downgrades")
    private final java.util.List<String> downgrades;

    /**
     * An array of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * validated firmware bundle downgrades.
     *
     * @return the value
     */
    public java.util.List<String> getDowngrades() {
        return downgrades;
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
        sb.append("FirmwareBundleTransitions(");
        sb.append("super=").append(super.toString());
        sb.append("upgrades=").append(String.valueOf(this.upgrades));
        sb.append(", downgrades=").append(String.valueOf(this.downgrades));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FirmwareBundleTransitions)) {
            return false;
        }

        FirmwareBundleTransitions other = (FirmwareBundleTransitions) o;
        return java.util.Objects.equals(this.upgrades, other.upgrades)
                && java.util.Objects.equals(this.downgrades, other.downgrades)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.upgrades == null ? 43 : this.upgrades.hashCode());
        result = (result * PRIME) + (this.downgrades == null ? 43 : this.downgrades.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
