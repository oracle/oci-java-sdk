/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The foreign key object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ForeignKey.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ForeignKey extends Key {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributeRefs")
        private java.util.List<KeyAttribute> attributeRefs;

        public Builder attributeRefs(java.util.List<KeyAttribute> attributeRefs) {
            this.attributeRefs = attributeRefs;
            this.__explicitlySet__.add("attributeRefs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateRule")
        private Integer updateRule;

        public Builder updateRule(Integer updateRule) {
            this.updateRule = updateRule;
            this.__explicitlySet__.add("updateRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deleteRule")
        private Integer deleteRule;

        public Builder deleteRule(Integer deleteRule) {
            this.deleteRule = deleteRule;
            this.__explicitlySet__.add("deleteRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referenceUniqueKey")
        private UniqueKey referenceUniqueKey;

        public Builder referenceUniqueKey(UniqueKey referenceUniqueKey) {
            this.referenceUniqueKey = referenceUniqueKey;
            this.__explicitlySet__.add("referenceUniqueKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ForeignKey build() {
            ForeignKey __instance__ =
                    new ForeignKey(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            attributeRefs,
                            updateRule,
                            deleteRule,
                            referenceUniqueKey,
                            objectStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ForeignKey o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .attributeRefs(o.getAttributeRefs())
                            .updateRule(o.getUpdateRule())
                            .deleteRule(o.getDeleteRule())
                            .referenceUniqueKey(o.getReferenceUniqueKey())
                            .objectStatus(o.getObjectStatus());

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

    @Deprecated
    public ForeignKey(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            java.util.List<KeyAttribute> attributeRefs,
            Integer updateRule,
            Integer deleteRule,
            UniqueKey referenceUniqueKey,
            Integer objectStatus) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.attributeRefs = attributeRefs;
        this.updateRule = updateRule;
        this.deleteRule = deleteRule;
        this.referenceUniqueKey = referenceUniqueKey;
        this.objectStatus = objectStatus;
    }

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value can be edited by the user and it is restricted to 1000 characters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * attributeRefs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeRefs")
    java.util.List<KeyAttribute> attributeRefs;

    /**
     * updateRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateRule")
    Integer updateRule;

    /**
     * deleteRule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deleteRule")
    Integer deleteRule;

    @com.fasterxml.jackson.annotation.JsonProperty("referenceUniqueKey")
    UniqueKey referenceUniqueKey;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
