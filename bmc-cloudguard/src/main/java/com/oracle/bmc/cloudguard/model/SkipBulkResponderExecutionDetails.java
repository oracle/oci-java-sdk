/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of responders to skip execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SkipBulkResponderExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SkipBulkResponderExecutionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"responderExecutionIds"})
    public SkipBulkResponderExecutionDetails(java.util.List<String> responderExecutionIds) {
        super();
        this.responderExecutionIds = responderExecutionIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of responder execution IDs to skip execution */
        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionIds")
        private java.util.List<String> responderExecutionIds;

        /**
         * List of responder execution IDs to skip execution
         *
         * @param responderExecutionIds the value to set
         * @return this builder
         */
        public Builder responderExecutionIds(java.util.List<String> responderExecutionIds) {
            this.responderExecutionIds = responderExecutionIds;
            this.__explicitlySet__.add("responderExecutionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SkipBulkResponderExecutionDetails build() {
            SkipBulkResponderExecutionDetails model =
                    new SkipBulkResponderExecutionDetails(this.responderExecutionIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SkipBulkResponderExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("responderExecutionIds")) {
                this.responderExecutionIds(model.getResponderExecutionIds());
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

    /** List of responder execution IDs to skip execution */
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionIds")
    private final java.util.List<String> responderExecutionIds;

    /**
     * List of responder execution IDs to skip execution
     *
     * @return the value
     */
    public java.util.List<String> getResponderExecutionIds() {
        return responderExecutionIds;
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
        sb.append("SkipBulkResponderExecutionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("responderExecutionIds=").append(String.valueOf(this.responderExecutionIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SkipBulkResponderExecutionDetails)) {
            return false;
        }

        SkipBulkResponderExecutionDetails other = (SkipBulkResponderExecutionDetails) o;
        return java.util.Objects.equals(this.responderExecutionIds, other.responderExecutionIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.responderExecutionIds == null
                                ? 43
                                : this.responderExecutionIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
