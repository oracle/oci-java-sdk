/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Diagnosis of a resource needed by the fleet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetDiagnosisSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetDiagnosisSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceType",
        "resourceId",
        "resourceState",
        "resourceDiagnosis"
    })
    public FleetDiagnosisSummary(
            ResourceType resourceType,
            String resourceId,
            ResourceState resourceState,
            String resourceDiagnosis) {
        super();
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.resourceState = resourceState;
        this.resourceDiagnosis = resourceDiagnosis;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the resource needed by the fleet.
         * This is the role of a resource in the fleet. Use the OCID to determine the actual OCI
         * resource type such as log group or log.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * The type of the resource needed by the fleet.
         * This is the role of a resource in the fleet. Use the OCID to determine the actual OCI
         * resource type such as log group or log.
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The OCID of the external resouce needed by the fleet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the external resouce needed by the fleet.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The state of the resource. The resource state is ACTIVE when it works properly for the fleet.
         * In case it would cause an issue for the fleet function, the state is INACTIVE.
         * When JMS can't locate the resource, the state is NOT_FOUND.
         * OTHER covers other cases, such as a temporarily network issue that prevents JMS from detecting the
         * resource. Check the resourceDiagnosis for details.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceState")
        private ResourceState resourceState;

        /**
         * The state of the resource. The resource state is ACTIVE when it works properly for the fleet.
         * In case it would cause an issue for the fleet function, the state is INACTIVE.
         * When JMS can't locate the resource, the state is NOT_FOUND.
         * OTHER covers other cases, such as a temporarily network issue that prevents JMS from detecting the
         * resource. Check the resourceDiagnosis for details.
         *
         * @param resourceState the value to set
         * @return this builder
         **/
        public Builder resourceState(ResourceState resourceState) {
            this.resourceState = resourceState;
            this.__explicitlySet__.add("resourceState");
            return this;
        }
        /**
         * The diagnosis message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceDiagnosis")
        private String resourceDiagnosis;

        /**
         * The diagnosis message.
         * @param resourceDiagnosis the value to set
         * @return this builder
         **/
        public Builder resourceDiagnosis(String resourceDiagnosis) {
            this.resourceDiagnosis = resourceDiagnosis;
            this.__explicitlySet__.add("resourceDiagnosis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetDiagnosisSummary build() {
            FleetDiagnosisSummary model =
                    new FleetDiagnosisSummary(
                            this.resourceType,
                            this.resourceId,
                            this.resourceState,
                            this.resourceDiagnosis);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetDiagnosisSummary model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceState")) {
                this.resourceState(model.getResourceState());
            }
            if (model.wasPropertyExplicitlySet("resourceDiagnosis")) {
                this.resourceDiagnosis(model.getResourceDiagnosis());
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
     * The type of the resource needed by the fleet.
     * This is the role of a resource in the fleet. Use the OCID to determine the actual OCI
     * resource type such as log group or log.
     *
     **/
    public enum ResourceType {
        InventoryLog("INVENTORY_LOG"),
        OperationLog("OPERATION_LOG"),
        CryptoSummarizedLog("CRYPTO_SUMMARIZED_LOG"),
        AnalysisOssBucket("ANALYSIS_OSS_BUCKET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the resource needed by the fleet.
     * This is the role of a resource in the fleet. Use the OCID to determine the actual OCI
     * resource type such as log group or log.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * The type of the resource needed by the fleet.
     * This is the role of a resource in the fleet. Use the OCID to determine the actual OCI
     * resource type such as log group or log.
     *
     * @return the value
     **/
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * The OCID of the external resouce needed by the fleet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the external resouce needed by the fleet.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The state of the resource. The resource state is ACTIVE when it works properly for the fleet.
     * In case it would cause an issue for the fleet function, the state is INACTIVE.
     * When JMS can't locate the resource, the state is NOT_FOUND.
     * OTHER covers other cases, such as a temporarily network issue that prevents JMS from detecting the
     * resource. Check the resourceDiagnosis for details.
     *
     **/
    public enum ResourceState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        NotFound("NOT_FOUND"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceState.class);

        private final String value;
        private static java.util.Map<String, ResourceState> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceState v : ResourceState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the resource. The resource state is ACTIVE when it works properly for the fleet.
     * In case it would cause an issue for the fleet function, the state is INACTIVE.
     * When JMS can't locate the resource, the state is NOT_FOUND.
     * OTHER covers other cases, such as a temporarily network issue that prevents JMS from detecting the
     * resource. Check the resourceDiagnosis for details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceState")
    private final ResourceState resourceState;

    /**
     * The state of the resource. The resource state is ACTIVE when it works properly for the fleet.
     * In case it would cause an issue for the fleet function, the state is INACTIVE.
     * When JMS can't locate the resource, the state is NOT_FOUND.
     * OTHER covers other cases, such as a temporarily network issue that prevents JMS from detecting the
     * resource. Check the resourceDiagnosis for details.
     *
     * @return the value
     **/
    public ResourceState getResourceState() {
        return resourceState;
    }

    /**
     * The diagnosis message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDiagnosis")
    private final String resourceDiagnosis;

    /**
     * The diagnosis message.
     * @return the value
     **/
    public String getResourceDiagnosis() {
        return resourceDiagnosis;
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
        sb.append("FleetDiagnosisSummary(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceState=").append(String.valueOf(this.resourceState));
        sb.append(", resourceDiagnosis=").append(String.valueOf(this.resourceDiagnosis));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetDiagnosisSummary)) {
            return false;
        }

        FleetDiagnosisSummary other = (FleetDiagnosisSummary) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceState, other.resourceState)
                && java.util.Objects.equals(this.resourceDiagnosis, other.resourceDiagnosis)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceState == null ? 43 : this.resourceState.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceDiagnosis == null ? 43 : this.resourceDiagnosis.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
