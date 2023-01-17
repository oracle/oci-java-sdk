/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ForeignKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ForeignKey extends Key {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The object key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The object's model version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
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
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * An array of attribute references.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeRefs")
        private java.util.List<KeyAttribute> attributeRefs;

        /**
         * An array of attribute references.
         * @param attributeRefs the value to set
         * @return this builder
         **/
        public Builder attributeRefs(java.util.List<KeyAttribute> attributeRefs) {
            this.attributeRefs = attributeRefs;
            this.__explicitlySet__.add("attributeRefs");
            return this;
        }
        /**
         * The update rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateRule")
        private Integer updateRule;

        /**
         * The update rule.
         * @param updateRule the value to set
         * @return this builder
         **/
        public Builder updateRule(Integer updateRule) {
            this.updateRule = updateRule;
            this.__explicitlySet__.add("updateRule");
            return this;
        }
        /**
         * The delete rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deleteRule")
        private Integer deleteRule;

        /**
         * The delete rule.
         * @param deleteRule the value to set
         * @return this builder
         **/
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

        public ForeignKey build() {
            ForeignKey model =
                    new ForeignKey(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.attributeRefs,
                            this.updateRule,
                            this.deleteRule,
                            this.referenceUniqueKey,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ForeignKey model) {
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
            if (model.wasPropertyExplicitlySet("attributeRefs")) {
                this.attributeRefs(model.getAttributeRefs());
            }
            if (model.wasPropertyExplicitlySet("updateRule")) {
                this.updateRule(model.getUpdateRule());
            }
            if (model.wasPropertyExplicitlySet("deleteRule")) {
                this.deleteRule(model.getDeleteRule());
            }
            if (model.wasPropertyExplicitlySet("referenceUniqueKey")) {
                this.referenceUniqueKey(model.getReferenceUniqueKey());
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
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
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
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * An array of attribute references.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeRefs")
    private final java.util.List<KeyAttribute> attributeRefs;

    /**
     * An array of attribute references.
     * @return the value
     **/
    public java.util.List<KeyAttribute> getAttributeRefs() {
        return attributeRefs;
    }

    /**
     * The update rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateRule")
    private final Integer updateRule;

    /**
     * The update rule.
     * @return the value
     **/
    public Integer getUpdateRule() {
        return updateRule;
    }

    /**
     * The delete rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deleteRule")
    private final Integer deleteRule;

    /**
     * The delete rule.
     * @return the value
     **/
    public Integer getDeleteRule() {
        return deleteRule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("referenceUniqueKey")
    private final UniqueKey referenceUniqueKey;

    public UniqueKey getReferenceUniqueKey() {
        return referenceUniqueKey;
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
        sb.append("ForeignKey(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", attributeRefs=").append(String.valueOf(this.attributeRefs));
        sb.append(", updateRule=").append(String.valueOf(this.updateRule));
        sb.append(", deleteRule=").append(String.valueOf(this.deleteRule));
        sb.append(", referenceUniqueKey=").append(String.valueOf(this.referenceUniqueKey));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForeignKey)) {
            return false;
        }

        ForeignKey other = (ForeignKey) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.attributeRefs, other.attributeRefs)
                && java.util.Objects.equals(this.updateRule, other.updateRule)
                && java.util.Objects.equals(this.deleteRule, other.deleteRule)
                && java.util.Objects.equals(this.referenceUniqueKey, other.referenceUniqueKey)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeRefs == null ? 43 : this.attributeRefs.hashCode());
        result = (result * PRIME) + (this.updateRule == null ? 43 : this.updateRule.hashCode());
        result = (result * PRIME) + (this.deleteRule == null ? 43 : this.deleteRule.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceUniqueKey == null
                                ? 43
                                : this.referenceUniqueKey.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        return result;
    }
}
