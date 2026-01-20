/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Parameters detailing how to provision the target endpoint that is a DB System. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateChannelTargetFromDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateChannelTargetFromDbSystemDetails extends CreateChannelTargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the target DB System.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The case-insensitive name that identifies the replication channel. Channel names must
         * follow the rules defined for [MySQL
         * identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html). The names of
         * non-Deleted Channels must be unique for each DB System.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("channelName")
        private String channelName;

        /**
         * The case-insensitive name that identifies the replication channel. Channel names must
         * follow the rules defined for [MySQL
         * identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html). The names of
         * non-Deleted Channels must be unique for each DB System.
         *
         * @param channelName the value to set
         * @return this builder
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            this.__explicitlySet__.add("channelName");
            return this;
        }
        /** The username for the replication applier of the target MySQL DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("applierUsername")
        private String applierUsername;

        /**
         * The username for the replication applier of the target MySQL DB System.
         *
         * @param applierUsername the value to set
         * @return this builder
         */
        public Builder applierUsername(String applierUsername) {
            this.applierUsername = applierUsername;
            this.__explicitlySet__.add("applierUsername");
            return this;
        }
        /** Replication filter rules to be applied at the DB System Channel target. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<ChannelFilter> filters;

        /**
         * Replication filter rules to be applied at the DB System Channel target.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<ChannelFilter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }
        /**
         * Specifies how a replication channel handles the creation and alteration of tables that do
         * not have a primary key. The default value is set to ALLOW.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tablesWithoutPrimaryKeyHandling")
        private ChannelTargetDbSystem.TablesWithoutPrimaryKeyHandling
                tablesWithoutPrimaryKeyHandling;

        /**
         * Specifies how a replication channel handles the creation and alteration of tables that do
         * not have a primary key. The default value is set to ALLOW.
         *
         * @param tablesWithoutPrimaryKeyHandling the value to set
         * @return this builder
         */
        public Builder tablesWithoutPrimaryKeyHandling(
                ChannelTargetDbSystem.TablesWithoutPrimaryKeyHandling
                        tablesWithoutPrimaryKeyHandling) {
            this.tablesWithoutPrimaryKeyHandling = tablesWithoutPrimaryKeyHandling;
            this.__explicitlySet__.add("tablesWithoutPrimaryKeyHandling");
            return this;
        }
        /**
         * Specifies the amount of time, in seconds, that the channel waits before applying a
         * transaction received from the source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("delayInSeconds")
        private Integer delayInSeconds;

        /**
         * Specifies the amount of time, in seconds, that the channel waits before applying a
         * transaction received from the source.
         *
         * @param delayInSeconds the value to set
         * @return this builder
         */
        public Builder delayInSeconds(Integer delayInSeconds) {
            this.delayInSeconds = delayInSeconds;
            this.__explicitlySet__.add("delayInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateChannelTargetFromDbSystemDetails build() {
            CreateChannelTargetFromDbSystemDetails model =
                    new CreateChannelTargetFromDbSystemDetails(
                            this.dbSystemId,
                            this.channelName,
                            this.applierUsername,
                            this.filters,
                            this.tablesWithoutPrimaryKeyHandling,
                            this.delayInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateChannelTargetFromDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("channelName")) {
                this.channelName(model.getChannelName());
            }
            if (model.wasPropertyExplicitlySet("applierUsername")) {
                this.applierUsername(model.getApplierUsername());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
            }
            if (model.wasPropertyExplicitlySet("tablesWithoutPrimaryKeyHandling")) {
                this.tablesWithoutPrimaryKeyHandling(model.getTablesWithoutPrimaryKeyHandling());
            }
            if (model.wasPropertyExplicitlySet("delayInSeconds")) {
                this.delayInSeconds(model.getDelayInSeconds());
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
    public CreateChannelTargetFromDbSystemDetails(
            String dbSystemId,
            String channelName,
            String applierUsername,
            java.util.List<ChannelFilter> filters,
            ChannelTargetDbSystem.TablesWithoutPrimaryKeyHandling tablesWithoutPrimaryKeyHandling,
            Integer delayInSeconds) {
        super();
        this.dbSystemId = dbSystemId;
        this.channelName = channelName;
        this.applierUsername = applierUsername;
        this.filters = filters;
        this.tablesWithoutPrimaryKeyHandling = tablesWithoutPrimaryKeyHandling;
        this.delayInSeconds = delayInSeconds;
    }

    /** The OCID of the target DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the target DB System.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The case-insensitive name that identifies the replication channel. Channel names must follow
     * the rules defined for [MySQL
     * identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html). The names of
     * non-Deleted Channels must be unique for each DB System.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channelName")
    private final String channelName;

    /**
     * The case-insensitive name that identifies the replication channel. Channel names must follow
     * the rules defined for [MySQL
     * identifiers](https://dev.mysql.com/doc/refman/8.0/en/identifiers.html). The names of
     * non-Deleted Channels must be unique for each DB System.
     *
     * @return the value
     */
    public String getChannelName() {
        return channelName;
    }

    /** The username for the replication applier of the target MySQL DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("applierUsername")
    private final String applierUsername;

    /**
     * The username for the replication applier of the target MySQL DB System.
     *
     * @return the value
     */
    public String getApplierUsername() {
        return applierUsername;
    }

    /** Replication filter rules to be applied at the DB System Channel target. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<ChannelFilter> filters;

    /**
     * Replication filter rules to be applied at the DB System Channel target.
     *
     * @return the value
     */
    public java.util.List<ChannelFilter> getFilters() {
        return filters;
    }

    /**
     * Specifies how a replication channel handles the creation and alteration of tables that do not
     * have a primary key. The default value is set to ALLOW.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tablesWithoutPrimaryKeyHandling")
    private final ChannelTargetDbSystem.TablesWithoutPrimaryKeyHandling
            tablesWithoutPrimaryKeyHandling;

    /**
     * Specifies how a replication channel handles the creation and alteration of tables that do not
     * have a primary key. The default value is set to ALLOW.
     *
     * @return the value
     */
    public ChannelTargetDbSystem.TablesWithoutPrimaryKeyHandling
            getTablesWithoutPrimaryKeyHandling() {
        return tablesWithoutPrimaryKeyHandling;
    }

    /**
     * Specifies the amount of time, in seconds, that the channel waits before applying a
     * transaction received from the source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("delayInSeconds")
    private final Integer delayInSeconds;

    /**
     * Specifies the amount of time, in seconds, that the channel waits before applying a
     * transaction received from the source.
     *
     * @return the value
     */
    public Integer getDelayInSeconds() {
        return delayInSeconds;
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
        sb.append("CreateChannelTargetFromDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", channelName=").append(String.valueOf(this.channelName));
        sb.append(", applierUsername=").append(String.valueOf(this.applierUsername));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(", tablesWithoutPrimaryKeyHandling=")
                .append(String.valueOf(this.tablesWithoutPrimaryKeyHandling));
        sb.append(", delayInSeconds=").append(String.valueOf(this.delayInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateChannelTargetFromDbSystemDetails)) {
            return false;
        }

        CreateChannelTargetFromDbSystemDetails other = (CreateChannelTargetFromDbSystemDetails) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.channelName, other.channelName)
                && java.util.Objects.equals(this.applierUsername, other.applierUsername)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(
                        this.tablesWithoutPrimaryKeyHandling, other.tablesWithoutPrimaryKeyHandling)
                && java.util.Objects.equals(this.delayInSeconds, other.delayInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.channelName == null ? 43 : this.channelName.hashCode());
        result =
                (result * PRIME)
                        + (this.applierUsername == null ? 43 : this.applierUsername.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result =
                (result * PRIME)
                        + (this.tablesWithoutPrimaryKeyHandling == null
                                ? 43
                                : this.tablesWithoutPrimaryKeyHandling.hashCode());
        result =
                (result * PRIME)
                        + (this.delayInSeconds == null ? 43 : this.delayInSeconds.hashCode());
        return result;
    }
}
