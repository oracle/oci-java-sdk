/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of a glossary. A glossary of business terms, such as 'Customer', 'Account', 'Contact', 'Address',
 * or 'Product', with definitions, used to provide common meaning across disparate data assets. Business glossaries
 * may be hierarchical where some terms may contain child terms to allow them to be used as 'taxonomies'.
 * By linking data assets, data entities, and attributes to glossaries and glossary terms, the glossary can act as a
 * way of organizing data catalog objects in a hierarchy to make a large number of objects more navigable and easier to
 * consume. Objects in the data catalog, such as data assets or data entities, may be linked to any level in the
 * glossary, so that the glossary can be used to browse the available data according to the business model of the
 * organization.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GlossarySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GlossarySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
        private TermWorkflowStatus workflowStatus;

        public Builder workflowStatus(TermWorkflowStatus workflowStatus) {
            this.workflowStatus = workflowStatus;
            this.__explicitlySet__.add("workflowStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
        private String importJobDefinitionKey;

        public Builder importJobDefinitionKey(String importJobDefinitionKey) {
            this.importJobDefinitionKey = importJobDefinitionKey;
            this.__explicitlySet__.add("importJobDefinitionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
        private String importJobKey;

        public Builder importJobKey(String importJobKey) {
            this.importJobKey = importJobKey;
            this.__explicitlySet__.add("importJobKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionKey")
        private String latestImportJobExecutionKey;

        public Builder latestImportJobExecutionKey(String latestImportJobExecutionKey) {
            this.latestImportJobExecutionKey = latestImportJobExecutionKey;
            this.__explicitlySet__.add("latestImportJobExecutionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionStatus")
        private String latestImportJobExecutionStatus;

        public Builder latestImportJobExecutionStatus(String latestImportJobExecutionStatus) {
            this.latestImportJobExecutionStatus = latestImportJobExecutionStatus;
            this.__explicitlySet__.add("latestImportJobExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GlossarySummary build() {
            GlossarySummary __instance__ =
                    new GlossarySummary(
                            key,
                            displayName,
                            catalogId,
                            timeCreated,
                            description,
                            uri,
                            workflowStatus,
                            lifecycleState,
                            importJobDefinitionKey,
                            importJobKey,
                            latestImportJobExecutionKey,
                            latestImportJobExecutionStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GlossarySummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .catalogId(o.getCatalogId())
                            .timeCreated(o.getTimeCreated())
                            .description(o.getDescription())
                            .uri(o.getUri())
                            .workflowStatus(o.getWorkflowStatus())
                            .lifecycleState(o.getLifecycleState())
                            .importJobDefinitionKey(o.getImportJobDefinitionKey())
                            .importJobKey(o.getImportJobKey())
                            .latestImportJobExecutionKey(o.getLatestImportJobExecutionKey())
                            .latestImportJobExecutionStatus(o.getLatestImportJobExecutionStatus());

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

    /**
     * Unique glossary key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    String catalogId;

    /**
     * The date and time the glossary was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Detailed description of the glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * URI to the glossary instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * Status of the approval process workflow for this business glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowStatus")
    TermWorkflowStatus workflowStatus;

    /**
     * State of the Glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The unique key of the job definition resource that was used in the Glossary import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
    String importJobDefinitionKey;

    /**
     * The unique key of the job policy for Glossary import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
    String importJobKey;

    /**
     * The unique key of the parent job execution for which the log resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionKey")
    String latestImportJobExecutionKey;

    /**
     * Status of the latest glossary import job execution, such as running, paused, or completed.
     * This may include additional information like time import started , import file size and % of completion
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latestImportJobExecutionStatus")
    String latestImportJobExecutionStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
