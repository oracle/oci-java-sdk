/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. A cross-connect group is a link aggregation
 * group (LAG), which can contain one or more {@link CrossConnect}. Customers who are colocated with
 * Oracle in a FastConnect location create and use cross-connect groups. For more information, see
 * [FastConnect
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
 *
 * <p>*Note:** If you're a provider who is setting up a physical connection to Oracle so customers
 * can use FastConnect over the connection, be aware that your connection is modeled the same way as
 * a colocated customer's (with {@code CrossConnect} and {@code CrossConnectGroup} objects, and so
 * on).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CrossConnectGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CrossConnectGroup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "lifecycleState",
        "customerReferenceName",
        "timeCreated",
        "macsecProperties",
        "ociPhysicalDeviceName",
        "ociLogicalDeviceName"
    })
    public CrossConnectGroup(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            String customerReferenceName,
            java.util.Date timeCreated,
            MacsecProperties macsecProperties,
            String ociPhysicalDeviceName,
            String ociLogicalDeviceName) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.customerReferenceName = customerReferenceName;
        this.timeCreated = timeCreated;
        this.macsecProperties = macsecProperties;
        this.ociPhysicalDeviceName = ociPhysicalDeviceName;
        this.ociLogicalDeviceName = ociLogicalDeviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the cross-connect group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the cross-connect group.
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** The cross-connect group's Oracle ID (OCID). */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The cross-connect group's Oracle ID (OCID).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The cross-connect group's current state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The cross-connect group's current state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A reference name or identifier for the physical fiber connection that this cross-connect
         * group uses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
        private String customerReferenceName;

        /**
         * A reference name or identifier for the physical fiber connection that this cross-connect
         * group uses.
         *
         * @param customerReferenceName the value to set
         * @return this builder
         */
        public Builder customerReferenceName(String customerReferenceName) {
            this.customerReferenceName = customerReferenceName;
            this.__explicitlySet__.add("customerReferenceName");
            return this;
        }
        /**
         * The date and time the cross-connect group was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cross-connect group was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
        private MacsecProperties macsecProperties;

        public Builder macsecProperties(MacsecProperties macsecProperties) {
            this.macsecProperties = macsecProperties;
            this.__explicitlySet__.add("macsecProperties");
            return this;
        }
        /** The FastConnect device that terminates the physical connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("ociPhysicalDeviceName")
        private String ociPhysicalDeviceName;

        /**
         * The FastConnect device that terminates the physical connection.
         *
         * @param ociPhysicalDeviceName the value to set
         * @return this builder
         */
        public Builder ociPhysicalDeviceName(String ociPhysicalDeviceName) {
            this.ociPhysicalDeviceName = ociPhysicalDeviceName;
            this.__explicitlySet__.add("ociPhysicalDeviceName");
            return this;
        }
        /**
         * The FastConnect device that terminates the logical connection. This device might be
         * different than the device that terminates the physical connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ociLogicalDeviceName")
        private String ociLogicalDeviceName;

        /**
         * The FastConnect device that terminates the logical connection. This device might be
         * different than the device that terminates the physical connection.
         *
         * @param ociLogicalDeviceName the value to set
         * @return this builder
         */
        public Builder ociLogicalDeviceName(String ociLogicalDeviceName) {
            this.ociLogicalDeviceName = ociLogicalDeviceName;
            this.__explicitlySet__.add("ociLogicalDeviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectGroup build() {
            CrossConnectGroup model =
                    new CrossConnectGroup(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.lifecycleState,
                            this.customerReferenceName,
                            this.timeCreated,
                            this.macsecProperties,
                            this.ociPhysicalDeviceName,
                            this.ociLogicalDeviceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectGroup model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("customerReferenceName")) {
                this.customerReferenceName(model.getCustomerReferenceName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("macsecProperties")) {
                this.macsecProperties(model.getMacsecProperties());
            }
            if (model.wasPropertyExplicitlySet("ociPhysicalDeviceName")) {
                this.ociPhysicalDeviceName(model.getOciPhysicalDeviceName());
            }
            if (model.wasPropertyExplicitlySet("ociLogicalDeviceName")) {
                this.ociLogicalDeviceName(model.getOciLogicalDeviceName());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the cross-connect group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the cross-connect group.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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

    /** The cross-connect group's Oracle ID (OCID). */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The cross-connect group's Oracle ID (OCID).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The cross-connect group's current state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Provisioned("PROVISIONED"),
        Inactive("INACTIVE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /** The cross-connect group's current state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The cross-connect group's current state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * group uses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerReferenceName")
    private final String customerReferenceName;

    /**
     * A reference name or identifier for the physical fiber connection that this cross-connect
     * group uses.
     *
     * @return the value
     */
    public String getCustomerReferenceName() {
        return customerReferenceName;
    }

    /**
     * The date and time the cross-connect group was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cross-connect group was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("macsecProperties")
    private final MacsecProperties macsecProperties;

    public MacsecProperties getMacsecProperties() {
        return macsecProperties;
    }

    /** The FastConnect device that terminates the physical connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("ociPhysicalDeviceName")
    private final String ociPhysicalDeviceName;

    /**
     * The FastConnect device that terminates the physical connection.
     *
     * @return the value
     */
    public String getOciPhysicalDeviceName() {
        return ociPhysicalDeviceName;
    }

    /**
     * The FastConnect device that terminates the logical connection. This device might be different
     * than the device that terminates the physical connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ociLogicalDeviceName")
    private final String ociLogicalDeviceName;

    /**
     * The FastConnect device that terminates the logical connection. This device might be different
     * than the device that terminates the physical connection.
     *
     * @return the value
     */
    public String getOciLogicalDeviceName() {
        return ociLogicalDeviceName;
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
        sb.append("CrossConnectGroup(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", customerReferenceName=").append(String.valueOf(this.customerReferenceName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", macsecProperties=").append(String.valueOf(this.macsecProperties));
        sb.append(", ociPhysicalDeviceName=").append(String.valueOf(this.ociPhysicalDeviceName));
        sb.append(", ociLogicalDeviceName=").append(String.valueOf(this.ociLogicalDeviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnectGroup)) {
            return false;
        }

        CrossConnectGroup other = (CrossConnectGroup) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.customerReferenceName, other.customerReferenceName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.macsecProperties, other.macsecProperties)
                && java.util.Objects.equals(this.ociPhysicalDeviceName, other.ociPhysicalDeviceName)
                && java.util.Objects.equals(this.ociLogicalDeviceName, other.ociLogicalDeviceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.customerReferenceName == null
                                ? 43
                                : this.customerReferenceName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.macsecProperties == null ? 43 : this.macsecProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.ociPhysicalDeviceName == null
                                ? 43
                                : this.ociPhysicalDeviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.ociLogicalDeviceName == null
                                ? 43
                                : this.ociLogicalDeviceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
