/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A confirmed target within a fleet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FleetTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetTarget extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "version",
        "product",
        "resource",
        "complianceState",
        "timeOfLastSuccessfulDiscovery",
        "timeOfLastDiscoveryAttempt",
        "isLastDiscoveryAttemptSuccessful",
        "lifecycleState",
        "systemTags"
    })
    public FleetTarget(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            String version,
            String product,
            TargetResource resource,
            ComplianceState complianceState,
            java.util.Date timeOfLastSuccessfulDiscovery,
            java.util.Date timeOfLastDiscoveryAttempt,
            Boolean isLastDiscoveryAttemptSuccessful,
            LifecycleState lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.version = version;
        this.product = product;
        this.resource = resource;
        this.complianceState = complianceState;
        this.timeOfLastSuccessfulDiscovery = timeOfLastSuccessfulDiscovery;
        this.timeOfLastDiscoveryAttempt = timeOfLastDiscoveryAttempt;
        this.isLastDiscoveryAttemptSuccessful = isLastDiscoveryAttemptSuccessful;
        this.lifecycleState = lifecycleState;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Tenancy OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Current version of target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Current version of target.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Product to which the target belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        /**
         * Product to which the target belongs to.
         * @param product the value to set
         * @return this builder
         **/
        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resource")
        private TargetResource resource;

        public Builder resource(TargetResource resource) {
            this.resource = resource;
            this.__explicitlySet__.add("resource");
            return this;
        }
        /**
         * The last known compliance state of the target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * The last known compliance state of the target.
         * @param complianceState the value to set
         * @return this builder
         **/
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /**
         * The time when the last successful discovery was made.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastSuccessfulDiscovery")
        private java.util.Date timeOfLastSuccessfulDiscovery;

        /**
         * The time when the last successful discovery was made.
         * @param timeOfLastSuccessfulDiscovery the value to set
         * @return this builder
         **/
        public Builder timeOfLastSuccessfulDiscovery(java.util.Date timeOfLastSuccessfulDiscovery) {
            this.timeOfLastSuccessfulDiscovery = timeOfLastSuccessfulDiscovery;
            this.__explicitlySet__.add("timeOfLastSuccessfulDiscovery");
            return this;
        }
        /**
         * The time when last discovery was attempted.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastDiscoveryAttempt")
        private java.util.Date timeOfLastDiscoveryAttempt;

        /**
         * The time when last discovery was attempted.
         * @param timeOfLastDiscoveryAttempt the value to set
         * @return this builder
         **/
        public Builder timeOfLastDiscoveryAttempt(java.util.Date timeOfLastDiscoveryAttempt) {
            this.timeOfLastDiscoveryAttempt = timeOfLastDiscoveryAttempt;
            this.__explicitlySet__.add("timeOfLastDiscoveryAttempt");
            return this;
        }
        /**
         * A boolean flag that represents whether the last discovery attempt was successful.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLastDiscoveryAttemptSuccessful")
        private Boolean isLastDiscoveryAttemptSuccessful;

        /**
         * A boolean flag that represents whether the last discovery attempt was successful.
         * @param isLastDiscoveryAttemptSuccessful the value to set
         * @return this builder
         **/
        public Builder isLastDiscoveryAttemptSuccessful(Boolean isLastDiscoveryAttemptSuccessful) {
            this.isLastDiscoveryAttemptSuccessful = isLastDiscoveryAttemptSuccessful;
            this.__explicitlySet__.add("isLastDiscoveryAttemptSuccessful");
            return this;
        }
        /**
         * The current state of the FleetTarget.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the FleetTarget.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetTarget build() {
            FleetTarget model =
                    new FleetTarget(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.version,
                            this.product,
                            this.resource,
                            this.complianceState,
                            this.timeOfLastSuccessfulDiscovery,
                            this.timeOfLastDiscoveryAttempt,
                            this.isLastDiscoveryAttemptSuccessful,
                            this.lifecycleState,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetTarget model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("resource")) {
                this.resource(model.getResource());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastSuccessfulDiscovery")) {
                this.timeOfLastSuccessfulDiscovery(model.getTimeOfLastSuccessfulDiscovery());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastDiscoveryAttempt")) {
                this.timeOfLastDiscoveryAttempt(model.getTimeOfLastDiscoveryAttempt());
            }
            if (model.wasPropertyExplicitlySet("isLastDiscoveryAttemptSuccessful")) {
                this.isLastDiscoveryAttemptSuccessful(model.getIsLastDiscoveryAttemptSuccessful());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Tenancy OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Current version of target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Current version of target.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Product to which the target belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final String product;

    /**
     * Product to which the target belongs to.
     * @return the value
     **/
    public String getProduct() {
        return product;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    private final TargetResource resource;

    public TargetResource getResource() {
        return resource;
    }

    /**
     * The last known compliance state of the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * The last known compliance state of the target.
     * @return the value
     **/
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /**
     * The time when the last successful discovery was made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastSuccessfulDiscovery")
    private final java.util.Date timeOfLastSuccessfulDiscovery;

    /**
     * The time when the last successful discovery was made.
     * @return the value
     **/
    public java.util.Date getTimeOfLastSuccessfulDiscovery() {
        return timeOfLastSuccessfulDiscovery;
    }

    /**
     * The time when last discovery was attempted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastDiscoveryAttempt")
    private final java.util.Date timeOfLastDiscoveryAttempt;

    /**
     * The time when last discovery was attempted.
     * @return the value
     **/
    public java.util.Date getTimeOfLastDiscoveryAttempt() {
        return timeOfLastDiscoveryAttempt;
    }

    /**
     * A boolean flag that represents whether the last discovery attempt was successful.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLastDiscoveryAttemptSuccessful")
    private final Boolean isLastDiscoveryAttemptSuccessful;

    /**
     * A boolean flag that represents whether the last discovery attempt was successful.
     * @return the value
     **/
    public Boolean getIsLastDiscoveryAttemptSuccessful() {
        return isLastDiscoveryAttemptSuccessful;
    }

    /**
     * The current state of the FleetTarget.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Deleted("DELETED"),
        Failed("FAILED"),
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
    /**
     * The current state of the FleetTarget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the FleetTarget.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("FleetTarget(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", resource=").append(String.valueOf(this.resource));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", timeOfLastSuccessfulDiscovery=")
                .append(String.valueOf(this.timeOfLastSuccessfulDiscovery));
        sb.append(", timeOfLastDiscoveryAttempt=")
                .append(String.valueOf(this.timeOfLastDiscoveryAttempt));
        sb.append(", isLastDiscoveryAttemptSuccessful=")
                .append(String.valueOf(this.isLastDiscoveryAttemptSuccessful));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetTarget)) {
            return false;
        }

        FleetTarget other = (FleetTarget) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.resource, other.resource)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(
                        this.timeOfLastSuccessfulDiscovery, other.timeOfLastSuccessfulDiscovery)
                && java.util.Objects.equals(
                        this.timeOfLastDiscoveryAttempt, other.timeOfLastDiscoveryAttempt)
                && java.util.Objects.equals(
                        this.isLastDiscoveryAttemptSuccessful,
                        other.isLastDiscoveryAttemptSuccessful)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.resource == null ? 43 : this.resource.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastSuccessfulDiscovery == null
                                ? 43
                                : this.timeOfLastSuccessfulDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastDiscoveryAttempt == null
                                ? 43
                                : this.timeOfLastDiscoveryAttempt.hashCode());
        result =
                (result * PRIME)
                        + (this.isLastDiscoveryAttemptSuccessful == null
                                ? 43
                                : this.isLastDiscoveryAttemptSuccessful.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
