/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Exadata insight resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource",
    defaultImpl = ExadataInsight.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EmManagedExternalExadataInsight.class,
        name = "EM_MANAGED_EXTERNAL_EXADATA"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExadataInsight {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "exadataName",
        "exadataDisplayName",
        "exadataType",
        "exadataRackType",
        "isVirtualizedExadata",
        "status",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails"
    })
    protected ExadataInsight(
            String id,
            String compartmentId,
            String exadataName,
            String exadataDisplayName,
            ExadataType exadataType,
            ExadataRackType exadataRackType,
            Boolean isVirtualizedExadata,
            ResourceStatus status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ExadataInsightLifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.exadataName = exadataName;
        this.exadataDisplayName = exadataDisplayName;
        this.exadataType = exadataType;
        this.exadataRackType = exadataRackType;
        this.isVirtualizedExadata = isVirtualizedExadata;
        this.status = status;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    /**
     * Exadata insight identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Exadata insight identifier
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Compartment identifier of the Exadata insight resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment identifier of the Exadata insight resource
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is unique amongst the Exadata systems managed by the same Enterprise Manager.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
    private final String exadataName;

    /**
     * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is unique amongst the Exadata systems managed by the same Enterprise Manager.
     * @return the value
     **/
    public String getExadataName() {
        return exadataName;
    }

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
    private final String exadataDisplayName;

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     * @return the value
     **/
    public String getExadataDisplayName() {
        return exadataDisplayName;
    }

    /**
     * Operations Insights internal representation of the the Exadata system type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
    private final ExadataType exadataType;

    /**
     * Operations Insights internal representation of the the Exadata system type.
     * @return the value
     **/
    public ExadataType getExadataType() {
        return exadataType;
    }

    /**
     * Exadata rack type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
    private final ExadataRackType exadataRackType;

    /**
     * Exadata rack type.
     * @return the value
     **/
    public ExadataRackType getExadataRackType() {
        return exadataRackType;
    }

    /**
     * true if virtualization is used in the Exadata system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVirtualizedExadata")
    private final Boolean isVirtualizedExadata;

    /**
     * true if virtualization is used in the Exadata system
     * @return the value
     **/
    public Boolean getIsVirtualizedExadata() {
        return isVirtualizedExadata;
    }

    /**
     * Indicates the status of an Exadata insight in Operations Insights
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ResourceStatus status;

    /**
     * Indicates the status of an Exadata insight in Operations Insights
     * @return the value
     **/
    public ResourceStatus getStatus() {
        return status;
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
     * The time the the Exadata insight was first enabled. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Exadata insight was first enabled. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Exadata insight was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Exadata insight was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ExadataInsightLifecycleState lifecycleState;

    /**
     * The current state of the Exadata insight.
     * @return the value
     **/
    public ExadataInsightLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("ExadataInsight(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", exadataName=").append(String.valueOf(this.exadataName));
        sb.append(", exadataDisplayName=").append(String.valueOf(this.exadataDisplayName));
        sb.append(", exadataType=").append(String.valueOf(this.exadataType));
        sb.append(", exadataRackType=").append(String.valueOf(this.exadataRackType));
        sb.append(", isVirtualizedExadata=").append(String.valueOf(this.isVirtualizedExadata));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsight)) {
            return false;
        }

        ExadataInsight other = (ExadataInsight) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.exadataName, other.exadataName)
                && java.util.Objects.equals(this.exadataDisplayName, other.exadataDisplayName)
                && java.util.Objects.equals(this.exadataType, other.exadataType)
                && java.util.Objects.equals(this.exadataRackType, other.exadataRackType)
                && java.util.Objects.equals(this.isVirtualizedExadata, other.isVirtualizedExadata)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.exadataName == null ? 43 : this.exadataName.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDisplayName == null
                                ? 43
                                : this.exadataDisplayName.hashCode());
        result = (result * PRIME) + (this.exadataType == null ? 43 : this.exadataType.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataRackType == null ? 43 : this.exadataRackType.hashCode());
        result =
                (result * PRIME)
                        + (this.isVirtualizedExadata == null
                                ? 43
                                : this.isVirtualizedExadata.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        return result;
    }
}
