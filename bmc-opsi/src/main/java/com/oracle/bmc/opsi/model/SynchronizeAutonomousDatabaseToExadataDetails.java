/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The details of onboarded autonomous database need to synchroized with infracture information.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SynchronizeAutonomousDatabaseToExadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SynchronizeAutonomousDatabaseToExadataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"entitySource"})
    public SynchronizeAutonomousDatabaseToExadataDetails(DatabaseEntitySourceAll entitySource) {
        super();
        this.entitySource = entitySource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Source of the database entity. Currently only AUTONOMOUS_DATABASE source is supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entitySource")
        private DatabaseEntitySourceAll entitySource;

        /**
         * Source of the database entity. Currently only AUTONOMOUS_DATABASE source is supported.
         *
         * @param entitySource the value to set
         * @return this builder
         */
        public Builder entitySource(DatabaseEntitySourceAll entitySource) {
            this.entitySource = entitySource;
            this.__explicitlySet__.add("entitySource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SynchronizeAutonomousDatabaseToExadataDetails build() {
            SynchronizeAutonomousDatabaseToExadataDetails model =
                    new SynchronizeAutonomousDatabaseToExadataDetails(this.entitySource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SynchronizeAutonomousDatabaseToExadataDetails model) {
            if (model.wasPropertyExplicitlySet("entitySource")) {
                this.entitySource(model.getEntitySource());
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

    /** Source of the database entity. Currently only AUTONOMOUS_DATABASE source is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("entitySource")
    private final DatabaseEntitySourceAll entitySource;

    /**
     * Source of the database entity. Currently only AUTONOMOUS_DATABASE source is supported.
     *
     * @return the value
     */
    public DatabaseEntitySourceAll getEntitySource() {
        return entitySource;
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
        sb.append("SynchronizeAutonomousDatabaseToExadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("entitySource=").append(String.valueOf(this.entitySource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SynchronizeAutonomousDatabaseToExadataDetails)) {
            return false;
        }

        SynchronizeAutonomousDatabaseToExadataDetails other =
                (SynchronizeAutonomousDatabaseToExadataDetails) o;
        return java.util.Objects.equals(this.entitySource, other.entitySource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entitySource == null ? 43 : this.entitySource.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
