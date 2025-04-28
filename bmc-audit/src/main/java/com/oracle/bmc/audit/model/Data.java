/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * The payload of the event. Information within {@code data} comes from the resource emitting the
 * event. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Data.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Data extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "eventGroupingId",
        "eventName",
        "compartmentId",
        "compartmentName",
        "resourceName",
        "resourceId",
        "availabilityDomain",
        "freeformTags",
        "definedTags",
        "identity",
        "request",
        "response",
        "stateChange",
        "additionalDetails"
    })
    public Data(
            String eventGroupingId,
            String eventName,
            String compartmentId,
            String compartmentName,
            String resourceName,
            String resourceId,
            String availabilityDomain,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Identity identity,
            Request request,
            Response response,
            StateChange stateChange,
            java.util.Map<String, Object> additionalDetails) {
        super();
        this.eventGroupingId = eventGroupingId;
        this.eventName = eventName;
        this.compartmentId = compartmentId;
        this.compartmentName = compartmentName;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.availabilityDomain = availabilityDomain;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.identity = identity;
        this.request = request;
        this.response = response;
        this.stateChange = stateChange;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This value links multiple audit events that are part of the same API operation. For
         * example, a long running API operations that emit an event at the start and the end of an
         * operation would use the same value in this field for both events.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventGroupingId")
        private String eventGroupingId;

        /**
         * This value links multiple audit events that are part of the same API operation. For
         * example, a long running API operations that emit an event at the start and the end of an
         * operation would use the same value in this field for both events.
         *
         * @param eventGroupingId the value to set
         * @return this builder
         */
        public Builder eventGroupingId(String eventGroupingId) {
            this.eventGroupingId = eventGroupingId;
            this.__explicitlySet__.add("eventGroupingId");
            return this;
        }
        /**
         * Name of the API operation that generated this event.
         *
         * <p>Example: {@code GetInstance}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        /**
         * Name of the API operation that generated this event.
         *
         * <p>Example: {@code GetInstance}
         *
         * @param eventName the value to set
         * @return this builder
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment of the resource emitting the event.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment of the resource emitting the event.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the compartment. This value is the friendly name associated with
         * compartmentId. This value can change, but the service logs the value that appeared at the
         * time of the audit event.
         *
         * <p>Example: {@code CompartmentA}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * The name of the compartment. This value is the friendly name associated with
         * compartmentId. This value can change, but the service logs the value that appeared at the
         * time of the audit event.
         *
         * <p>Example: {@code CompartmentA}
         *
         * @param compartmentName the value to set
         * @return this builder
         */
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }
        /** The name of the resource emitting the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource emitting the event.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or some
         * other ID for the resource emitting the event.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or some
         * other ID for the resource emitting the event.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The availability domain where the resource resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain where the resource resides.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. Exists for cross-compatibility only. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. Exists for cross-compatibility only. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonProperty("identity")
        private Identity identity;

        public Builder identity(Identity identity) {
            this.identity = identity;
            this.__explicitlySet__.add("identity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("request")
        private Request request;

        public Builder request(Request request) {
            this.request = request;
            this.__explicitlySet__.add("request");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("response")
        private Response response;

        public Builder response(Response response) {
            this.response = response;
            this.__explicitlySet__.add("response");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateChange")
        private StateChange stateChange;

        public Builder stateChange(StateChange stateChange) {
            this.stateChange = stateChange;
            this.__explicitlySet__.add("stateChange");
            return this;
        }
        /**
         * A container object for attribues unique to the resource emitting the event.
         *
         * <p>Example:
         *
         * <p>----- { "imageId": "ocid1.image.oc1.phx.<unique_ID>", "shape": "VM.Standard1.1",
         * "type": "CustomerVmi" } -----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, Object> additionalDetails;

        /**
         * A container object for attribues unique to the resource emitting the event.
         *
         * <p>Example:
         *
         * <p>----- { "imageId": "ocid1.image.oc1.phx.<unique_ID>", "shape": "VM.Standard1.1",
         * "type": "CustomerVmi" } -----
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, Object> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Data build() {
            Data model =
                    new Data(
                            this.eventGroupingId,
                            this.eventName,
                            this.compartmentId,
                            this.compartmentName,
                            this.resourceName,
                            this.resourceId,
                            this.availabilityDomain,
                            this.freeformTags,
                            this.definedTags,
                            this.identity,
                            this.request,
                            this.response,
                            this.stateChange,
                            this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Data model) {
            if (model.wasPropertyExplicitlySet("eventGroupingId")) {
                this.eventGroupingId(model.getEventGroupingId());
            }
            if (model.wasPropertyExplicitlySet("eventName")) {
                this.eventName(model.getEventName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentName")) {
                this.compartmentName(model.getCompartmentName());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("identity")) {
                this.identity(model.getIdentity());
            }
            if (model.wasPropertyExplicitlySet("request")) {
                this.request(model.getRequest());
            }
            if (model.wasPropertyExplicitlySet("response")) {
                this.response(model.getResponse());
            }
            if (model.wasPropertyExplicitlySet("stateChange")) {
                this.stateChange(model.getStateChange());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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
     * This value links multiple audit events that are part of the same API operation. For example,
     * a long running API operations that emit an event at the start and the end of an operation
     * would use the same value in this field for both events.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventGroupingId")
    private final String eventGroupingId;

    /**
     * This value links multiple audit events that are part of the same API operation. For example,
     * a long running API operations that emit an event at the start and the end of an operation
     * would use the same value in this field for both events.
     *
     * @return the value
     */
    public String getEventGroupingId() {
        return eventGroupingId;
    }

    /**
     * Name of the API operation that generated this event.
     *
     * <p>Example: {@code GetInstance}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    private final String eventName;

    /**
     * Name of the API operation that generated this event.
     *
     * <p>Example: {@code GetInstance}
     *
     * @return the value
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment of the resource emitting the event.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment of the resource emitting the event.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the compartment. This value is the friendly name associated with compartmentId.
     * This value can change, but the service logs the value that appeared at the time of the audit
     * event.
     *
     * <p>Example: {@code CompartmentA}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * The name of the compartment. This value is the friendly name associated with compartmentId.
     * This value can change, but the service logs the value that appeared at the time of the audit
     * event.
     *
     * <p>Example: {@code CompartmentA}
     *
     * @return the value
     */
    public String getCompartmentName() {
        return compartmentName;
    }

    /** The name of the resource emitting the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource emitting the event.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or some
     * other ID for the resource emitting the event.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or some
     * other ID for the resource emitting the event.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The availability domain where the resource resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where the resource resides.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. Exists for cross-compatibility only. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. Exists for cross-compatibility only. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("identity")
    private final Identity identity;

    public Identity getIdentity() {
        return identity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("request")
    private final Request request;

    public Request getRequest() {
        return request;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("response")
    private final Response response;

    public Response getResponse() {
        return response;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stateChange")
    private final StateChange stateChange;

    public StateChange getStateChange() {
        return stateChange;
    }

    /**
     * A container object for attribues unique to the resource emitting the event.
     *
     * <p>Example:
     *
     * <p>----- { "imageId": "ocid1.image.oc1.phx.<unique_ID>", "shape": "VM.Standard1.1", "type":
     * "CustomerVmi" } -----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, Object> additionalDetails;

    /**
     * A container object for attribues unique to the resource emitting the event.
     *
     * <p>Example:
     *
     * <p>----- { "imageId": "ocid1.image.oc1.phx.<unique_ID>", "shape": "VM.Standard1.1", "type":
     * "CustomerVmi" } -----
     *
     * @return the value
     */
    public java.util.Map<String, Object> getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("Data(");
        sb.append("super=").append(super.toString());
        sb.append("eventGroupingId=").append(String.valueOf(this.eventGroupingId));
        sb.append(", eventName=").append(String.valueOf(this.eventName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", identity=").append(String.valueOf(this.identity));
        sb.append(", request=").append(String.valueOf(this.request));
        sb.append(", response=").append(String.valueOf(this.response));
        sb.append(", stateChange=").append(String.valueOf(this.stateChange));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Data)) {
            return false;
        }

        Data other = (Data) o;
        return java.util.Objects.equals(this.eventGroupingId, other.eventGroupingId)
                && java.util.Objects.equals(this.eventName, other.eventName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.identity, other.identity)
                && java.util.Objects.equals(this.request, other.request)
                && java.util.Objects.equals(this.response, other.response)
                && java.util.Objects.equals(this.stateChange, other.stateChange)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.eventGroupingId == null ? 43 : this.eventGroupingId.hashCode());
        result = (result * PRIME) + (this.eventName == null ? 43 : this.eventName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.identity == null ? 43 : this.identity.hashCode());
        result = (result * PRIME) + (this.request == null ? 43 : this.request.hashCode());
        result = (result * PRIME) + (this.response == null ? 43 : this.response.hashCode());
        result = (result * PRIME) + (this.stateChange == null ? 43 : this.stateChange.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
