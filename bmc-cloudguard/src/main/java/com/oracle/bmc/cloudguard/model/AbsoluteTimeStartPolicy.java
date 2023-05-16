/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Policy that defines the exact start time. <br>
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
        builder = AbsoluteTimeStartPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "startPolicyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AbsoluteTimeStartPolicy extends ContinuousQueryStartPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Time when the query can start, if not specified it can start immediately. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryStartTime")
        private java.util.Date queryStartTime;

        /**
         * Time when the query can start, if not specified it can start immediately.
         *
         * @param queryStartTime the value to set
         * @return this builder
         */
        public Builder queryStartTime(java.util.Date queryStartTime) {
            this.queryStartTime = queryStartTime;
            this.__explicitlySet__.add("queryStartTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AbsoluteTimeStartPolicy build() {
            AbsoluteTimeStartPolicy model = new AbsoluteTimeStartPolicy(this.queryStartTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AbsoluteTimeStartPolicy model) {
            if (model.wasPropertyExplicitlySet("queryStartTime")) {
                this.queryStartTime(model.getQueryStartTime());
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
    public AbsoluteTimeStartPolicy(java.util.Date queryStartTime) {
        super();
        this.queryStartTime = queryStartTime;
    }

    /** Time when the query can start, if not specified it can start immediately. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryStartTime")
    private final java.util.Date queryStartTime;

    /**
     * Time when the query can start, if not specified it can start immediately.
     *
     * @return the value
     */
    public java.util.Date getQueryStartTime() {
        return queryStartTime;
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
        sb.append("AbsoluteTimeStartPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", queryStartTime=").append(String.valueOf(this.queryStartTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbsoluteTimeStartPolicy)) {
            return false;
        }

        AbsoluteTimeStartPolicy other = (AbsoluteTimeStartPolicy) o;
        return java.util.Objects.equals(this.queryStartTime, other.queryStartTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.queryStartTime == null ? 43 : this.queryStartTime.hashCode());
        return result;
    }
}
