/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The property search criteria for listing monitored resources. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SearchMonitoredResourcesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SearchMonitoredResourcesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "name",
        "nameContains",
        "type",
        "hostName",
        "externalId",
        "hostNameContains",
        "managementAgentId",
        "lifecycleState",
        "license",
        "timeCreatedGreaterThanOrEqualTo",
        "timeCreatedLessThan",
        "timeUpdatedGreaterThanOrEqualTo",
        "timeUpdatedLessThan",
        "resourceTimeZone",
        "sortOrder",
        "sortBy",
        "propertyEquals"
    })
    public SearchMonitoredResourcesDetails(
            String compartmentId,
            String name,
            String nameContains,
            String type,
            String hostName,
            String externalId,
            String hostNameContains,
            String managementAgentId,
            ResourceLifecycleState lifecycleState,
            LicenseType license,
            java.util.Date timeCreatedGreaterThanOrEqualTo,
            java.util.Date timeCreatedLessThan,
            java.util.Date timeUpdatedGreaterThanOrEqualTo,
            java.util.Date timeUpdatedLessThan,
            String resourceTimeZone,
            SortOrder sortOrder,
            SortBy sortBy,
            java.util.Map<String, String> propertyEquals) {
        super();
        this.compartmentId = compartmentId;
        this.name = name;
        this.nameContains = nameContains;
        this.type = type;
        this.hostName = hostName;
        this.externalId = externalId;
        this.hostNameContains = hostNameContains;
        this.managementAgentId = managementAgentId;
        this.lifecycleState = lifecycleState;
        this.license = license;
        this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = timeCreatedLessThan;
        this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
        this.timeUpdatedLessThan = timeUpdatedLessThan;
        this.resourceTimeZone = resourceTimeZone;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
        this.propertyEquals = propertyEquals;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A filter to return resources that match exact resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A filter to return resources that match exact resource name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A filter to return resources that match resource name pattern given. The match is not
         * case sensitive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
        private String nameContains;

        /**
         * A filter to return resources that match resource name pattern given. The match is not
         * case sensitive.
         *
         * @param nameContains the value to set
         * @return this builder
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            this.__explicitlySet__.add("nameContains");
            return this;
        }
        /** A filter to return resources that match resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * A filter to return resources that match resource type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** A filter to return resources with host name match. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * A filter to return resources with host name match.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * External resource is any OCI resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is
         * not a Stack Monitoring service resource. Currently supports only following resource types
         * - Container database, non-container database, pluggable database and OCI compute
         * instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * External resource is any OCI resource identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is
         * not a Stack Monitoring service resource. Currently supports only following resource types
         * - Container database, non-container database, pluggable database and OCI compute
         * instance.
         *
         * @param externalId the value to set
         * @return this builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /** A filter to return resources with host name pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostNameContains")
        private String hostNameContains;

        /**
         * A filter to return resources with host name pattern.
         *
         * @param hostNameContains the value to set
         * @return this builder
         */
        public Builder hostNameContains(String hostNameContains) {
            this.hostNameContains = hostNameContains;
            this.__explicitlySet__.add("hostNameContains");
            return this;
        }
        /** A filter to return resources with matching management agent id. */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * A filter to return resources with matching management agent id.
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /** A filter to return resources with matching lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourceLifecycleState lifecycleState;

        /**
         * A filter to return resources with matching lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ResourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** License edition of the monitored resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("license")
        private LicenseType license;

        /**
         * License edition of the monitored resource.
         *
         * @param license the value to set
         * @return this builder
         */
        public Builder license(LicenseType license) {
            this.license = license;
            this.__explicitlySet__.add("license");
            return this;
        }
        /**
         * Search for resources that were created within a specific date range, using this parameter
         * to specify the earliest creation date for the returned list (inclusive). Specifying this
         * parameter without the corresponding {@code timeCreatedLessThan} parameter will retrieve
         * resources created from the given {@code timeCreatedGreaterThanOrEqualTo} to the current
         * time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedGreaterThanOrEqualTo")
        private java.util.Date timeCreatedGreaterThanOrEqualTo;

        /**
         * Search for resources that were created within a specific date range, using this parameter
         * to specify the earliest creation date for the returned list (inclusive). Specifying this
         * parameter without the corresponding {@code timeCreatedLessThan} parameter will retrieve
         * resources created from the given {@code timeCreatedGreaterThanOrEqualTo} to the current
         * time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeCreatedGreaterThanOrEqualTo");
            return this;
        }
        /**
         * Search for resources that were created within a specific date range, using this parameter
         * to specify the latest creation date for the returned list (exclusive). Specifying this
         * parameter without the corresponding {@code timeCreatedGreaterThanOrEqualTo} parameter
         * will retrieve all resources created before the specified end date, in "YYYY-MM-ddThh:mmZ"
         * format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedLessThan")
        private java.util.Date timeCreatedLessThan;

        /**
         * Search for resources that were created within a specific date range, using this parameter
         * to specify the latest creation date for the returned list (exclusive). Specifying this
         * parameter without the corresponding {@code timeCreatedGreaterThanOrEqualTo} parameter
         * will retrieve all resources created before the specified end date, in "YYYY-MM-ddThh:mmZ"
         * format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            this.__explicitlySet__.add("timeCreatedLessThan");
            return this;
        }
        /**
         * Search for resources that were updated within a specific date range, using this parameter
         * to specify the earliest update date for the returned list (inclusive). Specifying this
         * parameter without the corresponding {@code timeUpdatedLessThan} parameter will retrieve
         * resources updated from the given {@code timeUpdatedGreaterThanOrEqualTo} to the current
         * time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedGreaterThanOrEqualTo")
        private java.util.Date timeUpdatedGreaterThanOrEqualTo;

        /**
         * Search for resources that were updated within a specific date range, using this parameter
         * to specify the earliest update date for the returned list (inclusive). Specifying this
         * parameter without the corresponding {@code timeUpdatedLessThan} parameter will retrieve
         * resources updated from the given {@code timeUpdatedGreaterThanOrEqualTo} to the current
         * time, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeUpdatedGreaterThanOrEqualTo the value to set
         * @return this builder
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            this.__explicitlySet__.add("timeUpdatedGreaterThanOrEqualTo");
            return this;
        }
        /**
         * Search for resources that were updated within a specific date range, using this parameter
         * to specify the latest creation date for the returned list (exclusive). Specifying this
         * parameter without the corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter
         * will retrieve all resources updated before the specified end date, in "YYYY-MM-ddThh:mmZ"
         * format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedLessThan")
        private java.util.Date timeUpdatedLessThan;

        /**
         * Search for resources that were updated within a specific date range, using this parameter
         * to specify the latest creation date for the returned list (exclusive). Specifying this
         * parameter without the corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter
         * will retrieve all resources updated before the specified end date, in "YYYY-MM-ddThh:mmZ"
         * format with a Z offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeUpdatedLessThan the value to set
         * @return this builder
         */
        public Builder timeUpdatedLessThan(java.util.Date timeUpdatedLessThan) {
            this.timeUpdatedLessThan = timeUpdatedLessThan;
            this.__explicitlySet__.add("timeUpdatedLessThan");
            return this;
        }
        /**
         * Time zone in the form of tz database canonical zone ID. Specifies the preference with a
         * value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
         * America/Los_Angeles
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
        private String resourceTimeZone;

        /**
         * Time zone in the form of tz database canonical zone ID. Specifies the preference with a
         * value that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
         * America/Los_Angeles
         *
         * @param resourceTimeZone the value to set
         * @return this builder
         */
        public Builder resourceTimeZone(String resourceTimeZone) {
            this.resourceTimeZone = resourceTimeZone;
            this.__explicitlySet__.add("resourceTimeZone");
            return this;
        }
        /** The sort order to use, either 'ASC' or 'DESC'. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for resources is ascending.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for resources is ascending.
         *
         * @param sortBy the value to set
         * @return this builder
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /** Criteria based on resource property. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyEquals")
        private java.util.Map<String, String> propertyEquals;

        /**
         * Criteria based on resource property.
         *
         * @param propertyEquals the value to set
         * @return this builder
         */
        public Builder propertyEquals(java.util.Map<String, String> propertyEquals) {
            this.propertyEquals = propertyEquals;
            this.__explicitlySet__.add("propertyEquals");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchMonitoredResourcesDetails build() {
            SearchMonitoredResourcesDetails model =
                    new SearchMonitoredResourcesDetails(
                            this.compartmentId,
                            this.name,
                            this.nameContains,
                            this.type,
                            this.hostName,
                            this.externalId,
                            this.hostNameContains,
                            this.managementAgentId,
                            this.lifecycleState,
                            this.license,
                            this.timeCreatedGreaterThanOrEqualTo,
                            this.timeCreatedLessThan,
                            this.timeUpdatedGreaterThanOrEqualTo,
                            this.timeUpdatedLessThan,
                            this.resourceTimeZone,
                            this.sortOrder,
                            this.sortBy,
                            this.propertyEquals);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchMonitoredResourcesDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("nameContains")) {
                this.nameContains(model.getNameContains());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("hostNameContains")) {
                this.hostNameContains(model.getHostNameContains());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("license")) {
                this.license(model.getLicense());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedGreaterThanOrEqualTo")) {
                this.timeCreatedGreaterThanOrEqualTo(model.getTimeCreatedGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedLessThan")) {
                this.timeCreatedLessThan(model.getTimeCreatedLessThan());
            }
            if (model.wasPropertyExplicitlySet("timeUpdatedGreaterThanOrEqualTo")) {
                this.timeUpdatedGreaterThanOrEqualTo(model.getTimeUpdatedGreaterThanOrEqualTo());
            }
            if (model.wasPropertyExplicitlySet("timeUpdatedLessThan")) {
                this.timeUpdatedLessThan(model.getTimeUpdatedLessThan());
            }
            if (model.wasPropertyExplicitlySet("resourceTimeZone")) {
                this.resourceTimeZone(model.getResourceTimeZone());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("propertyEquals")) {
                this.propertyEquals(model.getPropertyEquals());
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
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A filter to return resources that match exact resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A filter to return resources that match exact resource name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A filter to return resources that match resource name pattern given. The match is not case
     * sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
    private final String nameContains;

    /**
     * A filter to return resources that match resource name pattern given. The match is not case
     * sensitive.
     *
     * @return the value
     */
    public String getNameContains() {
        return nameContains;
    }

    /** A filter to return resources that match resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * A filter to return resources that match resource type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** A filter to return resources with host name match. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * A filter to return resources with host name match.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * External resource is any OCI resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is not a
     * Stack Monitoring service resource. Currently supports only following resource types -
     * Container database, non-container database, pluggable database and OCI compute instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * External resource is any OCI resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) which is not a
     * Stack Monitoring service resource. Currently supports only following resource types -
     * Container database, non-container database, pluggable database and OCI compute instance.
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /** A filter to return resources with host name pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostNameContains")
    private final String hostNameContains;

    /**
     * A filter to return resources with host name pattern.
     *
     * @return the value
     */
    public String getHostNameContains() {
        return hostNameContains;
    }

    /** A filter to return resources with matching management agent id. */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * A filter to return resources with matching management agent id.
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /** A filter to return resources with matching lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ResourceLifecycleState lifecycleState;

    /**
     * A filter to return resources with matching lifecycle state.
     *
     * @return the value
     */
    public ResourceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** License edition of the monitored resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("license")
    private final LicenseType license;

    /**
     * License edition of the monitored resource.
     *
     * @return the value
     */
    public LicenseType getLicense() {
        return license;
    }

    /**
     * Search for resources that were created within a specific date range, using this parameter to
     * specify the earliest creation date for the returned list (inclusive). Specifying this
     * parameter without the corresponding {@code timeCreatedLessThan} parameter will retrieve
     * resources created from the given {@code timeCreatedGreaterThanOrEqualTo} to the current time,
     * in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedGreaterThanOrEqualTo")
    private final java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were created within a specific date range, using this parameter to
     * specify the earliest creation date for the returned list (inclusive). Specifying this
     * parameter without the corresponding {@code timeCreatedLessThan} parameter will retrieve
     * resources created from the given {@code timeCreatedGreaterThanOrEqualTo} to the current time,
     * in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     *
     * @return the value
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }

    /**
     * Search for resources that were created within a specific date range, using this parameter to
     * specify the latest creation date for the returned list (exclusive). Specifying this parameter
     * without the corresponding {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all
     * resources created before the specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z
     * offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedLessThan")
    private final java.util.Date timeCreatedLessThan;

    /**
     * Search for resources that were created within a specific date range, using this parameter to
     * specify the latest creation date for the returned list (exclusive). Specifying this parameter
     * without the corresponding {@code timeCreatedGreaterThanOrEqualTo} parameter will retrieve all
     * resources created before the specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z
     * offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     *
     * @return the value
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }

    /**
     * Search for resources that were updated within a specific date range, using this parameter to
     * specify the earliest update date for the returned list (inclusive). Specifying this parameter
     * without the corresponding {@code timeUpdatedLessThan} parameter will retrieve resources
     * updated from the given {@code timeUpdatedGreaterThanOrEqualTo} to the current time, in
     * "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedGreaterThanOrEqualTo")
    private final java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were updated within a specific date range, using this parameter to
     * specify the earliest update date for the returned list (inclusive). Specifying this parameter
     * without the corresponding {@code timeUpdatedLessThan} parameter will retrieve resources
     * updated from the given {@code timeUpdatedGreaterThanOrEqualTo} to the current time, in
     * "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     *
     * @return the value
     */
    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }

    /**
     * Search for resources that were updated within a specific date range, using this parameter to
     * specify the latest creation date for the returned list (exclusive). Specifying this parameter
     * without the corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all
     * resources updated before the specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z
     * offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedLessThan")
    private final java.util.Date timeUpdatedLessThan;

    /**
     * Search for resources that were updated within a specific date range, using this parameter to
     * specify the latest creation date for the returned list (exclusive). Specifying this parameter
     * without the corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all
     * resources updated before the specified end date, in "YYYY-MM-ddThh:mmZ" format with a Z
     * offset, as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     *
     * @return the value
     */
    public java.util.Date getTimeUpdatedLessThan() {
        return timeUpdatedLessThan;
    }

    /**
     * Time zone in the form of tz database canonical zone ID. Specifies the preference with a value
     * that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
     * America/Los_Angeles
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTimeZone")
    private final String resourceTimeZone;

    /**
     * Time zone in the form of tz database canonical zone ID. Specifies the preference with a value
     * that uses the IANA Time Zone Database format (x-obmcs-time-zone). For example -
     * America/Los_Angeles
     *
     * @return the value
     */
    public String getResourceTimeZone() {
        return resourceTimeZone;
    }

    /** The sort order to use, either 'ASC' or 'DESC'. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     *
     * @return the value
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for resources is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("TIME_CREATED"),
        ResourceName("RESOURCE_NAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for resources is ascending.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for resources is ascending.
     *
     * @return the value
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    /** Criteria based on resource property. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyEquals")
    private final java.util.Map<String, String> propertyEquals;

    /**
     * Criteria based on resource property.
     *
     * @return the value
     */
    public java.util.Map<String, String> getPropertyEquals() {
        return propertyEquals;
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
        sb.append("SearchMonitoredResourcesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", nameContains=").append(String.valueOf(this.nameContains));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", hostNameContains=").append(String.valueOf(this.hostNameContains));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", license=").append(String.valueOf(this.license));
        sb.append(", timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(", timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(", timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(", timeUpdatedLessThan=").append(String.valueOf(this.timeUpdatedLessThan));
        sb.append(", resourceTimeZone=").append(String.valueOf(this.resourceTimeZone));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", propertyEquals=").append(String.valueOf(this.propertyEquals));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchMonitoredResourcesDetails)) {
            return false;
        }

        SearchMonitoredResourcesDetails other = (SearchMonitoredResourcesDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.hostNameContains, other.hostNameContains)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.license, other.license)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpdatedLessThan, other.timeUpdatedLessThan)
                && java.util.Objects.equals(this.resourceTimeZone, other.resourceTimeZone)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.propertyEquals, other.propertyEquals)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result =
                (result * PRIME)
                        + (this.hostNameContains == null ? 43 : this.hostNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.license == null ? 43 : this.license.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUpdatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedLessThan == null
                                ? 43
                                : this.timeUpdatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTimeZone == null ? 43 : this.resourceTimeZone.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyEquals == null ? 43 : this.propertyEquals.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
