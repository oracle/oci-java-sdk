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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScopeReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScopeReference extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"referenceObject", "referenceType", "refObjectName"})
    public ScopeReference(
            String referenceObject, ReferenceType referenceType, String refObjectName) {
        super();
        this.referenceObject = referenceObject;
        this.referenceType = referenceType;
        this.refObjectName = refObjectName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A key or shallow reference to an object.  For direct reference, it points to the actual scope object.  For BOUND_ENTITY_SHAPE or BOUND_ENTITY_SHAPE_FIELD, it points to the source or target operator.   For OCI_FUNCTION_INPUT_SHAPE or OCI_FUNCTION_OUTPUT_SHAPE, it points to the OCI Function object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referenceObject")
        private String referenceObject;

        /**
         * A key or shallow reference to an object.  For direct reference, it points to the actual scope object.  For BOUND_ENTITY_SHAPE or BOUND_ENTITY_SHAPE_FIELD, it points to the source or target operator.   For OCI_FUNCTION_INPUT_SHAPE or OCI_FUNCTION_OUTPUT_SHAPE, it points to the OCI Function object.
         * @param referenceObject the value to set
         * @return this builder
         **/
        public Builder referenceObject(String referenceObject) {
            this.referenceObject = referenceObject;
            this.__explicitlySet__.add("referenceObject");
            return this;
        }
        /**
         * The reference type for this reference.  Set to null for a direct reference, for indirect references set to a type of association such as "BOUND_ENTITY_SHAPE".   Current known reference type values are "BOUND_ENTITY_SHAPE", "BOUND_ENTITY_SHAPE_FIELD", "OCI_FUNCTION_INPUT_SHAPE", "OCI_FUNCTION_OUTPUT_SHAPE"
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
        private ReferenceType referenceType;

        /**
         * The reference type for this reference.  Set to null for a direct reference, for indirect references set to a type of association such as "BOUND_ENTITY_SHAPE".   Current known reference type values are "BOUND_ENTITY_SHAPE", "BOUND_ENTITY_SHAPE_FIELD", "OCI_FUNCTION_INPUT_SHAPE", "OCI_FUNCTION_OUTPUT_SHAPE"
         * @param referenceType the value to set
         * @return this builder
         **/
        public Builder referenceType(ReferenceType referenceType) {
            this.referenceType = referenceType;
            this.__explicitlySet__.add("referenceType");
            return this;
        }
        /**
         * The referenced object name for this reference.  Set to the field name if the referenceType is BOUND_ENTITY_SHAPE_FIELD, else set to null.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refObjectName")
        private String refObjectName;

        /**
         * The referenced object name for this reference.  Set to the field name if the referenceType is BOUND_ENTITY_SHAPE_FIELD, else set to null.
         * @param refObjectName the value to set
         * @return this builder
         **/
        public Builder refObjectName(String refObjectName) {
            this.refObjectName = refObjectName;
            this.__explicitlySet__.add("refObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScopeReference build() {
            ScopeReference model =
                    new ScopeReference(
                            this.referenceObject, this.referenceType, this.refObjectName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScopeReference model) {
            if (model.wasPropertyExplicitlySet("referenceObject")) {
                this.referenceObject(model.getReferenceObject());
            }
            if (model.wasPropertyExplicitlySet("referenceType")) {
                this.referenceType(model.getReferenceType());
            }
            if (model.wasPropertyExplicitlySet("refObjectName")) {
                this.refObjectName(model.getRefObjectName());
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
     * A key or shallow reference to an object.  For direct reference, it points to the actual scope object.  For BOUND_ENTITY_SHAPE or BOUND_ENTITY_SHAPE_FIELD, it points to the source or target operator.   For OCI_FUNCTION_INPUT_SHAPE or OCI_FUNCTION_OUTPUT_SHAPE, it points to the OCI Function object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceObject")
    private final String referenceObject;

    /**
     * A key or shallow reference to an object.  For direct reference, it points to the actual scope object.  For BOUND_ENTITY_SHAPE or BOUND_ENTITY_SHAPE_FIELD, it points to the source or target operator.   For OCI_FUNCTION_INPUT_SHAPE or OCI_FUNCTION_OUTPUT_SHAPE, it points to the OCI Function object.
     * @return the value
     **/
    public String getReferenceObject() {
        return referenceObject;
    }

    /**
     * The reference type for this reference.  Set to null for a direct reference, for indirect references set to a type of association such as "BOUND_ENTITY_SHAPE".   Current known reference type values are "BOUND_ENTITY_SHAPE", "BOUND_ENTITY_SHAPE_FIELD", "OCI_FUNCTION_INPUT_SHAPE", "OCI_FUNCTION_OUTPUT_SHAPE"
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReferenceType.class);

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
    private final ReferenceType referenceType;

    /**
     * The reference type for this reference.  Set to null for a direct reference, for indirect references set to a type of association such as "BOUND_ENTITY_SHAPE".   Current known reference type values are "BOUND_ENTITY_SHAPE", "BOUND_ENTITY_SHAPE_FIELD", "OCI_FUNCTION_INPUT_SHAPE", "OCI_FUNCTION_OUTPUT_SHAPE"
     * @return the value
     **/
    public ReferenceType getReferenceType() {
        return referenceType;
    }

    /**
     * The referenced object name for this reference.  Set to the field name if the referenceType is BOUND_ENTITY_SHAPE_FIELD, else set to null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refObjectName")
    private final String refObjectName;

    /**
     * The referenced object name for this reference.  Set to the field name if the referenceType is BOUND_ENTITY_SHAPE_FIELD, else set to null.
     * @return the value
     **/
    public String getRefObjectName() {
        return refObjectName;
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
        sb.append("ScopeReference(");
        sb.append("super=").append(super.toString());
        sb.append("referenceObject=").append(String.valueOf(this.referenceObject));
        sb.append(", referenceType=").append(String.valueOf(this.referenceType));
        sb.append(", refObjectName=").append(String.valueOf(this.refObjectName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScopeReference)) {
            return false;
        }

        ScopeReference other = (ScopeReference) o;
        return java.util.Objects.equals(this.referenceObject, other.referenceObject)
                && java.util.Objects.equals(this.referenceType, other.referenceType)
                && java.util.Objects.equals(this.refObjectName, other.refObjectName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.referenceObject == null ? 43 : this.referenceObject.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceType == null ? 43 : this.referenceType.hashCode());
        result =
                (result * PRIME)
                        + (this.refObjectName == null ? 43 : this.refObjectName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
