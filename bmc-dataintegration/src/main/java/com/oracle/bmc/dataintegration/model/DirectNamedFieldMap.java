/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A named field map. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DirectNamedFieldMap.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DirectNamedFieldMap extends FieldMap {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The object key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The object's model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }
        /** Deprecated - Reference to a typed object. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTypedObject")
        private String sourceTypedObject;

        /**
         * Deprecated - Reference to a typed object.
         *
         * @param sourceTypedObject the value to set
         * @return this builder
         */
        public Builder sourceTypedObject(String sourceTypedObject) {
            this.sourceTypedObject = sourceTypedObject;
            this.__explicitlySet__.add("sourceTypedObject");
            return this;
        }
        /** Deprecated - Reference to a typed object */
        @com.fasterxml.jackson.annotation.JsonProperty("targetTypedObject")
        private String targetTypedObject;

        /**
         * Deprecated - Reference to a typed object
         *
         * @param targetTypedObject the value to set
         * @return this builder
         */
        public Builder targetTypedObject(String targetTypedObject) {
            this.targetTypedObject = targetTypedObject;
            this.__explicitlySet__.add("targetTypedObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceScopeReference")
        private ScopeReference sourceScopeReference;

        public Builder sourceScopeReference(ScopeReference sourceScopeReference) {
            this.sourceScopeReference = sourceScopeReference;
            this.__explicitlySet__.add("sourceScopeReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetScopeReference")
        private ScopeReference targetScopeReference;

        public Builder targetScopeReference(ScopeReference targetScopeReference) {
            this.targetScopeReference = targetScopeReference;
            this.__explicitlySet__.add("targetScopeReference");
            return this;
        }
        /** The source field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceFieldName")
        private String sourceFieldName;

        /**
         * The source field name.
         *
         * @param sourceFieldName the value to set
         * @return this builder
         */
        public Builder sourceFieldName(String sourceFieldName) {
            this.sourceFieldName = sourceFieldName;
            this.__explicitlySet__.add("sourceFieldName");
            return this;
        }
        /** The target field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetFieldName")
        private String targetFieldName;

        /**
         * The target field name.
         *
         * @param targetFieldName the value to set
         * @return this builder
         */
        public Builder targetFieldName(String targetFieldName) {
            this.targetFieldName = targetFieldName;
            this.__explicitlySet__.add("targetFieldName");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DirectNamedFieldMap build() {
            DirectNamedFieldMap model =
                    new DirectNamedFieldMap(
                            this.description,
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.sourceTypedObject,
                            this.targetTypedObject,
                            this.sourceScopeReference,
                            this.targetScopeReference,
                            this.sourceFieldName,
                            this.targetFieldName,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DirectNamedFieldMap model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("sourceTypedObject")) {
                this.sourceTypedObject(model.getSourceTypedObject());
            }
            if (model.wasPropertyExplicitlySet("targetTypedObject")) {
                this.targetTypedObject(model.getTargetTypedObject());
            }
            if (model.wasPropertyExplicitlySet("sourceScopeReference")) {
                this.sourceScopeReference(model.getSourceScopeReference());
            }
            if (model.wasPropertyExplicitlySet("targetScopeReference")) {
                this.targetScopeReference(model.getTargetScopeReference());
            }
            if (model.wasPropertyExplicitlySet("sourceFieldName")) {
                this.sourceFieldName(model.getSourceFieldName());
            }
            if (model.wasPropertyExplicitlySet("targetFieldName")) {
                this.targetFieldName(model.getTargetFieldName());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
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
    public DirectNamedFieldMap(
            String description,
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            String sourceTypedObject,
            String targetTypedObject,
            ScopeReference sourceScopeReference,
            ScopeReference targetScopeReference,
            String sourceFieldName,
            String targetFieldName,
            Integer objectStatus) {
        super(description);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.configValues = configValues;
        this.sourceTypedObject = sourceTypedObject;
        this.targetTypedObject = targetTypedObject;
        this.sourceScopeReference = sourceScopeReference;
        this.targetScopeReference = targetScopeReference;
        this.sourceFieldName = sourceFieldName;
        this.targetFieldName = targetFieldName;
        this.objectStatus = objectStatus;
    }

    /** The object key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The object's model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
    }

    /** Deprecated - Reference to a typed object. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTypedObject")
    private final String sourceTypedObject;

    /**
     * Deprecated - Reference to a typed object.
     *
     * @return the value
     */
    public String getSourceTypedObject() {
        return sourceTypedObject;
    }

    /** Deprecated - Reference to a typed object */
    @com.fasterxml.jackson.annotation.JsonProperty("targetTypedObject")
    private final String targetTypedObject;

    /**
     * Deprecated - Reference to a typed object
     *
     * @return the value
     */
    public String getTargetTypedObject() {
        return targetTypedObject;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceScopeReference")
    private final ScopeReference sourceScopeReference;

    public ScopeReference getSourceScopeReference() {
        return sourceScopeReference;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetScopeReference")
    private final ScopeReference targetScopeReference;

    public ScopeReference getTargetScopeReference() {
        return targetScopeReference;
    }

    /** The source field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFieldName")
    private final String sourceFieldName;

    /**
     * The source field name.
     *
     * @return the value
     */
    public String getSourceFieldName() {
        return sourceFieldName;
    }

    /** The target field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetFieldName")
    private final String targetFieldName;

    /**
     * The target field name.
     *
     * @return the value
     */
    public String getTargetFieldName() {
        return targetFieldName;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
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
        sb.append("DirectNamedFieldMap(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", sourceTypedObject=").append(String.valueOf(this.sourceTypedObject));
        sb.append(", targetTypedObject=").append(String.valueOf(this.targetTypedObject));
        sb.append(", sourceScopeReference=").append(String.valueOf(this.sourceScopeReference));
        sb.append(", targetScopeReference=").append(String.valueOf(this.targetScopeReference));
        sb.append(", sourceFieldName=").append(String.valueOf(this.sourceFieldName));
        sb.append(", targetFieldName=").append(String.valueOf(this.targetFieldName));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DirectNamedFieldMap)) {
            return false;
        }

        DirectNamedFieldMap other = (DirectNamedFieldMap) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.sourceTypedObject, other.sourceTypedObject)
                && java.util.Objects.equals(this.targetTypedObject, other.targetTypedObject)
                && java.util.Objects.equals(this.sourceScopeReference, other.sourceScopeReference)
                && java.util.Objects.equals(this.targetScopeReference, other.targetScopeReference)
                && java.util.Objects.equals(this.sourceFieldName, other.sourceFieldName)
                && java.util.Objects.equals(this.targetFieldName, other.targetFieldName)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTypedObject == null ? 43 : this.sourceTypedObject.hashCode());
        result =
                (result * PRIME)
                        + (this.targetTypedObject == null ? 43 : this.targetTypedObject.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceScopeReference == null
                                ? 43
                                : this.sourceScopeReference.hashCode());
        result =
                (result * PRIME)
                        + (this.targetScopeReference == null
                                ? 43
                                : this.targetScopeReference.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceFieldName == null ? 43 : this.sourceFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetFieldName == null ? 43 : this.targetFieldName.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        return result;
    }
}
