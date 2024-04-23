/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * The yum or DNF package group that is associated with a software source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PackageGroupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PackageGroupSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "isUserVisible",
        "isDefault",
        "repositories",
        "groupType",
        "displayOrder"
    })
    public PackageGroupSummary(
            String id,
            String name,
            String description,
            Boolean isUserVisible,
            Boolean isDefault,
            java.util.List<String> repositories,
            PackageGroup.GroupType groupType,
            Integer displayOrder) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.isUserVisible = isUserVisible;
        this.isDefault = isDefault;
        this.repositories = repositories;
        this.groupType = groupType;
        this.displayOrder = displayOrder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Package group identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Package group identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Package group name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Package group name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Description of the package group. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the package group.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Indicates if this package group is visible to users. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUserVisible")
        private Boolean isUserVisible;

        /**
         * Indicates if this package group is visible to users.
         *
         * @param isUserVisible the value to set
         * @return this builder
         */
        public Builder isUserVisible(Boolean isUserVisible) {
            this.isUserVisible = isUserVisible;
            this.__explicitlySet__.add("isUserVisible");
            return this;
        }
        /** Indicates if this package group is the default. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates if this package group is the default.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /** The repository IDs of the package group. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositories")
        private java.util.List<String> repositories;

        /**
         * The repository IDs of the package group.
         *
         * @param repositories the value to set
         * @return this builder
         */
        public Builder repositories(java.util.List<String> repositories) {
            this.repositories = repositories;
            this.__explicitlySet__.add("repositories");
            return this;
        }
        /** Indicates if this is a group, category or environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupType")
        private PackageGroup.GroupType groupType;

        /**
         * Indicates if this is a group, category or environment.
         *
         * @param groupType the value to set
         * @return this builder
         */
        public Builder groupType(PackageGroup.GroupType groupType) {
            this.groupType = groupType;
            this.__explicitlySet__.add("groupType");
            return this;
        }
        /** Indicates the order to display category or environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
        private Integer displayOrder;

        /**
         * Indicates the order to display category or environment.
         *
         * @param displayOrder the value to set
         * @return this builder
         */
        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            this.__explicitlySet__.add("displayOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PackageGroupSummary build() {
            PackageGroupSummary model =
                    new PackageGroupSummary(
                            this.id,
                            this.name,
                            this.description,
                            this.isUserVisible,
                            this.isDefault,
                            this.repositories,
                            this.groupType,
                            this.displayOrder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PackageGroupSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
            if (model.wasPropertyExplicitlySet("repositories")) {
                this.repositories(model.getRepositories());
            }
            if (model.wasPropertyExplicitlySet("groupType")) {
                this.groupType(model.getGroupType());
            }
            if (model.wasPropertyExplicitlySet("displayOrder")) {
                this.displayOrder(model.getDisplayOrder());
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

    /** Package group identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Package group identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Package group name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Package group name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Description of the package group. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the package group.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Indicates if this package group is visible to users. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUserVisible")
    private final Boolean isUserVisible;

    /**
     * Indicates if this package group is visible to users.
     *
     * @return the value
     */
    public Boolean getIsUserVisible() {
        return isUserVisible;
    }

    /** Indicates if this package group is the default. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates if this package group is the default.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /** The repository IDs of the package group. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    private final java.util.List<String> repositories;

    /**
     * The repository IDs of the package group.
     *
     * @return the value
     */
    public java.util.List<String> getRepositories() {
        return repositories;
    }

    /** Indicates if this is a group, category or environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupType")
    private final PackageGroup.GroupType groupType;

    /**
     * Indicates if this is a group, category or environment.
     *
     * @return the value
     */
    public PackageGroup.GroupType getGroupType() {
        return groupType;
    }

    /** Indicates the order to display category or environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    private final Integer displayOrder;

    /**
     * Indicates the order to display category or environment.
     *
     * @return the value
     */
    public Integer getDisplayOrder() {
        return displayOrder;
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
        sb.append("PackageGroupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isUserVisible=").append(String.valueOf(this.isUserVisible));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", repositories=").append(String.valueOf(this.repositories));
        sb.append(", groupType=").append(String.valueOf(this.groupType));
        sb.append(", displayOrder=").append(String.valueOf(this.displayOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageGroupSummary)) {
            return false;
        }

        PackageGroupSummary other = (PackageGroupSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isUserVisible, other.isUserVisible)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.repositories, other.repositories)
                && java.util.Objects.equals(this.groupType, other.groupType)
                && java.util.Objects.equals(this.displayOrder, other.displayOrder)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserVisible == null ? 43 : this.isUserVisible.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.repositories == null ? 43 : this.repositories.hashCode());
        result = (result * PRIME) + (this.groupType == null ? 43 : this.groupType.hashCode());
        result = (result * PRIME) + (this.displayOrder == null ? 43 : this.displayOrder.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
