/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Awr hub source object
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwrHubSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrHubSource extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "awrHubId",
        "compartmentId",
        "type",
        "id",
        "awrHubOpsiSourceId",
        "sourceMailBoxUrl",
        "associatedResourceId",
        "associatedOpsiId",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "isRegisteredWithAwrHub",
        "awrSourceDatabaseId",
        "minSnapshotIdentifier",
        "maxSnapshotIdentifier",
        "timeFirstSnapshotGenerated",
        "timeLastSnapshotGenerated",
        "hoursSinceLastImport",
        "lifecycleState",
        "status"
    })
    public AwrHubSource(
            String name,
            String awrHubId,
            String compartmentId,
            AwrHubSourceType type,
            String id,
            String awrHubOpsiSourceId,
            String sourceMailBoxUrl,
            String associatedResourceId,
            String associatedOpsiId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isRegisteredWithAwrHub,
            String awrSourceDatabaseId,
            java.math.BigDecimal minSnapshotIdentifier,
            java.math.BigDecimal maxSnapshotIdentifier,
            java.util.Date timeFirstSnapshotGenerated,
            java.util.Date timeLastSnapshotGenerated,
            Double hoursSinceLastImport,
            AwrHubSourceLifecycleState lifecycleState,
            AwrHubSourceStatus status) {
        super();
        this.name = name;
        this.awrHubId = awrHubId;
        this.compartmentId = compartmentId;
        this.type = type;
        this.id = id;
        this.awrHubOpsiSourceId = awrHubOpsiSourceId;
        this.sourceMailBoxUrl = sourceMailBoxUrl;
        this.associatedResourceId = associatedResourceId;
        this.associatedOpsiId = associatedOpsiId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.isRegisteredWithAwrHub = isRegisteredWithAwrHub;
        this.awrSourceDatabaseId = awrSourceDatabaseId;
        this.minSnapshotIdentifier = minSnapshotIdentifier;
        this.maxSnapshotIdentifier = maxSnapshotIdentifier;
        this.timeFirstSnapshotGenerated = timeFirstSnapshotGenerated;
        this.timeLastSnapshotGenerated = timeLastSnapshotGenerated;
        this.hoursSinceLastImport = hoursSinceLastImport;
        this.lifecycleState = lifecycleState;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Awr Hub source database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Awr Hub source database.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * AWR Hub OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awrHubId")
        private String awrHubId;

        /**
         * AWR Hub OCID
         * @param awrHubId the value to set
         * @return this builder
         **/
        public Builder awrHubId(String awrHubId) {
            this.awrHubId = awrHubId;
            this.__explicitlySet__.add("awrHubId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * source type of the database
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AwrHubSourceType type;

        /**
         * source type of the database
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(AwrHubSourceType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Awr Hub source database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Awr Hub source database.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The shorted string of the Awr Hub source database identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awrHubOpsiSourceId")
        private String awrHubOpsiSourceId;

        /**
         * The shorted string of the Awr Hub source database identifier.
         * @param awrHubOpsiSourceId the value to set
         * @return this builder
         **/
        public Builder awrHubOpsiSourceId(String awrHubOpsiSourceId) {
            this.awrHubOpsiSourceId = awrHubOpsiSourceId;
            this.__explicitlySet__.add("awrHubOpsiSourceId");
            return this;
        }
        /**
         * Opsi Mailbox URL based on the Awr Hub and Awr Hub source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMailBoxUrl")
        private String sourceMailBoxUrl;

        /**
         * Opsi Mailbox URL based on the Awr Hub and Awr Hub source.
         * @param sourceMailBoxUrl the value to set
         * @return this builder
         **/
        public Builder sourceMailBoxUrl(String sourceMailBoxUrl) {
            this.sourceMailBoxUrl = sourceMailBoxUrl;
            this.__explicitlySet__.add("sourceMailBoxUrl");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
        private String associatedResourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
         * @param associatedResourceId the value to set
         * @return this builder
         **/
        public Builder associatedResourceId(String associatedResourceId) {
            this.associatedResourceId = associatedResourceId;
            this.__explicitlySet__.add("associatedResourceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedOpsiId")
        private String associatedOpsiId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
         * @param associatedOpsiId the value to set
         * @return this builder
         **/
        public Builder associatedOpsiId(String associatedOpsiId) {
            this.associatedOpsiId = associatedOpsiId;
            this.__explicitlySet__.add("associatedOpsiId");
            return this;
        }
        /**
         * The time at which the resource was first created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time at which the resource was first created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time at which the resource was last updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time at which the resource was last updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * This is {@code true} if the source databse is registered with a Awr Hub, otherwise {@code false}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRegisteredWithAwrHub")
        private Boolean isRegisteredWithAwrHub;

        /**
         * This is {@code true} if the source databse is registered with a Awr Hub, otherwise {@code false}
         * @param isRegisteredWithAwrHub the value to set
         * @return this builder
         **/
        public Builder isRegisteredWithAwrHub(Boolean isRegisteredWithAwrHub) {
            this.isRegisteredWithAwrHub = isRegisteredWithAwrHub;
            this.__explicitlySet__.add("isRegisteredWithAwrHub");
            return this;
        }
        /**
         * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
        private String awrSourceDatabaseId;

        /**
         * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
         * @param awrSourceDatabaseId the value to set
         * @return this builder
         **/
        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = awrSourceDatabaseId;
            this.__explicitlySet__.add("awrSourceDatabaseId");
            return this;
        }
        /**
         * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minSnapshotIdentifier")
        private java.math.BigDecimal minSnapshotIdentifier;

        /**
         * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         * @param minSnapshotIdentifier the value to set
         * @return this builder
         **/
        public Builder minSnapshotIdentifier(java.math.BigDecimal minSnapshotIdentifier) {
            this.minSnapshotIdentifier = minSnapshotIdentifier;
            this.__explicitlySet__.add("minSnapshotIdentifier");
            return this;
        }
        /**
         * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxSnapshotIdentifier")
        private java.math.BigDecimal maxSnapshotIdentifier;

        /**
         * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
         * @param maxSnapshotIdentifier the value to set
         * @return this builder
         **/
        public Builder maxSnapshotIdentifier(java.math.BigDecimal maxSnapshotIdentifier) {
            this.maxSnapshotIdentifier = maxSnapshotIdentifier;
            this.__explicitlySet__.add("maxSnapshotIdentifier");
            return this;
        }
        /**
         * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotGenerated")
        private java.util.Date timeFirstSnapshotGenerated;

        /**
         * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         * @param timeFirstSnapshotGenerated the value to set
         * @return this builder
         **/
        public Builder timeFirstSnapshotGenerated(java.util.Date timeFirstSnapshotGenerated) {
            this.timeFirstSnapshotGenerated = timeFirstSnapshotGenerated;
            this.__explicitlySet__.add("timeFirstSnapshotGenerated");
            return this;
        }
        /**
         * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSnapshotGenerated")
        private java.util.Date timeLastSnapshotGenerated;

        /**
         * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
         * @param timeLastSnapshotGenerated the value to set
         * @return this builder
         **/
        public Builder timeLastSnapshotGenerated(java.util.Date timeLastSnapshotGenerated) {
            this.timeLastSnapshotGenerated = timeLastSnapshotGenerated;
            this.__explicitlySet__.add("timeLastSnapshotGenerated");
            return this;
        }
        /**
         * Number of hours since last AWR snapshots import happened from the Source database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hoursSinceLastImport")
        private Double hoursSinceLastImport;

        /**
         * Number of hours since last AWR snapshots import happened from the Source database.
         * @param hoursSinceLastImport the value to set
         * @return this builder
         **/
        public Builder hoursSinceLastImport(Double hoursSinceLastImport) {
            this.hoursSinceLastImport = hoursSinceLastImport;
            this.__explicitlySet__.add("hoursSinceLastImport");
            return this;
        }
        /**
         * the current state of the source database
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AwrHubSourceLifecycleState lifecycleState;

        /**
         * the current state of the source database
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AwrHubSourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Indicates the status of a source database in Operations Insights
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AwrHubSourceStatus status;

        /**
         * Indicates the status of a source database in Operations Insights
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(AwrHubSourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrHubSource build() {
            AwrHubSource model =
                    new AwrHubSource(
                            this.name,
                            this.awrHubId,
                            this.compartmentId,
                            this.type,
                            this.id,
                            this.awrHubOpsiSourceId,
                            this.sourceMailBoxUrl,
                            this.associatedResourceId,
                            this.associatedOpsiId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isRegisteredWithAwrHub,
                            this.awrSourceDatabaseId,
                            this.minSnapshotIdentifier,
                            this.maxSnapshotIdentifier,
                            this.timeFirstSnapshotGenerated,
                            this.timeLastSnapshotGenerated,
                            this.hoursSinceLastImport,
                            this.lifecycleState,
                            this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrHubSource model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("awrHubId")) {
                this.awrHubId(model.getAwrHubId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("awrHubOpsiSourceId")) {
                this.awrHubOpsiSourceId(model.getAwrHubOpsiSourceId());
            }
            if (model.wasPropertyExplicitlySet("sourceMailBoxUrl")) {
                this.sourceMailBoxUrl(model.getSourceMailBoxUrl());
            }
            if (model.wasPropertyExplicitlySet("associatedResourceId")) {
                this.associatedResourceId(model.getAssociatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("associatedOpsiId")) {
                this.associatedOpsiId(model.getAssociatedOpsiId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("isRegisteredWithAwrHub")) {
                this.isRegisteredWithAwrHub(model.getIsRegisteredWithAwrHub());
            }
            if (model.wasPropertyExplicitlySet("awrSourceDatabaseId")) {
                this.awrSourceDatabaseId(model.getAwrSourceDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("minSnapshotIdentifier")) {
                this.minSnapshotIdentifier(model.getMinSnapshotIdentifier());
            }
            if (model.wasPropertyExplicitlySet("maxSnapshotIdentifier")) {
                this.maxSnapshotIdentifier(model.getMaxSnapshotIdentifier());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSnapshotGenerated")) {
                this.timeFirstSnapshotGenerated(model.getTimeFirstSnapshotGenerated());
            }
            if (model.wasPropertyExplicitlySet("timeLastSnapshotGenerated")) {
                this.timeLastSnapshotGenerated(model.getTimeLastSnapshotGenerated());
            }
            if (model.wasPropertyExplicitlySet("hoursSinceLastImport")) {
                this.hoursSinceLastImport(model.getHoursSinceLastImport());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
     * The name of the Awr Hub source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Awr Hub source database.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * AWR Hub OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrHubId")
    private final String awrHubId;

    /**
     * AWR Hub OCID
     * @return the value
     **/
    public String getAwrHubId() {
        return awrHubId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * source type of the database
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AwrHubSourceType type;

    /**
     * source type of the database
     * @return the value
     **/
    public AwrHubSourceType getType() {
        return type;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Awr Hub source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Awr Hub source database.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The shorted string of the Awr Hub source database identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrHubOpsiSourceId")
    private final String awrHubOpsiSourceId;

    /**
     * The shorted string of the Awr Hub source database identifier.
     * @return the value
     **/
    public String getAwrHubOpsiSourceId() {
        return awrHubOpsiSourceId;
    }

    /**
     * Opsi Mailbox URL based on the Awr Hub and Awr Hub source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMailBoxUrl")
    private final String sourceMailBoxUrl;

    /**
     * Opsi Mailbox URL based on the Awr Hub and Awr Hub source.
     * @return the value
     **/
    public String getSourceMailBoxUrl() {
        return sourceMailBoxUrl;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedResourceId")
    private final String associatedResourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
     * @return the value
     **/
    public String getAssociatedResourceId() {
        return associatedResourceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedOpsiId")
    private final String associatedOpsiId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database id.
     * @return the value
     **/
    public String getAssociatedOpsiId() {
        return associatedOpsiId;
    }

    /**
     * The time at which the resource was first created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time at which the resource was first created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time at which the resource was last updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time at which the resource was last updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * This is {@code true} if the source databse is registered with a Awr Hub, otherwise {@code false}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRegisteredWithAwrHub")
    private final Boolean isRegisteredWithAwrHub;

    /**
     * This is {@code true} if the source databse is registered with a Awr Hub, otherwise {@code false}
     * @return the value
     **/
    public Boolean getIsRegisteredWithAwrHub() {
        return isRegisteredWithAwrHub;
    }

    /**
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
    private final String awrSourceDatabaseId;

    /**
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     * @return the value
     **/
    public String getAwrSourceDatabaseId() {
        return awrSourceDatabaseId;
    }

    /**
     * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minSnapshotIdentifier")
    private final java.math.BigDecimal minSnapshotIdentifier;

    /**
     * The minimum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * @return the value
     **/
    public java.math.BigDecimal getMinSnapshotIdentifier() {
        return minSnapshotIdentifier;
    }

    /**
     * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSnapshotIdentifier")
    private final java.math.BigDecimal maxSnapshotIdentifier;

    /**
     * The maximum snapshot identifier of the source database for which AWR data is uploaded to AWR Hub.
     * @return the value
     **/
    public java.math.BigDecimal getMaxSnapshotIdentifier() {
        return maxSnapshotIdentifier;
    }

    /**
     * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotGenerated")
    private final java.util.Date timeFirstSnapshotGenerated;

    /**
     * The time at which the earliest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeFirstSnapshotGenerated() {
        return timeFirstSnapshotGenerated;
    }

    /**
     * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSnapshotGenerated")
    private final java.util.Date timeLastSnapshotGenerated;

    /**
     * The time at which the latest snapshot was generated in the source database for which data is uploaded to AWR Hub. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeLastSnapshotGenerated() {
        return timeLastSnapshotGenerated;
    }

    /**
     * Number of hours since last AWR snapshots import happened from the Source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hoursSinceLastImport")
    private final Double hoursSinceLastImport;

    /**
     * Number of hours since last AWR snapshots import happened from the Source database.
     * @return the value
     **/
    public Double getHoursSinceLastImport() {
        return hoursSinceLastImport;
    }

    /**
     * the current state of the source database
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AwrHubSourceLifecycleState lifecycleState;

    /**
     * the current state of the source database
     * @return the value
     **/
    public AwrHubSourceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Indicates the status of a source database in Operations Insights
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AwrHubSourceStatus status;

    /**
     * Indicates the status of a source database in Operations Insights
     * @return the value
     **/
    public AwrHubSourceStatus getStatus() {
        return status;
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
        sb.append("AwrHubSource(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", awrHubId=").append(String.valueOf(this.awrHubId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", awrHubOpsiSourceId=").append(String.valueOf(this.awrHubOpsiSourceId));
        sb.append(", sourceMailBoxUrl=").append(String.valueOf(this.sourceMailBoxUrl));
        sb.append(", associatedResourceId=").append(String.valueOf(this.associatedResourceId));
        sb.append(", associatedOpsiId=").append(String.valueOf(this.associatedOpsiId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isRegisteredWithAwrHub=").append(String.valueOf(this.isRegisteredWithAwrHub));
        sb.append(", awrSourceDatabaseId=").append(String.valueOf(this.awrSourceDatabaseId));
        sb.append(", minSnapshotIdentifier=").append(String.valueOf(this.minSnapshotIdentifier));
        sb.append(", maxSnapshotIdentifier=").append(String.valueOf(this.maxSnapshotIdentifier));
        sb.append(", timeFirstSnapshotGenerated=")
                .append(String.valueOf(this.timeFirstSnapshotGenerated));
        sb.append(", timeLastSnapshotGenerated=")
                .append(String.valueOf(this.timeLastSnapshotGenerated));
        sb.append(", hoursSinceLastImport=").append(String.valueOf(this.hoursSinceLastImport));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrHubSource)) {
            return false;
        }

        AwrHubSource other = (AwrHubSource) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.awrHubId, other.awrHubId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.awrHubOpsiSourceId, other.awrHubOpsiSourceId)
                && java.util.Objects.equals(this.sourceMailBoxUrl, other.sourceMailBoxUrl)
                && java.util.Objects.equals(this.associatedResourceId, other.associatedResourceId)
                && java.util.Objects.equals(this.associatedOpsiId, other.associatedOpsiId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.isRegisteredWithAwrHub, other.isRegisteredWithAwrHub)
                && java.util.Objects.equals(this.awrSourceDatabaseId, other.awrSourceDatabaseId)
                && java.util.Objects.equals(this.minSnapshotIdentifier, other.minSnapshotIdentifier)
                && java.util.Objects.equals(this.maxSnapshotIdentifier, other.maxSnapshotIdentifier)
                && java.util.Objects.equals(
                        this.timeFirstSnapshotGenerated, other.timeFirstSnapshotGenerated)
                && java.util.Objects.equals(
                        this.timeLastSnapshotGenerated, other.timeLastSnapshotGenerated)
                && java.util.Objects.equals(this.hoursSinceLastImport, other.hoursSinceLastImport)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.awrHubId == null ? 43 : this.awrHubId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.awrHubOpsiSourceId == null
                                ? 43
                                : this.awrHubOpsiSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMailBoxUrl == null ? 43 : this.sourceMailBoxUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceId == null
                                ? 43
                                : this.associatedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedOpsiId == null ? 43 : this.associatedOpsiId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isRegisteredWithAwrHub == null
                                ? 43
                                : this.isRegisteredWithAwrHub.hashCode());
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseId == null
                                ? 43
                                : this.awrSourceDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.minSnapshotIdentifier == null
                                ? 43
                                : this.minSnapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSnapshotIdentifier == null
                                ? 43
                                : this.maxSnapshotIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSnapshotGenerated == null
                                ? 43
                                : this.timeFirstSnapshotGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSnapshotGenerated == null
                                ? 43
                                : this.timeLastSnapshotGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.hoursSinceLastImport == null
                                ? 43
                                : this.hoursSinceLastImport.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
