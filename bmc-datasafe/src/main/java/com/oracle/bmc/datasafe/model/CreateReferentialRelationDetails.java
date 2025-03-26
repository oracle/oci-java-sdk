/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A sensitive column is a resource corresponding to a database column that is considered sensitive.
 * It's a subresource of sensitive data model resource and is always associated with a sensitive data model.
 * Note that referential relationships are also managed as part of sensitive columns.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateReferentialRelationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateReferentialRelationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"relationType", "parent", "child", "isSensitive"})
    public CreateReferentialRelationDetails(
            RelationType relationType, ColumnsInfo parent, ColumnsInfo child, Boolean isSensitive) {
        super();
        this.relationType = relationType;
        this.parent = parent;
        this.child = child;
        this.isSensitive = isSensitive;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of referential relationship the sensitive column has with its parent.
         * DB_DEFINED indicates that the relationship is defined in the database dictionary.
         * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relationType")
        private RelationType relationType;

        /**
         * The type of referential relationship the sensitive column has with its parent.
         * DB_DEFINED indicates that the relationship is defined in the database dictionary.
         * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
         *
         * @param relationType the value to set
         * @return this builder
         **/
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
         * Add to sensitive data model if passed true. If false is passed, then the
         * columns will not be added in the sensitive data model as sensitive columns and
         * if sensitive type OCIDs are assigned to the columns, then the sensitive type
         * OCIDs will not be retained.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * Add to sensitive data model if passed true. If false is passed, then the
         * columns will not be added in the sensitive data model as sensitive columns and
         * if sensitive type OCIDs are assigned to the columns, then the sensitive type
         * OCIDs will not be retained.
         *
         * @param isSensitive the value to set
         * @return this builder
         **/
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReferentialRelationDetails build() {
            CreateReferentialRelationDetails model =
                    new CreateReferentialRelationDetails(
                            this.relationType, this.parent, this.child, this.isSensitive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReferentialRelationDetails model) {
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
     * The type of referential relationship the sensitive column has with its parent.
     * DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    public enum RelationType {
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid RelationType: " + key);
        }
    };
    /**
     * The type of referential relationship the sensitive column has with its parent.
     * DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    private final RelationType relationType;

    /**
     * The type of referential relationship the sensitive column has with its parent.
     * DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     * @return the value
     **/
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
     * Add to sensitive data model if passed true. If false is passed, then the
     * columns will not be added in the sensitive data model as sensitive columns and
     * if sensitive type OCIDs are assigned to the columns, then the sensitive type
     * OCIDs will not be retained.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * Add to sensitive data model if passed true. If false is passed, then the
     * columns will not be added in the sensitive data model as sensitive columns and
     * if sensitive type OCIDs are assigned to the columns, then the sensitive type
     * OCIDs will not be retained.
     *
     * @return the value
     **/
    public Boolean getIsSensitive() {
        return isSensitive;
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
        sb.append("CreateReferentialRelationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("relationType=").append(String.valueOf(this.relationType));
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
        if (!(o instanceof CreateReferentialRelationDetails)) {
            return false;
        }

        CreateReferentialRelationDetails other = (CreateReferentialRelationDetails) o;
        return java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(this.parent, other.parent)
                && java.util.Objects.equals(this.child, other.child)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result = (result * PRIME) + (this.parent == null ? 43 : this.parent.hashCode());
        result = (result * PRIME) + (this.child == null ? 43 : this.child.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
