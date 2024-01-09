/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Exadata insights data object. <br>
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
        builder = ExadataInsightsDataObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataObjectType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataInsightsDataObject extends OpsiDataObject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupNames")
        private java.util.List<String> groupNames;

        public Builder groupNames(java.util.List<String> groupNames) {
            this.groupNames = groupNames;
            this.__explicitlySet__.add("groupNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedQueryTimePeriod")
        private String supportedQueryTimePeriod;

        public Builder supportedQueryTimePeriod(String supportedQueryTimePeriod) {
            this.supportedQueryTimePeriod = supportedQueryTimePeriod;
            this.__explicitlySet__.add("supportedQueryTimePeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnsMetadata")
        private java.util.List<DataObjectColumnMetadata> columnsMetadata;

        public Builder columnsMetadata(java.util.List<DataObjectColumnMetadata> columnsMetadata) {
            this.columnsMetadata = columnsMetadata;
            this.__explicitlySet__.add("columnsMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedQueryParams")
        private java.util.List<OpsiDataObjectSupportedQueryParam> supportedQueryParams;

        public Builder supportedQueryParams(
                java.util.List<OpsiDataObjectSupportedQueryParam> supportedQueryParams) {
            this.supportedQueryParams = supportedQueryParams;
            this.__explicitlySet__.add("supportedQueryParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightsDataObject build() {
            ExadataInsightsDataObject model =
                    new ExadataInsightsDataObject(
                            this.identifier,
                            this.displayName,
                            this.description,
                            this.name,
                            this.groupNames,
                            this.supportedQueryTimePeriod,
                            this.columnsMetadata,
                            this.supportedQueryParams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightsDataObject model) {
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("groupNames")) {
                this.groupNames(model.getGroupNames());
            }
            if (model.wasPropertyExplicitlySet("supportedQueryTimePeriod")) {
                this.supportedQueryTimePeriod(model.getSupportedQueryTimePeriod());
            }
            if (model.wasPropertyExplicitlySet("columnsMetadata")) {
                this.columnsMetadata(model.getColumnsMetadata());
            }
            if (model.wasPropertyExplicitlySet("supportedQueryParams")) {
                this.supportedQueryParams(model.getSupportedQueryParams());
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

    @Deprecated
    public ExadataInsightsDataObject(
            String identifier,
            String displayName,
            String description,
            String name,
            java.util.List<String> groupNames,
            String supportedQueryTimePeriod,
            java.util.List<DataObjectColumnMetadata> columnsMetadata,
            java.util.List<OpsiDataObjectSupportedQueryParam> supportedQueryParams) {
        super(
                identifier,
                displayName,
                description,
                name,
                groupNames,
                supportedQueryTimePeriod,
                columnsMetadata,
                supportedQueryParams);
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
        sb.append("ExadataInsightsDataObject(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightsDataObject)) {
            return false;
        }

        ExadataInsightsDataObject other = (ExadataInsightsDataObject) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
