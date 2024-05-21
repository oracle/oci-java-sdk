/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Fleet Update Collection Resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = FsuCollection.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = GiCollection.class, name = "GI"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DbCollection.class, name = "DB")
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FsuCollection extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "serviceType",
        "compartmentId",
        "activeFsuCycle",
        "targetCount",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected FsuCollection(
            String id,
            String displayName,
            CollectionServiceTypes serviceType,
            String compartmentId,
            ActiveCycleDetails activeFsuCycle,
            Integer targetCount,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            CollectionLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.serviceType = serviceType;
        this.compartmentId = compartmentId;
        this.activeFsuCycle = activeFsuCycle;
        this.targetCount = targetCount;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    /**
     * OCID identifier for the Exadata Fleet Update Collection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID identifier for the Exadata Fleet Update Collection.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Exadata Fleet Update Collection resource display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Exadata Fleet Update Collection resource display name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Exadata service type for the target resource members.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final CollectionServiceTypes serviceType;

    /**
     * Exadata service type for the target resource members.
     *
     * @return the value
     **/
    public CollectionServiceTypes getServiceType() {
        return serviceType;
    }

    /**
     * Compartment Identifier
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("activeFsuCycle")
    private final ActiveCycleDetails activeFsuCycle;

    public ActiveCycleDetails getActiveFsuCycle() {
        return activeFsuCycle;
    }

    /**
     * Number of targets that are members of this Collection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
    private final Integer targetCount;

    /**
     * Number of targets that are members of this Collection.
     *
     * @return the value
     **/
    public Integer getTargetCount() {
        return targetCount;
    }

    /**
     * The time the Exadata Fleet Update Collection was created. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Exadata Fleet Update Collection was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Exadata Fleet Update Collection was updated. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Exadata Fleet Update Collection was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the Exadata Fleet Update Collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CollectionLifecycleStates lifecycleState;

    /**
     * The current state of the Exadata Fleet Update Collection.
     * @return the value
     **/
    public CollectionLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail.
     * For example, can be used to provide actionable information for a resource in Failed state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     * For example, can be used to provide actionable information for a resource in Failed state.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
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
        sb.append("FsuCollection(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", activeFsuCycle=").append(String.valueOf(this.activeFsuCycle));
        sb.append(", targetCount=").append(String.valueOf(this.targetCount));
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
        if (!(o instanceof FsuCollection)) {
            return false;
        }

        FsuCollection other = (FsuCollection) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.activeFsuCycle, other.activeFsuCycle)
                && java.util.Objects.equals(this.targetCount, other.targetCount)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.activeFsuCycle == null ? 43 : this.activeFsuCycle.hashCode());
        result = (result * PRIME) + (this.targetCount == null ? 43 : this.targetCount.hashCode());
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
