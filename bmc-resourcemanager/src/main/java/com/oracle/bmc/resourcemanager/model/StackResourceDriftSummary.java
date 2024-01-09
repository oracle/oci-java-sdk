/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Drift status details for the indicated resource and stack. Includes actual and expected (defined)
 * properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StackResourceDriftSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StackResourceDriftSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stackId",
        "compartmentId",
        "resourceName",
        "resourceId",
        "resourceType",
        "resourceDriftStatus",
        "actualProperties",
        "expectedProperties",
        "timeDriftChecked"
    })
    public StackResourceDriftSummary(
            String stackId,
            String compartmentId,
            String resourceName,
            String resourceId,
            String resourceType,
            ResourceDriftStatus resourceDriftStatus,
            java.util.Map<String, String> actualProperties,
            java.util.Map<String, String> expectedProperties,
            java.util.Date timeDriftChecked) {
        super();
        this.stackId = stackId;
        this.compartmentId = compartmentId;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.resourceDriftStatus = resourceDriftStatus;
        this.actualProperties = actualProperties;
        this.expectedProperties = expectedProperties;
        this.timeDriftChecked = timeDriftChecked;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the stack.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the stack.
         *
         * @param stackId the value to set
         * @return this builder
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment where the stack is located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment where the stack is located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the resource as defined in the stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource as defined in the stack.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource provisioned by Terraform.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource provisioned by Terraform.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
         * provider](https://www.terraform.io/docs/providers/oci/index.html). Example: {@code
         * oci_core_instance}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
         * provider](https://www.terraform.io/docs/providers/oci/index.html). Example: {@code
         * oci_core_instance}
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The drift status of the resource. A drift status value indicates whether or not the
         * actual state of the resource differs from the expected (defined) state for that resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceDriftStatus")
        private ResourceDriftStatus resourceDriftStatus;

        /**
         * The drift status of the resource. A drift status value indicates whether or not the
         * actual state of the resource differs from the expected (defined) state for that resource.
         *
         * @param resourceDriftStatus the value to set
         * @return this builder
         */
        public Builder resourceDriftStatus(ResourceDriftStatus resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            this.__explicitlySet__.add("resourceDriftStatus");
            return this;
        }
        /**
         * Actual values of properties that the stack defines for the indicated resource. Each
         * property and value is provided as a key-value pair. The following example shows actual
         * values for the resource's display name and server type: {@code {"display_name":
         * "tf-default-dhcp-options-new", "options.0.server_type": "VcnLocalPlusInternet"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actualProperties")
        private java.util.Map<String, String> actualProperties;

        /**
         * Actual values of properties that the stack defines for the indicated resource. Each
         * property and value is provided as a key-value pair. The following example shows actual
         * values for the resource's display name and server type: {@code {"display_name":
         * "tf-default-dhcp-options-new", "options.0.server_type": "VcnLocalPlusInternet"}}
         *
         * @param actualProperties the value to set
         * @return this builder
         */
        public Builder actualProperties(java.util.Map<String, String> actualProperties) {
            this.actualProperties = actualProperties;
            this.__explicitlySet__.add("actualProperties");
            return this;
        }
        /**
         * Expected values of properties that the stack defines for the indicated resource. Each
         * property and value is provided as a key-value pair. The following example shows expected
         * (defined) values for the resource's display name and server type: {@code {"display_name":
         * "tf-default-dhcp-options", "options.0.server_type": "VcnLocalPlusInternet"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedProperties")
        private java.util.Map<String, String> expectedProperties;

        /**
         * Expected values of properties that the stack defines for the indicated resource. Each
         * property and value is provided as a key-value pair. The following example shows expected
         * (defined) values for the resource's display name and server type: {@code {"display_name":
         * "tf-default-dhcp-options", "options.0.server_type": "VcnLocalPlusInternet"}}
         *
         * @param expectedProperties the value to set
         * @return this builder
         */
        public Builder expectedProperties(java.util.Map<String, String> expectedProperties) {
            this.expectedProperties = expectedProperties;
            this.__explicitlySet__.add("expectedProperties");
            return this;
        }
        /**
         * The date and time when the drift detection was executed. Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDriftChecked")
        private java.util.Date timeDriftChecked;

        /**
         * The date and time when the drift detection was executed. Format is defined by RFC3339.
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeDriftChecked the value to set
         * @return this builder
         */
        public Builder timeDriftChecked(java.util.Date timeDriftChecked) {
            this.timeDriftChecked = timeDriftChecked;
            this.__explicitlySet__.add("timeDriftChecked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StackResourceDriftSummary build() {
            StackResourceDriftSummary model =
                    new StackResourceDriftSummary(
                            this.stackId,
                            this.compartmentId,
                            this.resourceName,
                            this.resourceId,
                            this.resourceType,
                            this.resourceDriftStatus,
                            this.actualProperties,
                            this.expectedProperties,
                            this.timeDriftChecked);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StackResourceDriftSummary model) {
            if (model.wasPropertyExplicitlySet("stackId")) {
                this.stackId(model.getStackId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceDriftStatus")) {
                this.resourceDriftStatus(model.getResourceDriftStatus());
            }
            if (model.wasPropertyExplicitlySet("actualProperties")) {
                this.actualProperties(model.getActualProperties());
            }
            if (model.wasPropertyExplicitlySet("expectedProperties")) {
                this.expectedProperties(model.getExpectedProperties());
            }
            if (model.wasPropertyExplicitlySet("timeDriftChecked")) {
                this.timeDriftChecked(model.getTimeDriftChecked());
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
     * the stack.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    private final String stackId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the stack.
     *
     * @return the value
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment where the stack is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment where the stack is located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the resource as defined in the stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource as defined in the stack.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource provisioned by Terraform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource provisioned by Terraform.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
     * provider](https://www.terraform.io/docs/providers/oci/index.html). Example: {@code
     * oci_core_instance}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
     * provider](https://www.terraform.io/docs/providers/oci/index.html). Example: {@code
     * oci_core_instance}
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The drift status of the resource. A drift status value indicates whether or not the actual
     * state of the resource differs from the expected (defined) state for that resource.
     */
    public enum ResourceDriftStatus implements com.oracle.bmc.http.internal.BmcEnum {
        NotChecked("NOT_CHECKED"),
        InSync("IN_SYNC"),
        Modified("MODIFIED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceDriftStatus.class);

        private final String value;
        private static java.util.Map<String, ResourceDriftStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceDriftStatus v : ResourceDriftStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceDriftStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceDriftStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceDriftStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The drift status of the resource. A drift status value indicates whether or not the actual
     * state of the resource differs from the expected (defined) state for that resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDriftStatus")
    private final ResourceDriftStatus resourceDriftStatus;

    /**
     * The drift status of the resource. A drift status value indicates whether or not the actual
     * state of the resource differs from the expected (defined) state for that resource.
     *
     * @return the value
     */
    public ResourceDriftStatus getResourceDriftStatus() {
        return resourceDriftStatus;
    }

    /**
     * Actual values of properties that the stack defines for the indicated resource. Each property
     * and value is provided as a key-value pair. The following example shows actual values for the
     * resource's display name and server type: {@code {"display_name":
     * "tf-default-dhcp-options-new", "options.0.server_type": "VcnLocalPlusInternet"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actualProperties")
    private final java.util.Map<String, String> actualProperties;

    /**
     * Actual values of properties that the stack defines for the indicated resource. Each property
     * and value is provided as a key-value pair. The following example shows actual values for the
     * resource's display name and server type: {@code {"display_name":
     * "tf-default-dhcp-options-new", "options.0.server_type": "VcnLocalPlusInternet"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getActualProperties() {
        return actualProperties;
    }

    /**
     * Expected values of properties that the stack defines for the indicated resource. Each
     * property and value is provided as a key-value pair. The following example shows expected
     * (defined) values for the resource's display name and server type: {@code {"display_name":
     * "tf-default-dhcp-options", "options.0.server_type": "VcnLocalPlusInternet"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedProperties")
    private final java.util.Map<String, String> expectedProperties;

    /**
     * Expected values of properties that the stack defines for the indicated resource. Each
     * property and value is provided as a key-value pair. The following example shows expected
     * (defined) values for the resource's display name and server type: {@code {"display_name":
     * "tf-default-dhcp-options", "options.0.server_type": "VcnLocalPlusInternet"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getExpectedProperties() {
        return expectedProperties;
    }

    /**
     * The date and time when the drift detection was executed. Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDriftChecked")
    private final java.util.Date timeDriftChecked;

    /**
     * The date and time when the drift detection was executed. Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeDriftChecked() {
        return timeDriftChecked;
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
        sb.append("StackResourceDriftSummary(");
        sb.append("super=").append(super.toString());
        sb.append("stackId=").append(String.valueOf(this.stackId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceDriftStatus=").append(String.valueOf(this.resourceDriftStatus));
        sb.append(", actualProperties=").append(String.valueOf(this.actualProperties));
        sb.append(", expectedProperties=").append(String.valueOf(this.expectedProperties));
        sb.append(", timeDriftChecked=").append(String.valueOf(this.timeDriftChecked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StackResourceDriftSummary)) {
            return false;
        }

        StackResourceDriftSummary other = (StackResourceDriftSummary) o;
        return java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceDriftStatus, other.resourceDriftStatus)
                && java.util.Objects.equals(this.actualProperties, other.actualProperties)
                && java.util.Objects.equals(this.expectedProperties, other.expectedProperties)
                && java.util.Objects.equals(this.timeDriftChecked, other.timeDriftChecked)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceDriftStatus == null
                                ? 43
                                : this.resourceDriftStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.actualProperties == null ? 43 : this.actualProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedProperties == null
                                ? 43
                                : this.expectedProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDriftChecked == null ? 43 : this.timeDriftChecked.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
