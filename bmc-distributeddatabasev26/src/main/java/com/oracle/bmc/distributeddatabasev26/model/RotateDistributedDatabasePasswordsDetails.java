/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Payload to rotate passwords for shards and catalogs in the Globally distributed database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RotateDistributedDatabasePasswordsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RotateDistributedDatabasePasswordsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseDetails"})
    public RotateDistributedDatabasePasswordsDetails(
            java.util.List<RotateDistributedDatabaseDetails> databaseDetails) {
        super();
        this.databaseDetails = databaseDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Collection of shard or catalog password rotation details. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
        private java.util.List<RotateDistributedDatabaseDetails> databaseDetails;

        /**
         * Collection of shard or catalog password rotation details.
         *
         * @param databaseDetails the value to set
         * @return this builder
         */
        public Builder databaseDetails(
                java.util.List<RotateDistributedDatabaseDetails> databaseDetails) {
            this.databaseDetails = databaseDetails;
            this.__explicitlySet__.add("databaseDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RotateDistributedDatabasePasswordsDetails build() {
            RotateDistributedDatabasePasswordsDetails model =
                    new RotateDistributedDatabasePasswordsDetails(this.databaseDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RotateDistributedDatabasePasswordsDetails model) {
            if (model.wasPropertyExplicitlySet("databaseDetails")) {
                this.databaseDetails(model.getDatabaseDetails());
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

    /** Collection of shard or catalog password rotation details. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
    private final java.util.List<RotateDistributedDatabaseDetails> databaseDetails;

    /**
     * Collection of shard or catalog password rotation details.
     *
     * @return the value
     */
    public java.util.List<RotateDistributedDatabaseDetails> getDatabaseDetails() {
        return databaseDetails;
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
        sb.append("RotateDistributedDatabasePasswordsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseDetails=").append(String.valueOf(this.databaseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RotateDistributedDatabasePasswordsDetails)) {
            return false;
        }

        RotateDistributedDatabasePasswordsDetails other =
                (RotateDistributedDatabasePasswordsDetails) o;
        return java.util.Objects.equals(this.databaseDetails, other.databaseDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseDetails == null ? 43 : this.databaseDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
