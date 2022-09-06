/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The request object for single derived Entity.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeriveEntitiesItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeriveEntitiesItem extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"modelType", "mode", "referencedDataObject"})
    public DeriveEntitiesItem(
            String modelType, Mode mode, ReferencedDataObject referencedDataObject) {
        super();
        this.modelType = modelType;
        this.mode = mode;
        this.referencedDataObject = referencedDataObject;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The model type of DeriveEntitiesRequestItem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The model type of DeriveEntitiesRequestItem
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * Determines whether derived entity is treated as source or target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * Determines whether derived entity is treated as source or target
         * @param mode the value to set
         * @return this builder
         **/
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedDataObject")
        private ReferencedDataObject referencedDataObject;

        public Builder referencedDataObject(ReferencedDataObject referencedDataObject) {
            this.referencedDataObject = referencedDataObject;
            this.__explicitlySet__.add("referencedDataObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeriveEntitiesItem build() {
            DeriveEntitiesItem model =
                    new DeriveEntitiesItem(this.modelType, this.mode, this.referencedDataObject);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeriveEntitiesItem model) {
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("referencedDataObject")) {
                this.referencedDataObject(model.getReferencedDataObject());
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
     * The model type of DeriveEntitiesRequestItem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The model type of DeriveEntitiesRequestItem
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * Determines whether derived entity is treated as source or target
     **/
    public enum Mode {
        In("IN"),
        Out("OUT"),
        ;

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                map.put(v.getValue(), v);
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Mode: " + key);
        }
    };
    /**
     * Determines whether derived entity is treated as source or target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * Determines whether derived entity is treated as source or target
     * @return the value
     **/
    public Mode getMode() {
        return mode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("referencedDataObject")
    private final ReferencedDataObject referencedDataObject;

    public ReferencedDataObject getReferencedDataObject() {
        return referencedDataObject;
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
        sb.append("DeriveEntitiesItem(");
        sb.append("super=").append(super.toString());
        sb.append("modelType=").append(String.valueOf(this.modelType));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", referencedDataObject=").append(String.valueOf(this.referencedDataObject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeriveEntitiesItem)) {
            return false;
        }

        DeriveEntitiesItem other = (DeriveEntitiesItem) o;
        return java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.referencedDataObject, other.referencedDataObject)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedDataObject == null
                                ? 43
                                : this.referencedDataObject.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
