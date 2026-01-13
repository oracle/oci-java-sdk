/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A list of SQL IDs with most CPU activity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TopSqlCpuActivity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TopSqlCpuActivity
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"activity"})
    public TopSqlCpuActivity(java.util.List<SqlCpuActivity> activity) {
        super();
        this.activity = activity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of sql CPU activity. */
        @com.fasterxml.jackson.annotation.JsonProperty("activity")
        private java.util.List<SqlCpuActivity> activity;

        /**
         * A list of sql CPU activity.
         *
         * @param activity the value to set
         * @return this builder
         */
        public Builder activity(java.util.List<SqlCpuActivity> activity) {
            this.activity = activity;
            this.__explicitlySet__.add("activity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopSqlCpuActivity build() {
            TopSqlCpuActivity model = new TopSqlCpuActivity(this.activity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopSqlCpuActivity model) {
            if (model.wasPropertyExplicitlySet("activity")) {
                this.activity(model.getActivity());
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

    /** A list of sql CPU activity. */
    @com.fasterxml.jackson.annotation.JsonProperty("activity")
    private final java.util.List<SqlCpuActivity> activity;

    /**
     * A list of sql CPU activity.
     *
     * @return the value
     */
    public java.util.List<SqlCpuActivity> getActivity() {
        return activity;
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
        sb.append("TopSqlCpuActivity(");
        sb.append("super=").append(super.toString());
        sb.append("activity=").append(String.valueOf(this.activity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopSqlCpuActivity)) {
            return false;
        }

        TopSqlCpuActivity other = (TopSqlCpuActivity) o;
        return java.util.Objects.equals(this.activity, other.activity) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.activity == null ? 43 : this.activity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
