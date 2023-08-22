/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Metadata of a column in a data object resultset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataObjectColumnMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataObjectColumnMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "category",
        "dataType",
        "dataTypeName",
        "displayName",
        "description",
        "groupName",
        "unitDetails"
    })
    public DataObjectColumnMetadata(
            String name,
            Category category,
            String dataType,
            DataTypeName dataTypeName,
            String displayName,
            String description,
            String groupName,
            DataObjectColumnUnit unitDetails) {
        super();
        this.name = name;
        this.category = category;
        this.dataType = dataType;
        this.dataTypeName = dataTypeName;
        this.displayName = displayName;
        this.description = description;
        this.groupName = groupName;
        this.unitDetails = unitDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the column.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Category of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * Category of the column.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** Type of a data object column. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Type of a data object column.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Type name of a data object column. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataTypeName")
        private DataTypeName dataTypeName;

        /**
         * Type name of a data object column.
         *
         * @param dataTypeName the value to set
         * @return this builder
         */
        public Builder dataTypeName(DataTypeName dataTypeName) {
            this.dataTypeName = dataTypeName;
            this.__explicitlySet__.add("dataTypeName");
            return this;
        }
        /** Display name of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the column.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the column.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Group name of the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * Group name of the column.
         *
         * @param groupName the value to set
         * @return this builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitDetails")
        private DataObjectColumnUnit unitDetails;

        public Builder unitDetails(DataObjectColumnUnit unitDetails) {
            this.unitDetails = unitDetails;
            this.__explicitlySet__.add("unitDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataObjectColumnMetadata build() {
            DataObjectColumnMetadata model =
                    new DataObjectColumnMetadata(
                            this.name,
                            this.category,
                            this.dataType,
                            this.dataTypeName,
                            this.displayName,
                            this.description,
                            this.groupName,
                            this.unitDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataObjectColumnMetadata model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("dataTypeName")) {
                this.dataTypeName(model.getDataTypeName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("unitDetails")) {
                this.unitDetails(model.getUnitDetails());
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

    /** Name of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the column.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Category of the column. */
    public enum Category implements com.oracle.bmc.http.internal.BmcEnum {
        Dimension("DIMENSION"),
        Metric("METRIC"),
        TimeDimension("TIME_DIMENSION"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Category of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * Category of the column.
     *
     * @return the value
     */
    public Category getCategory() {
        return category;
    }

    /** Type of a data object column. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Type of a data object column.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** Type name of a data object column. */
    public enum DataTypeName implements com.oracle.bmc.http.internal.BmcEnum {
        Number("NUMBER"),
        Timestamp("TIMESTAMP"),
        Varchar2("VARCHAR2"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataTypeName.class);

        private final String value;
        private static java.util.Map<String, DataTypeName> map;

        static {
            map = new java.util.HashMap<>();
            for (DataTypeName v : DataTypeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataTypeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataTypeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataTypeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type name of a data object column. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypeName")
    private final DataTypeName dataTypeName;

    /**
     * Type name of a data object column.
     *
     * @return the value
     */
    public DataTypeName getDataTypeName() {
        return dataTypeName;
    }

    /** Display name of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the column.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the column.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Group name of the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * Group name of the column.
     *
     * @return the value
     */
    public String getGroupName() {
        return groupName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("unitDetails")
    private final DataObjectColumnUnit unitDetails;

    public DataObjectColumnUnit getUnitDetails() {
        return unitDetails;
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
        sb.append("DataObjectColumnMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", dataTypeName=").append(String.valueOf(this.dataTypeName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(", unitDetails=").append(String.valueOf(this.unitDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectColumnMetadata)) {
            return false;
        }

        DataObjectColumnMetadata other = (DataObjectColumnMetadata) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.dataTypeName, other.dataTypeName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.unitDetails, other.unitDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.dataTypeName == null ? 43 : this.dataTypeName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.unitDetails == null ? 43 : this.unitDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
