/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Drift status details for the indicated resource and stack. Includes actual and expected (defined) properties.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StackResourceDriftSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class StackResourceDriftSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceDriftStatus")
        private ResourceDriftStatus resourceDriftStatus;

        public Builder resourceDriftStatus(ResourceDriftStatus resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            this.__explicitlySet__.add("resourceDriftStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actualProperties")
        private java.util.Map<String, String> actualProperties;

        public Builder actualProperties(java.util.Map<String, String> actualProperties) {
            this.actualProperties = actualProperties;
            this.__explicitlySet__.add("actualProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedProperties")
        private java.util.Map<String, String> expectedProperties;

        public Builder expectedProperties(java.util.Map<String, String> expectedProperties) {
            this.expectedProperties = expectedProperties;
            this.__explicitlySet__.add("expectedProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDriftChecked")
        private java.util.Date timeDriftChecked;

        public Builder timeDriftChecked(java.util.Date timeDriftChecked) {
            this.timeDriftChecked = timeDriftChecked;
            this.__explicitlySet__.add("timeDriftChecked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StackResourceDriftSummary build() {
            StackResourceDriftSummary __instance__ =
                    new StackResourceDriftSummary(
                            stackId,
                            compartmentId,
                            resourceName,
                            resourceId,
                            resourceType,
                            resourceDriftStatus,
                            actualProperties,
                            expectedProperties,
                            timeDriftChecked);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StackResourceDriftSummary o) {
            Builder copiedBuilder =
                    stackId(o.getStackId())
                            .compartmentId(o.getCompartmentId())
                            .resourceName(o.getResourceName())
                            .resourceId(o.getResourceId())
                            .resourceType(o.getResourceType())
                            .resourceDriftStatus(o.getResourceDriftStatus())
                            .actualProperties(o.getActualProperties())
                            .expectedProperties(o.getExpectedProperties())
                            .timeDriftChecked(o.getTimeDriftChecked());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    String stackId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the stack is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name of the resource as defined in the stack.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource provisioned by Terraform.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * The provider resource type.
     * Must be supported by the [Oracle Cloud Infrastructure provider](https://www.terraform.io/docs/providers/oci/index.html).
     * Example: `oci_core_instance`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    String resourceType;
    /**
     * The drift status of the resource.
     * A drift status value indicates whether or not the actual state of the resource differs from the expected (defined) state for that resource.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ResourceDriftStatus {
        NotChecked("NOT_CHECKED"),
        InSync("IN_SYNC"),
        Modified("MODIFIED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The drift status of the resource.
     * A drift status value indicates whether or not the actual state of the resource differs from the expected (defined) state for that resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDriftStatus")
    ResourceDriftStatus resourceDriftStatus;

    /**
     * Actual values of properties that the stack defines for the indicated resource.
     * Each property and value is provided as a key-value pair.
     * The following example shows actual values for the resource's display name and server type:
     * `{\"display_name\": \"tf-default-dhcp-options-new\", \"options.0.server_type\": \"VcnLocalPlusInternet\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualProperties")
    java.util.Map<String, String> actualProperties;

    /**
     * Expected values of properties that the stack defines for the indicated resource.
     * Each property and value is provided as a key-value pair.
     * The following example shows expected (defined) values for the resource's display name and server type:
     * `{\"display_name\": \"tf-default-dhcp-options\", \"options.0.server_type\": \"VcnLocalPlusInternet\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedProperties")
    java.util.Map<String, String> expectedProperties;

    /**
     * Date and time when the drift detection was executed. Format defined by RFC3339.
     * Example: 2020-01-25T21:10:29.600Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDriftChecked")
    java.util.Date timeDriftChecked;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
