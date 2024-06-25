/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about the create request for the capacity request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOccCapacityRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOccCapacityRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "occAvailabilityCatalogId",
        "namespace",
        "region",
        "displayName",
        "requestType",
        "description",
        "freeformTags",
        "definedTags",
        "lifecycleDetails",
        "availabilityDomain",
        "dateExpectedCapacityHandover",
        "requestState",
        "details"
    })
    public CreateOccCapacityRequestDetails(
            String compartmentId,
            String occAvailabilityCatalogId,
            Namespace namespace,
            String region,
            String displayName,
            OccCapacityRequest.RequestType requestType,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String lifecycleDetails,
            String availabilityDomain,
            java.util.Date dateExpectedCapacityHandover,
            RequestState requestState,
            java.util.List<OccCapacityRequestBaseDetails> details) {
        super();
        this.compartmentId = compartmentId;
        this.occAvailabilityCatalogId = occAvailabilityCatalogId;
        this.namespace = namespace;
        this.region = region;
        this.displayName = displayName;
        this.requestType = requestType;
        this.description = description;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lifecycleDetails = lifecycleDetails;
        this.availabilityDomain = availabilityDomain;
        this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
        this.requestState = requestState;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Since all resources are at tenancy level hence this will be the ocid of the tenancy where operation is to be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Since all resources are at tenancy level hence this will be the ocid of the tenancy where operation is to be performed.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the availability catalog against which capacity request is made.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("occAvailabilityCatalogId")
        private String occAvailabilityCatalogId;

        /**
         * The OCID of the availability catalog against which capacity request is made.
         * @param occAvailabilityCatalogId the value to set
         * @return this builder
         **/
        public Builder occAvailabilityCatalogId(String occAvailabilityCatalogId) {
            this.occAvailabilityCatalogId = occAvailabilityCatalogId;
            this.__explicitlySet__.add("occAvailabilityCatalogId");
            return this;
        }
        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private Namespace namespace;

        /**
         * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(Namespace namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The name of the region for which the capacity request is made.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region for which the capacity request is made.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * An user-friendly name for the capacity request. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An user-friendly name for the capacity request. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Type of Capacity Request(New or Transfer)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestType")
        private OccCapacityRequest.RequestType requestType;

        /**
         * Type of Capacity Request(New or Transfer)
         * @param requestType the value to set
         * @return this builder
         **/
        public Builder requestType(OccCapacityRequest.RequestType requestType) {
            this.requestType = requestType;
            this.__explicitlySet__.add("requestType");
            return this;
        }
        /**
         * Meaningful text about the capacity request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Meaningful text about the capacity request.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The availability domain (AD) for which the capacity request is made. If this is specified then the capacity will be validated and fulfilled within the scope of this AD.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain (AD) for which the capacity request is made. If this is specified then the capacity will be validated and fulfilled within the scope of this AD.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
        private java.util.Date dateExpectedCapacityHandover;

        /**
         * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
         * @param dateExpectedCapacityHandover the value to set
         * @return this builder
         **/
        public Builder dateExpectedCapacityHandover(java.util.Date dateExpectedCapacityHandover) {
            this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
            this.__explicitlySet__.add("dateExpectedCapacityHandover");
            return this;
        }
        /**
         * The subset of request states available for creating the capacity request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestState")
        private RequestState requestState;

        /**
         * The subset of request states available for creating the capacity request.
         * @param requestState the value to set
         * @return this builder
         **/
        public Builder requestState(RequestState requestState) {
            this.requestState = requestState;
            this.__explicitlySet__.add("requestState");
            return this;
        }
        /**
         * A list of different resources requested by the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.List<OccCapacityRequestBaseDetails> details;

        /**
         * A list of different resources requested by the user.
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(java.util.List<OccCapacityRequestBaseDetails> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOccCapacityRequestDetails build() {
            CreateOccCapacityRequestDetails model =
                    new CreateOccCapacityRequestDetails(
                            this.compartmentId,
                            this.occAvailabilityCatalogId,
                            this.namespace,
                            this.region,
                            this.displayName,
                            this.requestType,
                            this.description,
                            this.freeformTags,
                            this.definedTags,
                            this.lifecycleDetails,
                            this.availabilityDomain,
                            this.dateExpectedCapacityHandover,
                            this.requestState,
                            this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOccCapacityRequestDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("occAvailabilityCatalogId")) {
                this.occAvailabilityCatalogId(model.getOccAvailabilityCatalogId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("requestType")) {
                this.requestType(model.getRequestType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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
     * Since all resources are at tenancy level hence this will be the ocid of the tenancy where operation is to be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Since all resources are at tenancy level hence this will be the ocid of the tenancy where operation is to be performed.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the availability catalog against which capacity request is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("occAvailabilityCatalogId")
    private final String occAvailabilityCatalogId;

    /**
     * The OCID of the availability catalog against which capacity request is made.
     * @return the value
     **/
    public String getOccAvailabilityCatalogId() {
        return occAvailabilityCatalogId;
    }

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final Namespace namespace;

    /**
     * The name of the OCI service in consideration. For example, Compute, Exadata, and so on.
     * @return the value
     **/
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * The name of the region for which the capacity request is made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region for which the capacity request is made.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * An user-friendly name for the capacity request. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An user-friendly name for the capacity request. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Type of Capacity Request(New or Transfer)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestType")
    private final OccCapacityRequest.RequestType requestType;

    /**
     * Type of Capacity Request(New or Transfer)
     * @return the value
     **/
    public OccCapacityRequest.RequestType getRequestType() {
        return requestType;
    }

    /**
     * Meaningful text about the capacity request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Meaningful text about the capacity request.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The availability domain (AD) for which the capacity request is made. If this is specified then the capacity will be validated and fulfilled within the scope of this AD.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain (AD) for which the capacity request is made. If this is specified then the capacity will be validated and fulfilled within the scope of this AD.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dateExpectedCapacityHandover")
    private final java.util.Date dateExpectedCapacityHandover;

    /**
     * The date by which the capacity requested by customers before dateFinalCustomerOrder needs to be fulfilled.
     * @return the value
     **/
    public java.util.Date getDateExpectedCapacityHandover() {
        return dateExpectedCapacityHandover;
    }

    /**
     * The subset of request states available for creating the capacity request.
     **/
    public enum RequestState {
        Created("CREATED"),
        Submitted("SUBMITTED"),
        ;

        private final String value;
        private static java.util.Map<String, RequestState> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestState v : RequestState.values()) {
                map.put(v.getValue(), v);
            }
        }

        RequestState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RequestState: " + key);
        }
    };
    /**
     * The subset of request states available for creating the capacity request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestState")
    private final RequestState requestState;

    /**
     * The subset of request states available for creating the capacity request.
     * @return the value
     **/
    public RequestState getRequestState() {
        return requestState;
    }

    /**
     * A list of different resources requested by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.List<OccCapacityRequestBaseDetails> details;

    /**
     * A list of different resources requested by the user.
     * @return the value
     **/
    public java.util.List<OccCapacityRequestBaseDetails> getDetails() {
        return details;
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
        sb.append("CreateOccCapacityRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", occAvailabilityCatalogId=")
                .append(String.valueOf(this.occAvailabilityCatalogId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", requestType=").append(String.valueOf(this.requestType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", dateExpectedCapacityHandover=")
                .append(String.valueOf(this.dateExpectedCapacityHandover));
        sb.append(", requestState=").append(String.valueOf(this.requestState));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOccCapacityRequestDetails)) {
            return false;
        }

        CreateOccCapacityRequestDetails other = (CreateOccCapacityRequestDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.occAvailabilityCatalogId, other.occAvailabilityCatalogId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.requestType, other.requestType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.dateExpectedCapacityHandover, other.dateExpectedCapacityHandover)
                && java.util.Objects.equals(this.requestState, other.requestState)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.occAvailabilityCatalogId == null
                                ? 43
                                : this.occAvailabilityCatalogId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.requestType == null ? 43 : this.requestType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
