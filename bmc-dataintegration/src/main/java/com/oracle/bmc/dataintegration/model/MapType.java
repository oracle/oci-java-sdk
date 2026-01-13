/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Map type object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MapType.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MapType extends BaseType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Seeded type */
        @com.fasterxml.jackson.annotation.JsonProperty("keyElementType")
        private String keyElementType;

        /**
         * Seeded type
         *
         * @param keyElementType the value to set
         * @return this builder
         */
        public Builder keyElementType(String keyElementType) {
            this.keyElementType = keyElementType;
            this.__explicitlySet__.add("keyElementType");
            return this;
        }
        /** Seeded type */
        @com.fasterxml.jackson.annotation.JsonProperty("valueElementType")
        private String valueElementType;

        /**
         * Seeded type
         *
         * @param valueElementType the value to set
         * @return this builder
         */
        public Builder valueElementType(String valueElementType) {
            this.valueElementType = valueElementType;
            this.__explicitlySet__.add("valueElementType");
            return this;
        }
        /** Defines whether null values are allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("containsNull")
        private Boolean containsNull;

        /**
         * Defines whether null values are allowed.
         *
         * @param containsNull the value to set
         * @return this builder
         */
        public Builder containsNull(Boolean containsNull) {
            this.containsNull = containsNull;
            this.__explicitlySet__.add("containsNull");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MapType build() {
            MapType model =
                    new MapType(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectStatus,
                            this.description,
                            this.keyElementType,
                            this.valueElementType,
                            this.containsNull);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MapType model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("keyElementType")) {
                this.keyElementType(model.getKeyElementType());
            }
            if (model.wasPropertyExplicitlySet("valueElementType")) {
                this.valueElementType(model.getValueElementType());
            }
            if (model.wasPropertyExplicitlySet("containsNull")) {
                this.containsNull(model.getContainsNull());
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

    @Deprecated
    public MapType(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectStatus,
            String description,
            String keyElementType,
            String valueElementType,
            Boolean containsNull) {
        super(key, modelVersion, parentRef, name, objectStatus, description);
        this.keyElementType = keyElementType;
        this.valueElementType = valueElementType;
        this.containsNull = containsNull;
    }

    /** Seeded type */
    @com.fasterxml.jackson.annotation.JsonProperty("keyElementType")
    private final String keyElementType;

    /**
     * Seeded type
     *
     * @return the value
     */
    public String getKeyElementType() {
        return keyElementType;
    }

    /** Seeded type */
    @com.fasterxml.jackson.annotation.JsonProperty("valueElementType")
    private final String valueElementType;

    /**
     * Seeded type
     *
     * @return the value
     */
    public String getValueElementType() {
        return valueElementType;
    }

    /** Defines whether null values are allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("containsNull")
    private final Boolean containsNull;

    /**
     * Defines whether null values are allowed.
     *
     * @return the value
     */
    public Boolean getContainsNull() {
        return containsNull;
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
        sb.append("MapType(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", keyElementType=").append(String.valueOf(this.keyElementType));
        sb.append(", valueElementType=").append(String.valueOf(this.valueElementType));
        sb.append(", containsNull=").append(String.valueOf(this.containsNull));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MapType)) {
            return false;
        }

        MapType other = (MapType) o;
        return java.util.Objects.equals(this.keyElementType, other.keyElementType)
                && java.util.Objects.equals(this.valueElementType, other.valueElementType)
                && java.util.Objects.equals(this.containsNull, other.containsNull)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.keyElementType == null ? 43 : this.keyElementType.hashCode());
        result =
                (result * PRIME)
                        + (this.valueElementType == null ? 43 : this.valueElementType.hashCode());
        result = (result * PRIME) + (this.containsNull == null ? 43 : this.containsNull.hashCode());
        return result;
    }
}
