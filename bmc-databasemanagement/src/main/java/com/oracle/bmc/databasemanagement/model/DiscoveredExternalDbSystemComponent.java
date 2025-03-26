/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external DB system component.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "componentType",
    defaultImpl = DiscoveredExternalDbSystemComponent.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalCluster.class,
        name = "CLUSTER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalDbHome.class,
        name = "DATABASE_HOME"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalDatabase.class,
        name = "DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalPluggableDatabase.class,
        name = "PLUGGABLE_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalClusterInstance.class,
        name = "CLUSTER_INSTANCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalListener.class,
        name = "LISTENER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalDbNode.class,
        name = "DATABASE_NODE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalAsm.class,
        name = "ASM"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DiscoveredExternalAsmInstance.class,
        name = "ASM_INSTANCE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DiscoveredExternalDbSystemComponent
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "componentId",
        "displayName",
        "componentName",
        "resourceId",
        "isSelectedForMonitoring",
        "status",
        "associatedComponents"
    })
    protected DiscoveredExternalDbSystemComponent(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedComponent> associatedComponents) {
        super();
        this.componentId = componentId;
        this.displayName = displayName;
        this.componentName = componentName;
        this.resourceId = resourceId;
        this.isSelectedForMonitoring = isSelectedForMonitoring;
        this.status = status;
        this.associatedComponents = associatedComponents;
    }

    /**
     * The identifier of the discovered DB system component.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("componentId")
    private final String componentId;

    /**
     * The identifier of the discovered DB system component.
     * @return the value
     **/
    public String getComponentId() {
        return componentId;
    }

    /**
     * The user-friendly name for the discovered DB system component. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the discovered DB system component. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the discovered DB system component.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * The name of the discovered DB system component.
     * @return the value
     **/
    public String getComponentName() {
        return componentName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the existing OCI resource matching the discovered DB system component.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the existing OCI resource matching the discovered DB system component.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Indicates whether the DB system component should be provisioned as an OCI resource or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSelectedForMonitoring")
    private final Boolean isSelectedForMonitoring;

    /**
     * Indicates whether the DB system component should be provisioned as an OCI resource or not.
     * @return the value
     **/
    public Boolean getIsSelectedForMonitoring() {
        return isSelectedForMonitoring;
    }

    /**
     * The state of the discovered DB system component.
     **/
    public enum Status {
        New("NEW"),
        Existing("EXISTING"),
        MarkedForDeletion("MARKED_FOR_DELETION"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the discovered DB system component.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The state of the discovered DB system component.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The list of associated components.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedComponents")
    private final java.util.List<AssociatedComponent> associatedComponents;

    /**
     * The list of associated components.
     * @return the value
     **/
    public java.util.List<AssociatedComponent> getAssociatedComponents() {
        return associatedComponents;
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
        sb.append("DiscoveredExternalDbSystemComponent(");
        sb.append("super=").append(super.toString());
        sb.append("componentId=").append(String.valueOf(this.componentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", isSelectedForMonitoring=")
                .append(String.valueOf(this.isSelectedForMonitoring));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", associatedComponents=").append(String.valueOf(this.associatedComponents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredExternalDbSystemComponent)) {
            return false;
        }

        DiscoveredExternalDbSystemComponent other = (DiscoveredExternalDbSystemComponent) o;
        return java.util.Objects.equals(this.componentId, other.componentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(
                        this.isSelectedForMonitoring, other.isSelectedForMonitoring)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.associatedComponents, other.associatedComponents)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.componentId == null ? 43 : this.componentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isSelectedForMonitoring == null
                                ? 43
                                : this.isSelectedForMonitoring.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedComponents == null
                                ? 43
                                : this.associatedComponents.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
