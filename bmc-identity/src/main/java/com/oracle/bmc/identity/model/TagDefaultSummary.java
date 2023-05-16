/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * Summary information for the specified tag default. <br>
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
        builder = TagDefaultSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TagDefaultSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "tagNamespaceId",
        "tagDefinitionId",
        "tagDefinitionName",
        "value",
        "timeCreated",
        "lifecycleState",
        "isRequired",
        "locks"
    })
    public TagDefaultSummary(
            String id,
            String compartmentId,
            String tagNamespaceId,
            String tagDefinitionId,
            String tagDefinitionName,
            String value,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            Boolean isRequired,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.tagNamespaceId = tagNamespaceId;
        this.tagDefinitionId = tagDefinitionId;
        this.tagDefinitionName = tagDefinitionName;
        this.value = value;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.isRequired = isRequired;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the tag default. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the tag default.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment. The tag default will apply to all new resources that are
         * created in the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment. The tag default will apply to all new resources that are
         * created in the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the tag namespace that contains the tag definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceId")
        private String tagNamespaceId;

        /**
         * The OCID of the tag namespace that contains the tag definition.
         *
         * @param tagNamespaceId the value to set
         * @return this builder
         */
        public Builder tagNamespaceId(String tagNamespaceId) {
            this.tagNamespaceId = tagNamespaceId;
            this.__explicitlySet__.add("tagNamespaceId");
            return this;
        }
        /**
         * The OCID of the tag definition. The tag default will always assign a default value for
         * this tag definition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
        private String tagDefinitionId;

        /**
         * The OCID of the tag definition. The tag default will always assign a default value for
         * this tag definition.
         *
         * @param tagDefinitionId the value to set
         * @return this builder
         */
        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            this.__explicitlySet__.add("tagDefinitionId");
            return this;
        }
        /**
         * The name used in the tag definition. This field is informational in the context of the
         * tag default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
        private String tagDefinitionName;

        /**
         * The name used in the tag definition. This field is informational in the context of the
         * tag default.
         *
         * @param tagDefinitionName the value to set
         * @return this builder
         */
        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }
        /**
         * The default value for the tag definition. This will be applied to all new resources
         * created in the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The default value for the tag definition. This will be applied to all new resources
         * created in the compartment.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Date and time the {@code TagDefault} object was created, in the format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code TagDefault} object was created, in the format defined by
         * RFC3339.
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
        /**
         * The tag default's current state. After creating a {@code TagDefault}, make sure its
         * {@code lifecycleState} is ACTIVE before using it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The tag default's current state. After creating a {@code TagDefault}, make sure its
         * {@code lifecycleState} is ACTIVE before using it.
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
         * If you specify that a value is required, a value is set during resource creation (either
         * by the user creating the resource or another tag defualt). If no value is set, resource
         * creation is blocked.
         *
         * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
         * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
         * during resource creation.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * If you specify that a value is required, a value is set during resource creation (either
         * by the user creating the resource or another tag defualt). If no value is set, resource
         * creation is blocked.
         *
         * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
         * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
         * during resource creation.
         *
         * <p>Example: {@code false}
         *
         * @param isRequired the value to set
         * @return this builder
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TagDefaultSummary build() {
            TagDefaultSummary model =
                    new TagDefaultSummary(
                            this.id,
                            this.compartmentId,
                            this.tagNamespaceId,
                            this.tagDefinitionId,
                            this.tagDefinitionName,
                            this.value,
                            this.timeCreated,
                            this.lifecycleState,
                            this.isRequired,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TagDefaultSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tagNamespaceId")) {
                this.tagNamespaceId(model.getTagNamespaceId());
            }
            if (model.wasPropertyExplicitlySet("tagDefinitionId")) {
                this.tagDefinitionId(model.getTagDefinitionId());
            }
            if (model.wasPropertyExplicitlySet("tagDefinitionName")) {
                this.tagDefinitionName(model.getTagDefinitionName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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

    /** The OCID of the tag default. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the tag default.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment. The tag default will apply to all new resources that are created
     * in the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment. The tag default will apply to all new resources that are created
     * in the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the tag namespace that contains the tag definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceId")
    private final String tagNamespaceId;

    /**
     * The OCID of the tag namespace that contains the tag definition.
     *
     * @return the value
     */
    public String getTagNamespaceId() {
        return tagNamespaceId;
    }

    /**
     * The OCID of the tag definition. The tag default will always assign a default value for this
     * tag definition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
    private final String tagDefinitionId;

    /**
     * The OCID of the tag definition. The tag default will always assign a default value for this
     * tag definition.
     *
     * @return the value
     */
    public String getTagDefinitionId() {
        return tagDefinitionId;
    }

    /**
     * The name used in the tag definition. This field is informational in the context of the tag
     * default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
    private final String tagDefinitionName;

    /**
     * The name used in the tag definition. This field is informational in the context of the tag
     * default.
     *
     * @return the value
     */
    public String getTagDefinitionName() {
        return tagDefinitionName;
    }

    /**
     * The default value for the tag definition. This will be applied to all new resources created
     * in the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The default value for the tag definition. This will be applied to all new resources created
     * in the compartment.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Date and time the {@code TagDefault} object was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code TagDefault} object was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The tag default's current state. After creating a {@code TagDefault}, make sure its {@code
     * lifecycleState} is ACTIVE before using it.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The tag default's current state. After creating a {@code TagDefault}, make sure its {@code
     * lifecycleState} is ACTIVE before using it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The tag default's current state. After creating a {@code TagDefault}, make sure its {@code
     * lifecycleState} is ACTIVE before using it.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource creation
     * is blocked.
     *
     * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
     * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
     * during resource creation.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag defualt). If no value is set, resource creation
     * is blocked.
     *
     * <p>If the {@code isRequired} flag is set to "true", the value is set during resource
     * creation. * If the {@code isRequired} flag is set to "false", the value you enter is set
     * during resource creation.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("TagDefaultSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tagNamespaceId=").append(String.valueOf(this.tagNamespaceId));
        sb.append(", tagDefinitionId=").append(String.valueOf(this.tagDefinitionId));
        sb.append(", tagDefinitionName=").append(String.valueOf(this.tagDefinitionName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagDefaultSummary)) {
            return false;
        }

        TagDefaultSummary other = (TagDefaultSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tagNamespaceId, other.tagNamespaceId)
                && java.util.Objects.equals(this.tagDefinitionId, other.tagDefinitionId)
                && java.util.Objects.equals(this.tagDefinitionName, other.tagDefinitionName)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.locks, other.locks)
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
        result =
                (result * PRIME)
                        + (this.tagNamespaceId == null ? 43 : this.tagNamespaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionId == null ? 43 : this.tagDefinitionId.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionName == null ? 43 : this.tagDefinitionName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
