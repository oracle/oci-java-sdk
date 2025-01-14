/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Customer logging configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomerLoggingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomerLoggingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logRetentionDays"})
    public CustomerLoggingDetails(Integer logRetentionDays) {
        super();
        this.logRetentionDays = logRetentionDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** the age of an index after which the index will get deleted by ISM policy */
        @com.fasterxml.jackson.annotation.JsonProperty("logRetentionDays")
        private Integer logRetentionDays;

        /**
         * the age of an index after which the index will get deleted by ISM policy
         *
         * @param logRetentionDays the value to set
         * @return this builder
         */
        public Builder logRetentionDays(Integer logRetentionDays) {
            this.logRetentionDays = logRetentionDays;
            this.__explicitlySet__.add("logRetentionDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomerLoggingDetails build() {
            CustomerLoggingDetails model = new CustomerLoggingDetails(this.logRetentionDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomerLoggingDetails model) {
            if (model.wasPropertyExplicitlySet("logRetentionDays")) {
                this.logRetentionDays(model.getLogRetentionDays());
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

    /** the age of an index after which the index will get deleted by ISM policy */
    @com.fasterxml.jackson.annotation.JsonProperty("logRetentionDays")
    private final Integer logRetentionDays;

    /**
     * the age of an index after which the index will get deleted by ISM policy
     *
     * @return the value
     */
    public Integer getLogRetentionDays() {
        return logRetentionDays;
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
        sb.append("CustomerLoggingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("logRetentionDays=").append(String.valueOf(this.logRetentionDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerLoggingDetails)) {
            return false;
        }

        CustomerLoggingDetails other = (CustomerLoggingDetails) o;
        return java.util.Objects.equals(this.logRetentionDays, other.logRetentionDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.logRetentionDays == null ? 43 : this.logRetentionDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
