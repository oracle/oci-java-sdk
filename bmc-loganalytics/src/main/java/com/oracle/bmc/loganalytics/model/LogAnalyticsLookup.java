/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsLookup
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsLookup.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsLookup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("activeEditVersion")
        private Long activeEditVersion;

        public Builder activeEditVersion(Long activeEditVersion) {
            this.activeEditVersion = activeEditVersion;
            this.__explicitlySet__.add("activeEditVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
        private String canonicalLink;

        public Builder canonicalLink(String canonicalLink) {
            this.canonicalLink = canonicalLink;
            this.__explicitlySet__.add("canonicalLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<LookupField> fields;

        public Builder fields(java.util.List<LookupField> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
        private Long lookupReference;

        public Builder lookupReference(Long lookupReference) {
            this.lookupReference = lookupReference;
            this.__explicitlySet__.add("lookupReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBuiltIn")
        private Long isBuiltIn;

        public Builder isBuiltIn(Long isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            this.__explicitlySet__.add("isBuiltIn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
        private String lookupDisplayName;

        public Builder lookupDisplayName(String lookupDisplayName) {
            this.lookupDisplayName = lookupDisplayName;
            this.__explicitlySet__.add("lookupDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referringSources")
        private AutoLookups referringSources;

        public Builder referringSources(AutoLookups referringSources) {
            this.referringSources = referringSources;
            this.__explicitlySet__.add("referringSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusSummary")
        private StatusSummary statusSummary;

        public Builder statusSummary(StatusSummary statusSummary) {
            this.statusSummary = statusSummary;
            this.__explicitlySet__.add("statusSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLookup build() {
            LogAnalyticsLookup __instance__ =
                    new LogAnalyticsLookup(
                            activeEditVersion,
                            canonicalLink,
                            description,
                            editVersion,
                            fields,
                            lookupReference,
                            name,
                            isBuiltIn,
                            isHidden,
                            lookupDisplayName,
                            referringSources,
                            statusSummary,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLookup o) {
            Builder copiedBuilder =
                    activeEditVersion(o.getActiveEditVersion())
                            .canonicalLink(o.getCanonicalLink())
                            .description(o.getDescription())
                            .editVersion(o.getEditVersion())
                            .fields(o.getFields())
                            .lookupReference(o.getLookupReference())
                            .name(o.getName())
                            .isBuiltIn(o.getIsBuiltIn())
                            .isHidden(o.getIsHidden())
                            .lookupDisplayName(o.getLookupDisplayName())
                            .referringSources(o.getReferringSources())
                            .statusSummary(o.getStatusSummary())
                            .timeUpdated(o.getTimeUpdated());

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
     * active edit version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeEditVersion")
    Long activeEditVersion;

    /**
     * canonical link
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalLink")
    String canonicalLink;

    /**
     * description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * edit version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * fields
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<LookupField> fields;

    /**
     * lookupReference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupReference")
    Long lookupReference;

    /**
     * iname
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * is built in
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBuiltIn")
    Long isBuiltIn;

    /**
     * is hidden
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    Boolean isHidden;

    /**
     * name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lookupDisplayName")
    String lookupDisplayName;

    /**
     * sources using
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referringSources")
    AutoLookups referringSources;

    /**
     * status summary
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusSummary")
    StatusSummary statusSummary;

    /**
     * last updated date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
