/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a given MySQL query, it consists of the query sample details, the explain plan and
 * potential warnings. <br>
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
        builder = MySqlQueryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlQueryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"querySampleDetails", "queryExplainPlan", "queryMessages"})
    public MySqlQueryDetails(
            MySqlQuerySampleDetails querySampleDetails,
            MySqlQueryExplainPlan queryExplainPlan,
            java.util.List<MySqlQueryMessage> queryMessages) {
        super();
        this.querySampleDetails = querySampleDetails;
        this.queryExplainPlan = queryExplainPlan;
        this.queryMessages = queryMessages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("querySampleDetails")
        private MySqlQuerySampleDetails querySampleDetails;

        public Builder querySampleDetails(MySqlQuerySampleDetails querySampleDetails) {
            this.querySampleDetails = querySampleDetails;
            this.__explicitlySet__.add("querySampleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryExplainPlan")
        private MySqlQueryExplainPlan queryExplainPlan;

        public Builder queryExplainPlan(MySqlQueryExplainPlan queryExplainPlan) {
            this.queryExplainPlan = queryExplainPlan;
            this.__explicitlySet__.add("queryExplainPlan");
            return this;
        }
        /** The errors, warnings and notes that could be raised by the execution of the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryMessages")
        private java.util.List<MySqlQueryMessage> queryMessages;

        /**
         * The errors, warnings and notes that could be raised by the execution of the query.
         *
         * @param queryMessages the value to set
         * @return this builder
         */
        public Builder queryMessages(java.util.List<MySqlQueryMessage> queryMessages) {
            this.queryMessages = queryMessages;
            this.__explicitlySet__.add("queryMessages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlQueryDetails build() {
            MySqlQueryDetails model =
                    new MySqlQueryDetails(
                            this.querySampleDetails, this.queryExplainPlan, this.queryMessages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlQueryDetails model) {
            if (model.wasPropertyExplicitlySet("querySampleDetails")) {
                this.querySampleDetails(model.getQuerySampleDetails());
            }
            if (model.wasPropertyExplicitlySet("queryExplainPlan")) {
                this.queryExplainPlan(model.getQueryExplainPlan());
            }
            if (model.wasPropertyExplicitlySet("queryMessages")) {
                this.queryMessages(model.getQueryMessages());
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

    @com.fasterxml.jackson.annotation.JsonProperty("querySampleDetails")
    private final MySqlQuerySampleDetails querySampleDetails;

    public MySqlQuerySampleDetails getQuerySampleDetails() {
        return querySampleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryExplainPlan")
    private final MySqlQueryExplainPlan queryExplainPlan;

    public MySqlQueryExplainPlan getQueryExplainPlan() {
        return queryExplainPlan;
    }

    /** The errors, warnings and notes that could be raised by the execution of the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryMessages")
    private final java.util.List<MySqlQueryMessage> queryMessages;

    /**
     * The errors, warnings and notes that could be raised by the execution of the query.
     *
     * @return the value
     */
    public java.util.List<MySqlQueryMessage> getQueryMessages() {
        return queryMessages;
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
        sb.append("MySqlQueryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("querySampleDetails=").append(String.valueOf(this.querySampleDetails));
        sb.append(", queryExplainPlan=").append(String.valueOf(this.queryExplainPlan));
        sb.append(", queryMessages=").append(String.valueOf(this.queryMessages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlQueryDetails)) {
            return false;
        }

        MySqlQueryDetails other = (MySqlQueryDetails) o;
        return java.util.Objects.equals(this.querySampleDetails, other.querySampleDetails)
                && java.util.Objects.equals(this.queryExplainPlan, other.queryExplainPlan)
                && java.util.Objects.equals(this.queryMessages, other.queryMessages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.querySampleDetails == null
                                ? 43
                                : this.querySampleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.queryExplainPlan == null ? 43 : this.queryExplainPlan.hashCode());
        result =
                (result * PRIME)
                        + (this.queryMessages == null ? 43 : this.queryMessages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
