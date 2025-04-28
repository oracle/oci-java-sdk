/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * A summary model for the capacity request model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OccCapacityRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccCapacityRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "occAvailabilityCatalogId",
        "displayName",
        "description",
        "namespace",
        "occCustomerGroupId",
        "region",
        "availabilityDomain",
        "dateExpectedCapacityHandover",
        "requestState",
        "requestType",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OccCapacityRequestSummary(
            String id,
            String compartmentId,
            String occAvailabilityCatalogId,
            String displayName,
            String description,
            Namespace namespace,
            String occCustomerGroupId,
            String region,
            String availabilityDomain,
            java.util.Date dateExpectedCapacityHandover,
            OccCapacityRequest.RequestState requestState,
            OccCapacityRequest.RequestType requestType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            OccCapacityRequest.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.occAvailabilityCatalogId = occAvailabilityCatalogId;
        this.displayName = displayName;
        this.description = description;
        this.namespace = namespace;
        this.occCustomerGroupId = occCustomerGroupId;
        this.region = region;
        this.availabilityDomain = availabilityDomain;
        this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
        this.requestState = requestState;
        this.requestType = requestType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the capacity request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the capacity request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the tenancy from which the request was made. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy from which the request was made.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the availability catalog against which the capacity request was placed. */
        @com.fasterxml.jackson.annotation.JsonProperty("occAvailabilityCatalogId")
        private String occAvailabilityCatalogId;

        /**
         * The OCID of the availability catalog against which the capacity request was placed.
         *
         * @param occAvailabilityCatalogId the value to set
         * @return this builder
         */
        public Builder occAvailabilityCatalogId(String occAvailabilityCatalogId) {
            this.occAvailabilityCatalogId = occAvailabilityCatalogId;
            this.__explicitlySet__.add("occAvailabilityCatalogId");
            return this;
        }
        /** The display name of the capacity request. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the capacity request.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Meaningful text about the capacity request. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Meaningful text about the capacity request.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private Namespace namespace;

        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(Namespace namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The OCID of the customer group to which this customer belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
        private String occCustomerGroupId;

        /**
         * The OCID of the customer group to which this customer belongs to.
         *
         * @param occCustomerGroupId the value to set
         * @return this builder
         */
        public Builder occCustomerGroupId(String occCustomerGroupId) {
            this.occCustomerGroupId = occCustomerGroupId;
            this.__explicitlySet__.add("occCustomerGroupId");
            return this;
        }
        /** The name of the region for which the capacity request was made. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region for which the capacity request was made.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The availability domain (AD) for which the capacity request was made. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain (AD) for which the capacity request was made.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs
         * to be fulfilled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
        private java.util.Date dateExpectedCapacityHandover;

        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs
         * to be fulfilled.
         *
         * @param dateExpectedCapacityHandover the value to set
         * @return this builder
         */
        public Builder dateExpectedCapacityHandover(java.util.Date dateExpectedCapacityHandover) {
            this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
            this.__explicitlySet__.add("dateExpectedCapacityHandover");
            return this;
        }
        /** A list of states through which the capacity request goes by. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestState")
        private OccCapacityRequest.RequestState requestState;

        /**
         * A list of states through which the capacity request goes by.
         *
         * @param requestState the value to set
         * @return this builder
         */
        public Builder requestState(OccCapacityRequest.RequestState requestState) {
            this.requestState = requestState;
            this.__explicitlySet__.add("requestState");
            return this;
        }
        /** Type of Capacity Request(New or Transfer) */
        @com.fasterxml.jackson.annotation.JsonProperty("requestType")
        private OccCapacityRequest.RequestType requestType;

        /**
         * Type of Capacity Request(New or Transfer)
         *
         * @param requestType the value to set
         * @return this builder
         */
        public Builder requestType(OccCapacityRequest.RequestType requestType) {
            this.requestType = requestType;
            this.__explicitlySet__.add("requestType");
            return this;
        }
        /** The time when the capacity request was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the capacity request was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the capacity request was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the capacity request was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current lifecycle state of the customer group. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OccCapacityRequest.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the customer group.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OccCapacityRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in a Failed State.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in a Failed State.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccCapacityRequestSummary build() {
            OccCapacityRequestSummary model =
                    new OccCapacityRequestSummary(
                            this.id,
                            this.compartmentId,
                            this.occAvailabilityCatalogId,
                            this.displayName,
                            this.description,
                            this.namespace,
                            this.occCustomerGroupId,
                            this.region,
                            this.availabilityDomain,
                            this.dateExpectedCapacityHandover,
                            this.requestState,
                            this.requestType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccCapacityRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("occAvailabilityCatalogId")) {
                this.occAvailabilityCatalogId(model.getOccAvailabilityCatalogId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("occCustomerGroupId")) {
                this.occCustomerGroupId(model.getOccCustomerGroupId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("dateExpectedCapacityHandover")) {
                this.dateExpectedCapacityHandover(model.getDateExpectedCapacityHandover());
            }
            if (model.wasPropertyExplicitlySet("requestState")) {
                this.requestState(model.getRequestState());
            }
            if (model.wasPropertyExplicitlySet("requestType")) {
                this.requestType(model.getRequestType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** The OCID of the capacity request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the capacity request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the tenancy from which the request was made. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy from which the request was made.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the availability catalog against which the capacity request was placed. */
    @com.fasterxml.jackson.annotation.JsonProperty("occAvailabilityCatalogId")
    private final String occAvailabilityCatalogId;

    /**
     * The OCID of the availability catalog against which the capacity request was placed.
     *
     * @return the value
     */
    public String getOccAvailabilityCatalogId() {
        return occAvailabilityCatalogId;
    }

    /** The display name of the capacity request. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the capacity request.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Meaningful text about the capacity request. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Meaningful text about the capacity request.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The name of the OCI service in consideration. For example, Compute, Exadata, and so on. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final Namespace namespace;

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     *
     * @return the value
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /** The OCID of the customer group to which this customer belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("occCustomerGroupId")
    private final String occCustomerGroupId;

    /**
     * The OCID of the customer group to which this customer belongs to.
     *
     * @return the value
     */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
    }

    /** The name of the region for which the capacity request was made. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region for which the capacity request was made.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The availability domain (AD) for which the capacity request was made. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain (AD) for which the capacity request was made.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to
     * be fulfilled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
    private final java.util.Date dateExpectedCapacityHandover;

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to
     * be fulfilled.
     *
     * @return the value
     */
    public java.util.Date getDateExpectedCapacityHandover() {
        return dateExpectedCapacityHandover;
    }

    /** A list of states through which the capacity request goes by. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestState")
    private final OccCapacityRequest.RequestState requestState;

    /**
     * A list of states through which the capacity request goes by.
     *
     * @return the value
     */
    public OccCapacityRequest.RequestState getRequestState() {
        return requestState;
    }

    /** Type of Capacity Request(New or Transfer) */
    @com.fasterxml.jackson.annotation.JsonProperty("requestType")
    private final OccCapacityRequest.RequestType requestType;

    /**
     * Type of Capacity Request(New or Transfer)
     *
     * @return the value
     */
    public OccCapacityRequest.RequestType getRequestType() {
        return requestType;
    }

    /** The time when the capacity request was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the capacity request was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the capacity request was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the capacity request was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current lifecycle state of the customer group. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OccCapacityRequest.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the customer group.
     *
     * @return the value
     */
    public OccCapacityRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in a Failed State.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in a Failed State.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OccCapacityRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", occAvailabilityCatalogId=")
                .append(String.valueOf(this.occAvailabilityCatalogId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", dateExpectedCapacityHandover=")
                .append(String.valueOf(this.dateExpectedCapacityHandover));
        sb.append(", requestState=").append(String.valueOf(this.requestState));
        sb.append(", requestType=").append(String.valueOf(this.requestType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccCapacityRequestSummary)) {
            return false;
        }

        OccCapacityRequestSummary other = (OccCapacityRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.occAvailabilityCatalogId, other.occAvailabilityCatalogId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.dateExpectedCapacityHandover, other.dateExpectedCapacityHandover)
                && java.util.Objects.equals(this.requestState, other.requestState)
                && java.util.Objects.equals(this.requestType, other.requestType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.occAvailabilityCatalogId == null
                                ? 43
                                : this.occAvailabilityCatalogId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.dateExpectedCapacityHandover == null
                                ? 43
                                : this.dateExpectedCapacityHandover.hashCode());
        result = (result * PRIME) + (this.requestState == null ? 43 : this.requestState.hashCode());
        result = (result * PRIME) + (this.requestType == null ? 43 : this.requestType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
