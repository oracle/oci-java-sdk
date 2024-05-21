/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An event is an occurrence of something of interest on a managed instance,
 * such as a kernel crash, software package update, or software source
 * update.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = Event.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SoftwareUpdateEvent.class,
        name = "SOFTWARE_UPDATE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = KernelOopsEvent.class,
        name = "KERNEL_OOPS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ManagementStationEvent.class,
        name = "MANAGEMENT_STATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SoftwareSourceEvent.class,
        name = "SOFTWARE_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = KernelCrashEvent.class,
        name = "KERNEL_CRASH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExploitAttemptEvent.class,
        name = "EXPLOIT_ATTEMPT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AgentEvent.class, name = "AGENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = KspliceUpdateEvent.class,
        name = "KSPLICE_UPDATE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Event extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "eventSummary",
        "compartmentId",
        "eventDetails",
        "resourceId",
        "systemDetails",
        "timeOccurred",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "isManagedByAutonomousLinux",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected Event(
            String id,
            String eventSummary,
            String compartmentId,
            String eventDetails,
            String resourceId,
            SystemDetails systemDetails,
            java.util.Date timeOccurred,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Boolean isManagedByAutonomousLinux,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.eventSummary = eventSummary;
        this.compartmentId = compartmentId;
        this.eventDetails = eventDetails;
        this.resourceId = resourceId;
        this.systemDetails = systemDetails;
        this.timeOccurred = timeOccurred;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the event.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Summary of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventSummary")
    private final String eventSummary;

    /**
     * Summary of the event.
     * @return the value
     **/
    public String getEventSummary() {
        return eventSummary;
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
     * Details of an event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventDetails")
    private final String eventDetails;

    /**
     * Details of an event.
     * @return the value
     **/
    public String getEventDetails() {
        return eventDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance or resource where the event occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance or resource where the event occurred.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("systemDetails")
    private final SystemDetails systemDetails;

    public SystemDetails getSystemDetails() {
        return systemDetails;
    }

    /**
     * The date and time that the event occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOccurred")
    private final java.util.Date timeOccurred;

    /**
     * The date and time that the event occurred.
     * @return the value
     **/
    public java.util.Date getTimeOccurred() {
        return timeOccurred;
    }

    /**
     * The date and time the Event was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Event was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the event was updated (in [RFC 3339](https://tools.ietf.org/html/rfc3339) format).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the event was updated (in [RFC 3339](https://tools.ietf.org/html/rfc3339) format).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the event.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the event.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Describes the current state of the event in more detail. For example, the
     * message can provide actionable information for a resource in the 'FAILED' state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Describes the current state of the event in more detail. For example, the
     * message can provide actionable information for a resource in the 'FAILED' state.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Indicates whether the event occurred on a resource that is managed by the Autonomous Linux service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedByAutonomousLinux")
    private final Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether the event occurred on a resource that is managed by the Autonomous Linux service.
     * @return the value
     **/
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("Event(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", eventSummary=").append(String.valueOf(this.eventSummary));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", eventDetails=").append(String.valueOf(this.eventDetails));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", systemDetails=").append(String.valueOf(this.systemDetails));
        sb.append(", timeOccurred=").append(String.valueOf(this.timeOccurred));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
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
        if (!(o instanceof Event)) {
            return false;
        }

        Event other = (Event) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.eventSummary, other.eventSummary)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.eventDetails, other.eventDetails)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.systemDetails, other.systemDetails)
                && java.util.Objects.equals(this.timeOccurred, other.timeOccurred)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
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
        result = (result * PRIME) + (this.eventSummary == null ? 43 : this.eventSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.eventDetails == null ? 43 : this.eventDetails.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.systemDetails == null ? 43 : this.systemDetails.hashCode());
        result = (result * PRIME) + (this.timeOccurred == null ? 43 : this.timeOccurred.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
