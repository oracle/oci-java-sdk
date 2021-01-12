/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * This is the reference summary information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReferenceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReferenceSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
        private String identifierPath;

        public Builder identifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            this.__explicitlySet__.add("identifierPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
        private Object targetObject;

        public Builder targetObject(Object targetObject) {
            this.targetObject = targetObject;
            this.__explicitlySet__.add("targetObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedBy")
        private java.util.List<ReferenceUsedBy> usedBy;

        public Builder usedBy(java.util.List<ReferenceUsedBy> usedBy) {
            this.usedBy = usedBy;
            this.__explicitlySet__.add("usedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("childReferences")
        private java.util.List<ChildReference> childReferences;

        public Builder childReferences(java.util.List<ChildReference> childReferences) {
            this.childReferences = childReferences;
            this.__explicitlySet__.add("childReferences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReferenceSummary build() {
            ReferenceSummary __instance__ =
                    new ReferenceSummary(
                            key,
                            name,
                            identifier,
                            identifierPath,
                            description,
                            type,
                            targetObject,
                            aggregatorKey,
                            usedBy,
                            childReferences);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReferenceSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .name(o.getName())
                            .identifier(o.getIdentifier())
                            .identifierPath(o.getIdentifierPath())
                            .description(o.getDescription())
                            .type(o.getType())
                            .targetObject(o.getTargetObject())
                            .aggregatorKey(o.getAggregatorKey())
                            .usedBy(o.getUsedBy())
                            .childReferences(o.getChildReferences());

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
     * The reference's key, key of the object that is being used by a published object or its dependents.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The name of reference object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The identifier of reference object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    /**
     * The identifier path of reference object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
    String identifierPath;

    /**
     * The description of reference object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
    /**
     * The type of reference object.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        OracleDataAsset("ORACLE_DATA_ASSET"),
        OracleObjectStorageDataAsset("ORACLE_OBJECT_STORAGE_DATA_ASSET"),
        OracleAtpDataAsset("ORACLE_ATP_DATA_ASSET"),
        OracleAdwcDataAsset("ORACLE_ADWC_DATA_ASSET"),
        MysqlDataAsset("MYSQL_DATA_ASSET"),
        GenericJdbcDataAsset("GENERIC_JDBC_DATA_ASSET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The type of reference object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * The target object referenced. References are made to data assets and child references are made to connections. The type defining this reference is mentioned in the property type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
    Object targetObject;

    /**
     * The aggregator of reference object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    String aggregatorKey;

    /**
     * List of published objects where this is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedBy")
    java.util.List<ReferenceUsedBy> usedBy;

    /**
     * List of references that are dependent on this reference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childReferences")
    java.util.List<ChildReference> childReferences;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
