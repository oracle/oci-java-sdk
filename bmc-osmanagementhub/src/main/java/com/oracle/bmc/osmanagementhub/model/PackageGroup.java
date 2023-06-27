/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Yum/DNF package group, category or environment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PackageGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PackageGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "repositories",
        "description",
        "isUserVisible",
        "isDefault",
        "groupType",
        "displayOrder",
        "packages"
    })
    public PackageGroup(
            String id,
            String name,
            java.util.List<String> repositories,
            String description,
            Boolean isUserVisible,
            Boolean isDefault,
            GroupType groupType,
            Integer displayOrder,
            java.util.List<String> packages) {
        super();
        this.id = id;
        this.name = name;
        this.repositories = repositories;
        this.description = description;
        this.isUserVisible = isUserVisible;
        this.isDefault = isDefault;
        this.groupType = groupType;
        this.displayOrder = displayOrder;
        this.packages = packages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Package group identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Package group identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Package group name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Package group name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * the IDs of the package group's repositories.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositories")
        private java.util.List<String> repositories;

        /**
         * the IDs of the package group's repositories.
         * @param repositories the value to set
         * @return this builder
         **/
        public Builder repositories(java.util.List<String> repositories) {
            this.repositories = repositories;
            this.__explicitlySet__.add("repositories");
            return this;
        }
        /**
         * description of the package group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * description of the package group.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Indicates if this package group is visible by users.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUserVisible")
        private Boolean isUserVisible;

        /**
         * Indicates if this package group is visible by users.
         * @param isUserVisible the value to set
         * @return this builder
         **/
        public Builder isUserVisible(Boolean isUserVisible) {
            this.isUserVisible = isUserVisible;
            this.__explicitlySet__.add("isUserVisible");
            return this;
        }
        /**
         * Indicates if this package group is the default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates if this package group is the default.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * Indicates if this is a group, category or environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupType")
        private GroupType groupType;

        /**
         * Indicates if this is a group, category or environment.
         * @param groupType the value to set
         * @return this builder
         **/
        public Builder groupType(GroupType groupType) {
            this.groupType = groupType;
            this.__explicitlySet__.add("groupType");
            return this;
        }
        /**
         * Indicates the order to display category or environment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
        private Integer displayOrder;

        /**
         * Indicates the order to display category or environment.
         * @param displayOrder the value to set
         * @return this builder
         **/
        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            this.__explicitlySet__.add("displayOrder");
            return this;
        }
        /**
         * The list of packages in the package group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<String> packages;

        /**
         * The list of packages in the package group.
         * @param packages the value to set
         * @return this builder
         **/
        public Builder packages(java.util.List<String> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PackageGroup build() {
            PackageGroup model =
                    new PackageGroup(
                            this.id,
                            this.name,
                            this.repositories,
                            this.description,
                            this.isUserVisible,
                            this.isDefault,
                            this.groupType,
                            this.displayOrder,
                            this.packages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PackageGroup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("repositories")) {
                this.repositories(model.getRepositories());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isUserVisible")) {
                this.isUserVisible(model.getIsUserVisible());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("groupType")) {
                this.groupType(model.getGroupType());
            }
            if (model.wasPropertyExplicitlySet("displayOrder")) {
                this.displayOrder(model.getDisplayOrder());
            }
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
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
     * Package group identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Package group identifier.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Package group name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Package group name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * the IDs of the package group's repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    private final java.util.List<String> repositories;

    /**
     * the IDs of the package group's repositories.
     * @return the value
     **/
    public java.util.List<String> getRepositories() {
        return repositories;
    }

    /**
     * description of the package group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * description of the package group.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Indicates if this package group is visible by users.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUserVisible")
    private final Boolean isUserVisible;

    /**
     * Indicates if this package group is visible by users.
     * @return the value
     **/
    public Boolean getIsUserVisible() {
        return isUserVisible;
    }

    /**
     * Indicates if this package group is the default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates if this package group is the default.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Indicates if this is a group, category or environment.
     **/
    public enum GroupType {
        Group("GROUP"),
        Environment("ENVIRONMENT"),
        Category("CATEGORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GroupType.class);

        private final String value;
        private static java.util.Map<String, GroupType> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupType v : GroupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GroupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GroupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates if this is a group, category or environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupType")
    private final GroupType groupType;

    /**
     * Indicates if this is a group, category or environment.
     * @return the value
     **/
    public GroupType getGroupType() {
        return groupType;
    }

    /**
     * Indicates the order to display category or environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    private final Integer displayOrder;

    /**
     * Indicates the order to display category or environment.
     * @return the value
     **/
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * The list of packages in the package group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<String> packages;

    /**
     * The list of packages in the package group.
     * @return the value
     **/
    public java.util.List<String> getPackages() {
        return packages;
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
        sb.append("PackageGroup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", repositories=").append(String.valueOf(this.repositories));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isUserVisible=").append(String.valueOf(this.isUserVisible));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", groupType=").append(String.valueOf(this.groupType));
        sb.append(", displayOrder=").append(String.valueOf(this.displayOrder));
        sb.append(", packages=").append(String.valueOf(this.packages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageGroup)) {
            return false;
        }

        PackageGroup other = (PackageGroup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.repositories, other.repositories)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isUserVisible, other.isUserVisible)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.groupType, other.groupType)
                && java.util.Objects.equals(this.displayOrder, other.displayOrder)
                && java.util.Objects.equals(this.packages, other.packages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.repositories == null ? 43 : this.repositories.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserVisible == null ? 43 : this.isUserVisible.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.groupType == null ? 43 : this.groupType.hashCode());
        result = (result * PRIME) + (this.displayOrder == null ? 43 : this.displayOrder.hashCode());
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
