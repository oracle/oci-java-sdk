/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The search criteria for listing monitored resource member targets. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SearchMonitoredResourceMembersDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SearchMonitoredResourceMembersDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"destinationResourceId", "limitLevel"})
    public SearchMonitoredResourceMembersDetails(String destinationResourceId, Integer limitLevel) {
        super();
        this.destinationResourceId = destinationResourceId;
        this.limitLevel = limitLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Destination Monitored Resource Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
        private String destinationResourceId;

        /**
         * Destination Monitored Resource Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param destinationResourceId the value to set
         * @return this builder
         */
        public Builder destinationResourceId(String destinationResourceId) {
            this.destinationResourceId = destinationResourceId;
            this.__explicitlySet__.add("destinationResourceId");
            return this;
        }
        /** The field which determines the depth of hierarchy while searching for members. */
        @com.fasterxml.jackson.annotation.JsonProperty("limitLevel")
        private Integer limitLevel;

        /**
         * The field which determines the depth of hierarchy while searching for members.
         *
         * @param limitLevel the value to set
         * @return this builder
         */
        public Builder limitLevel(Integer limitLevel) {
            this.limitLevel = limitLevel;
            this.__explicitlySet__.add("limitLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchMonitoredResourceMembersDetails build() {
            SearchMonitoredResourceMembersDetails model =
                    new SearchMonitoredResourceMembersDetails(
                            this.destinationResourceId, this.limitLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchMonitoredResourceMembersDetails model) {
            if (model.wasPropertyExplicitlySet("destinationResourceId")) {
                this.destinationResourceId(model.getDestinationResourceId());
            }
            if (model.wasPropertyExplicitlySet("limitLevel")) {
                this.limitLevel(model.getLimitLevel());
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
     * Destination Monitored Resource Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
    private final String destinationResourceId;

    /**
     * Destination Monitored Resource Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getDestinationResourceId() {
        return destinationResourceId;
    }

    /** The field which determines the depth of hierarchy while searching for members. */
    @com.fasterxml.jackson.annotation.JsonProperty("limitLevel")
    private final Integer limitLevel;

    /**
     * The field which determines the depth of hierarchy while searching for members.
     *
     * @return the value
     */
    public Integer getLimitLevel() {
        return limitLevel;
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
        sb.append("SearchMonitoredResourceMembersDetails(");
        sb.append("super=").append(super.toString());
        sb.append("destinationResourceId=").append(String.valueOf(this.destinationResourceId));
        sb.append(", limitLevel=").append(String.valueOf(this.limitLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchMonitoredResourceMembersDetails)) {
            return false;
        }

        SearchMonitoredResourceMembersDetails other = (SearchMonitoredResourceMembersDetails) o;
        return java.util.Objects.equals(this.destinationResourceId, other.destinationResourceId)
                && java.util.Objects.equals(this.limitLevel, other.limitLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationResourceId == null
                                ? 43
                                : this.destinationResourceId.hashCode());
        result = (result * PRIME) + (this.limitLevel == null ? 43 : this.limitLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
