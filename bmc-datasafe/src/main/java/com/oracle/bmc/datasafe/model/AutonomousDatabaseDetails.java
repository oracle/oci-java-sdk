/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of the Oracle Autonomous Database to be registered as a target database in Data Safe.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "databaseType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseDetails extends DatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
        private InfrastructureType infrastructureType;

        public Builder infrastructureType(InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            this.__explicitlySet__.add("infrastructureType");
            return this;
        }
        /**
         * The OCID of the autonomous database registered as a target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
        private String autonomousDatabaseId;

        /**
         * The OCID of the autonomous database registered as a target database in Data Safe.
         * @param autonomousDatabaseId the value to set
         * @return this builder
         **/
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            this.__explicitlySet__.add("autonomousDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseDetails build() {
            AutonomousDatabaseDetails model =
                    new AutonomousDatabaseDetails(
                            this.infrastructureType, this.autonomousDatabaseId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("infrastructureType")) {
                this.infrastructureType(model.getInfrastructureType());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseId")) {
                this.autonomousDatabaseId(model.getAutonomousDatabaseId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public AutonomousDatabaseDetails(
            InfrastructureType infrastructureType, String autonomousDatabaseId) {
        super(infrastructureType);
        this.autonomousDatabaseId = autonomousDatabaseId;
    }

    /**
     * The OCID of the autonomous database registered as a target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
    private final String autonomousDatabaseId;

    /**
     * The OCID of the autonomous database registered as a target database in Data Safe.
     * @return the value
     **/
    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDatabaseDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseDetails)) {
            return false;
        }

        AutonomousDatabaseDetails other = (AutonomousDatabaseDetails) o;
        return java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseId == null
                                ? 43
                                : this.autonomousDatabaseId.hashCode());
        return result;
    }
}
