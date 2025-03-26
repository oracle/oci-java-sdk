/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the flatten operator.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FlattenDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FlattenDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "flattenProjectionPreferences",
        "flattenAttributeRoot",
        "flattenAttributePath",
        "flattenColumns",
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "objectStatus"
    })
    public FlattenDetails(
            FlattenProjectionPreferences flattenProjectionPreferences,
            String flattenAttributeRoot,
            String flattenAttributePath,
            java.util.List<TypedObject> flattenColumns,
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            Integer objectStatus) {
        super();
        this.flattenProjectionPreferences = flattenProjectionPreferences;
        this.flattenAttributeRoot = flattenAttributeRoot;
        this.flattenAttributePath = flattenAttributePath;
        this.flattenColumns = flattenColumns;
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.objectStatus = objectStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("flattenProjectionPreferences")
        private FlattenProjectionPreferences flattenProjectionPreferences;

        public Builder flattenProjectionPreferences(
                FlattenProjectionPreferences flattenProjectionPreferences) {
            this.flattenProjectionPreferences = flattenProjectionPreferences;
            this.__explicitlySet__.add("flattenProjectionPreferences");
            return this;
        }
        /**
         * The string of flatten attribute column name where the flatten process starts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributeRoot")
        private String flattenAttributeRoot;

        /**
         * The string of flatten attribute column name where the flatten process starts.
         * @param flattenAttributeRoot the value to set
         * @return this builder
         **/
        public Builder flattenAttributeRoot(String flattenAttributeRoot) {
            this.flattenAttributeRoot = flattenAttributeRoot;
            this.__explicitlySet__.add("flattenAttributeRoot");
            return this;
        }
        /**
         * The string of flatten attribute path in flattenAttributeRoot from upper level to leaf/targeted level concatenated with dot(.).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributePath")
        private String flattenAttributePath;

        /**
         * The string of flatten attribute path in flattenAttributeRoot from upper level to leaf/targeted level concatenated with dot(.).
         * @param flattenAttributePath the value to set
         * @return this builder
         **/
        public Builder flattenAttributePath(String flattenAttributePath) {
            this.flattenAttributePath = flattenAttributePath;
            this.__explicitlySet__.add("flattenAttributePath");
            return this;
        }
        /**
         * The array of flatten columns which are the input to flatten.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flattenColumns")
        private java.util.List<TypedObject> flattenColumns;

        /**
         * The array of flatten columns which are the input to flatten.
         * @param flattenColumns the value to set
         * @return this builder
         **/
        public Builder flattenColumns(java.util.List<TypedObject> flattenColumns) {
            this.flattenColumns = flattenColumns;
            this.__explicitlySet__.add("flattenColumns");
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

        public FlattenDetails build() {
            FlattenDetails model =
                    new FlattenDetails(
                            this.flattenProjectionPreferences,
                            this.flattenAttributeRoot,
                            this.flattenAttributePath,
                            this.flattenColumns,
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
        public Builder copy(FlattenDetails model) {
            if (model.wasPropertyExplicitlySet("flattenProjectionPreferences")) {
                this.flattenProjectionPreferences(model.getFlattenProjectionPreferences());
            }
            if (model.wasPropertyExplicitlySet("flattenAttributeRoot")) {
                this.flattenAttributeRoot(model.getFlattenAttributeRoot());
            }
            if (model.wasPropertyExplicitlySet("flattenAttributePath")) {
                this.flattenAttributePath(model.getFlattenAttributePath());
            }
            if (model.wasPropertyExplicitlySet("flattenColumns")) {
                this.flattenColumns(model.getFlattenColumns());
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

    @com.fasterxml.jackson.annotation.JsonProperty("flattenProjectionPreferences")
    private final FlattenProjectionPreferences flattenProjectionPreferences;

    public FlattenProjectionPreferences getFlattenProjectionPreferences() {
        return flattenProjectionPreferences;
    }

    /**
     * The string of flatten attribute column name where the flatten process starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributeRoot")
    private final String flattenAttributeRoot;

    /**
     * The string of flatten attribute column name where the flatten process starts.
     * @return the value
     **/
    public String getFlattenAttributeRoot() {
        return flattenAttributeRoot;
    }

    /**
     * The string of flatten attribute path in flattenAttributeRoot from upper level to leaf/targeted level concatenated with dot(.).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flattenAttributePath")
    private final String flattenAttributePath;

    /**
     * The string of flatten attribute path in flattenAttributeRoot from upper level to leaf/targeted level concatenated with dot(.).
     * @return the value
     **/
    public String getFlattenAttributePath() {
        return flattenAttributePath;
    }

    /**
     * The array of flatten columns which are the input to flatten.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flattenColumns")
    private final java.util.List<TypedObject> flattenColumns;

    /**
     * The array of flatten columns which are the input to flatten.
     * @return the value
     **/
    public java.util.List<TypedObject> getFlattenColumns() {
        return flattenColumns;
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
        sb.append("FlattenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("flattenProjectionPreferences=")
                .append(String.valueOf(this.flattenProjectionPreferences));
        sb.append(", flattenAttributeRoot=").append(String.valueOf(this.flattenAttributeRoot));
        sb.append(", flattenAttributePath=").append(String.valueOf(this.flattenAttributePath));
        sb.append(", flattenColumns=").append(String.valueOf(this.flattenColumns));
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
        if (!(o instanceof FlattenDetails)) {
            return false;
        }

        FlattenDetails other = (FlattenDetails) o;
        return java.util.Objects.equals(
                        this.flattenProjectionPreferences, other.flattenProjectionPreferences)
                && java.util.Objects.equals(this.flattenAttributeRoot, other.flattenAttributeRoot)
                && java.util.Objects.equals(this.flattenAttributePath, other.flattenAttributePath)
                && java.util.Objects.equals(this.flattenColumns, other.flattenColumns)
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
        result =
                (result * PRIME)
                        + (this.flattenProjectionPreferences == null
                                ? 43
                                : this.flattenProjectionPreferences.hashCode());
        result =
                (result * PRIME)
                        + (this.flattenAttributeRoot == null
                                ? 43
                                : this.flattenAttributeRoot.hashCode());
        result =
                (result * PRIME)
                        + (this.flattenAttributePath == null
                                ? 43
                                : this.flattenAttributePath.hashCode());
        result =
                (result * PRIME)
                        + (this.flattenColumns == null ? 43 : this.flattenColumns.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
