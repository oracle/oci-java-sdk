/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters for creating a data source (DataSource resource).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataSourceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "status",
        "compartmentId",
        "dataSourceFeedProvider",
        "dataSourceDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateDataSourceDetails(
            String displayName,
            DataSourceStatus status,
            String compartmentId,
            DataSourceFeedProvider dataSourceFeedProvider,
            DataSourceDetails dataSourceDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.status = status;
        this.compartmentId = compartmentId;
        this.dataSourceFeedProvider = dataSourceFeedProvider;
        this.dataSourceDetails = dataSourceDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Data source display name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Data source display name
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Enablement status of data source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private DataSourceStatus status;

        /**
         * Enablement status of data source.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(DataSourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Compartment OCID of the data source
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID of the data source
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Type of data source feed provider (LoggingQuery)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceFeedProvider")
        private DataSourceFeedProvider dataSourceFeedProvider;

        /**
         * Type of data source feed provider (LoggingQuery)
         * @param dataSourceFeedProvider the value to set
         * @return this builder
         **/
        public Builder dataSourceFeedProvider(DataSourceFeedProvider dataSourceFeedProvider) {
            this.dataSourceFeedProvider = dataSourceFeedProvider;
            this.__explicitlySet__.add("dataSourceFeedProvider");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetails")
        private DataSourceDetails dataSourceDetails;

        public Builder dataSourceDetails(DataSourceDetails dataSourceDetails) {
            this.dataSourceDetails = dataSourceDetails;
            this.__explicitlySet__.add("dataSourceDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         * <p>
         * Avoid entering confidential information.
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataSourceDetails build() {
            CreateDataSourceDetails model =
                    new CreateDataSourceDetails(
                            this.displayName,
                            this.status,
                            this.compartmentId,
                            this.dataSourceFeedProvider,
                            this.dataSourceDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataSourceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dataSourceFeedProvider")) {
                this.dataSourceFeedProvider(model.getDataSourceFeedProvider());
            }
            if (model.wasPropertyExplicitlySet("dataSourceDetails")) {
                this.dataSourceDetails(model.getDataSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Data source display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Data source display name
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Enablement status of data source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DataSourceStatus status;

    /**
     * Enablement status of data source.
     * @return the value
     **/
    public DataSourceStatus getStatus() {
        return status;
    }

    /**
     * Compartment OCID of the data source
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID of the data source
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Type of data source feed provider (LoggingQuery)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceFeedProvider")
    private final DataSourceFeedProvider dataSourceFeedProvider;

    /**
     * Type of data source feed provider (LoggingQuery)
     * @return the value
     **/
    public DataSourceFeedProvider getDataSourceFeedProvider() {
        return dataSourceFeedProvider;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceDetails")
    private final DataSourceDetails dataSourceDetails;

    public DataSourceDetails getDataSourceDetails() {
        return dataSourceDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     * <p>
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDataSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dataSourceFeedProvider=").append(String.valueOf(this.dataSourceFeedProvider));
        sb.append(", dataSourceDetails=").append(String.valueOf(this.dataSourceDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataSourceDetails)) {
            return false;
        }

        CreateDataSourceDetails other = (CreateDataSourceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.dataSourceFeedProvider, other.dataSourceFeedProvider)
                && java.util.Objects.equals(this.dataSourceDetails, other.dataSourceDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSourceFeedProvider == null
                                ? 43
                                : this.dataSourceFeedProvider.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSourceDetails == null ? 43 : this.dataSourceDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
