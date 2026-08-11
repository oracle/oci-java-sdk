/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Additional quick recycle settings. <br>
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
        builder = QuickRecycleSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QuickRecycleSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nvmeWipe"})
    public QuickRecycleSettings(Boolean nvmeWipe) {
        super();
        this.nvmeWipe = nvmeWipe;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether to wipe NVMe data during quick recycle. */
        @com.fasterxml.jackson.annotation.JsonProperty("nvmeWipe")
        private Boolean nvmeWipe;

        /**
         * Whether to wipe NVMe data during quick recycle.
         *
         * @param nvmeWipe the value to set
         * @return this builder
         */
        public Builder nvmeWipe(Boolean nvmeWipe) {
            this.nvmeWipe = nvmeWipe;
            this.__explicitlySet__.add("nvmeWipe");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QuickRecycleSettings build() {
            QuickRecycleSettings model = new QuickRecycleSettings(this.nvmeWipe);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QuickRecycleSettings model) {
            if (model.wasPropertyExplicitlySet("nvmeWipe")) {
                this.nvmeWipe(model.getNvmeWipe());
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

    /** Whether to wipe NVMe data during quick recycle. */
    @com.fasterxml.jackson.annotation.JsonProperty("nvmeWipe")
    private final Boolean nvmeWipe;

    /**
     * Whether to wipe NVMe data during quick recycle.
     *
     * @return the value
     */
    public Boolean getNvmeWipe() {
        return nvmeWipe;
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
        sb.append("QuickRecycleSettings(");
        sb.append("super=").append(super.toString());
        sb.append("nvmeWipe=").append(String.valueOf(this.nvmeWipe));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuickRecycleSettings)) {
            return false;
        }

        QuickRecycleSettings other = (QuickRecycleSettings) o;
        return java.util.Objects.equals(this.nvmeWipe, other.nvmeWipe) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nvmeWipe == null ? 43 : this.nvmeWipe.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
