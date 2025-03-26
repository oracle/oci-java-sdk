/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A software source contains a collection of packages
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwareSourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftwareSourceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "compartmentId",
        "displayName",
        "repoType",
        "status",
        "packages",
        "lifecycleState",
        "parentId",
        "parentName",
        "freeformTags",
        "definedTags"
    })
    public SoftwareSourceSummary(
            String id,
            String description,
            String compartmentId,
            String displayName,
            String repoType,
            Status status,
            Integer packages,
            LifecycleStates lifecycleState,
            String parentId,
            String parentName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.description = description;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.repoType = repoType;
        this.status = status;
        this.packages = packages;
        this.lifecycleState = lifecycleState;
        this.parentId = parentId;
        this.parentName = parentName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID for the Software Source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID for the Software Source
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Information specified by the user about the software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Information specified by the user about the software source
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * OCID for the Compartment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID for the Compartment
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * User friendly name for the software source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User friendly name for the software source
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Type of the Software Source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repoType")
        private String repoType;

        /**
         * Type of the Software Source
         * @param repoType the value to set
         * @return this builder
         **/
        public Builder repoType(String repoType) {
            this.repoType = repoType;
            this.__explicitlySet__.add("repoType");
            return this;
        }
        /**
         * status of the software source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * status of the software source.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Number of packages
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private Integer packages;

        /**
         * Number of packages
         * @param packages the value to set
         * @return this builder
         **/
        public Builder packages(Integer packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }
        /**
         * The current state of the software source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the software source.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * OCID for the parent software source, if there is one
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * OCID for the parent software source, if there is one
         * @param parentId the value to set
         * @return this builder
         **/
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /**
         * Display name the parent software source, if there is one
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentName")
        private String parentName;

        /**
         * Display name the parent software source, if there is one
         * @param parentName the value to set
         * @return this builder
         **/
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            this.__explicitlySet__.add("parentName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public SoftwareSourceSummary build() {
            SoftwareSourceSummary model =
                    new SoftwareSourceSummary(
                            this.id,
                            this.description,
                            this.compartmentId,
                            this.displayName,
                            this.repoType,
                            this.status,
                            this.packages,
                            this.lifecycleState,
                            this.parentId,
                            this.parentName,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSourceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("repoType")) {
                this.repoType(model.getRepoType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("parentName")) {
                this.parentName(model.getParentName());
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
     * OCID for the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID for the Software Source
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Information specified by the user about the software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Information specified by the user about the software source
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * OCID for the Compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID for the Compartment
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User friendly name for the software source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User friendly name for the software source
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Type of the Software Source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repoType")
    private final String repoType;

    /**
     * Type of the Software Source
     * @return the value
     **/
    public String getRepoType() {
        return repoType;
    }

    /**
     * status of the software source.
     **/
    public enum Status {
        Normal("NORMAL"),
        Unreachable("UNREACHABLE"),
        Error("ERROR"),
        Warning("WARNING"),

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
     * status of the software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * status of the software source.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Number of packages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final Integer packages;

    /**
     * Number of packages
     * @return the value
     **/
    public Integer getPackages() {
        return packages;
    }

    /**
     * The current state of the software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the software source.
     * @return the value
     **/
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * OCID for the parent software source, if there is one
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * OCID for the parent software source, if there is one
     * @return the value
     **/
    public String getParentId() {
        return parentId;
    }

    /**
     * Display name the parent software source, if there is one
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentName")
    private final String parentName;

    /**
     * Display name the parent software source, if there is one
     * @return the value
     **/
    public String getParentName() {
        return parentName;
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
        sb.append("SoftwareSourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", repoType=").append(String.valueOf(this.repoType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", parentName=").append(String.valueOf(this.parentName));
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
        if (!(o instanceof SoftwareSourceSummary)) {
            return false;
        }

        SoftwareSourceSummary other = (SoftwareSourceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.repoType, other.repoType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.packages, other.packages)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.parentName, other.parentName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.repoType == null ? 43 : this.repoType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.parentName == null ? 43 : this.parentName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
