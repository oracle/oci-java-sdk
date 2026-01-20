/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * A span filter written in text, or as the
 * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a SpanFilter
 * resource. If both are given, the filterText is used. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FilterTextOrId.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FilterTextOrId
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filterId", "filterText"})
    public FilterTextOrId(String filterId, String filterText) {
        super();
        this.filterId = filterId;
        this.filterText = filterText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Span Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is
         * generated when a Span Filter is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Span Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is
         * generated when a Span Filter is created.
         *
         * @param filterId the value to set
         * @return this builder
         */
        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }
        /** The string that defines the Span Filter expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterText")
        private String filterText;

        /**
         * The string that defines the Span Filter expression.
         *
         * @param filterText the value to set
         * @return this builder
         */
        public Builder filterText(String filterText) {
            this.filterText = filterText;
            this.__explicitlySet__.add("filterText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterTextOrId build() {
            FilterTextOrId model = new FilterTextOrId(this.filterId, this.filterText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterTextOrId model) {
            if (model.wasPropertyExplicitlySet("filterId")) {
                this.filterId(model.getFilterId());
            }
            if (model.wasPropertyExplicitlySet("filterText")) {
                this.filterText(model.getFilterText());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Span
     * Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is generated
     * when a Span Filter is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    private final String filterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Span
     * Filter. The filterId is mandatory for the creation of MetricGroups. A filterId is generated
     * when a Span Filter is created.
     *
     * @return the value
     */
    public String getFilterId() {
        return filterId;
    }

    /** The string that defines the Span Filter expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterText")
    private final String filterText;

    /**
     * The string that defines the Span Filter expression.
     *
     * @return the value
     */
    public String getFilterText() {
        return filterText;
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
        sb.append("FilterTextOrId(");
        sb.append("super=").append(super.toString());
        sb.append("filterId=").append(String.valueOf(this.filterId));
        sb.append(", filterText=").append(String.valueOf(this.filterText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterTextOrId)) {
            return false;
        }

        FilterTextOrId other = (FilterTextOrId) o;
        return java.util.Objects.equals(this.filterId, other.filterId)
                && java.util.Objects.equals(this.filterText, other.filterText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filterId == null ? 43 : this.filterId.hashCode());
        result = (result * PRIME) + (this.filterText == null ? 43 : this.filterText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
