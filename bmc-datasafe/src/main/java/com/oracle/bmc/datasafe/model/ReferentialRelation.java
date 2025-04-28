/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A referential relation is a resource corresponding to database columns. It's a subresource of
 * sensitive data model resource and is always associated with a sensitive data model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReferentialRelation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReferentialRelation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "lifecycleState",
        "sensitiveDataModelId",
        "relationType",
        "parent",
        "child",
        "isSensitive"
    })
    public ReferentialRelation(
            String key,
            ReferentialRelationLifecycleState lifecycleState,
            String sensitiveDataModelId,
            RelationType relationType,
            ColumnsInfo parent,
            ColumnsInfo child,
            Boolean isSensitive) {
        super();
        this.key = key;
        this.lifecycleState = lifecycleState;
        this.sensitiveDataModelId = sensitiveDataModelId;
        this.relationType = relationType;
        this.parent = parent;
        this.child = child;
        this.isSensitive = isSensitive;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies the referential relation. It's numeric and unique within a
         * sensitive data model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies the referential relation. It's numeric and unique within a
         * sensitive data model.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The current state of the referential relation. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ReferentialRelationLifecycleState lifecycleState;

        /**
         * The current state of the referential relation.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ReferentialRelationLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The OCID of the sensitive data model that contains the sensitive column. */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        /**
         * The OCID of the sensitive data model that contains the sensitive column.
         *
         * @param sensitiveDataModelId the value to set
         * @return this builder
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }
        /**
         * The type of referential relationship the sensitive column has with its parent. NONE
         * indicates that the sensitive column does not have a parent. DB_DEFINED indicates that the
         * relationship is defined in the database dictionary. APP_DEFINED indicates that the
         * relationship is defined at the application level and not in the database dictionary.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relationType")
        private RelationType relationType;

        /**
         * The type of referential relationship the sensitive column has with its parent. NONE
         * indicates that the sensitive column does not have a parent. DB_DEFINED indicates that the
         * relationship is defined in the database dictionary. APP_DEFINED indicates that the
         * relationship is defined at the application level and not in the database dictionary.
         *
         * @param relationType the value to set
         * @return this builder
         */
        public Builder relationType(RelationType relationType) {
            this.relationType = relationType;
            this.__explicitlySet__.add("relationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parent")
        private ColumnsInfo parent;

        public Builder parent(ColumnsInfo parent) {
            this.parent = parent;
            this.__explicitlySet__.add("parent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("child")
        private ColumnsInfo child;

        public Builder child(ColumnsInfo child) {
            this.child = child;
            this.__explicitlySet__.add("child");
            return this;
        }
        /**
         * Determines if the columns present in the referential relation is present in the sensitive
         * data model
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * Determines if the columns present in the referential relation is present in the sensitive
         * data model
         *
         * @param isSensitive the value to set
         * @return this builder
         */
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReferentialRelation build() {
            ReferentialRelation model =
                    new ReferentialRelation(
                            this.key,
                            this.lifecycleState,
                            this.sensitiveDataModelId,
                            this.relationType,
                            this.parent,
                            this.child,
                            this.isSensitive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReferentialRelation model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sensitiveDataModelId")) {
                this.sensitiveDataModelId(model.getSensitiveDataModelId());
            }
            if (model.wasPropertyExplicitlySet("relationType")) {
                this.relationType(model.getRelationType());
            }
            if (model.wasPropertyExplicitlySet("parent")) {
                this.parent(model.getParent());
            }
            if (model.wasPropertyExplicitlySet("child")) {
                this.child(model.getChild());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
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

    /**
     * The unique key that identifies the referential relation. It's numeric and unique within a
     * sensitive data model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies the referential relation. It's numeric and unique within a
     * sensitive data model.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The current state of the referential relation. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ReferentialRelationLifecycleState lifecycleState;

    /**
     * The current state of the referential relation.
     *
     * @return the value
     */
    public ReferentialRelationLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The OCID of the sensitive data model that contains the sensitive column. */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    private final String sensitiveDataModelId;

    /**
     * The OCID of the sensitive data model that contains the sensitive column.
     *
     * @return the value
     */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }

    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates
     * that the sensitive column does not have a parent. DB_DEFINED indicates that the relationship
     * is defined in the database dictionary. APP_DEFINED indicates that the relationship is defined
     * at the application level and not in the database dictionary.
     */
    public enum RelationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RelationType.class);

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RelationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RelationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates
     * that the sensitive column does not have a parent. DB_DEFINED indicates that the relationship
     * is defined in the database dictionary. APP_DEFINED indicates that the relationship is defined
     * at the application level and not in the database dictionary.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    private final RelationType relationType;

    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates
     * that the sensitive column does not have a parent. DB_DEFINED indicates that the relationship
     * is defined in the database dictionary. APP_DEFINED indicates that the relationship is defined
     * at the application level and not in the database dictionary.
     *
     * @return the value
     */
    public RelationType getRelationType() {
        return relationType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    private final ColumnsInfo parent;

    public ColumnsInfo getParent() {
        return parent;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("child")
    private final ColumnsInfo child;

    public ColumnsInfo getChild() {
        return child;
    }

    /**
     * Determines if the columns present in the referential relation is present in the sensitive
     * data model
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * Determines if the columns present in the referential relation is present in the sensitive
     * data model
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
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
        sb.append("ReferentialRelation(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(", relationType=").append(String.valueOf(this.relationType));
        sb.append(", parent=").append(String.valueOf(this.parent));
        sb.append(", child=").append(String.valueOf(this.child));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReferentialRelation)) {
            return false;
        }

        ReferentialRelation other = (ReferentialRelation) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(this.parent, other.parent)
                && java.util.Objects.equals(this.child, other.child)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result = (result * PRIME) + (this.parent == null ? 43 : this.parent.hashCode());
        result = (result * PRIME) + (this.child == null ? 43 : this.child.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
