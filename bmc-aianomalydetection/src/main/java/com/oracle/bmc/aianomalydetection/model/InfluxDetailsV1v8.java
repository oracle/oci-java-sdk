/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Influx details for V_1_8. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InfluxDetailsV1v8.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "influxVersion")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InfluxDetailsV1v8 extends InfluxDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** DB Name for influx connection */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * DB Name for influx connection
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** retention policy is how long the bucket would last */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPolicyName")
        private String retentionPolicyName;

        /**
         * retention policy is how long the bucket would last
         *
         * @param retentionPolicyName the value to set
         * @return this builder
         */
        public Builder retentionPolicyName(String retentionPolicyName) {
            this.retentionPolicyName = retentionPolicyName;
            this.__explicitlySet__.add("retentionPolicyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InfluxDetailsV1v8 build() {
            InfluxDetailsV1v8 model =
                    new InfluxDetailsV1v8(this.databaseName, this.retentionPolicyName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InfluxDetailsV1v8 model) {
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("retentionPolicyName")) {
                this.retentionPolicyName(model.getRetentionPolicyName());
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
    public InfluxDetailsV1v8(String databaseName, String retentionPolicyName) {
        super();
        this.databaseName = databaseName;
        this.retentionPolicyName = retentionPolicyName;
    }

    /** DB Name for influx connection */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * DB Name for influx connection
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** retention policy is how long the bucket would last */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPolicyName")
    private final String retentionPolicyName;

    /**
     * retention policy is how long the bucket would last
     *
     * @return the value
     */
    public String getRetentionPolicyName() {
        return retentionPolicyName;
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
        sb.append("InfluxDetailsV1v8(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", retentionPolicyName=").append(String.valueOf(this.retentionPolicyName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfluxDetailsV1v8)) {
            return false;
        }

        InfluxDetailsV1v8 other = (InfluxDetailsV1v8) o;
        return java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.retentionPolicyName, other.retentionPolicyName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPolicyName == null
                                ? 43
                                : this.retentionPolicyName.hashCode());
        return result;
    }
}
