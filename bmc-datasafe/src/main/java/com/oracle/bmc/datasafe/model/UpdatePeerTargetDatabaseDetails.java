/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of the peer database used for updating the peer target database in Data Safe.
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
    builder = UpdatePeerTargetDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdatePeerTargetDatabaseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "databaseDetails",
        "tlsConfig"
    })
    public UpdatePeerTargetDatabaseDetails(
            String displayName,
            String description,
            DatabaseDetails databaseDetails,
            TlsConfig tlsConfig) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.databaseDetails = databaseDetails;
        this.tlsConfig = tlsConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the peer target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the peer target database in Data Safe.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of the peer target database in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the peer target database in Data Safe.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
        private DatabaseDetails databaseDetails;

        public Builder databaseDetails(DatabaseDetails databaseDetails) {
            this.databaseDetails = databaseDetails;
            this.__explicitlySet__.add("databaseDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsConfig")
        private TlsConfig tlsConfig;

        public Builder tlsConfig(TlsConfig tlsConfig) {
            this.tlsConfig = tlsConfig;
            this.__explicitlySet__.add("tlsConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePeerTargetDatabaseDetails build() {
            UpdatePeerTargetDatabaseDetails model =
                    new UpdatePeerTargetDatabaseDetails(
                            this.displayName,
                            this.description,
                            this.databaseDetails,
                            this.tlsConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePeerTargetDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("databaseDetails")) {
                this.databaseDetails(model.getDatabaseDetails());
            }
            if (model.wasPropertyExplicitlySet("tlsConfig")) {
                this.tlsConfig(model.getTlsConfig());
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

    /**
     * The display name of the peer target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the peer target database in Data Safe.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the peer target database in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the peer target database in Data Safe.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
    private final DatabaseDetails databaseDetails;

    public DatabaseDetails getDatabaseDetails() {
        return databaseDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tlsConfig")
    private final TlsConfig tlsConfig;

    public TlsConfig getTlsConfig() {
        return tlsConfig;
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
        sb.append("UpdatePeerTargetDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", databaseDetails=").append(String.valueOf(this.databaseDetails));
        sb.append(", tlsConfig=").append(String.valueOf(this.tlsConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePeerTargetDatabaseDetails)) {
            return false;
        }

        UpdatePeerTargetDatabaseDetails other = (UpdatePeerTargetDatabaseDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.databaseDetails, other.databaseDetails)
                && java.util.Objects.equals(this.tlsConfig, other.tlsConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDetails == null ? 43 : this.databaseDetails.hashCode());
        result = (result * PRIME) + (this.tlsConfig == null ? 43 : this.tlsConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
