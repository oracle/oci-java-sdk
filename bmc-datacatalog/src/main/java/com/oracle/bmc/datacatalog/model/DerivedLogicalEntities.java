/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Entities derived from the application of a pattern to a list of file paths.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DerivedLogicalEntities.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DerivedLogicalEntities {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "realizedExpression", "filesInLogicalGrouping"})
    public DerivedLogicalEntities(
            String name, String realizedExpression, java.util.List<String> filesInLogicalGrouping) {
        super();
        this.name = name;
        this.realizedExpression = realizedExpression;
        this.filesInLogicalGrouping = filesInLogicalGrouping;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the derived logical entity. The group name of the unmatched files will be UNMATCHED
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the derived logical entity. The group name of the unmatched files will be UNMATCHED
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The expression realized after resolving qualifiers . Used in deriving this logical entity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("realizedExpression")
        private String realizedExpression;

        /**
         * The expression realized after resolving qualifiers . Used in deriving this logical entity
         * @param realizedExpression the value to set
         * @return this builder
         **/
        public Builder realizedExpression(String realizedExpression) {
            this.realizedExpression = realizedExpression;
            this.__explicitlySet__.add("realizedExpression");
            return this;
        }
        /**
         * The list of file paths that belong to the grouping of logical entity or UNMATCHED for which realizedExpression is a selector.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filesInLogicalGrouping")
        private java.util.List<String> filesInLogicalGrouping;

        /**
         * The list of file paths that belong to the grouping of logical entity or UNMATCHED for which realizedExpression is a selector.
         * @param filesInLogicalGrouping the value to set
         * @return this builder
         **/
        public Builder filesInLogicalGrouping(java.util.List<String> filesInLogicalGrouping) {
            this.filesInLogicalGrouping = filesInLogicalGrouping;
            this.__explicitlySet__.add("filesInLogicalGrouping");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DerivedLogicalEntities build() {
            DerivedLogicalEntities __instance__ =
                    new DerivedLogicalEntities(name, realizedExpression, filesInLogicalGrouping);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DerivedLogicalEntities o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .realizedExpression(o.getRealizedExpression())
                            .filesInLogicalGrouping(o.getFilesInLogicalGrouping());

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
     * The name of the derived logical entity. The group name of the unmatched files will be UNMATCHED
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the derived logical entity. The group name of the unmatched files will be UNMATCHED
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The expression realized after resolving qualifiers . Used in deriving this logical entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realizedExpression")
    private final String realizedExpression;

    /**
     * The expression realized after resolving qualifiers . Used in deriving this logical entity
     * @return the value
     **/
    public String getRealizedExpression() {
        return realizedExpression;
    }

    /**
     * The list of file paths that belong to the grouping of logical entity or UNMATCHED for which realizedExpression is a selector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filesInLogicalGrouping")
    private final java.util.List<String> filesInLogicalGrouping;

    /**
     * The list of file paths that belong to the grouping of logical entity or UNMATCHED for which realizedExpression is a selector.
     * @return the value
     **/
    public java.util.List<String> getFilesInLogicalGrouping() {
        return filesInLogicalGrouping;
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
        sb.append("DerivedLogicalEntities(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", realizedExpression=").append(String.valueOf(this.realizedExpression));
        sb.append(", filesInLogicalGrouping=").append(String.valueOf(this.filesInLogicalGrouping));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DerivedLogicalEntities)) {
            return false;
        }

        DerivedLogicalEntities other = (DerivedLogicalEntities) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.realizedExpression, other.realizedExpression)
                && java.util.Objects.equals(
                        this.filesInLogicalGrouping, other.filesInLogicalGrouping)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.realizedExpression == null
                                ? 43
                                : this.realizedExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.filesInLogicalGrouping == null
                                ? 43
                                : this.filesInLogicalGrouping.hashCode());
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
