/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Compute Host Configuration Data <br>
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
        builder = ComputeHostConfigurationData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeHostConfigurationData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeLastApply", "checkDetails"})
    public ComputeHostConfigurationData(
            java.util.Date timeLastApply, ComputeHostConfigurationCheckDetails checkDetails) {
        super();
        this.timeLastApply = timeLastApply;
        this.checkDetails = checkDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The time that was last applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastApply")
        private java.util.Date timeLastApply;

        /**
         * The time that was last applied.
         *
         * @param timeLastApply the value to set
         * @return this builder
         */
        public Builder timeLastApply(java.util.Date timeLastApply) {
            this.timeLastApply = timeLastApply;
            this.__explicitlySet__.add("timeLastApply");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checkDetails")
        private ComputeHostConfigurationCheckDetails checkDetails;

        public Builder checkDetails(ComputeHostConfigurationCheckDetails checkDetails) {
            this.checkDetails = checkDetails;
            this.__explicitlySet__.add("checkDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeHostConfigurationData build() {
            ComputeHostConfigurationData model =
                    new ComputeHostConfigurationData(this.timeLastApply, this.checkDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeHostConfigurationData model) {
            if (model.wasPropertyExplicitlySet("timeLastApply")) {
                this.timeLastApply(model.getTimeLastApply());
            }
            if (model.wasPropertyExplicitlySet("checkDetails")) {
                this.checkDetails(model.getCheckDetails());
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

    /** The time that was last applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastApply")
    private final java.util.Date timeLastApply;

    /**
     * The time that was last applied.
     *
     * @return the value
     */
    public java.util.Date getTimeLastApply() {
        return timeLastApply;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("checkDetails")
    private final ComputeHostConfigurationCheckDetails checkDetails;

    public ComputeHostConfigurationCheckDetails getCheckDetails() {
        return checkDetails;
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
        sb.append("ComputeHostConfigurationData(");
        sb.append("super=").append(super.toString());
        sb.append("timeLastApply=").append(String.valueOf(this.timeLastApply));
        sb.append(", checkDetails=").append(String.valueOf(this.checkDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeHostConfigurationData)) {
            return false;
        }

        ComputeHostConfigurationData other = (ComputeHostConfigurationData) o;
        return java.util.Objects.equals(this.timeLastApply, other.timeLastApply)
                && java.util.Objects.equals(this.checkDetails, other.checkDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeLastApply == null ? 43 : this.timeLastApply.hashCode());
        result = (result * PRIME) + (this.checkDetails == null ? 43 : this.checkDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
