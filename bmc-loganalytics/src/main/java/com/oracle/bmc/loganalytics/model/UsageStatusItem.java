/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UsageStatusItem
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageStatusItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageStatusItem {
    @Deprecated
    @java.beans.ConstructorProperties({"dataType", "isMultiValued", "currentUsage", "maxAvailable"})
    public UsageStatusItem(
            String dataType, Boolean isMultiValued, Long currentUsage, Integer maxAvailable) {
        super();
        this.dataType = dataType;
        this.isMultiValued = isMultiValued;
        this.currentUsage = currentUsage;
        this.maxAvailable = maxAvailable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The field data type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * The field data type.
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * A flag indicating whether or not the field is multi-valued.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        /**
         * A flag indicating whether or not the field is multi-valued.
         *
         * @param isMultiValued the value to set
         * @return this builder
         **/
        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }
        /**
         * The current usage of the field.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
        private Long currentUsage;

        /**
         * The current usage of the field.
         * @param currentUsage the value to set
         * @return this builder
         **/
        public Builder currentUsage(Long currentUsage) {
            this.currentUsage = currentUsage;
            this.__explicitlySet__.add("currentUsage");
            return this;
        }
        /**
         * The maximum availability of the field.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxAvailable")
        private Integer maxAvailable;

        /**
         * The maximum availability of the field.
         * @param maxAvailable the value to set
         * @return this builder
         **/
        public Builder maxAvailable(Integer maxAvailable) {
            this.maxAvailable = maxAvailable;
            this.__explicitlySet__.add("maxAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageStatusItem build() {
            UsageStatusItem __instance__ =
                    new UsageStatusItem(dataType, isMultiValued, currentUsage, maxAvailable);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageStatusItem o) {
            Builder copiedBuilder =
                    dataType(o.getDataType())
                            .isMultiValued(o.getIsMultiValued())
                            .currentUsage(o.getCurrentUsage())
                            .maxAvailable(o.getMaxAvailable());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The field data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * The field data type.
     * @return the value
     **/
    public String getDataType() {
        return dataType;
    }

    /**
     * A flag indicating whether or not the field is multi-valued.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    private final Boolean isMultiValued;

    /**
     * A flag indicating whether or not the field is multi-valued.
     *
     * @return the value
     **/
    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    /**
     * The current usage of the field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
    private final Long currentUsage;

    /**
     * The current usage of the field.
     * @return the value
     **/
    public Long getCurrentUsage() {
        return currentUsage;
    }

    /**
     * The maximum availability of the field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAvailable")
    private final Integer maxAvailable;

    /**
     * The maximum availability of the field.
     * @return the value
     **/
    public Integer getMaxAvailable() {
        return maxAvailable;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UsageStatusItem(");
        sb.append("dataType=").append(String.valueOf(this.dataType));
        sb.append(", isMultiValued=").append(String.valueOf(this.isMultiValued));
        sb.append(", currentUsage=").append(String.valueOf(this.currentUsage));
        sb.append(", maxAvailable=").append(String.valueOf(this.maxAvailable));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageStatusItem)) {
            return false;
        }

        UsageStatusItem other = (UsageStatusItem) o;
        return java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.isMultiValued, other.isMultiValued)
                && java.util.Objects.equals(this.currentUsage, other.currentUsage)
                && java.util.Objects.equals(this.maxAvailable, other.maxAvailable)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiValued == null ? 43 : this.isMultiValued.hashCode());
        result = (result * PRIME) + (this.currentUsage == null ? 43 : this.currentUsage.hashCode());
        result = (result * PRIME) + (this.maxAvailable == null ? 43 : this.maxAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
