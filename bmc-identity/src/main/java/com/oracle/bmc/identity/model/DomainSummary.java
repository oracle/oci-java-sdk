/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) As the name suggests, a {@code DomainSummary} object contains information about a {@code Domain}.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DomainSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DomainSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "url",
        "homeRegionUrl",
        "homeRegion",
        "replicaRegions",
        "type",
        "licenseType",
        "isHiddenOnLogin",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public DomainSummary(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String url,
            String homeRegionUrl,
            String homeRegion,
            java.util.List<ReplicatedRegionDetails> replicaRegions,
            Type type,
            String licenseType,
            Boolean isHiddenOnLogin,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.url = url;
        this.homeRegionUrl = homeRegionUrl;
        this.homeRegion = homeRegion;
        this.replicaRegions = replicaRegions;
        this.type = type;
        this.licenseType = licenseType;
        this.isHiddenOnLogin = isHiddenOnLogin;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the identity domain.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment containing the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the identity domain.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The mutable display name of the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The mutable display name of the identity domain.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The identity domain description. You can have an empty description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The identity domain description. You can have an empty description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Region-agnostic identity domain URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * Region-agnostic identity domain URL.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * Region-specific identity domain URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("homeRegionUrl")
        private String homeRegionUrl;

        /**
         * Region-specific identity domain URL.
         * @param homeRegionUrl the value to set
         * @return this builder
         **/
        public Builder homeRegionUrl(String homeRegionUrl) {
            this.homeRegionUrl = homeRegionUrl;
            this.__explicitlySet__.add("homeRegionUrl");
            return this;
        }
        /**
         * The home region for the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
        private String homeRegion;

        /**
         * The home region for the identity domain.
         * @param homeRegion the value to set
         * @return this builder
         **/
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            this.__explicitlySet__.add("homeRegion");
            return this;
        }
        /**
         * The regions where replicas of the identity domain exist.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicaRegions")
        private java.util.List<ReplicatedRegionDetails> replicaRegions;

        /**
         * The regions where replicas of the identity domain exist.
         * @param replicaRegions the value to set
         * @return this builder
         **/
        public Builder replicaRegions(java.util.List<ReplicatedRegionDetails> replicaRegions) {
            this.replicaRegions = replicaRegions;
            this.__explicitlySet__.add("replicaRegions");
            return this;
        }
        /**
         * The type of the identity domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the identity domain.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The license type of the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private String licenseType;

        /**
         * The license type of the identity domain.
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /**
         * Indicates whether the identity domain is hidden on the sign-in screen or not.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHiddenOnLogin")
        private Boolean isHiddenOnLogin;

        /**
         * Indicates whether the identity domain is hidden on the sign-in screen or not.
         *
         * @param isHiddenOnLogin the value to set
         * @return this builder
         **/
        public Builder isHiddenOnLogin(Boolean isHiddenOnLogin) {
            this.isHiddenOnLogin = isHiddenOnLogin;
            this.__explicitlySet__.add("isHiddenOnLogin");
            return this;
        }
        /**
         * Date and time the identity domain was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the identity domain was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The current state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Any additional details about the current state of the identity domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * Any additional details about the current state of the identity domain.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainSummary build() {
            DomainSummary model =
                    new DomainSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.url,
                            this.homeRegionUrl,
                            this.homeRegion,
                            this.replicaRegions,
                            this.type,
                            this.licenseType,
                            this.isHiddenOnLogin,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("homeRegionUrl")) {
                this.homeRegionUrl(model.getHomeRegionUrl());
            }
            if (model.wasPropertyExplicitlySet("homeRegion")) {
                this.homeRegion(model.getHomeRegion());
            }
            if (model.wasPropertyExplicitlySet("replicaRegions")) {
                this.replicaRegions(model.getReplicaRegions());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("isHiddenOnLogin")) {
                this.isHiddenOnLogin(model.getIsHiddenOnLogin());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the identity domain.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment containing the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the identity domain.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The mutable display name of the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The mutable display name of the identity domain.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The identity domain description. You can have an empty description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The identity domain description. You can have an empty description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Region-agnostic identity domain URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * Region-agnostic identity domain URL.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * Region-specific identity domain URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegionUrl")
    private final String homeRegionUrl;

    /**
     * Region-specific identity domain URL.
     * @return the value
     **/
    public String getHomeRegionUrl() {
        return homeRegionUrl;
    }

    /**
     * The home region for the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
    private final String homeRegion;

    /**
     * The home region for the identity domain.
     * @return the value
     **/
    public String getHomeRegion() {
        return homeRegion;
    }

    /**
     * The regions where replicas of the identity domain exist.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicaRegions")
    private final java.util.List<ReplicatedRegionDetails> replicaRegions;

    /**
     * The regions where replicas of the identity domain exist.
     * @return the value
     **/
    public java.util.List<ReplicatedRegionDetails> getReplicaRegions() {
        return replicaRegions;
    }

    /**
     * The type of the identity domain.
     *
     **/
    public enum Type {
        Default("DEFAULT"),
        Secondary("SECONDARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the identity domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the identity domain.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The license type of the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final String licenseType;

    /**
     * The license type of the identity domain.
     * @return the value
     **/
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Indicates whether the identity domain is hidden on the sign-in screen or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenOnLogin")
    private final Boolean isHiddenOnLogin;

    /**
     * Indicates whether the identity domain is hidden on the sign-in screen or not.
     *
     * @return the value
     **/
    public Boolean getIsHiddenOnLogin() {
        return isHiddenOnLogin;
    }

    /**
     * Date and time the identity domain was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the identity domain was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current state.
     *
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Inactive("INACTIVE"),

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
     * The current state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Any additional details about the current state of the identity domain.
     *
     **/
    public enum LifecycleDetails {
        Deactivating("DEACTIVATING"),
        Activating("ACTIVATING"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Any additional details about the current state of the identity domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * Any additional details about the current state of the identity domain.
     *
     * @return the value
     **/
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("DomainSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", homeRegionUrl=").append(String.valueOf(this.homeRegionUrl));
        sb.append(", homeRegion=").append(String.valueOf(this.homeRegion));
        sb.append(", replicaRegions=").append(String.valueOf(this.replicaRegions));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", isHiddenOnLogin=").append(String.valueOf(this.isHiddenOnLogin));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DomainSummary)) {
            return false;
        }

        DomainSummary other = (DomainSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.homeRegionUrl, other.homeRegionUrl)
                && java.util.Objects.equals(this.homeRegion, other.homeRegion)
                && java.util.Objects.equals(this.replicaRegions, other.replicaRegions)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.isHiddenOnLogin, other.isHiddenOnLogin)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.homeRegionUrl == null ? 43 : this.homeRegionUrl.hashCode());
        result = (result * PRIME) + (this.homeRegion == null ? 43 : this.homeRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaRegions == null ? 43 : this.replicaRegions.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.isHiddenOnLogin == null ? 43 : this.isHiddenOnLogin.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
