/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * The payload of the event. Information within {@code data} comes from the resource emitting the event.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Data.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Data {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("eventGroupingId")
        private String eventGroupingId;

        public Builder eventGroupingId(String eventGroupingId) {
            this.eventGroupingId = eventGroupingId;
            this.__explicitlySet__.add("eventGroupingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

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

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, Object> additionalDetails;

        public Builder additionalDetails(java.util.Map<String, Object> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Data build() {
            Data __instance__ =
                    new Data(
                            eventGroupingId,
                            eventName,
                            compartmentId,
                            compartmentName,
                            resourceName,
                            resourceId,
                            availabilityDomain,
                            freeformTags,
                            definedTags,
                            identity,
                            request,
                            response,
                            stateChange,
                            additionalDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Data o) {
            Builder copiedBuilder =
                    eventGroupingId(o.getEventGroupingId())
                            .eventName(o.getEventName())
                            .compartmentId(o.getCompartmentId())
                            .compartmentName(o.getCompartmentName())
                            .resourceName(o.getResourceName())
                            .resourceId(o.getResourceId())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .identity(o.getIdentity())
                            .request(o.getRequest())
                            .response(o.getResponse())
                            .stateChange(o.getStateChange())
                            .additionalDetails(o.getAdditionalDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * This value links multiple audit events that are part of the same API operation. For example,
     * a long running API operations that emit an event at the start and the end of an operation
     * would use the same value in this field for both events.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventGroupingId")
    String eventGroupingId;

    /**
     * Name of the API operation that generated this event.
     * <p>
     * Example: {@code GetInstance}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    String eventName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment of the resource
     * emitting the event.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name of the compartment. This value is the friendly name associated with compartmentId.
     * This value can change, but the service logs the value that appeared at the time of the audit
     * event.
     * <p>
     * Example: {@code CompartmentA}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    String compartmentName;

    /**
     * The name of the resource emitting the event.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * An [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) or some other ID for the resource
     * emitting the event.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * The availability domain where the resource resides.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name,
     * type, or namespace. Exists for cross-compatibility only. For more information,
     * see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonProperty("identity")
    Identity identity;

    @com.fasterxml.jackson.annotation.JsonProperty("request")
    Request request;

    @com.fasterxml.jackson.annotation.JsonProperty("response")
    Response response;

    @com.fasterxml.jackson.annotation.JsonProperty("stateChange")
    StateChange stateChange;

    /**
     * A container object for attribues unique to the resource emitting the event.
     * <p>
     * Example:
     * <p>
     * -----
     *     {
     *       "imageId": "ocid1.image.oc1.phx.<unique_ID>",
     *       "shape": "VM.Standard1.1",
     *       "type": "CustomerVmi"
     *     }
     *   -----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    java.util.Map<String, Object> additionalDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
