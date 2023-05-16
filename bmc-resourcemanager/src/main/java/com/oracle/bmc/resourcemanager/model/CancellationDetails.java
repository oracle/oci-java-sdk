/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Cancellation details for a job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CancellationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CancellationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isForced"})
    public CancellationDetails(Boolean isForced) {
        super();
        this.isForced = isForced;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether a forced cancellation was requested for the job while it was running. A
         * forced cancellation can result in an incorrect state file. For example, the state file
         * might not reflect the exact state of the provisioned resources.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForced")
        private Boolean isForced;

        /**
         * Indicates whether a forced cancellation was requested for the job while it was running. A
         * forced cancellation can result in an incorrect state file. For example, the state file
         * might not reflect the exact state of the provisioned resources.
         *
         * @param isForced the value to set
         * @return this builder
         */
        public Builder isForced(Boolean isForced) {
            this.isForced = isForced;
            this.__explicitlySet__.add("isForced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CancellationDetails build() {
            CancellationDetails model = new CancellationDetails(this.isForced);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CancellationDetails model) {
            if (model.wasPropertyExplicitlySet("isForced")) {
                this.isForced(model.getIsForced());
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
     * Indicates whether a forced cancellation was requested for the job while it was running. A
     * forced cancellation can result in an incorrect state file. For example, the state file might
     * not reflect the exact state of the provisioned resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isForced")
    private final Boolean isForced;

    /**
     * Indicates whether a forced cancellation was requested for the job while it was running. A
     * forced cancellation can result in an incorrect state file. For example, the state file might
     * not reflect the exact state of the provisioned resources.
     *
     * @return the value
     */
    public Boolean getIsForced() {
        return isForced;
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
        sb.append("CancellationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isForced=").append(String.valueOf(this.isForced));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancellationDetails)) {
            return false;
        }

        CancellationDetails other = (CancellationDetails) o;
        return java.util.Objects.equals(this.isForced, other.isForced) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isForced == null ? 43 : this.isForced.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
