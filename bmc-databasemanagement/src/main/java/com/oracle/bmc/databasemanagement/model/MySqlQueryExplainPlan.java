/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The explain plan for a given MySQL query. <br>
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
        builder = MySqlQueryExplainPlan.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlQueryExplainPlan
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"jsonExplain", "jsonExplainVersion"})
    public MySqlQueryExplainPlan(String jsonExplain, MySqlJsonExplainVersion jsonExplainVersion) {
        super();
        this.jsonExplain = jsonExplain;
        this.jsonExplainVersion = jsonExplainVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The json format of the explain plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("jsonExplain")
        private String jsonExplain;

        /**
         * The json format of the explain plan.
         *
         * @param jsonExplain the value to set
         * @return this builder
         */
        public Builder jsonExplain(String jsonExplain) {
            this.jsonExplain = jsonExplain;
            this.__explicitlySet__.add("jsonExplain");
            return this;
        }
        /** The version of the Json format of MySQL Explain. */
        @com.fasterxml.jackson.annotation.JsonProperty("jsonExplainVersion")
        private MySqlJsonExplainVersion jsonExplainVersion;

        /**
         * The version of the Json format of MySQL Explain.
         *
         * @param jsonExplainVersion the value to set
         * @return this builder
         */
        public Builder jsonExplainVersion(MySqlJsonExplainVersion jsonExplainVersion) {
            this.jsonExplainVersion = jsonExplainVersion;
            this.__explicitlySet__.add("jsonExplainVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlQueryExplainPlan build() {
            MySqlQueryExplainPlan model =
                    new MySqlQueryExplainPlan(this.jsonExplain, this.jsonExplainVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlQueryExplainPlan model) {
            if (model.wasPropertyExplicitlySet("jsonExplain")) {
                this.jsonExplain(model.getJsonExplain());
            }
            if (model.wasPropertyExplicitlySet("jsonExplainVersion")) {
                this.jsonExplainVersion(model.getJsonExplainVersion());
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

    /** The json format of the explain plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("jsonExplain")
    private final String jsonExplain;

    /**
     * The json format of the explain plan.
     *
     * @return the value
     */
    public String getJsonExplain() {
        return jsonExplain;
    }

    /** The version of the Json format of MySQL Explain. */
    @com.fasterxml.jackson.annotation.JsonProperty("jsonExplainVersion")
    private final MySqlJsonExplainVersion jsonExplainVersion;

    /**
     * The version of the Json format of MySQL Explain.
     *
     * @return the value
     */
    public MySqlJsonExplainVersion getJsonExplainVersion() {
        return jsonExplainVersion;
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
        sb.append("MySqlQueryExplainPlan(");
        sb.append("super=").append(super.toString());
        sb.append("jsonExplain=").append(String.valueOf(this.jsonExplain));
        sb.append(", jsonExplainVersion=").append(String.valueOf(this.jsonExplainVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlQueryExplainPlan)) {
            return false;
        }

        MySqlQueryExplainPlan other = (MySqlQueryExplainPlan) o;
        return java.util.Objects.equals(this.jsonExplain, other.jsonExplain)
                && java.util.Objects.equals(this.jsonExplainVersion, other.jsonExplainVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.jsonExplain == null ? 43 : this.jsonExplain.hashCode());
        result =
                (result * PRIME)
                        + (this.jsonExplainVersion == null
                                ? 43
                                : this.jsonExplainVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
