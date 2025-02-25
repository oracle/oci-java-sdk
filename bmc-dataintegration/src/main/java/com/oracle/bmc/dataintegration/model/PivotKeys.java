/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The type representing the pivot key and pivot value details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PivotKeys.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PivotKeys extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pivotAxis",
        "pivotKeyValueMap",
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "objectStatus"
    })
    public PivotKeys(
            java.util.List<String> pivotAxis,
            java.util.Map<String, java.util.List<String>> pivotKeyValueMap,
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            Integer objectStatus) {
        super();
        this.pivotAxis = pivotAxis;
        this.pivotKeyValueMap = pivotKeyValueMap;
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.objectStatus = objectStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The pivot axis is the point around which the table will be rotated, and the pivot values will be transposed into columns in the output table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pivotAxis")
        private java.util.List<String> pivotAxis;

        /**
         * The pivot axis is the point around which the table will be rotated, and the pivot values will be transposed into columns in the output table.
         * @param pivotAxis the value to set
         * @return this builder
         **/
        public Builder pivotAxis(java.util.List<String> pivotAxis) {
            this.pivotAxis = pivotAxis;
            this.__explicitlySet__.add("pivotAxis");
            return this;
        }
        /**
         * Map of alias to pivot key values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pivotKeyValueMap")
        private java.util.Map<String, java.util.List<String>> pivotKeyValueMap;

        /**
         * Map of alias to pivot key values.
         * @param pivotKeyValueMap the value to set
         * @return this builder
         **/
        public Builder pivotKeyValueMap(
                java.util.Map<String, java.util.List<String>> pivotKeyValueMap) {
            this.pivotKeyValueMap = pivotKeyValueMap;
            this.__explicitlySet__.add("pivotKeyValueMap");
            return this;
        }
        /**
         * The key of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the object.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The type of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The model version of an object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
         * @param modelVersion the value to set
         * @return this builder
         **/
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
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PivotKeys build() {
            PivotKeys model =
                    new PivotKeys(
                            this.pivotAxis,
                            this.pivotKeyValueMap,
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PivotKeys model) {
            if (model.wasPropertyExplicitlySet("pivotAxis")) {
                this.pivotAxis(model.getPivotAxis());
            }
            if (model.wasPropertyExplicitlySet("pivotKeyValueMap")) {
                this.pivotKeyValueMap(model.getPivotKeyValueMap());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
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
     * The pivot axis is the point around which the table will be rotated, and the pivot values will be transposed into columns in the output table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pivotAxis")
    private final java.util.List<String> pivotAxis;

    /**
     * The pivot axis is the point around which the table will be rotated, and the pivot values will be transposed into columns in the output table.
     * @return the value
     **/
    public java.util.List<String> getPivotAxis() {
        return pivotAxis;
    }

    /**
     * Map of alias to pivot key values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pivotKeyValueMap")
    private final java.util.Map<String, java.util.List<String>> pivotKeyValueMap;

    /**
     * Map of alias to pivot key values.
     * @return the value
     **/
    public java.util.Map<String, java.util.List<String>> getPivotKeyValueMap() {
        return pivotKeyValueMap;
    }

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
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
        sb.append("PivotKeys(");
        sb.append("super=").append(super.toString());
        sb.append("pivotAxis=").append(String.valueOf(this.pivotAxis));
        sb.append(", pivotKeyValueMap=").append(String.valueOf(this.pivotKeyValueMap));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PivotKeys)) {
            return false;
        }

        PivotKeys other = (PivotKeys) o;
        return java.util.Objects.equals(this.pivotAxis, other.pivotAxis)
                && java.util.Objects.equals(this.pivotKeyValueMap, other.pivotKeyValueMap)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pivotAxis == null ? 43 : this.pivotAxis.hashCode());
        result =
                (result * PRIME)
                        + (this.pivotKeyValueMap == null ? 43 : this.pivotKeyValueMap.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
