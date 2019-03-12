/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * A document that specifies a default value for a Tag Definition for all resource types created in a Compartment.
 * <p>
 * Tag Defaults are inherited by child compartments. This means that if you set a Tag Default on the root Compartment
 * for a tenancy, all resources are guaranteed to be created with the referenced Tag Definition applied.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TagDefault.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TagDefault {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceId")
        private String tagNamespaceId;

        public Builder tagNamespaceId(String tagNamespaceId) {
            this.tagNamespaceId = tagNamespaceId;
            this.__explicitlySet__.add("tagNamespaceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
        private String tagDefinitionId;

        public Builder tagDefinitionId(String tagDefinitionId) {
            this.tagDefinitionId = tagDefinitionId;
            this.__explicitlySet__.add("tagDefinitionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
        private String tagDefinitionName;

        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TagDefault build() {
            TagDefault __instance__ =
                    new TagDefault(
                            id,
                            compartmentId,
                            tagNamespaceId,
                            tagDefinitionId,
                            tagDefinitionName,
                            value,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TagDefault o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .tagNamespaceId(o.getTagNamespaceId())
                            .tagDefinitionId(o.getTagDefinitionId())
                            .tagDefinitionName(o.getTagDefinitionName())
                            .value(o.getValue())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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
     * The OCID of the Tag Default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the Compartment. The Tag Default will apply to any resource contained in this Compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the Tag Namespace that contains the Tag Definition.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagNamespaceId")
    String tagNamespaceId;

    /**
     * The OCID of the Tag Definition. The Tag Default will always assign a default value for this Tag Definition.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionId")
    String tagDefinitionId;

    /**
     * The name used in the Tag Definition. This field is informational in the context of the Tag Default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
    String tagDefinitionName;

    /**
     * The default value for the Tag Definition. This will be applied to all resources created in the Compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * Date and time the `TagDefault` object was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The tag default's current state. After creating a tagdefault, make sure its `lifecycleState` is ACTIVE before using it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The tag default's current state. After creating a tagdefault, make sure its `lifecycleState` is ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
