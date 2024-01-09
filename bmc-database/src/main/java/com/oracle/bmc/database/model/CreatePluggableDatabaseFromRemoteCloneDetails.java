/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Specifies the creation type Remote Clone. Additional input 'dblinkUsername{@code and
 * }dblinkUserPassword can be provided for RemoteClone/Create RefreshableClone Operation. If not
 * provided, Backend will create a temporary user to perform RemoteClone operation. It is a required
 * input parameter in case of creating Refreshable Clone PDB. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePluggableDatabaseFromRemoteCloneDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "creationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePluggableDatabaseFromRemoteCloneDetails
        extends CreatePluggableDatabaseCreationTypeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the DB link user. */
        @com.fasterxml.jackson.annotation.JsonProperty("dblinkUsername")
        private String dblinkUsername;

        /**
         * The name of the DB link user.
         *
         * @param dblinkUsername the value to set
         * @return this builder
         */
        public Builder dblinkUsername(String dblinkUsername) {
            this.dblinkUsername = dblinkUsername;
            this.__explicitlySet__.add("dblinkUsername");
            return this;
        }
        /** The DB link user password. */
        @com.fasterxml.jackson.annotation.JsonProperty("dblinkUserPassword")
        private String dblinkUserPassword;

        /**
         * The DB link user password.
         *
         * @param dblinkUserPassword the value to set
         * @return this builder
         */
        public Builder dblinkUserPassword(String dblinkUserPassword) {
            this.dblinkUserPassword = dblinkUserPassword;
            this.__explicitlySet__.add("dblinkUserPassword");
            return this;
        }
        /** The OCID of the Source Pluggable Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePluggableDatabaseId")
        private String sourcePluggableDatabaseId;

        /**
         * The OCID of the Source Pluggable Database.
         *
         * @param sourcePluggableDatabaseId the value to set
         * @return this builder
         */
        public Builder sourcePluggableDatabaseId(String sourcePluggableDatabaseId) {
            this.sourcePluggableDatabaseId = sourcePluggableDatabaseId;
            this.__explicitlySet__.add("sourcePluggableDatabaseId");
            return this;
        }
        /** The DB system administrator password of the source Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseAdminPassword")
        private String sourceContainerDatabaseAdminPassword;

        /**
         * The DB system administrator password of the source Container Database.
         *
         * @param sourceContainerDatabaseAdminPassword the value to set
         * @return this builder
         */
        public Builder sourceContainerDatabaseAdminPassword(
                String sourceContainerDatabaseAdminPassword) {
            this.sourceContainerDatabaseAdminPassword = sourceContainerDatabaseAdminPassword;
            this.__explicitlySet__.add("sourceContainerDatabaseAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshableCloneDetails")
        private CreatePluggableDatabaseRefreshableCloneDetails refreshableCloneDetails;

        public Builder refreshableCloneDetails(
                CreatePluggableDatabaseRefreshableCloneDetails refreshableCloneDetails) {
            this.refreshableCloneDetails = refreshableCloneDetails;
            this.__explicitlySet__.add("refreshableCloneDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePluggableDatabaseFromRemoteCloneDetails build() {
            CreatePluggableDatabaseFromRemoteCloneDetails model =
                    new CreatePluggableDatabaseFromRemoteCloneDetails(
                            this.dblinkUsername,
                            this.dblinkUserPassword,
                            this.sourcePluggableDatabaseId,
                            this.sourceContainerDatabaseAdminPassword,
                            this.refreshableCloneDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePluggableDatabaseFromRemoteCloneDetails model) {
            if (model.wasPropertyExplicitlySet("dblinkUsername")) {
                this.dblinkUsername(model.getDblinkUsername());
            }
            if (model.wasPropertyExplicitlySet("dblinkUserPassword")) {
                this.dblinkUserPassword(model.getDblinkUserPassword());
            }
            if (model.wasPropertyExplicitlySet("sourcePluggableDatabaseId")) {
                this.sourcePluggableDatabaseId(model.getSourcePluggableDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDatabaseAdminPassword")) {
                this.sourceContainerDatabaseAdminPassword(
                        model.getSourceContainerDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("refreshableCloneDetails")) {
                this.refreshableCloneDetails(model.getRefreshableCloneDetails());
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
    public CreatePluggableDatabaseFromRemoteCloneDetails(
            String dblinkUsername,
            String dblinkUserPassword,
            String sourcePluggableDatabaseId,
            String sourceContainerDatabaseAdminPassword,
            CreatePluggableDatabaseRefreshableCloneDetails refreshableCloneDetails) {
        super();
        this.dblinkUsername = dblinkUsername;
        this.dblinkUserPassword = dblinkUserPassword;
        this.sourcePluggableDatabaseId = sourcePluggableDatabaseId;
        this.sourceContainerDatabaseAdminPassword = sourceContainerDatabaseAdminPassword;
        this.refreshableCloneDetails = refreshableCloneDetails;
    }

    /** The name of the DB link user. */
    @com.fasterxml.jackson.annotation.JsonProperty("dblinkUsername")
    private final String dblinkUsername;

    /**
     * The name of the DB link user.
     *
     * @return the value
     */
    public String getDblinkUsername() {
        return dblinkUsername;
    }

    /** The DB link user password. */
    @com.fasterxml.jackson.annotation.JsonProperty("dblinkUserPassword")
    private final String dblinkUserPassword;

    /**
     * The DB link user password.
     *
     * @return the value
     */
    public String getDblinkUserPassword() {
        return dblinkUserPassword;
    }

    /** The OCID of the Source Pluggable Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePluggableDatabaseId")
    private final String sourcePluggableDatabaseId;

    /**
     * The OCID of the Source Pluggable Database.
     *
     * @return the value
     */
    public String getSourcePluggableDatabaseId() {
        return sourcePluggableDatabaseId;
    }

    /** The DB system administrator password of the source Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseAdminPassword")
    private final String sourceContainerDatabaseAdminPassword;

    /**
     * The DB system administrator password of the source Container Database.
     *
     * @return the value
     */
    public String getSourceContainerDatabaseAdminPassword() {
        return sourceContainerDatabaseAdminPassword;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("refreshableCloneDetails")
    private final CreatePluggableDatabaseRefreshableCloneDetails refreshableCloneDetails;

    public CreatePluggableDatabaseRefreshableCloneDetails getRefreshableCloneDetails() {
        return refreshableCloneDetails;
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
        sb.append("CreatePluggableDatabaseFromRemoteCloneDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dblinkUsername=").append(String.valueOf(this.dblinkUsername));
        sb.append(", dblinkUserPassword=").append("<redacted>");
        sb.append(", sourcePluggableDatabaseId=")
                .append(String.valueOf(this.sourcePluggableDatabaseId));
        sb.append(", sourceContainerDatabaseAdminPassword=").append("<redacted>");
        sb.append(", refreshableCloneDetails=")
                .append(String.valueOf(this.refreshableCloneDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePluggableDatabaseFromRemoteCloneDetails)) {
            return false;
        }

        CreatePluggableDatabaseFromRemoteCloneDetails other =
                (CreatePluggableDatabaseFromRemoteCloneDetails) o;
        return java.util.Objects.equals(this.dblinkUsername, other.dblinkUsername)
                && java.util.Objects.equals(this.dblinkUserPassword, other.dblinkUserPassword)
                && java.util.Objects.equals(
                        this.sourcePluggableDatabaseId, other.sourcePluggableDatabaseId)
                && java.util.Objects.equals(
                        this.sourceContainerDatabaseAdminPassword,
                        other.sourceContainerDatabaseAdminPassword)
                && java.util.Objects.equals(
                        this.refreshableCloneDetails, other.refreshableCloneDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dblinkUsername == null ? 43 : this.dblinkUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.dblinkUserPassword == null
                                ? 43
                                : this.dblinkUserPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePluggableDatabaseId == null
                                ? 43
                                : this.sourcePluggableDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceContainerDatabaseAdminPassword == null
                                ? 43
                                : this.sourceContainerDatabaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableCloneDetails == null
                                ? 43
                                : this.refreshableCloneDetails.hashCode());
        return result;
    }
}
