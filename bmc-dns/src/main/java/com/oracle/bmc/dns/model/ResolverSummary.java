/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI DNS resolver. If the resolver has an attached VCN, the VCN will attempt to answer queries based on the
 * attached views in priority order. If the query does not match any of the attached views, the query will be
 * evaluated against the default view. If the default view does not match, the rules will be evaluated in
 * priority order. If no rules match the query, answers come from Internet DNS. A resolver may have a maximum of 10
 * resolver endpoints.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResolverSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResolverSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "attachedVcnId",
        "displayName",
        "freeformTags",
        "definedTags",
        "id",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "self",
        "defaultViewId",
        "isProtected"
    })
    public ResolverSummary(
            String compartmentId,
            String attachedVcnId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String id,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String self,
            String defaultViewId,
            Boolean isProtected) {
        super();
        this.compartmentId = compartmentId;
        this.attachedVcnId = attachedVcnId;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.id = id;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.self = self;
        this.defaultViewId = defaultViewId;
        this.isProtected = isProtected;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the owning compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the owning compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the attached VCN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachedVcnId")
        private String attachedVcnId;

        /**
         * The OCID of the attached VCN.
         *
         * @param attachedVcnId the value to set
         * @return this builder
         **/
        public Builder attachedVcnId(String attachedVcnId) {
            this.attachedVcnId = attachedVcnId;
            this.__explicitlySet__.add("attachedVcnId");
            return this;
        }
        /**
         * The display name of the resolver.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the resolver.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The OCID of the resolver.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resolver.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format
         * with a Z offset, as defined by RFC 3339.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format
         * with a Z offset, as defined by RFC 3339.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the resource was last updated in "YYYY-MM-ddThh:mm:ssZ"
         * format with a Z offset, as defined by RFC 3339.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was last updated in "YYYY-MM-ddThh:mm:ssZ"
         * format with a Z offset, as defined by RFC 3339.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The canonical absolute URL of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        /**
         * The canonical absolute URL of the resource.
         * @param self the value to set
         * @return this builder
         **/
        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }
        /**
         * The OCID of the default view.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultViewId")
        private String defaultViewId;

        /**
         * The OCID of the default view.
         *
         * @param defaultViewId the value to set
         * @return this builder
         **/
        public Builder defaultViewId(String defaultViewId) {
            this.defaultViewId = defaultViewId;
            this.__explicitlySet__.add("defaultViewId");
            return this;
        }
        /**
         * A Boolean flag indicating whether or not parts of the resource are unable to be explicitly managed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
        private Boolean isProtected;

        /**
         * A Boolean flag indicating whether or not parts of the resource are unable to be explicitly managed.
         *
         * @param isProtected the value to set
         * @return this builder
         **/
        public Builder isProtected(Boolean isProtected) {
            this.isProtected = isProtected;
            this.__explicitlySet__.add("isProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResolverSummary build() {
            ResolverSummary model =
                    new ResolverSummary(
                            this.compartmentId,
                            this.attachedVcnId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.id,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.self,
                            this.defaultViewId,
                            this.isProtected);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResolverSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("attachedVcnId")) {
                this.attachedVcnId(model.getAttachedVcnId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("self")) {
                this.self(model.getSelf());
            }
            if (model.wasPropertyExplicitlySet("defaultViewId")) {
                this.defaultViewId(model.getDefaultViewId());
            }
            if (model.wasPropertyExplicitlySet("isProtected")) {
                this.isProtected(model.getIsProtected());
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
     * The OCID of the owning compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the owning compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the attached VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedVcnId")
    private final String attachedVcnId;

    /**
     * The OCID of the attached VCN.
     *
     * @return the value
     **/
    public String getAttachedVcnId() {
        return attachedVcnId;
    }

    /**
     * The display name of the resolver.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the resolver.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The OCID of the resolver.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resolver.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format
     * with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format
     * with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was last updated in "YYYY-MM-ddThh:mm:ssZ"
     * format with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated in "YYYY-MM-ddThh:mm:ssZ"
     * format with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the resource.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),

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
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The canonical absolute URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    private final String self;

    /**
     * The canonical absolute URL of the resource.
     * @return the value
     **/
    public String getSelf() {
        return self;
    }

    /**
     * The OCID of the default view.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultViewId")
    private final String defaultViewId;

    /**
     * The OCID of the default view.
     *
     * @return the value
     **/
    public String getDefaultViewId() {
        return defaultViewId;
    }

    /**
     * A Boolean flag indicating whether or not parts of the resource are unable to be explicitly managed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
    private final Boolean isProtected;

    /**
     * A Boolean flag indicating whether or not parts of the resource are unable to be explicitly managed.
     *
     * @return the value
     **/
    public Boolean getIsProtected() {
        return isProtected;
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
        sb.append("ResolverSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", attachedVcnId=").append(String.valueOf(this.attachedVcnId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", self=").append(String.valueOf(this.self));
        sb.append(", defaultViewId=").append(String.valueOf(this.defaultViewId));
        sb.append(", isProtected=").append(String.valueOf(this.isProtected));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResolverSummary)) {
            return false;
        }

        ResolverSummary other = (ResolverSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.attachedVcnId, other.attachedVcnId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.self, other.self)
                && java.util.Objects.equals(this.defaultViewId, other.defaultViewId)
                && java.util.Objects.equals(this.isProtected, other.isProtected)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedVcnId == null ? 43 : this.attachedVcnId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.self == null ? 43 : this.self.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultViewId == null ? 43 : this.defaultViewId.hashCode());
        result = (result * PRIME) + (this.isProtected == null ? 43 : this.isProtected.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
