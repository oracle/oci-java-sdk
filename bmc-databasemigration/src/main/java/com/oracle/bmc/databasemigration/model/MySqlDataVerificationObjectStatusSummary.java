/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Per-object status comparison line for MySQL migrations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlDataVerificationObjectStatusSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDataVerificationObjectStatusSummary
        extends DataVerificationObjectStatusSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusInSource")
        private String statusInSource;

        public Builder statusInSource(String statusInSource) {
            this.statusInSource = statusInSource;
            this.__explicitlySet__.add("statusInSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusInTarget")
        private String statusInTarget;

        public Builder statusInTarget(String statusInTarget) {
            this.statusInTarget = statusInTarget;
            this.__explicitlySet__.add("statusInTarget");
            return this;
        }
        /** MySQL database object type. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private MySqlDatabaseObjectTypes objectType;

        /**
         * MySQL database object type.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(MySqlDatabaseObjectTypes objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDataVerificationObjectStatusSummary build() {
            MySqlDataVerificationObjectStatusSummary model =
                    new MySqlDataVerificationObjectStatusSummary(
                            this.owner,
                            this.objectName,
                            this.statusInSource,
                            this.statusInTarget,
                            this.objectType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDataVerificationObjectStatusSummary model) {
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("statusInSource")) {
                this.statusInSource(model.getStatusInSource());
            }
            if (model.wasPropertyExplicitlySet("statusInTarget")) {
                this.statusInTarget(model.getStatusInTarget());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
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
    public MySqlDataVerificationObjectStatusSummary(
            String owner,
            String objectName,
            String statusInSource,
            String statusInTarget,
            MySqlDatabaseObjectTypes objectType) {
        super(owner, objectName, statusInSource, statusInTarget);
        this.objectType = objectType;
    }

    /** MySQL database object type. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final MySqlDatabaseObjectTypes objectType;

    /**
     * MySQL database object type.
     *
     * @return the value
     */
    public MySqlDatabaseObjectTypes getObjectType() {
        return objectType;
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
        sb.append("MySqlDataVerificationObjectStatusSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDataVerificationObjectStatusSummary)) {
            return false;
        }

        MySqlDataVerificationObjectStatusSummary other =
                (MySqlDataVerificationObjectStatusSummary) o;
        return java.util.Objects.equals(this.objectType, other.objectType) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        return result;
    }
}
