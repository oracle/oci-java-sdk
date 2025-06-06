/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Oracle Clone Migration Summary <br>
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
        builder = OracleCloneMigrationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleCloneMigrationDetails extends CloneMigrationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
        private String sourceDatabaseConnectionId;

        public Builder sourceDatabaseConnectionId(String sourceDatabaseConnectionId) {
            this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
            this.__explicitlySet__.add("sourceDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
        private String targetDatabaseConnectionId;

        public Builder targetDatabaseConnectionId(String targetDatabaseConnectionId) {
            this.targetDatabaseConnectionId = targetDatabaseConnectionId;
            this.__explicitlySet__.add("targetDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
         *
         * @param sourceContainerDatabaseConnectionId the value to set
         * @return this builder
         */
        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
        private String sourceStandbyDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
         *
         * @param sourceStandbyDatabaseConnectionId the value to set
         * @return this builder
         */
        public Builder sourceStandbyDatabaseConnectionId(String sourceStandbyDatabaseConnectionId) {
            this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
            this.__explicitlySet__.add("sourceStandbyDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleCloneMigrationDetails build() {
            OracleCloneMigrationDetails model =
                    new OracleCloneMigrationDetails(
                            this.displayName,
                            this.compartmentId,
                            this.sourceDatabaseConnectionId,
                            this.targetDatabaseConnectionId,
                            this.freeformTags,
                            this.definedTags,
                            this.sourceContainerDatabaseConnectionId,
                            this.sourceStandbyDatabaseConnectionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleCloneMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnectionId")) {
                this.sourceDatabaseConnectionId(model.getSourceDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnectionId")) {
                this.targetDatabaseConnectionId(model.getTargetDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDatabaseConnectionId")) {
                this.sourceContainerDatabaseConnectionId(
                        model.getSourceContainerDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("sourceStandbyDatabaseConnectionId")) {
                this.sourceStandbyDatabaseConnectionId(
                        model.getSourceStandbyDatabaseConnectionId());
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
    public OracleCloneMigrationDetails(
            String displayName,
            String compartmentId,
            String sourceDatabaseConnectionId,
            String targetDatabaseConnectionId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String sourceContainerDatabaseConnectionId,
            String sourceStandbyDatabaseConnectionId) {
        super(
                displayName,
                compartmentId,
                sourceDatabaseConnectionId,
                targetDatabaseConnectionId,
                freeformTags,
                definedTags);
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
        this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getSourceContainerDatabaseConnectionId() {
        return sourceContainerDatabaseConnectionId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
    private final String sourceStandbyDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getSourceStandbyDatabaseConnectionId() {
        return sourceStandbyDatabaseConnectionId;
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
        sb.append("OracleCloneMigrationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", sourceStandbyDatabaseConnectionId=")
                .append(String.valueOf(this.sourceStandbyDatabaseConnectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleCloneMigrationDetails)) {
            return false;
        }

        OracleCloneMigrationDetails other = (OracleCloneMigrationDetails) o;
        return java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.sourceStandbyDatabaseConnectionId,
                        other.sourceStandbyDatabaseConnectionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sourceContainerDatabaseConnectionId == null
                                ? 43
                                : this.sourceContainerDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceStandbyDatabaseConnectionId == null
                                ? 43
                                : this.sourceStandbyDatabaseConnectionId.hashCode());
        return result;
    }
}
