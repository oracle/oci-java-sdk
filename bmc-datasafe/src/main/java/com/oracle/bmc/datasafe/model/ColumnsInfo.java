/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * columnsInfo object has details of column group with schema details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ColumnsInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ColumnsInfo extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaName",
        "objectType",
        "objectName",
        "appName",
        "columnGroup",
        "sensitiveTypeIds"
    })
    public ColumnsInfo(
            String schemaName,
            ObjectType objectType,
            String objectName,
            String appName,
            java.util.List<String> columnGroup,
            java.util.List<String> sensitiveTypeIds) {
        super();
        this.schemaName = schemaName;
        this.objectType = objectType;
        this.objectName = objectName;
        this.appName = appName;
        this.columnGroup = columnGroup;
        this.sensitiveTypeIds = sensitiveTypeIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The schema name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The schema name.
         * @param schemaName the value to set
         * @return this builder
         **/
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * The type of the database object that contains the sensitive column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the database object that contains the sensitive column.
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /**
         * The database object that contains the columns.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The database object that contains the columns.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The application name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appName")
        private String appName;

        /**
         * The application name.
         * @param appName the value to set
         * @return this builder
         **/
        public Builder appName(String appName) {
            this.appName = appName;
            this.__explicitlySet__.add("appName");
            return this;
        }
        /**
         * Group of columns in referential relation. Order needs to be maintained in the elements of the parent/child array listing.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnGroup")
        private java.util.List<String> columnGroup;

        /**
         * Group of columns in referential relation. Order needs to be maintained in the elements of the parent/child array listing.
         *
         * @param columnGroup the value to set
         * @return this builder
         **/
        public Builder columnGroup(java.util.List<String> columnGroup) {
            this.columnGroup = columnGroup;
            this.__explicitlySet__.add("columnGroup");
            return this;
        }
        /**
         * Sensitive type ocids of each column groups. Order needs to be maintained with the parent column group.
         * For the DB defined referential relations identified during SDM creation, we cannot add sensitive types.
         * Instead use the sensitiveColumn POST API to mark the columns sensitive.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIds")
        private java.util.List<String> sensitiveTypeIds;

        /**
         * Sensitive type ocids of each column groups. Order needs to be maintained with the parent column group.
         * For the DB defined referential relations identified during SDM creation, we cannot add sensitive types.
         * Instead use the sensitiveColumn POST API to mark the columns sensitive.
         *
         * @param sensitiveTypeIds the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeIds(java.util.List<String> sensitiveTypeIds) {
            this.sensitiveTypeIds = sensitiveTypeIds;
            this.__explicitlySet__.add("sensitiveTypeIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ColumnsInfo build() {
            ColumnsInfo model =
                    new ColumnsInfo(
                            this.schemaName,
                            this.objectType,
                            this.objectName,
                            this.appName,
                            this.columnGroup,
                            this.sensitiveTypeIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ColumnsInfo model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("appName")) {
                this.appName(model.getAppName());
            }
            if (model.wasPropertyExplicitlySet("columnGroup")) {
                this.columnGroup(model.getColumnGroup());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeIds")) {
                this.sensitiveTypeIds(model.getSensitiveTypeIds());
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
     * The schema name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The schema name.
     * @return the value
     **/
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * The type of the database object that contains the sensitive column.
     **/
    public enum ObjectType {
        Table("TABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ObjectType.class);

        private final String value;
        private static java.util.Map<String, ObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (ObjectType v : ObjectType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ObjectType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ObjectType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ObjectType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the database object that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the database object that contains the sensitive column.
     * @return the value
     **/
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * The database object that contains the columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The database object that contains the columns.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * The application name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appName")
    private final String appName;

    /**
     * The application name.
     * @return the value
     **/
    public String getAppName() {
        return appName;
    }

    /**
     * Group of columns in referential relation. Order needs to be maintained in the elements of the parent/child array listing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnGroup")
    private final java.util.List<String> columnGroup;

    /**
     * Group of columns in referential relation. Order needs to be maintained in the elements of the parent/child array listing.
     *
     * @return the value
     **/
    public java.util.List<String> getColumnGroup() {
        return columnGroup;
    }

    /**
     * Sensitive type ocids of each column groups. Order needs to be maintained with the parent column group.
     * For the DB defined referential relations identified during SDM creation, we cannot add sensitive types.
     * Instead use the sensitiveColumn POST API to mark the columns sensitive.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIds")
    private final java.util.List<String> sensitiveTypeIds;

    /**
     * Sensitive type ocids of each column groups. Order needs to be maintained with the parent column group.
     * For the DB defined referential relations identified during SDM creation, we cannot add sensitive types.
     * Instead use the sensitiveColumn POST API to mark the columns sensitive.
     *
     * @return the value
     **/
    public java.util.List<String> getSensitiveTypeIds() {
        return sensitiveTypeIds;
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
        sb.append("ColumnsInfo(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", appName=").append(String.valueOf(this.appName));
        sb.append(", columnGroup=").append(String.valueOf(this.columnGroup));
        sb.append(", sensitiveTypeIds=").append(String.valueOf(this.sensitiveTypeIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColumnsInfo)) {
            return false;
        }

        ColumnsInfo other = (ColumnsInfo) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.appName, other.appName)
                && java.util.Objects.equals(this.columnGroup, other.columnGroup)
                && java.util.Objects.equals(this.sensitiveTypeIds, other.sensitiveTypeIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.appName == null ? 43 : this.appName.hashCode());
        result = (result * PRIME) + (this.columnGroup == null ? 43 : this.columnGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeIds == null ? 43 : this.sensitiveTypeIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
