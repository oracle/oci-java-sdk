/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Globally distributed database composite data guard shard space replica creation details. <br>
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
        builder = CreateCompositeDataGuardShardSpaceReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCompositeDataGuardShardSpaceReplicaDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "databases"})
    public CreateCompositeDataGuardShardSpaceReplicaDetails(
            String name, java.util.List<CreateDistributedDatabaseShardDatabaseDetails> databases) {
        super();
        this.name = name;
        this.databases = databases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of shard space replica. It must start with a letter and contain only letters,
         * digits, and underscores. Maximum length is 40 characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of shard space replica. It must start with a letter and contain only letters,
         * digits, and underscores. Maximum length is 40 characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The details of composite data guard shard space replica databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("databases")
        private java.util.List<CreateDistributedDatabaseShardDatabaseDetails> databases;

        /**
         * The details of composite data guard shard space replica databases.
         *
         * @param databases the value to set
         * @return this builder
         */
        public Builder databases(
                java.util.List<CreateDistributedDatabaseShardDatabaseDetails> databases) {
            this.databases = databases;
            this.__explicitlySet__.add("databases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCompositeDataGuardShardSpaceReplicaDetails build() {
            CreateCompositeDataGuardShardSpaceReplicaDetails model =
                    new CreateCompositeDataGuardShardSpaceReplicaDetails(this.name, this.databases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompositeDataGuardShardSpaceReplicaDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("databases")) {
                this.databases(model.getDatabases());
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

    /**
     * The name of shard space replica. It must start with a letter and contain only letters,
     * digits, and underscores. Maximum length is 40 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of shard space replica. It must start with a letter and contain only letters,
     * digits, and underscores. Maximum length is 40 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The details of composite data guard shard space replica databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("databases")
    private final java.util.List<CreateDistributedDatabaseShardDatabaseDetails> databases;

    /**
     * The details of composite data guard shard space replica databases.
     *
     * @return the value
     */
    public java.util.List<CreateDistributedDatabaseShardDatabaseDetails> getDatabases() {
        return databases;
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
        sb.append("CreateCompositeDataGuardShardSpaceReplicaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", databases=").append(String.valueOf(this.databases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCompositeDataGuardShardSpaceReplicaDetails)) {
            return false;
        }

        CreateCompositeDataGuardShardSpaceReplicaDetails other =
                (CreateCompositeDataGuardShardSpaceReplicaDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.databases, other.databases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.databases == null ? 43 : this.databases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
