/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The {@code ScopeReference} class is a base class for any model object that wraps a scope reference to a TypedObject.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScopeReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ScopeReference {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("referenceObject")
        private String referenceObject;

        public Builder referenceObject(String referenceObject) {
            this.referenceObject = referenceObject;
            this.__explicitlySet__.add("referenceObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
        private ReferenceType referenceType;

        public Builder referenceType(ReferenceType referenceType) {
            this.referenceType = referenceType;
            this.__explicitlySet__.add("referenceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refObjectName")
        private String refObjectName;

        public Builder refObjectName(String refObjectName) {
            this.refObjectName = refObjectName;
            this.__explicitlySet__.add("refObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScopeReference build() {
            ScopeReference __instance__ =
                    new ScopeReference(referenceObject, referenceType, refObjectName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScopeReference o) {
            Builder copiedBuilder =
                    referenceObject(o.getReferenceObject())
                            .referenceType(o.getReferenceType())
                            .refObjectName(o.getRefObjectName());

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
     * A key or shallow reference to an object.  For direct reference, it points to the actual scope object.  For BOUND_ENTITY_SHAPE or BOUND_ENTITY_SHAPE_FIELD, it points to the source or target operator.   For OCI_FUNCTION_INPUT_SHAPE or OCI_FUNCTION_OUTPUT_SHAPE, it points to the OCI Function object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceObject")
    String referenceObject;
    /**
     * The reference type for this reference.  Set to null for a direct reference, for indirect references set to a type of association such as "BOUND_ENTITY_SHAPE".   Current known reference type values are "BOUND_ENTITY_SHAPE", "BOUND_ENTITY_SHAPE_FIELD", "OCI_FUNCTION_INPUT_SHAPE", "OCI_FUNCTION_OUTPUT_SHAPE"
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ReferenceType {
        DirectRef("DIRECT_REF"),
        BoundEntityShape("BOUND_ENTITY_SHAPE"),
        BoundEntityShapeField("BOUND_ENTITY_SHAPE_FIELD"),
        OciFunctionInputShape("OCI_FUNCTION_INPUT_SHAPE"),
        OciFunctionOutputShape("OCI_FUNCTION_OUTPUT_SHAPE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ReferenceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReferenceType v : ReferenceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReferenceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReferenceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReferenceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The reference type for this reference.  Set to null for a direct reference, for indirect references set to a type of association such as "BOUND_ENTITY_SHAPE".   Current known reference type values are "BOUND_ENTITY_SHAPE", "BOUND_ENTITY_SHAPE_FIELD", "OCI_FUNCTION_INPUT_SHAPE", "OCI_FUNCTION_OUTPUT_SHAPE"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
    ReferenceType referenceType;

    /**
     * The referenced object name for this reference.  Set to the field name if the referenceType is BOUND_ENTITY_SHAPE_FIELD, else set to null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refObjectName")
    String refObjectName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
