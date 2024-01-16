/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of the peer target database in Data Safe. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PeerTargetDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PeerTargetDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "key",
        "dataguardAssociationId",
        "timeCreated",
        "role",
        "databaseUniqueName",
        "databaseDetails",
        "tlsConfig",
        "lifecycleState",
        "lifecycleDetails"
    })
    public PeerTargetDatabase(
            String displayName,
            String description,
            Integer key,
            String dataguardAssociationId,
            java.util.Date timeCreated,
            String role,
            String databaseUniqueName,
            DatabaseDetails databaseDetails,
            TlsConfig tlsConfig,
            TargetDatabaseLifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.key = key;
        this.dataguardAssociationId = dataguardAssociationId;
        this.timeCreated = timeCreated;
        this.role = role;
        this.databaseUniqueName = databaseUniqueName;
        this.databaseDetails = databaseDetails;
        this.tlsConfig = tlsConfig;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The display name of the peer target database in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the peer target database in Data Safe.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the peer target database in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the peer target database in Data Safe.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The secondary key assigned for the peer target database in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private Integer key;

        /**
         * The secondary key assigned for the peer target database in Data Safe.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(Integer key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The OCID of the Data Guard Association resource in which the database associated to the
         * peer target database is considered as peer database to the primary database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataguardAssociationId")
        private String dataguardAssociationId;

        /**
         * The OCID of the Data Guard Association resource in which the database associated to the
         * peer target database is considered as peer database to the primary database.
         *
         * @param dataguardAssociationId the value to set
         * @return this builder
         */
        public Builder dataguardAssociationId(String dataguardAssociationId) {
            this.dataguardAssociationId = dataguardAssociationId;
            this.__explicitlySet__.add("dataguardAssociationId");
            return this;
        }
        /** The date and time of the peer target database registration in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time of the peer target database registration in Data Safe.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Role of the database associated to the peer target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private String role;

        /**
         * Role of the database associated to the peer target database.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(String role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /** Unique name of the database associated to the peer target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseUniqueName")
        private String databaseUniqueName;

        /**
         * Unique name of the database associated to the peer target database.
         *
         * @param databaseUniqueName the value to set
         * @return this builder
         */
        public Builder databaseUniqueName(String databaseUniqueName) {
            this.databaseUniqueName = databaseUniqueName;
            this.__explicitlySet__.add("databaseUniqueName");
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
        /** The current state of the peer target database in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private TargetDatabaseLifecycleState lifecycleState;

        /**
         * The current state of the peer target database in Data Safe.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(TargetDatabaseLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current state of the peer target database in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the peer target database in Data Safe.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerTargetDatabase build() {
            PeerTargetDatabase model =
                    new PeerTargetDatabase(
                            this.displayName,
                            this.description,
                            this.key,
                            this.dataguardAssociationId,
                            this.timeCreated,
                            this.role,
                            this.databaseUniqueName,
                            this.databaseDetails,
                            this.tlsConfig,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerTargetDatabase model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("dataguardAssociationId")) {
                this.dataguardAssociationId(model.getDataguardAssociationId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("databaseUniqueName")) {
                this.databaseUniqueName(model.getDatabaseUniqueName());
            }
            if (model.wasPropertyExplicitlySet("databaseDetails")) {
                this.databaseDetails(model.getDatabaseDetails());
            }
            if (model.wasPropertyExplicitlySet("tlsConfig")) {
                this.tlsConfig(model.getTlsConfig());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** The display name of the peer target database in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the peer target database in Data Safe.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the peer target database in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the peer target database in Data Safe.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The secondary key assigned for the peer target database in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final Integer key;

    /**
     * The secondary key assigned for the peer target database in Data Safe.
     *
     * @return the value
     */
    public Integer getKey() {
        return key;
    }

    /**
     * The OCID of the Data Guard Association resource in which the database associated to the peer
     * target database is considered as peer database to the primary database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataguardAssociationId")
    private final String dataguardAssociationId;

    /**
     * The OCID of the Data Guard Association resource in which the database associated to the peer
     * target database is considered as peer database to the primary database.
     *
     * @return the value
     */
    public String getDataguardAssociationId() {
        return dataguardAssociationId;
    }

    /** The date and time of the peer target database registration in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time of the peer target database registration in Data Safe.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Role of the database associated to the peer target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final String role;

    /**
     * Role of the database associated to the peer target database.
     *
     * @return the value
     */
    public String getRole() {
        return role;
    }

    /** Unique name of the database associated to the peer target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseUniqueName")
    private final String databaseUniqueName;

    /**
     * Unique name of the database associated to the peer target database.
     *
     * @return the value
     */
    public String getDatabaseUniqueName() {
        return databaseUniqueName;
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

    /** The current state of the peer target database in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TargetDatabaseLifecycleState lifecycleState;

    /**
     * The current state of the peer target database in Data Safe.
     *
     * @return the value
     */
    public TargetDatabaseLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current state of the peer target database in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the peer target database in Data Safe.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("PeerTargetDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", dataguardAssociationId=").append(String.valueOf(this.dataguardAssociationId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", databaseUniqueName=").append(String.valueOf(this.databaseUniqueName));
        sb.append(", databaseDetails=").append(String.valueOf(this.databaseDetails));
        sb.append(", tlsConfig=").append(String.valueOf(this.tlsConfig));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerTargetDatabase)) {
            return false;
        }

        PeerTargetDatabase other = (PeerTargetDatabase) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(
                        this.dataguardAssociationId, other.dataguardAssociationId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.databaseUniqueName, other.databaseUniqueName)
                && java.util.Objects.equals(this.databaseDetails, other.databaseDetails)
                && java.util.Objects.equals(this.tlsConfig, other.tlsConfig)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.dataguardAssociationId == null
                                ? 43
                                : this.dataguardAssociationId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseUniqueName == null
                                ? 43
                                : this.databaseUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDetails == null ? 43 : this.databaseDetails.hashCode());
        result = (result * PRIME) + (this.tlsConfig == null ? 43 : this.tlsConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
